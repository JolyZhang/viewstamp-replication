/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package vr.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2014-12-11")
public class StartViewChangeResponse implements org.apache.thrift.TBase<StartViewChangeResponse, StartViewChangeResponse._Fields>, java.io.Serializable, Cloneable, Comparable<StartViewChangeResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("StartViewChangeResponse");

  private static final org.apache.thrift.protocol.TField REPLICA_NUMBER_FIELD_DESC = new org.apache.thrift.protocol.TField("replicaNumber", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField NEW_VIEW_NUMBER_FIELD_DESC = new org.apache.thrift.protocol.TField("newViewNumber", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField SUCCESS_FIELD_DESC = new org.apache.thrift.protocol.TField("success", org.apache.thrift.protocol.TType.BOOL, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new StartViewChangeResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new StartViewChangeResponseTupleSchemeFactory());
  }

  public int replicaNumber; // required
  public int newViewNumber; // required
  public boolean success; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    REPLICA_NUMBER((short)1, "replicaNumber"),
    NEW_VIEW_NUMBER((short)2, "newViewNumber"),
    SUCCESS((short)3, "success");

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
        case 1: // REPLICA_NUMBER
          return REPLICA_NUMBER;
        case 2: // NEW_VIEW_NUMBER
          return NEW_VIEW_NUMBER;
        case 3: // SUCCESS
          return SUCCESS;
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
  private static final int __REPLICANUMBER_ISSET_ID = 0;
  private static final int __NEWVIEWNUMBER_ISSET_ID = 1;
  private static final int __SUCCESS_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.REPLICA_NUMBER, new org.apache.thrift.meta_data.FieldMetaData("replicaNumber", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "int")));
    tmpMap.put(_Fields.NEW_VIEW_NUMBER, new org.apache.thrift.meta_data.FieldMetaData("newViewNumber", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "int")));
    tmpMap.put(_Fields.SUCCESS, new org.apache.thrift.meta_data.FieldMetaData("success", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(StartViewChangeResponse.class, metaDataMap);
  }

  public StartViewChangeResponse() {
  }

  public StartViewChangeResponse(
    int replicaNumber,
    int newViewNumber,
    boolean success)
  {
    this();
    this.replicaNumber = replicaNumber;
    setReplicaNumberIsSet(true);
    this.newViewNumber = newViewNumber;
    setNewViewNumberIsSet(true);
    this.success = success;
    setSuccessIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public StartViewChangeResponse(StartViewChangeResponse other) {
    __isset_bitfield = other.__isset_bitfield;
    this.replicaNumber = other.replicaNumber;
    this.newViewNumber = other.newViewNumber;
    this.success = other.success;
  }

  public StartViewChangeResponse deepCopy() {
    return new StartViewChangeResponse(this);
  }

  @Override
  public void clear() {
    setReplicaNumberIsSet(false);
    this.replicaNumber = 0;
    setNewViewNumberIsSet(false);
    this.newViewNumber = 0;
    setSuccessIsSet(false);
    this.success = false;
  }

  public int getReplicaNumber() {
    return this.replicaNumber;
  }

  public StartViewChangeResponse setReplicaNumber(int replicaNumber) {
    this.replicaNumber = replicaNumber;
    setReplicaNumberIsSet(true);
    return this;
  }

  public void unsetReplicaNumber() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __REPLICANUMBER_ISSET_ID);
  }

  /** Returns true if field replicaNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetReplicaNumber() {
    return EncodingUtils.testBit(__isset_bitfield, __REPLICANUMBER_ISSET_ID);
  }

  public void setReplicaNumberIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __REPLICANUMBER_ISSET_ID, value);
  }

  public int getNewViewNumber() {
    return this.newViewNumber;
  }

  public StartViewChangeResponse setNewViewNumber(int newViewNumber) {
    this.newViewNumber = newViewNumber;
    setNewViewNumberIsSet(true);
    return this;
  }

  public void unsetNewViewNumber() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __NEWVIEWNUMBER_ISSET_ID);
  }

  /** Returns true if field newViewNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetNewViewNumber() {
    return EncodingUtils.testBit(__isset_bitfield, __NEWVIEWNUMBER_ISSET_ID);
  }

  public void setNewViewNumberIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __NEWVIEWNUMBER_ISSET_ID, value);
  }

  public boolean isSuccess() {
    return this.success;
  }

  public StartViewChangeResponse setSuccess(boolean success) {
    this.success = success;
    setSuccessIsSet(true);
    return this;
  }

  public void unsetSuccess() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SUCCESS_ISSET_ID);
  }

  /** Returns true if field success is set (has been assigned a value) and false otherwise */
  public boolean isSetSuccess() {
    return EncodingUtils.testBit(__isset_bitfield, __SUCCESS_ISSET_ID);
  }

  public void setSuccessIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SUCCESS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case REPLICA_NUMBER:
      if (value == null) {
        unsetReplicaNumber();
      } else {
        setReplicaNumber((Integer)value);
      }
      break;

    case NEW_VIEW_NUMBER:
      if (value == null) {
        unsetNewViewNumber();
      } else {
        setNewViewNumber((Integer)value);
      }
      break;

    case SUCCESS:
      if (value == null) {
        unsetSuccess();
      } else {
        setSuccess((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case REPLICA_NUMBER:
      return Integer.valueOf(getReplicaNumber());

    case NEW_VIEW_NUMBER:
      return Integer.valueOf(getNewViewNumber());

    case SUCCESS:
      return Boolean.valueOf(isSuccess());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case REPLICA_NUMBER:
      return isSetReplicaNumber();
    case NEW_VIEW_NUMBER:
      return isSetNewViewNumber();
    case SUCCESS:
      return isSetSuccess();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof StartViewChangeResponse)
      return this.equals((StartViewChangeResponse)that);
    return false;
  }

  public boolean equals(StartViewChangeResponse that) {
    if (that == null)
      return false;

    boolean this_present_replicaNumber = true;
    boolean that_present_replicaNumber = true;
    if (this_present_replicaNumber || that_present_replicaNumber) {
      if (!(this_present_replicaNumber && that_present_replicaNumber))
        return false;
      if (this.replicaNumber != that.replicaNumber)
        return false;
    }

    boolean this_present_newViewNumber = true;
    boolean that_present_newViewNumber = true;
    if (this_present_newViewNumber || that_present_newViewNumber) {
      if (!(this_present_newViewNumber && that_present_newViewNumber))
        return false;
      if (this.newViewNumber != that.newViewNumber)
        return false;
    }

    boolean this_present_success = true;
    boolean that_present_success = true;
    if (this_present_success || that_present_success) {
      if (!(this_present_success && that_present_success))
        return false;
      if (this.success != that.success)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_replicaNumber = true;
    list.add(present_replicaNumber);
    if (present_replicaNumber)
      list.add(replicaNumber);

    boolean present_newViewNumber = true;
    list.add(present_newViewNumber);
    if (present_newViewNumber)
      list.add(newViewNumber);

    boolean present_success = true;
    list.add(present_success);
    if (present_success)
      list.add(success);

    return list.hashCode();
  }

  @Override
  public int compareTo(StartViewChangeResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetReplicaNumber()).compareTo(other.isSetReplicaNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReplicaNumber()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.replicaNumber, other.replicaNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNewViewNumber()).compareTo(other.isSetNewViewNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNewViewNumber()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.newViewNumber, other.newViewNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSuccess()).compareTo(other.isSetSuccess());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSuccess()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.success, other.success);
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
    StringBuilder sb = new StringBuilder("StartViewChangeResponse(");
    boolean first = true;

    sb.append("replicaNumber:");
    sb.append(this.replicaNumber);
    first = false;
    if (!first) sb.append(", ");
    sb.append("newViewNumber:");
    sb.append(this.newViewNumber);
    first = false;
    if (!first) sb.append(", ");
    sb.append("success:");
    sb.append(this.success);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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

  private static class StartViewChangeResponseStandardSchemeFactory implements SchemeFactory {
    public StartViewChangeResponseStandardScheme getScheme() {
      return new StartViewChangeResponseStandardScheme();
    }
  }

  private static class StartViewChangeResponseStandardScheme extends StandardScheme<StartViewChangeResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, StartViewChangeResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // REPLICA_NUMBER
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.replicaNumber = iprot.readI32();
              struct.setReplicaNumberIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NEW_VIEW_NUMBER
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.newViewNumber = iprot.readI32();
              struct.setNewViewNumberIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SUCCESS
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.success = iprot.readBool();
              struct.setSuccessIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, StartViewChangeResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(REPLICA_NUMBER_FIELD_DESC);
      oprot.writeI32(struct.replicaNumber);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(NEW_VIEW_NUMBER_FIELD_DESC);
      oprot.writeI32(struct.newViewNumber);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(SUCCESS_FIELD_DESC);
      oprot.writeBool(struct.success);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class StartViewChangeResponseTupleSchemeFactory implements SchemeFactory {
    public StartViewChangeResponseTupleScheme getScheme() {
      return new StartViewChangeResponseTupleScheme();
    }
  }

  private static class StartViewChangeResponseTupleScheme extends TupleScheme<StartViewChangeResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, StartViewChangeResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetReplicaNumber()) {
        optionals.set(0);
      }
      if (struct.isSetNewViewNumber()) {
        optionals.set(1);
      }
      if (struct.isSetSuccess()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetReplicaNumber()) {
        oprot.writeI32(struct.replicaNumber);
      }
      if (struct.isSetNewViewNumber()) {
        oprot.writeI32(struct.newViewNumber);
      }
      if (struct.isSetSuccess()) {
        oprot.writeBool(struct.success);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, StartViewChangeResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.replicaNumber = iprot.readI32();
        struct.setReplicaNumberIsSet(true);
      }
      if (incoming.get(1)) {
        struct.newViewNumber = iprot.readI32();
        struct.setNewViewNumberIsSet(true);
      }
      if (incoming.get(2)) {
        struct.success = iprot.readBool();
        struct.setSuccessIsSet(true);
      }
    }
  }

}
