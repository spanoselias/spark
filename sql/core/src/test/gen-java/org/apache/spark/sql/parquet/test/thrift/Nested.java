/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.spark.sql.parquet.test.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-7-7")
public class Nested implements org.apache.thrift.TBase<Nested, Nested._Fields>, java.io.Serializable, Cloneable, Comparable<Nested> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Nested");

  private static final org.apache.thrift.protocol.TField NESTED_INTS_COLUMN_FIELD_DESC = new org.apache.thrift.protocol.TField("nestedIntsColumn", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField NESTED_STRING_COLUMN_FIELD_DESC = new org.apache.thrift.protocol.TField("nestedStringColumn", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new NestedStandardSchemeFactory());
    schemes.put(TupleScheme.class, new NestedTupleSchemeFactory());
  }

  public List<Integer> nestedIntsColumn; // required
  public String nestedStringColumn; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NESTED_INTS_COLUMN((short)1, "nestedIntsColumn"),
    NESTED_STRING_COLUMN((short)2, "nestedStringColumn");

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
        case 1: // NESTED_INTS_COLUMN
          return NESTED_INTS_COLUMN;
        case 2: // NESTED_STRING_COLUMN
          return NESTED_STRING_COLUMN;
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
    tmpMap.put(_Fields.NESTED_INTS_COLUMN, new org.apache.thrift.meta_data.FieldMetaData("nestedIntsColumn", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    tmpMap.put(_Fields.NESTED_STRING_COLUMN, new org.apache.thrift.meta_data.FieldMetaData("nestedStringColumn", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Nested.class, metaDataMap);
  }

  public Nested() {
  }

  public Nested(
    List<Integer> nestedIntsColumn,
    String nestedStringColumn)
  {
    this();
    this.nestedIntsColumn = nestedIntsColumn;
    this.nestedStringColumn = nestedStringColumn;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Nested(Nested other) {
    if (other.isSetNestedIntsColumn()) {
      List<Integer> __this__nestedIntsColumn = new ArrayList<Integer>(other.nestedIntsColumn);
      this.nestedIntsColumn = __this__nestedIntsColumn;
    }
    if (other.isSetNestedStringColumn()) {
      this.nestedStringColumn = other.nestedStringColumn;
    }
  }

  public Nested deepCopy() {
    return new Nested(this);
  }

  @Override
  public void clear() {
    this.nestedIntsColumn = null;
    this.nestedStringColumn = null;
  }

  public int getNestedIntsColumnSize() {
    return (this.nestedIntsColumn == null) ? 0 : this.nestedIntsColumn.size();
  }

  public java.util.Iterator<Integer> getNestedIntsColumnIterator() {
    return (this.nestedIntsColumn == null) ? null : this.nestedIntsColumn.iterator();
  }

  public void addToNestedIntsColumn(int elem) {
    if (this.nestedIntsColumn == null) {
      this.nestedIntsColumn = new ArrayList<Integer>();
    }
    this.nestedIntsColumn.add(elem);
  }

  public List<Integer> getNestedIntsColumn() {
    return this.nestedIntsColumn;
  }

  public Nested setNestedIntsColumn(List<Integer> nestedIntsColumn) {
    this.nestedIntsColumn = nestedIntsColumn;
    return this;
  }

  public void unsetNestedIntsColumn() {
    this.nestedIntsColumn = null;
  }

  /** Returns true if field nestedIntsColumn is set (has been assigned a value) and false otherwise */
  public boolean isSetNestedIntsColumn() {
    return this.nestedIntsColumn != null;
  }

  public void setNestedIntsColumnIsSet(boolean value) {
    if (!value) {
      this.nestedIntsColumn = null;
    }
  }

  public String getNestedStringColumn() {
    return this.nestedStringColumn;
  }

  public Nested setNestedStringColumn(String nestedStringColumn) {
    this.nestedStringColumn = nestedStringColumn;
    return this;
  }

  public void unsetNestedStringColumn() {
    this.nestedStringColumn = null;
  }

  /** Returns true if field nestedStringColumn is set (has been assigned a value) and false otherwise */
  public boolean isSetNestedStringColumn() {
    return this.nestedStringColumn != null;
  }

  public void setNestedStringColumnIsSet(boolean value) {
    if (!value) {
      this.nestedStringColumn = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NESTED_INTS_COLUMN:
      if (value == null) {
        unsetNestedIntsColumn();
      } else {
        setNestedIntsColumn((List<Integer>)value);
      }
      break;

    case NESTED_STRING_COLUMN:
      if (value == null) {
        unsetNestedStringColumn();
      } else {
        setNestedStringColumn((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NESTED_INTS_COLUMN:
      return getNestedIntsColumn();

    case NESTED_STRING_COLUMN:
      return getNestedStringColumn();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NESTED_INTS_COLUMN:
      return isSetNestedIntsColumn();
    case NESTED_STRING_COLUMN:
      return isSetNestedStringColumn();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Nested)
      return this.equals((Nested)that);
    return false;
  }

  public boolean equals(Nested that) {
    if (that == null)
      return false;

    boolean this_present_nestedIntsColumn = true && this.isSetNestedIntsColumn();
    boolean that_present_nestedIntsColumn = true && that.isSetNestedIntsColumn();
    if (this_present_nestedIntsColumn || that_present_nestedIntsColumn) {
      if (!(this_present_nestedIntsColumn && that_present_nestedIntsColumn))
        return false;
      if (!this.nestedIntsColumn.equals(that.nestedIntsColumn))
        return false;
    }

    boolean this_present_nestedStringColumn = true && this.isSetNestedStringColumn();
    boolean that_present_nestedStringColumn = true && that.isSetNestedStringColumn();
    if (this_present_nestedStringColumn || that_present_nestedStringColumn) {
      if (!(this_present_nestedStringColumn && that_present_nestedStringColumn))
        return false;
      if (!this.nestedStringColumn.equals(that.nestedStringColumn))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_nestedIntsColumn = true && (isSetNestedIntsColumn());
    list.add(present_nestedIntsColumn);
    if (present_nestedIntsColumn)
      list.add(nestedIntsColumn);

    boolean present_nestedStringColumn = true && (isSetNestedStringColumn());
    list.add(present_nestedStringColumn);
    if (present_nestedStringColumn)
      list.add(nestedStringColumn);

    return list.hashCode();
  }

  @Override
  public int compareTo(Nested other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetNestedIntsColumn()).compareTo(other.isSetNestedIntsColumn());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNestedIntsColumn()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nestedIntsColumn, other.nestedIntsColumn);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNestedStringColumn()).compareTo(other.isSetNestedStringColumn());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNestedStringColumn()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nestedStringColumn, other.nestedStringColumn);
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
    StringBuilder sb = new StringBuilder("Nested(");
    boolean first = true;

    sb.append("nestedIntsColumn:");
    if (this.nestedIntsColumn == null) {
      sb.append("null");
    } else {
      sb.append(this.nestedIntsColumn);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("nestedStringColumn:");
    if (this.nestedStringColumn == null) {
      sb.append("null");
    } else {
      sb.append(this.nestedStringColumn);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (nestedIntsColumn == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'nestedIntsColumn' was not present! Struct: " + toString());
    }
    if (nestedStringColumn == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'nestedStringColumn' was not present! Struct: " + toString());
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class NestedStandardSchemeFactory implements SchemeFactory {
    public NestedStandardScheme getScheme() {
      return new NestedStandardScheme();
    }
  }

  private static class NestedStandardScheme extends StandardScheme<Nested> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Nested struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NESTED_INTS_COLUMN
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.nestedIntsColumn = new ArrayList<Integer>(_list0.size);
                int _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = iprot.readI32();
                  struct.nestedIntsColumn.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setNestedIntsColumnIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NESTED_STRING_COLUMN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.nestedStringColumn = iprot.readString();
              struct.setNestedStringColumnIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Nested struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.nestedIntsColumn != null) {
        oprot.writeFieldBegin(NESTED_INTS_COLUMN_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.nestedIntsColumn.size()));
          for (int _iter3 : struct.nestedIntsColumn)
          {
            oprot.writeI32(_iter3);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.nestedStringColumn != null) {
        oprot.writeFieldBegin(NESTED_STRING_COLUMN_FIELD_DESC);
        oprot.writeString(struct.nestedStringColumn);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class NestedTupleSchemeFactory implements SchemeFactory {
    public NestedTupleScheme getScheme() {
      return new NestedTupleScheme();
    }
  }

  private static class NestedTupleScheme extends TupleScheme<Nested> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Nested struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.nestedIntsColumn.size());
        for (int _iter4 : struct.nestedIntsColumn)
        {
          oprot.writeI32(_iter4);
        }
      }
      oprot.writeString(struct.nestedStringColumn);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Nested struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, iprot.readI32());
        struct.nestedIntsColumn = new ArrayList<Integer>(_list5.size);
        int _elem6;
        for (int _i7 = 0; _i7 < _list5.size; ++_i7)
        {
          _elem6 = iprot.readI32();
          struct.nestedIntsColumn.add(_elem6);
        }
      }
      struct.setNestedIntsColumnIsSet(true);
      struct.nestedStringColumn = iprot.readString();
      struct.setNestedStringColumnIsSet(true);
    }
  }

}

