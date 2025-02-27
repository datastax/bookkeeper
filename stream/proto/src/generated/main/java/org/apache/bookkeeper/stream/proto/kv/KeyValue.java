// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kv.proto

package org.apache.bookkeeper.stream.proto.kv;

/**
 * Protobuf type {@code bookkeeper.proto.kv.KeyValue}
 */
public final class KeyValue extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bookkeeper.proto.kv.KeyValue)
    KeyValueOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KeyValue.newBuilder() to construct.
  private KeyValue(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KeyValue() {
    key_ = com.google.protobuf.ByteString.EMPTY;
    value_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new KeyValue();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private KeyValue(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {

            key_ = input.readBytes();
            break;
          }
          case 16: {

            createRevision_ = input.readInt64();
            break;
          }
          case 24: {

            modRevision_ = input.readInt64();
            break;
          }
          case 32: {

            version_ = input.readInt64();
            break;
          }
          case 42: {

            value_ = input.readBytes();
            break;
          }
          case 48: {

            isNumber_ = input.readBool();
            break;
          }
          case 56: {

            numberValue_ = input.readInt64();
            break;
          }
          case 64: {

            expireTime_ = input.readInt64();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.apache.bookkeeper.stream.proto.kv.Kv.internal_static_bookkeeper_proto_kv_KeyValue_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.bookkeeper.stream.proto.kv.Kv.internal_static_bookkeeper_proto_kv_KeyValue_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.bookkeeper.stream.proto.kv.KeyValue.class, org.apache.bookkeeper.stream.proto.kv.KeyValue.Builder.class);
  }

  public static final int KEY_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString key_;
  /**
   * <pre>
   * key is the key in bytes. An empty key is not allowed.
   * </pre>
   *
   * <code>bytes key = 1;</code>
   * @return The key.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getKey() {
    return key_;
  }

  public static final int CREATE_REVISION_FIELD_NUMBER = 2;
  private long createRevision_;
  /**
   * <pre>
   * create_revision is the revision of last creation on this key.
   * </pre>
   *
   * <code>int64 create_revision = 2;</code>
   * @return The createRevision.
   */
  @java.lang.Override
  public long getCreateRevision() {
    return createRevision_;
  }

  public static final int MOD_REVISION_FIELD_NUMBER = 3;
  private long modRevision_;
  /**
   * <pre>
   * mod_revision is the revision of last modification on this key.
   * </pre>
   *
   * <code>int64 mod_revision = 3;</code>
   * @return The modRevision.
   */
  @java.lang.Override
  public long getModRevision() {
    return modRevision_;
  }

  public static final int VERSION_FIELD_NUMBER = 4;
  private long version_;
  /**
   * <pre>
   * version is the version of the key. A deletion resets
   * the version to zero and any modification of the key
   * increases its version.
   * </pre>
   *
   * <code>int64 version = 4;</code>
   * @return The version.
   */
  @java.lang.Override
  public long getVersion() {
    return version_;
  }

  public static final int VALUE_FIELD_NUMBER = 5;
  private com.google.protobuf.ByteString value_;
  /**
   * <pre>
   * value is the value held by the key, in bytes.
   * </pre>
   *
   * <code>bytes value = 5;</code>
   * @return The value.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getValue() {
    return value_;
  }

  public static final int IS_NUMBER_FIELD_NUMBER = 6;
  private boolean isNumber_;
  /**
   * <code>bool is_number = 6;</code>
   * @return The isNumber.
   */
  @java.lang.Override
  public boolean getIsNumber() {
    return isNumber_;
  }

  public static final int NUMBER_VALUE_FIELD_NUMBER = 7;
  private long numberValue_;
  /**
   * <code>int64 number_value = 7;</code>
   * @return The numberValue.
   */
  @java.lang.Override
  public long getNumberValue() {
    return numberValue_;
  }

  public static final int EXPIRE_TIME_FIELD_NUMBER = 8;
  private long expireTime_;
  /**
   * <pre>
   * time in milliseconds when the record expires (0 for none)
   * </pre>
   *
   * <code>int64 expire_time = 8;</code>
   * @return The expireTime.
   */
  @java.lang.Override
  public long getExpireTime() {
    return expireTime_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!key_.isEmpty()) {
      output.writeBytes(1, key_);
    }
    if (createRevision_ != 0L) {
      output.writeInt64(2, createRevision_);
    }
    if (modRevision_ != 0L) {
      output.writeInt64(3, modRevision_);
    }
    if (version_ != 0L) {
      output.writeInt64(4, version_);
    }
    if (!value_.isEmpty()) {
      output.writeBytes(5, value_);
    }
    if (isNumber_ != false) {
      output.writeBool(6, isNumber_);
    }
    if (numberValue_ != 0L) {
      output.writeInt64(7, numberValue_);
    }
    if (expireTime_ != 0L) {
      output.writeInt64(8, expireTime_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!key_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, key_);
    }
    if (createRevision_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, createRevision_);
    }
    if (modRevision_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, modRevision_);
    }
    if (version_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, version_);
    }
    if (!value_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(5, value_);
    }
    if (isNumber_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, isNumber_);
    }
    if (numberValue_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(7, numberValue_);
    }
    if (expireTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(8, expireTime_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.apache.bookkeeper.stream.proto.kv.KeyValue)) {
      return super.equals(obj);
    }
    org.apache.bookkeeper.stream.proto.kv.KeyValue other = (org.apache.bookkeeper.stream.proto.kv.KeyValue) obj;

    if (!getKey()
        .equals(other.getKey())) return false;
    if (getCreateRevision()
        != other.getCreateRevision()) return false;
    if (getModRevision()
        != other.getModRevision()) return false;
    if (getVersion()
        != other.getVersion()) return false;
    if (!getValue()
        .equals(other.getValue())) return false;
    if (getIsNumber()
        != other.getIsNumber()) return false;
    if (getNumberValue()
        != other.getNumberValue()) return false;
    if (getExpireTime()
        != other.getExpireTime()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + KEY_FIELD_NUMBER;
    hash = (53 * hash) + getKey().hashCode();
    hash = (37 * hash) + CREATE_REVISION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCreateRevision());
    hash = (37 * hash) + MOD_REVISION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getModRevision());
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getVersion());
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getValue().hashCode();
    hash = (37 * hash) + IS_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsNumber());
    hash = (37 * hash) + NUMBER_VALUE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNumberValue());
    hash = (37 * hash) + EXPIRE_TIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getExpireTime());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.bookkeeper.stream.proto.kv.KeyValue parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.bookkeeper.stream.proto.kv.KeyValue parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.bookkeeper.stream.proto.kv.KeyValue parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.bookkeeper.stream.proto.kv.KeyValue parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.bookkeeper.stream.proto.kv.KeyValue parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.bookkeeper.stream.proto.kv.KeyValue parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.bookkeeper.stream.proto.kv.KeyValue parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.bookkeeper.stream.proto.kv.KeyValue parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.bookkeeper.stream.proto.kv.KeyValue parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.apache.bookkeeper.stream.proto.kv.KeyValue parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.bookkeeper.stream.proto.kv.KeyValue parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.bookkeeper.stream.proto.kv.KeyValue parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.apache.bookkeeper.stream.proto.kv.KeyValue prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code bookkeeper.proto.kv.KeyValue}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bookkeeper.proto.kv.KeyValue)
      org.apache.bookkeeper.stream.proto.kv.KeyValueOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.bookkeeper.stream.proto.kv.Kv.internal_static_bookkeeper_proto_kv_KeyValue_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.bookkeeper.stream.proto.kv.Kv.internal_static_bookkeeper_proto_kv_KeyValue_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.bookkeeper.stream.proto.kv.KeyValue.class, org.apache.bookkeeper.stream.proto.kv.KeyValue.Builder.class);
    }

    // Construct using org.apache.bookkeeper.stream.proto.kv.KeyValue.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      key_ = com.google.protobuf.ByteString.EMPTY;

      createRevision_ = 0L;

      modRevision_ = 0L;

      version_ = 0L;

      value_ = com.google.protobuf.ByteString.EMPTY;

      isNumber_ = false;

      numberValue_ = 0L;

      expireTime_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.bookkeeper.stream.proto.kv.Kv.internal_static_bookkeeper_proto_kv_KeyValue_descriptor;
    }

    @java.lang.Override
    public org.apache.bookkeeper.stream.proto.kv.KeyValue getDefaultInstanceForType() {
      return org.apache.bookkeeper.stream.proto.kv.KeyValue.getDefaultInstance();
    }

    @java.lang.Override
    public org.apache.bookkeeper.stream.proto.kv.KeyValue build() {
      org.apache.bookkeeper.stream.proto.kv.KeyValue result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.apache.bookkeeper.stream.proto.kv.KeyValue buildPartial() {
      org.apache.bookkeeper.stream.proto.kv.KeyValue result = new org.apache.bookkeeper.stream.proto.kv.KeyValue(this);
      result.key_ = key_;
      result.createRevision_ = createRevision_;
      result.modRevision_ = modRevision_;
      result.version_ = version_;
      result.value_ = value_;
      result.isNumber_ = isNumber_;
      result.numberValue_ = numberValue_;
      result.expireTime_ = expireTime_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.apache.bookkeeper.stream.proto.kv.KeyValue) {
        return mergeFrom((org.apache.bookkeeper.stream.proto.kv.KeyValue)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.bookkeeper.stream.proto.kv.KeyValue other) {
      if (other == org.apache.bookkeeper.stream.proto.kv.KeyValue.getDefaultInstance()) return this;
      if (other.getKey() != com.google.protobuf.ByteString.EMPTY) {
        setKey(other.getKey());
      }
      if (other.getCreateRevision() != 0L) {
        setCreateRevision(other.getCreateRevision());
      }
      if (other.getModRevision() != 0L) {
        setModRevision(other.getModRevision());
      }
      if (other.getVersion() != 0L) {
        setVersion(other.getVersion());
      }
      if (other.getValue() != com.google.protobuf.ByteString.EMPTY) {
        setValue(other.getValue());
      }
      if (other.getIsNumber() != false) {
        setIsNumber(other.getIsNumber());
      }
      if (other.getNumberValue() != 0L) {
        setNumberValue(other.getNumberValue());
      }
      if (other.getExpireTime() != 0L) {
        setExpireTime(other.getExpireTime());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.apache.bookkeeper.stream.proto.kv.KeyValue parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.apache.bookkeeper.stream.proto.kv.KeyValue) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString key_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * key is the key in bytes. An empty key is not allowed.
     * </pre>
     *
     * <code>bytes key = 1;</code>
     * @return The key.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getKey() {
      return key_;
    }
    /**
     * <pre>
     * key is the key in bytes. An empty key is not allowed.
     * </pre>
     *
     * <code>bytes key = 1;</code>
     * @param value The key to set.
     * @return This builder for chaining.
     */
    public Builder setKey(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      key_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * key is the key in bytes. An empty key is not allowed.
     * </pre>
     *
     * <code>bytes key = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearKey() {
      
      key_ = getDefaultInstance().getKey();
      onChanged();
      return this;
    }

    private long createRevision_ ;
    /**
     * <pre>
     * create_revision is the revision of last creation on this key.
     * </pre>
     *
     * <code>int64 create_revision = 2;</code>
     * @return The createRevision.
     */
    @java.lang.Override
    public long getCreateRevision() {
      return createRevision_;
    }
    /**
     * <pre>
     * create_revision is the revision of last creation on this key.
     * </pre>
     *
     * <code>int64 create_revision = 2;</code>
     * @param value The createRevision to set.
     * @return This builder for chaining.
     */
    public Builder setCreateRevision(long value) {
      
      createRevision_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * create_revision is the revision of last creation on this key.
     * </pre>
     *
     * <code>int64 create_revision = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCreateRevision() {
      
      createRevision_ = 0L;
      onChanged();
      return this;
    }

    private long modRevision_ ;
    /**
     * <pre>
     * mod_revision is the revision of last modification on this key.
     * </pre>
     *
     * <code>int64 mod_revision = 3;</code>
     * @return The modRevision.
     */
    @java.lang.Override
    public long getModRevision() {
      return modRevision_;
    }
    /**
     * <pre>
     * mod_revision is the revision of last modification on this key.
     * </pre>
     *
     * <code>int64 mod_revision = 3;</code>
     * @param value The modRevision to set.
     * @return This builder for chaining.
     */
    public Builder setModRevision(long value) {
      
      modRevision_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * mod_revision is the revision of last modification on this key.
     * </pre>
     *
     * <code>int64 mod_revision = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearModRevision() {
      
      modRevision_ = 0L;
      onChanged();
      return this;
    }

    private long version_ ;
    /**
     * <pre>
     * version is the version of the key. A deletion resets
     * the version to zero and any modification of the key
     * increases its version.
     * </pre>
     *
     * <code>int64 version = 4;</code>
     * @return The version.
     */
    @java.lang.Override
    public long getVersion() {
      return version_;
    }
    /**
     * <pre>
     * version is the version of the key. A deletion resets
     * the version to zero and any modification of the key
     * increases its version.
     * </pre>
     *
     * <code>int64 version = 4;</code>
     * @param value The version to set.
     * @return This builder for chaining.
     */
    public Builder setVersion(long value) {
      
      version_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * version is the version of the key. A deletion resets
     * the version to zero and any modification of the key
     * increases its version.
     * </pre>
     *
     * <code>int64 version = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearVersion() {
      
      version_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString value_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * value is the value held by the key, in bytes.
     * </pre>
     *
     * <code>bytes value = 5;</code>
     * @return The value.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getValue() {
      return value_;
    }
    /**
     * <pre>
     * value is the value held by the key, in bytes.
     * </pre>
     *
     * <code>bytes value = 5;</code>
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * value is the value held by the key, in bytes.
     * </pre>
     *
     * <code>bytes value = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      
      value_ = getDefaultInstance().getValue();
      onChanged();
      return this;
    }

    private boolean isNumber_ ;
    /**
     * <code>bool is_number = 6;</code>
     * @return The isNumber.
     */
    @java.lang.Override
    public boolean getIsNumber() {
      return isNumber_;
    }
    /**
     * <code>bool is_number = 6;</code>
     * @param value The isNumber to set.
     * @return This builder for chaining.
     */
    public Builder setIsNumber(boolean value) {
      
      isNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_number = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsNumber() {
      
      isNumber_ = false;
      onChanged();
      return this;
    }

    private long numberValue_ ;
    /**
     * <code>int64 number_value = 7;</code>
     * @return The numberValue.
     */
    @java.lang.Override
    public long getNumberValue() {
      return numberValue_;
    }
    /**
     * <code>int64 number_value = 7;</code>
     * @param value The numberValue to set.
     * @return This builder for chaining.
     */
    public Builder setNumberValue(long value) {
      
      numberValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 number_value = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumberValue() {
      
      numberValue_ = 0L;
      onChanged();
      return this;
    }

    private long expireTime_ ;
    /**
     * <pre>
     * time in milliseconds when the record expires (0 for none)
     * </pre>
     *
     * <code>int64 expire_time = 8;</code>
     * @return The expireTime.
     */
    @java.lang.Override
    public long getExpireTime() {
      return expireTime_;
    }
    /**
     * <pre>
     * time in milliseconds when the record expires (0 for none)
     * </pre>
     *
     * <code>int64 expire_time = 8;</code>
     * @param value The expireTime to set.
     * @return This builder for chaining.
     */
    public Builder setExpireTime(long value) {
      
      expireTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * time in milliseconds when the record expires (0 for none)
     * </pre>
     *
     * <code>int64 expire_time = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearExpireTime() {
      
      expireTime_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:bookkeeper.proto.kv.KeyValue)
  }

  // @@protoc_insertion_point(class_scope:bookkeeper.proto.kv.KeyValue)
  private static final org.apache.bookkeeper.stream.proto.kv.KeyValue DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.bookkeeper.stream.proto.kv.KeyValue();
  }

  public static org.apache.bookkeeper.stream.proto.kv.KeyValue getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KeyValue>
      PARSER = new com.google.protobuf.AbstractParser<KeyValue>() {
    @java.lang.Override
    public KeyValue parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new KeyValue(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<KeyValue> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KeyValue> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.apache.bookkeeper.stream.proto.kv.KeyValue getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

