package scheduler

import (
	"log"

	"github.com/scootdev/scoot/cloud/cluster"
)

const noTask = ""

// clusterState maintains a cluster of nodes
// and information about what task is running on each node
type clusterState struct {
	updateCh chan []cluster.NodeUpdate
	nodes    map[cluster.NodeId]*nodeState
	affinity map[string]*nodeGroups //key is a snapshotID.
}

type nodeGroups struct {
	idle map[cluster.NodeId]cluster.Node
	busy map[cluster.NodeId]cluster.Node
}

func newNodeGroups() *nodeGroups {
	return &nodeGroups{idle: map[cluster.NodeId]cluster.Node{}, busy: map[cluster.NodeId]cluster.Node{}}
}

// The State of A Node in the Cluster
type nodeState struct {
	node        cluster.Node
	runningTask string
	snapshotID  string
}

// Initializes a Node State for the specified Node
func newNodeState(node cluster.Node) *nodeState {
	return &nodeState{
		node:        node,
		runningTask: noTask,
		snapshotID:  "",
	}
}

// Creates a New State Distributor with the initial nodes, and which updates
// nodes added or removed based on the supplied channel.
func newClusterState(initial []cluster.Node, updateCh chan []cluster.NodeUpdate) *clusterState {
	nodes := make(map[cluster.NodeId]*nodeState)
	affinity := map[string]*nodeGroups{"": newNodeGroups()}
	for _, n := range initial {
		nodes[n.Id()] = newNodeState(n)
		affinity[""].idle[n.Id()] = n
	}

	return &clusterState{
		updateCh: updateCh,
		nodes:    nodes,
		affinity: affinity,
	}
}

// Update ClusterState to reflect that a task has been scheduled on a particular node
// SnapshotID should be the value from the task definition associated with the given taskID.
// TODO: taskID is not unique (and isn't currently required to be), but a jobID arg would fix that.
func (c *clusterState) taskScheduled(nodeId cluster.NodeId, taskId string, snapshotID string) {
	ns := c.nodes[nodeId]

	delete(c.affinity[ns.snapshotID].idle, nodeId)
	if _, ok := c.affinity[snapshotID]; !ok {
		c.affinity[snapshotID] = newNodeGroups()
	}
	c.affinity[snapshotID].busy[nodeId] = ns.node

	ns.snapshotID = snapshotID
	ns.runningTask = taskId
}

// Update ClusterState to reflect that a task has finished running on
// a particular node, whether successfully or unsuccessfully
func (c *clusterState) taskCompleted(nodeId cluster.NodeId, taskId string) {
	// this node may have been removed from the cluster in the last update
	ns, ok := c.nodes[nodeId]
	if ok {
		ns.runningTask = noTask
		delete(c.affinity[ns.snapshotID].busy, nodeId)
		c.affinity[ns.snapshotID].idle[nodeId] = ns.node
	}
}

func (c *clusterState) getNodeState(nodeId cluster.NodeId) (*nodeState, bool) {
	ns, ok := c.nodes[nodeId]
	return ns, ok
}

// upate cluster state to reflect added and removed nodes
func (c *clusterState) updateCluster() {
	select {
	case updates, ok := <-c.updateCh:
		if !ok {
			c.updateCh = nil
		}
		c.update(updates)
	default:
	}
}

// Processes nodes being added and removed from the cluster &
// updates the distributor state accordingly
func (c *clusterState) update(updates []cluster.NodeUpdate) {
	for _, update := range updates {
		switch update.UpdateType {
		case cluster.NodeAdded:
			// add the node if it doesn't already exist
			if _, ok := c.nodes[update.Node.Id()]; !ok {
				c.nodes[update.Node.Id()] = newNodeState(update.Node)
				c.affinity[""].idle[update.Node.Id()] = update.Node
				log.Printf("Added node: %+v, now have %d nodes\n", update.Node, len(c.nodes))
			}
		case cluster.NodeRemoved:
			log.Printf("Removed nodeId: %s (%v), now have %d nodes\n", string(update.Id), c.nodes[update.Id], len(c.nodes))
			if nodeState, ok := c.nodes[update.Id]; ok {
				delete(c.affinity[nodeState.snapshotID].idle, update.Id)
				delete(c.affinity[nodeState.snapshotID].busy, update.Id)
				delete(c.nodes, update.Id)
			}
		}
	}

}
