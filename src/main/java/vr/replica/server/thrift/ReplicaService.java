/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package vr.replica.server.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2014-12-8")
public class ReplicaService {

  public interface Iface {

    public ResponseStruct request(String op, String c, long r) throws org.apache.thrift.TException;

  }

  public interface AsyncIface {

    public void request(String op, String c, long r, org.apache.thrift.async.AsyncMethodCallback resultHandler) throws org.apache.thrift.TException;

  }

  public static class Client extends org.apache.thrift.TServiceClient implements Iface {
    public static class Factory implements org.apache.thrift.TServiceClientFactory<Client> {
      public Factory() {}
      public Client getClient(org.apache.thrift.protocol.TProtocol prot) {
        return new Client(prot);
      }
      public Client getClient(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TProtocol oprot) {
        return new Client(iprot, oprot);
      }
    }

    public Client(org.apache.thrift.protocol.TProtocol prot)
    {
      super(prot, prot);
    }

    public Client(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TProtocol oprot) {
      super(iprot, oprot);
    }

    public ResponseStruct request(String op, String c, long r) throws org.apache.thrift.TException
    {
      send_request(op, c, r);
      return recv_request();
    }

    public void send_request(String op, String c, long r) throws org.apache.thrift.TException
    {
      request_args args = new request_args();
      args.setOp(op);
      args.setC(c);
      args.setR(r);
      sendBase("request", args);
    }

    public ResponseStruct recv_request() throws org.apache.thrift.TException
    {
      request_result result = new request_result();
      receiveBase(result, "request");
      if (result.isSetSuccess()) {
        return result.success;
      }
      throw new org.apache.thrift.TApplicationException(org.apache.thrift.TApplicationException.MISSING_RESULT, "request failed: unknown result");
    }

  }
  public static class AsyncClient extends org.apache.thrift.async.TAsyncClient implements AsyncIface {
    public static class Factory implements org.apache.thrift.async.TAsyncClientFactory<AsyncClient> {
      private org.apache.thrift.async.TAsyncClientManager clientManager;
      private org.apache.thrift.protocol.TProtocolFactory protocolFactory;
      public Factory(org.apache.thrift.async.TAsyncClientManager clientManager, org.apache.thrift.protocol.TProtocolFactory protocolFactory) {
        this.clientManager = clientManager;
        this.protocolFactory = protocolFactory;
      }
      public AsyncClient getAsyncClient(org.apache.thrift.transport.TNonblockingTransport transport) {
        return new AsyncClient(protocolFactory, clientManager, transport);
      }
    }

    public AsyncClient(org.apache.thrift.protocol.TProtocolFactory protocolFactory, org.apache.thrift.async.TAsyncClientManager clientManager, org.apache.thrift.transport.TNonblockingTransport transport) {
      super(protocolFactory, clientManager, transport);
    }

    public void request(String op, String c, long r, org.apache.thrift.async.AsyncMethodCallback resultHandler) throws org.apache.thrift.TException {
      checkReady();
      request_call method_call = new request_call(op, c, r, resultHandler, this, ___protocolFactory, ___transport);
      this.___currentMethod = method_call;
      ___manager.call(method_call);
    }

    public static class request_call extends org.apache.thrift.async.TAsyncMethodCall {
      private String op;
      private String c;
      private long r;
      public request_call(String op, String c, long r, org.apache.thrift.async.AsyncMethodCallback resultHandler, org.apache.thrift.async.TAsyncClient client, org.apache.thrift.protocol.TProtocolFactory protocolFactory, org.apache.thrift.transport.TNonblockingTransport transport) throws org.apache.thrift.TException {
        super(client, protocolFactory, transport, resultHandler, false);
        this.op = op;
        this.c = c;
        this.r = r;
      }

      public void write_args(org.apache.thrift.protocol.TProtocol prot) throws org.apache.thrift.TException {
        prot.writeMessageBegin(new org.apache.thrift.protocol.TMessage("request", org.apache.thrift.protocol.TMessageType.CALL, 0));
        request_args args = new request_args();
        args.setOp(op);
        args.setC(c);
        args.setR(r);
        args.write(prot);
        prot.writeMessageEnd();
      }

      public ResponseStruct getResult() throws org.apache.thrift.TException {
        if (getState() != org.apache.thrift.async.TAsyncMethodCall.State.RESPONSE_READ) {
          throw new IllegalStateException("Method call not finished!");
        }
        org.apache.thrift.transport.TMemoryInputTransport memoryTransport = new org.apache.thrift.transport.TMemoryInputTransport(getFrameBuffer().array());
        org.apache.thrift.protocol.TProtocol prot = client.getProtocolFactory().getProtocol(memoryTransport);
        return (new Client(prot)).recv_request();
      }
    }

  }

  public static class Processor<I extends Iface> extends org.apache.thrift.TBaseProcessor<I> implements org.apache.thrift.TProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger(Processor.class.getName());
    public Processor(I iface) {
      super(iface, getProcessMap(new HashMap<String, org.apache.thrift.ProcessFunction<I, ? extends org.apache.thrift.TBase>>()));
    }

    protected Processor(I iface, Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> processMap) {
      super(iface, getProcessMap(processMap));
    }

    private static <I extends Iface> Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> getProcessMap(Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> processMap) {
      processMap.put("request", new request());
      return processMap;
    }

    public static class request<I extends Iface> extends org.apache.thrift.ProcessFunction<I, request_args> {
      public request() {
        super("request");
      }

      public request_args getEmptyArgsInstance() {
        return new request_args();
      }

      protected boolean isOneway() {
        return false;
      }

      public request_result getResult(I iface, request_args args) throws org.apache.thrift.TException {
        request_result result = new request_result();
        result.success = iface.request(args.op, args.c, args.r);
        return result;
      }
    }

  }

  public static class AsyncProcessor<I extends AsyncIface> extends org.apache.thrift.TBaseAsyncProcessor<I> {
    private static final Logger LOGGER = LoggerFactory.getLogger(AsyncProcessor.class.getName());
    public AsyncProcessor(I iface) {
      super(iface, getProcessMap(new HashMap<String, org.apache.thrift.AsyncProcessFunction<I, ? extends org.apache.thrift.TBase, ?>>()));
    }

    protected AsyncProcessor(I iface, Map<String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase, ?>> processMap) {
      super(iface, getProcessMap(processMap));
    }

    private static <I extends AsyncIface> Map<String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase,?>> getProcessMap(Map<String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase, ?>> processMap) {
      processMap.put("request", new request());
      return processMap;
    }

    public static class request<I extends AsyncIface> extends org.apache.thrift.AsyncProcessFunction<I, request_args, ResponseStruct> {
      public request() {
        super("request");
      }

      public request_args getEmptyArgsInstance() {
        return new request_args();
      }

      public AsyncMethodCallback<ResponseStruct> getResultHandler(final AsyncFrameBuffer fb, final int seqid) {
        final org.apache.thrift.AsyncProcessFunction fcall = this;
        return new AsyncMethodCallback<ResponseStruct>() { 
          public void onComplete(ResponseStruct o) {
            request_result result = new request_result();
            result.success = o;
            try {
              fcall.sendResponse(fb,result, org.apache.thrift.protocol.TMessageType.REPLY,seqid);
              return;
            } catch (Exception e) {
              LOGGER.error("Exception writing to internal frame buffer", e);
            }
            fb.close();
          }
          public void onError(Exception e) {
            byte msgType = org.apache.thrift.protocol.TMessageType.REPLY;
            org.apache.thrift.TBase msg;
            request_result result = new request_result();
            {
              msgType = org.apache.thrift.protocol.TMessageType.EXCEPTION;
              msg = (org.apache.thrift.TBase)new org.apache.thrift.TApplicationException(org.apache.thrift.TApplicationException.INTERNAL_ERROR, e.getMessage());
            }
            try {
              fcall.sendResponse(fb,msg,msgType,seqid);
              return;
            } catch (Exception ex) {
              LOGGER.error("Exception writing to internal frame buffer", ex);
            }
            fb.close();
          }
        };
      }

      protected boolean isOneway() {
        return false;
      }

      public void start(I iface, request_args args, org.apache.thrift.async.AsyncMethodCallback<ResponseStruct> resultHandler) throws TException {
        iface.request(args.op, args.c, args.r,resultHandler);
      }
    }

  }

  public static class request_args implements org.apache.thrift.TBase<request_args, request_args._Fields>, java.io.Serializable, Cloneable, Comparable<request_args>   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("request_args");

    private static final org.apache.thrift.protocol.TField OP_FIELD_DESC = new org.apache.thrift.protocol.TField("op", org.apache.thrift.protocol.TType.STRING, (short)1);
    private static final org.apache.thrift.protocol.TField C_FIELD_DESC = new org.apache.thrift.protocol.TField("c", org.apache.thrift.protocol.TType.STRING, (short)2);
    private static final org.apache.thrift.protocol.TField R_FIELD_DESC = new org.apache.thrift.protocol.TField("r", org.apache.thrift.protocol.TType.I64, (short)3);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
      schemes.put(StandardScheme.class, new request_argsStandardSchemeFactory());
      schemes.put(TupleScheme.class, new request_argsTupleSchemeFactory());
    }

    public String op; // required
    public String c; // required
    public long r; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
      OP((short)1, "op"),
      C((short)2, "c"),
      R((short)3, "r");

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
          case 1: // OP
            return OP;
          case 2: // C
            return C;
          case 3: // R
            return R;
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
    private static final int __R_ISSET_ID = 0;
    private byte __isset_bitfield = 0;
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
      Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
      tmpMap.put(_Fields.OP, new org.apache.thrift.meta_data.FieldMetaData("op", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
      tmpMap.put(_Fields.C, new org.apache.thrift.meta_data.FieldMetaData("c", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
      tmpMap.put(_Fields.R, new org.apache.thrift.meta_data.FieldMetaData("r", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64          , "long")));
      metaDataMap = Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(request_args.class, metaDataMap);
    }

    public request_args() {
    }

    public request_args(
      String op,
      String c,
      long r)
    {
      this();
      this.op = op;
      this.c = c;
      this.r = r;
      setRIsSet(true);
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public request_args(request_args other) {
      __isset_bitfield = other.__isset_bitfield;
      if (other.isSetOp()) {
        this.op = other.op;
      }
      if (other.isSetC()) {
        this.c = other.c;
      }
      this.r = other.r;
    }

    public request_args deepCopy() {
      return new request_args(this);
    }

    @Override
    public void clear() {
      this.op = null;
      this.c = null;
      setRIsSet(false);
      this.r = 0;
    }

    public String getOp() {
      return this.op;
    }

    public request_args setOp(String op) {
      this.op = op;
      return this;
    }

    public void unsetOp() {
      this.op = null;
    }

    /** Returns true if field op is set (has been assigned a value) and false otherwise */
    public boolean isSetOp() {
      return this.op != null;
    }

    public void setOpIsSet(boolean value) {
      if (!value) {
        this.op = null;
      }
    }

    public String getC() {
      return this.c;
    }

    public request_args setC(String c) {
      this.c = c;
      return this;
    }

    public void unsetC() {
      this.c = null;
    }

    /** Returns true if field c is set (has been assigned a value) and false otherwise */
    public boolean isSetC() {
      return this.c != null;
    }

    public void setCIsSet(boolean value) {
      if (!value) {
        this.c = null;
      }
    }

    public long getR() {
      return this.r;
    }

    public request_args setR(long r) {
      this.r = r;
      setRIsSet(true);
      return this;
    }

    public void unsetR() {
      __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __R_ISSET_ID);
    }

    /** Returns true if field r is set (has been assigned a value) and false otherwise */
    public boolean isSetR() {
      return EncodingUtils.testBit(__isset_bitfield, __R_ISSET_ID);
    }

    public void setRIsSet(boolean value) {
      __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __R_ISSET_ID, value);
    }

    public void setFieldValue(_Fields field, Object value) {
      switch (field) {
      case OP:
        if (value == null) {
          unsetOp();
        } else {
          setOp((String)value);
        }
        break;

      case C:
        if (value == null) {
          unsetC();
        } else {
          setC((String)value);
        }
        break;

      case R:
        if (value == null) {
          unsetR();
        } else {
          setR((Long)value);
        }
        break;

      }
    }

    public Object getFieldValue(_Fields field) {
      switch (field) {
      case OP:
        return getOp();

      case C:
        return getC();

      case R:
        return Long.valueOf(getR());

      }
      throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new IllegalArgumentException();
      }

      switch (field) {
      case OP:
        return isSetOp();
      case C:
        return isSetC();
      case R:
        return isSetR();
      }
      throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof request_args)
        return this.equals((request_args)that);
      return false;
    }

    public boolean equals(request_args that) {
      if (that == null)
        return false;

      boolean this_present_op = true && this.isSetOp();
      boolean that_present_op = true && that.isSetOp();
      if (this_present_op || that_present_op) {
        if (!(this_present_op && that_present_op))
          return false;
        if (!this.op.equals(that.op))
          return false;
      }

      boolean this_present_c = true && this.isSetC();
      boolean that_present_c = true && that.isSetC();
      if (this_present_c || that_present_c) {
        if (!(this_present_c && that_present_c))
          return false;
        if (!this.c.equals(that.c))
          return false;
      }

      boolean this_present_r = true;
      boolean that_present_r = true;
      if (this_present_r || that_present_r) {
        if (!(this_present_r && that_present_r))
          return false;
        if (this.r != that.r)
          return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      List<Object> list = new ArrayList<Object>();

      boolean present_op = true && (isSetOp());
      list.add(present_op);
      if (present_op)
        list.add(op);

      boolean present_c = true && (isSetC());
      list.add(present_c);
      if (present_c)
        list.add(c);

      boolean present_r = true;
      list.add(present_r);
      if (present_r)
        list.add(r);

      return list.hashCode();
    }

    @Override
    public int compareTo(request_args other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;

      lastComparison = Boolean.valueOf(isSetOp()).compareTo(other.isSetOp());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetOp()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.op, other.op);
        if (lastComparison != 0) {
          return lastComparison;
        }
      }
      lastComparison = Boolean.valueOf(isSetC()).compareTo(other.isSetC());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetC()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.c, other.c);
        if (lastComparison != 0) {
          return lastComparison;
        }
      }
      lastComparison = Boolean.valueOf(isSetR()).compareTo(other.isSetR());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetR()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.r, other.r);
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
      StringBuilder sb = new StringBuilder("request_args(");
      boolean first = true;

      sb.append("op:");
      if (this.op == null) {
        sb.append("null");
      } else {
        sb.append(this.op);
      }
      first = false;
      if (!first) sb.append(", ");
      sb.append("c:");
      if (this.c == null) {
        sb.append("null");
      } else {
        sb.append(this.c);
      }
      first = false;
      if (!first) sb.append(", ");
      sb.append("r:");
      sb.append(this.r);
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

    private static class request_argsStandardSchemeFactory implements SchemeFactory {
      public request_argsStandardScheme getScheme() {
        return new request_argsStandardScheme();
      }
    }

    private static class request_argsStandardScheme extends StandardScheme<request_args> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, request_args struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            case 1: // OP
              if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                struct.op = iprot.readString();
                struct.setOpIsSet(true);
              } else { 
                org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
              }
              break;
            case 2: // C
              if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                struct.c = iprot.readString();
                struct.setCIsSet(true);
              } else { 
                org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
              }
              break;
            case 3: // R
              if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
                struct.r = iprot.readI64();
                struct.setRIsSet(true);
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

      public void write(org.apache.thrift.protocol.TProtocol oprot, request_args struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.op != null) {
          oprot.writeFieldBegin(OP_FIELD_DESC);
          oprot.writeString(struct.op);
          oprot.writeFieldEnd();
        }
        if (struct.c != null) {
          oprot.writeFieldBegin(C_FIELD_DESC);
          oprot.writeString(struct.c);
          oprot.writeFieldEnd();
        }
        oprot.writeFieldBegin(R_FIELD_DESC);
        oprot.writeI64(struct.r);
        oprot.writeFieldEnd();
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class request_argsTupleSchemeFactory implements SchemeFactory {
      public request_argsTupleScheme getScheme() {
        return new request_argsTupleScheme();
      }
    }

    private static class request_argsTupleScheme extends TupleScheme<request_args> {

      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, request_args struct) throws org.apache.thrift.TException {
        TTupleProtocol oprot = (TTupleProtocol) prot;
        BitSet optionals = new BitSet();
        if (struct.isSetOp()) {
          optionals.set(0);
        }
        if (struct.isSetC()) {
          optionals.set(1);
        }
        if (struct.isSetR()) {
          optionals.set(2);
        }
        oprot.writeBitSet(optionals, 3);
        if (struct.isSetOp()) {
          oprot.writeString(struct.op);
        }
        if (struct.isSetC()) {
          oprot.writeString(struct.c);
        }
        if (struct.isSetR()) {
          oprot.writeI64(struct.r);
        }
      }

      @Override
      public void read(org.apache.thrift.protocol.TProtocol prot, request_args struct) throws org.apache.thrift.TException {
        TTupleProtocol iprot = (TTupleProtocol) prot;
        BitSet incoming = iprot.readBitSet(3);
        if (incoming.get(0)) {
          struct.op = iprot.readString();
          struct.setOpIsSet(true);
        }
        if (incoming.get(1)) {
          struct.c = iprot.readString();
          struct.setCIsSet(true);
        }
        if (incoming.get(2)) {
          struct.r = iprot.readI64();
          struct.setRIsSet(true);
        }
      }
    }

  }

  public static class request_result implements org.apache.thrift.TBase<request_result, request_result._Fields>, java.io.Serializable, Cloneable, Comparable<request_result>   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("request_result");

    private static final org.apache.thrift.protocol.TField SUCCESS_FIELD_DESC = new org.apache.thrift.protocol.TField("success", org.apache.thrift.protocol.TType.STRUCT, (short)0);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
      schemes.put(StandardScheme.class, new request_resultStandardSchemeFactory());
      schemes.put(TupleScheme.class, new request_resultTupleSchemeFactory());
    }

    public ResponseStruct success; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
      SUCCESS((short)0, "success");

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
          case 0: // SUCCESS
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
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
      Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
      tmpMap.put(_Fields.SUCCESS, new org.apache.thrift.meta_data.FieldMetaData("success", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ResponseStruct.class)));
      metaDataMap = Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(request_result.class, metaDataMap);
    }

    public request_result() {
    }

    public request_result(
      ResponseStruct success)
    {
      this();
      this.success = success;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public request_result(request_result other) {
      if (other.isSetSuccess()) {
        this.success = new ResponseStruct(other.success);
      }
    }

    public request_result deepCopy() {
      return new request_result(this);
    }

    @Override
    public void clear() {
      this.success = null;
    }

    public ResponseStruct getSuccess() {
      return this.success;
    }

    public request_result setSuccess(ResponseStruct success) {
      this.success = success;
      return this;
    }

    public void unsetSuccess() {
      this.success = null;
    }

    /** Returns true if field success is set (has been assigned a value) and false otherwise */
    public boolean isSetSuccess() {
      return this.success != null;
    }

    public void setSuccessIsSet(boolean value) {
      if (!value) {
        this.success = null;
      }
    }

    public void setFieldValue(_Fields field, Object value) {
      switch (field) {
      case SUCCESS:
        if (value == null) {
          unsetSuccess();
        } else {
          setSuccess((ResponseStruct)value);
        }
        break;

      }
    }

    public Object getFieldValue(_Fields field) {
      switch (field) {
      case SUCCESS:
        return getSuccess();

      }
      throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new IllegalArgumentException();
      }

      switch (field) {
      case SUCCESS:
        return isSetSuccess();
      }
      throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof request_result)
        return this.equals((request_result)that);
      return false;
    }

    public boolean equals(request_result that) {
      if (that == null)
        return false;

      boolean this_present_success = true && this.isSetSuccess();
      boolean that_present_success = true && that.isSetSuccess();
      if (this_present_success || that_present_success) {
        if (!(this_present_success && that_present_success))
          return false;
        if (!this.success.equals(that.success))
          return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      List<Object> list = new ArrayList<Object>();

      boolean present_success = true && (isSetSuccess());
      list.add(present_success);
      if (present_success)
        list.add(success);

      return list.hashCode();
    }

    @Override
    public int compareTo(request_result other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;

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
      StringBuilder sb = new StringBuilder("request_result(");
      boolean first = true;

      sb.append("success:");
      if (this.success == null) {
        sb.append("null");
      } else {
        sb.append(this.success);
      }
      first = false;
      sb.append(")");
      return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
      // check for required fields
      // check for sub-struct validity
      if (success != null) {
        success.validate();
      }
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
        read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private static class request_resultStandardSchemeFactory implements SchemeFactory {
      public request_resultStandardScheme getScheme() {
        return new request_resultStandardScheme();
      }
    }

    private static class request_resultStandardScheme extends StandardScheme<request_result> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, request_result struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            case 0: // SUCCESS
              if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
                struct.success = new ResponseStruct();
                struct.success.read(iprot);
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

      public void write(org.apache.thrift.protocol.TProtocol oprot, request_result struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.success != null) {
          oprot.writeFieldBegin(SUCCESS_FIELD_DESC);
          struct.success.write(oprot);
          oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class request_resultTupleSchemeFactory implements SchemeFactory {
      public request_resultTupleScheme getScheme() {
        return new request_resultTupleScheme();
      }
    }

    private static class request_resultTupleScheme extends TupleScheme<request_result> {

      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, request_result struct) throws org.apache.thrift.TException {
        TTupleProtocol oprot = (TTupleProtocol) prot;
        BitSet optionals = new BitSet();
        if (struct.isSetSuccess()) {
          optionals.set(0);
        }
        oprot.writeBitSet(optionals, 1);
        if (struct.isSetSuccess()) {
          struct.success.write(oprot);
        }
      }

      @Override
      public void read(org.apache.thrift.protocol.TProtocol prot, request_result struct) throws org.apache.thrift.TException {
        TTupleProtocol iprot = (TTupleProtocol) prot;
        BitSet incoming = iprot.readBitSet(1);
        if (incoming.get(0)) {
          struct.success = new ResponseStruct();
          struct.success.read(iprot);
          struct.setSuccessIsSet(true);
        }
      }
    }

  }

}
