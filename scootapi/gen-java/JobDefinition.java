/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2018-01-10")
public class JobDefinition implements org.apache.thrift.TBase<JobDefinition, JobDefinition._Fields>, java.io.Serializable, Cloneable, Comparable<JobDefinition> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("JobDefinition");

  private static final org.apache.thrift.protocol.TField TASKS_FIELD_DESC = new org.apache.thrift.protocol.TField("tasks", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField DEPRECATED_JOB_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("DEPRECATED_jobType", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField DEFAULT_TASK_TIMEOUT_MS_FIELD_DESC = new org.apache.thrift.protocol.TField("defaultTaskTimeoutMs", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField PRIORITY_FIELD_DESC = new org.apache.thrift.protocol.TField("priority", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField TAG_FIELD_DESC = new org.apache.thrift.protocol.TField("tag", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField BASIS_FIELD_DESC = new org.apache.thrift.protocol.TField("basis", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField REQUESTOR_FIELD_DESC = new org.apache.thrift.protocol.TField("requestor", org.apache.thrift.protocol.TType.STRING, (short)7);
  private static final org.apache.thrift.protocol.TField JOB_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("jobType", org.apache.thrift.protocol.TType.STRING, (short)8);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new JobDefinitionStandardSchemeFactory());
    schemes.put(TupleScheme.class, new JobDefinitionTupleSchemeFactory());
  }

  public List<TaskDefinition> tasks; // required
  /**
   * 
   * @see JobType
   */
  public JobType DEPRECATED_jobType; // optional
  public int defaultTaskTimeoutMs; // optional
  public int priority; // optional
  public String tag; // optional
  public String basis; // optional
  public String requestor; // optional
  public String jobType; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TASKS((short)1, "tasks"),
    /**
     * 
     * @see JobType
     */
    DEPRECATED_JOB_TYPE((short)2, "DEPRECATED_jobType"),
    DEFAULT_TASK_TIMEOUT_MS((short)3, "defaultTaskTimeoutMs"),
    PRIORITY((short)4, "priority"),
    TAG((short)5, "tag"),
    BASIS((short)6, "basis"),
    REQUESTOR((short)7, "requestor"),
    JOB_TYPE((short)8, "jobType");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TASKS
          return TASKS;
        case 2: // DEPRECATED_JOB_TYPE
          return DEPRECATED_JOB_TYPE;
        case 3: // DEFAULT_TASK_TIMEOUT_MS
          return DEFAULT_TASK_TIMEOUT_MS;
        case 4: // PRIORITY
          return PRIORITY;
        case 5: // TAG
          return TAG;
        case 6: // BASIS
          return BASIS;
        case 7: // REQUESTOR
          return REQUESTOR;
        case 8: // JOB_TYPE
          return JOB_TYPE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __DEFAULTTASKTIMEOUTMS_ISSET_ID = 0;
  private static final int __PRIORITY_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.DEPRECATED_JOB_TYPE,_Fields.DEFAULT_TASK_TIMEOUT_MS,_Fields.PRIORITY,_Fields.TAG,_Fields.BASIS,_Fields.REQUESTOR,_Fields.JOB_TYPE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TASKS, new org.apache.thrift.meta_data.FieldMetaData("tasks", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TaskDefinition.class))));
    tmpMap.put(_Fields.DEPRECATED_JOB_TYPE, new org.apache.thrift.meta_data.FieldMetaData("DEPRECATED_jobType", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, JobType.class)));
    tmpMap.put(_Fields.DEFAULT_TASK_TIMEOUT_MS, new org.apache.thrift.meta_data.FieldMetaData("defaultTaskTimeoutMs", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.PRIORITY, new org.apache.thrift.meta_data.FieldMetaData("priority", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TAG, new org.apache.thrift.meta_data.FieldMetaData("tag", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.BASIS, new org.apache.thrift.meta_data.FieldMetaData("basis", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.REQUESTOR, new org.apache.thrift.meta_data.FieldMetaData("requestor", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.JOB_TYPE, new org.apache.thrift.meta_data.FieldMetaData("jobType", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(JobDefinition.class, metaDataMap);
  }

  public JobDefinition() {
  }

  public JobDefinition(
    List<TaskDefinition> tasks)
  {
    this();
    this.tasks = tasks;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public JobDefinition(JobDefinition other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetTasks()) {
      List<TaskDefinition> __this__tasks = new ArrayList<TaskDefinition>(other.tasks.size());
      for (TaskDefinition other_element : other.tasks) {
        __this__tasks.add(new TaskDefinition(other_element));
      }
      this.tasks = __this__tasks;
    }
    if (other.isSetDEPRECATED_jobType()) {
      this.DEPRECATED_jobType = other.DEPRECATED_jobType;
    }
    this.defaultTaskTimeoutMs = other.defaultTaskTimeoutMs;
    this.priority = other.priority;
    if (other.isSetTag()) {
      this.tag = other.tag;
    }
    if (other.isSetBasis()) {
      this.basis = other.basis;
    }
    if (other.isSetRequestor()) {
      this.requestor = other.requestor;
    }
    if (other.isSetJobType()) {
      this.jobType = other.jobType;
    }
  }

  public JobDefinition deepCopy() {
    return new JobDefinition(this);
  }

  @Override
  public void clear() {
    this.tasks = null;
    this.DEPRECATED_jobType = null;
    setDefaultTaskTimeoutMsIsSet(false);
    this.defaultTaskTimeoutMs = 0;
    setPriorityIsSet(false);
    this.priority = 0;
    this.tag = null;
    this.basis = null;
    this.requestor = null;
    this.jobType = null;
  }

  public int getTasksSize() {
    return (this.tasks == null) ? 0 : this.tasks.size();
  }

  public java.util.Iterator<TaskDefinition> getTasksIterator() {
    return (this.tasks == null) ? null : this.tasks.iterator();
  }

  public void addToTasks(TaskDefinition elem) {
    if (this.tasks == null) {
      this.tasks = new ArrayList<TaskDefinition>();
    }
    this.tasks.add(elem);
  }

  public List<TaskDefinition> getTasks() {
    return this.tasks;
  }

  public JobDefinition setTasks(List<TaskDefinition> tasks) {
    this.tasks = tasks;
    return this;
  }

  public void unsetTasks() {
    this.tasks = null;
  }

  /** Returns true if field tasks is set (has been assigned a value) and false otherwise */
  public boolean isSetTasks() {
    return this.tasks != null;
  }

  public void setTasksIsSet(boolean value) {
    if (!value) {
      this.tasks = null;
    }
  }

  /**
   * 
   * @see JobType
   */
  public JobType getDEPRECATED_jobType() {
    return this.DEPRECATED_jobType;
  }

  /**
   * 
   * @see JobType
   */
  public JobDefinition setDEPRECATED_jobType(JobType DEPRECATED_jobType) {
    this.DEPRECATED_jobType = DEPRECATED_jobType;
    return this;
  }

  public void unsetDEPRECATED_jobType() {
    this.DEPRECATED_jobType = null;
  }

  /** Returns true if field DEPRECATED_jobType is set (has been assigned a value) and false otherwise */
  public boolean isSetDEPRECATED_jobType() {
    return this.DEPRECATED_jobType != null;
  }

  public void setDEPRECATED_jobTypeIsSet(boolean value) {
    if (!value) {
      this.DEPRECATED_jobType = null;
    }
  }

  public int getDefaultTaskTimeoutMs() {
    return this.defaultTaskTimeoutMs;
  }

  public JobDefinition setDefaultTaskTimeoutMs(int defaultTaskTimeoutMs) {
    this.defaultTaskTimeoutMs = defaultTaskTimeoutMs;
    setDefaultTaskTimeoutMsIsSet(true);
    return this;
  }

  public void unsetDefaultTaskTimeoutMs() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DEFAULTTASKTIMEOUTMS_ISSET_ID);
  }

  /** Returns true if field defaultTaskTimeoutMs is set (has been assigned a value) and false otherwise */
  public boolean isSetDefaultTaskTimeoutMs() {
    return EncodingUtils.testBit(__isset_bitfield, __DEFAULTTASKTIMEOUTMS_ISSET_ID);
  }

  public void setDefaultTaskTimeoutMsIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DEFAULTTASKTIMEOUTMS_ISSET_ID, value);
  }

  public int getPriority() {
    return this.priority;
  }

  public JobDefinition setPriority(int priority) {
    this.priority = priority;
    setPriorityIsSet(true);
    return this;
  }

  public void unsetPriority() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PRIORITY_ISSET_ID);
  }

  /** Returns true if field priority is set (has been assigned a value) and false otherwise */
  public boolean isSetPriority() {
    return EncodingUtils.testBit(__isset_bitfield, __PRIORITY_ISSET_ID);
  }

  public void setPriorityIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PRIORITY_ISSET_ID, value);
  }

  public String getTag() {
    return this.tag;
  }

  public JobDefinition setTag(String tag) {
    this.tag = tag;
    return this;
  }

  public void unsetTag() {
    this.tag = null;
  }

  /** Returns true if field tag is set (has been assigned a value) and false otherwise */
  public boolean isSetTag() {
    return this.tag != null;
  }

  public void setTagIsSet(boolean value) {
    if (!value) {
      this.tag = null;
    }
  }

  public String getBasis() {
    return this.basis;
  }

  public JobDefinition setBasis(String basis) {
    this.basis = basis;
    return this;
  }

  public void unsetBasis() {
    this.basis = null;
  }

  /** Returns true if field basis is set (has been assigned a value) and false otherwise */
  public boolean isSetBasis() {
    return this.basis != null;
  }

  public void setBasisIsSet(boolean value) {
    if (!value) {
      this.basis = null;
    }
  }

  public String getRequestor() {
    return this.requestor;
  }

  public JobDefinition setRequestor(String requestor) {
    this.requestor = requestor;
    return this;
  }

  public void unsetRequestor() {
    this.requestor = null;
  }

  /** Returns true if field requestor is set (has been assigned a value) and false otherwise */
  public boolean isSetRequestor() {
    return this.requestor != null;
  }

  public void setRequestorIsSet(boolean value) {
    if (!value) {
      this.requestor = null;
    }
  }

  public String getJobType() {
    return this.jobType;
  }

  public JobDefinition setJobType(String jobType) {
    this.jobType = jobType;
    return this;
  }

  public void unsetJobType() {
    this.jobType = null;
  }

  /** Returns true if field jobType is set (has been assigned a value) and false otherwise */
  public boolean isSetJobType() {
    return this.jobType != null;
  }

  public void setJobTypeIsSet(boolean value) {
    if (!value) {
      this.jobType = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TASKS:
      if (value == null) {
        unsetTasks();
      } else {
        setTasks((List<TaskDefinition>)value);
      }
      break;

    case DEPRECATED_JOB_TYPE:
      if (value == null) {
        unsetDEPRECATED_jobType();
      } else {
        setDEPRECATED_jobType((JobType)value);
      }
      break;

    case DEFAULT_TASK_TIMEOUT_MS:
      if (value == null) {
        unsetDefaultTaskTimeoutMs();
      } else {
        setDefaultTaskTimeoutMs((Integer)value);
      }
      break;

    case PRIORITY:
      if (value == null) {
        unsetPriority();
      } else {
        setPriority((Integer)value);
      }
      break;

    case TAG:
      if (value == null) {
        unsetTag();
      } else {
        setTag((String)value);
      }
      break;

    case BASIS:
      if (value == null) {
        unsetBasis();
      } else {
        setBasis((String)value);
      }
      break;

    case REQUESTOR:
      if (value == null) {
        unsetRequestor();
      } else {
        setRequestor((String)value);
      }
      break;

    case JOB_TYPE:
      if (value == null) {
        unsetJobType();
      } else {
        setJobType((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TASKS:
      return getTasks();

    case DEPRECATED_JOB_TYPE:
      return getDEPRECATED_jobType();

    case DEFAULT_TASK_TIMEOUT_MS:
      return getDefaultTaskTimeoutMs();

    case PRIORITY:
      return getPriority();

    case TAG:
      return getTag();

    case BASIS:
      return getBasis();

    case REQUESTOR:
      return getRequestor();

    case JOB_TYPE:
      return getJobType();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TASKS:
      return isSetTasks();
    case DEPRECATED_JOB_TYPE:
      return isSetDEPRECATED_jobType();
    case DEFAULT_TASK_TIMEOUT_MS:
      return isSetDefaultTaskTimeoutMs();
    case PRIORITY:
      return isSetPriority();
    case TAG:
      return isSetTag();
    case BASIS:
      return isSetBasis();
    case REQUESTOR:
      return isSetRequestor();
    case JOB_TYPE:
      return isSetJobType();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof JobDefinition)
      return this.equals((JobDefinition)that);
    return false;
  }

  public boolean equals(JobDefinition that) {
    if (that == null)
      return false;

    boolean this_present_tasks = true && this.isSetTasks();
    boolean that_present_tasks = true && that.isSetTasks();
    if (this_present_tasks || that_present_tasks) {
      if (!(this_present_tasks && that_present_tasks))
        return false;
      if (!this.tasks.equals(that.tasks))
        return false;
    }

    boolean this_present_DEPRECATED_jobType = true && this.isSetDEPRECATED_jobType();
    boolean that_present_DEPRECATED_jobType = true && that.isSetDEPRECATED_jobType();
    if (this_present_DEPRECATED_jobType || that_present_DEPRECATED_jobType) {
      if (!(this_present_DEPRECATED_jobType && that_present_DEPRECATED_jobType))
        return false;
      if (!this.DEPRECATED_jobType.equals(that.DEPRECATED_jobType))
        return false;
    }

    boolean this_present_defaultTaskTimeoutMs = true && this.isSetDefaultTaskTimeoutMs();
    boolean that_present_defaultTaskTimeoutMs = true && that.isSetDefaultTaskTimeoutMs();
    if (this_present_defaultTaskTimeoutMs || that_present_defaultTaskTimeoutMs) {
      if (!(this_present_defaultTaskTimeoutMs && that_present_defaultTaskTimeoutMs))
        return false;
      if (this.defaultTaskTimeoutMs != that.defaultTaskTimeoutMs)
        return false;
    }

    boolean this_present_priority = true && this.isSetPriority();
    boolean that_present_priority = true && that.isSetPriority();
    if (this_present_priority || that_present_priority) {
      if (!(this_present_priority && that_present_priority))
        return false;
      if (this.priority != that.priority)
        return false;
    }

    boolean this_present_tag = true && this.isSetTag();
    boolean that_present_tag = true && that.isSetTag();
    if (this_present_tag || that_present_tag) {
      if (!(this_present_tag && that_present_tag))
        return false;
      if (!this.tag.equals(that.tag))
        return false;
    }

    boolean this_present_basis = true && this.isSetBasis();
    boolean that_present_basis = true && that.isSetBasis();
    if (this_present_basis || that_present_basis) {
      if (!(this_present_basis && that_present_basis))
        return false;
      if (!this.basis.equals(that.basis))
        return false;
    }

    boolean this_present_requestor = true && this.isSetRequestor();
    boolean that_present_requestor = true && that.isSetRequestor();
    if (this_present_requestor || that_present_requestor) {
      if (!(this_present_requestor && that_present_requestor))
        return false;
      if (!this.requestor.equals(that.requestor))
        return false;
    }

    boolean this_present_jobType = true && this.isSetJobType();
    boolean that_present_jobType = true && that.isSetJobType();
    if (this_present_jobType || that_present_jobType) {
      if (!(this_present_jobType && that_present_jobType))
        return false;
      if (!this.jobType.equals(that.jobType))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_tasks = true && (isSetTasks());
    list.add(present_tasks);
    if (present_tasks)
      list.add(tasks);

    boolean present_DEPRECATED_jobType = true && (isSetDEPRECATED_jobType());
    list.add(present_DEPRECATED_jobType);
    if (present_DEPRECATED_jobType)
      list.add(DEPRECATED_jobType.getValue());

    boolean present_defaultTaskTimeoutMs = true && (isSetDefaultTaskTimeoutMs());
    list.add(present_defaultTaskTimeoutMs);
    if (present_defaultTaskTimeoutMs)
      list.add(defaultTaskTimeoutMs);

    boolean present_priority = true && (isSetPriority());
    list.add(present_priority);
    if (present_priority)
      list.add(priority);

    boolean present_tag = true && (isSetTag());
    list.add(present_tag);
    if (present_tag)
      list.add(tag);

    boolean present_basis = true && (isSetBasis());
    list.add(present_basis);
    if (present_basis)
      list.add(basis);

    boolean present_requestor = true && (isSetRequestor());
    list.add(present_requestor);
    if (present_requestor)
      list.add(requestor);

    boolean present_jobType = true && (isSetJobType());
    list.add(present_jobType);
    if (present_jobType)
      list.add(jobType);

    return list.hashCode();
  }

  @Override
  public int compareTo(JobDefinition other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTasks()).compareTo(other.isSetTasks());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTasks()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tasks, other.tasks);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDEPRECATED_jobType()).compareTo(other.isSetDEPRECATED_jobType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDEPRECATED_jobType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.DEPRECATED_jobType, other.DEPRECATED_jobType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDefaultTaskTimeoutMs()).compareTo(other.isSetDefaultTaskTimeoutMs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDefaultTaskTimeoutMs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.defaultTaskTimeoutMs, other.defaultTaskTimeoutMs);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPriority()).compareTo(other.isSetPriority());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPriority()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.priority, other.priority);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTag()).compareTo(other.isSetTag());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTag()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tag, other.tag);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBasis()).compareTo(other.isSetBasis());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBasis()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.basis, other.basis);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRequestor()).compareTo(other.isSetRequestor());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRequestor()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.requestor, other.requestor);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetJobType()).compareTo(other.isSetJobType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJobType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jobType, other.jobType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("JobDefinition(");
    boolean first = true;

    sb.append("tasks:");
    if (this.tasks == null) {
      sb.append("null");
    } else {
      sb.append(this.tasks);
    }
    first = false;
    if (isSetDEPRECATED_jobType()) {
      if (!first) sb.append(", ");
      sb.append("DEPRECATED_jobType:");
      if (this.DEPRECATED_jobType == null) {
        sb.append("null");
      } else {
        sb.append(this.DEPRECATED_jobType);
      }
      first = false;
    }
    if (isSetDefaultTaskTimeoutMs()) {
      if (!first) sb.append(", ");
      sb.append("defaultTaskTimeoutMs:");
      sb.append(this.defaultTaskTimeoutMs);
      first = false;
    }
    if (isSetPriority()) {
      if (!first) sb.append(", ");
      sb.append("priority:");
      sb.append(this.priority);
      first = false;
    }
    if (isSetTag()) {
      if (!first) sb.append(", ");
      sb.append("tag:");
      if (this.tag == null) {
        sb.append("null");
      } else {
        sb.append(this.tag);
      }
      first = false;
    }
    if (isSetBasis()) {
      if (!first) sb.append(", ");
      sb.append("basis:");
      if (this.basis == null) {
        sb.append("null");
      } else {
        sb.append(this.basis);
      }
      first = false;
    }
    if (isSetRequestor()) {
      if (!first) sb.append(", ");
      sb.append("requestor:");
      if (this.requestor == null) {
        sb.append("null");
      } else {
        sb.append(this.requestor);
      }
      first = false;
    }
    if (isSetJobType()) {
      if (!first) sb.append(", ");
      sb.append("jobType:");
      if (this.jobType == null) {
        sb.append("null");
      } else {
        sb.append(this.jobType);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (tasks == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'tasks' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class JobDefinitionStandardSchemeFactory implements SchemeFactory {
    public JobDefinitionStandardScheme getScheme() {
      return new JobDefinitionStandardScheme();
    }
  }

  private static class JobDefinitionStandardScheme extends StandardScheme<JobDefinition> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, JobDefinition struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TASKS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list18 = iprot.readListBegin();
                struct.tasks = new ArrayList<TaskDefinition>(_list18.size);
                TaskDefinition _elem19;
                for (int _i20 = 0; _i20 < _list18.size; ++_i20)
                {
                  _elem19 = new TaskDefinition();
                  _elem19.read(iprot);
                  struct.tasks.add(_elem19);
                }
                iprot.readListEnd();
              }
              struct.setTasksIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DEPRECATED_JOB_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.DEPRECATED_jobType = JobType.findByValue(iprot.readI32());
              struct.setDEPRECATED_jobTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DEFAULT_TASK_TIMEOUT_MS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.defaultTaskTimeoutMs = iprot.readI32();
              struct.setDefaultTaskTimeoutMsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PRIORITY
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.priority = iprot.readI32();
              struct.setPriorityIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // TAG
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.tag = iprot.readString();
              struct.setTagIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // BASIS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.basis = iprot.readString();
              struct.setBasisIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // REQUESTOR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.requestor = iprot.readString();
              struct.setRequestorIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // JOB_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.jobType = iprot.readString();
              struct.setJobTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, JobDefinition struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.tasks != null) {
        oprot.writeFieldBegin(TASKS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.tasks.size()));
          for (TaskDefinition _iter21 : struct.tasks)
          {
            _iter21.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.DEPRECATED_jobType != null) {
        if (struct.isSetDEPRECATED_jobType()) {
          oprot.writeFieldBegin(DEPRECATED_JOB_TYPE_FIELD_DESC);
          oprot.writeI32(struct.DEPRECATED_jobType.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetDefaultTaskTimeoutMs()) {
        oprot.writeFieldBegin(DEFAULT_TASK_TIMEOUT_MS_FIELD_DESC);
        oprot.writeI32(struct.defaultTaskTimeoutMs);
        oprot.writeFieldEnd();
      }
      if (struct.isSetPriority()) {
        oprot.writeFieldBegin(PRIORITY_FIELD_DESC);
        oprot.writeI32(struct.priority);
        oprot.writeFieldEnd();
      }
      if (struct.tag != null) {
        if (struct.isSetTag()) {
          oprot.writeFieldBegin(TAG_FIELD_DESC);
          oprot.writeString(struct.tag);
          oprot.writeFieldEnd();
        }
      }
      if (struct.basis != null) {
        if (struct.isSetBasis()) {
          oprot.writeFieldBegin(BASIS_FIELD_DESC);
          oprot.writeString(struct.basis);
          oprot.writeFieldEnd();
        }
      }
      if (struct.requestor != null) {
        if (struct.isSetRequestor()) {
          oprot.writeFieldBegin(REQUESTOR_FIELD_DESC);
          oprot.writeString(struct.requestor);
          oprot.writeFieldEnd();
        }
      }
      if (struct.jobType != null) {
        if (struct.isSetJobType()) {
          oprot.writeFieldBegin(JOB_TYPE_FIELD_DESC);
          oprot.writeString(struct.jobType);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class JobDefinitionTupleSchemeFactory implements SchemeFactory {
    public JobDefinitionTupleScheme getScheme() {
      return new JobDefinitionTupleScheme();
    }
  }

  private static class JobDefinitionTupleScheme extends TupleScheme<JobDefinition> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, JobDefinition struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.tasks.size());
        for (TaskDefinition _iter22 : struct.tasks)
        {
          _iter22.write(oprot);
        }
      }
      BitSet optionals = new BitSet();
      if (struct.isSetDEPRECATED_jobType()) {
        optionals.set(0);
      }
      if (struct.isSetDefaultTaskTimeoutMs()) {
        optionals.set(1);
      }
      if (struct.isSetPriority()) {
        optionals.set(2);
      }
      if (struct.isSetTag()) {
        optionals.set(3);
      }
      if (struct.isSetBasis()) {
        optionals.set(4);
      }
      if (struct.isSetRequestor()) {
        optionals.set(5);
      }
      if (struct.isSetJobType()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetDEPRECATED_jobType()) {
        oprot.writeI32(struct.DEPRECATED_jobType.getValue());
      }
      if (struct.isSetDefaultTaskTimeoutMs()) {
        oprot.writeI32(struct.defaultTaskTimeoutMs);
      }
      if (struct.isSetPriority()) {
        oprot.writeI32(struct.priority);
      }
      if (struct.isSetTag()) {
        oprot.writeString(struct.tag);
      }
      if (struct.isSetBasis()) {
        oprot.writeString(struct.basis);
      }
      if (struct.isSetRequestor()) {
        oprot.writeString(struct.requestor);
      }
      if (struct.isSetJobType()) {
        oprot.writeString(struct.jobType);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, JobDefinition struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list23 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.tasks = new ArrayList<TaskDefinition>(_list23.size);
        TaskDefinition _elem24;
        for (int _i25 = 0; _i25 < _list23.size; ++_i25)
        {
          _elem24 = new TaskDefinition();
          _elem24.read(iprot);
          struct.tasks.add(_elem24);
        }
      }
      struct.setTasksIsSet(true);
      BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.DEPRECATED_jobType = JobType.findByValue(iprot.readI32());
        struct.setDEPRECATED_jobTypeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.defaultTaskTimeoutMs = iprot.readI32();
        struct.setDefaultTaskTimeoutMsIsSet(true);
      }
      if (incoming.get(2)) {
        struct.priority = iprot.readI32();
        struct.setPriorityIsSet(true);
      }
      if (incoming.get(3)) {
        struct.tag = iprot.readString();
        struct.setTagIsSet(true);
      }
      if (incoming.get(4)) {
        struct.basis = iprot.readString();
        struct.setBasisIsSet(true);
      }
      if (incoming.get(5)) {
        struct.requestor = iprot.readString();
        struct.setRequestorIsSet(true);
      }
      if (incoming.get(6)) {
        struct.jobType = iprot.readString();
        struct.setJobTypeIsSet(true);
      }
    }
  }

}

