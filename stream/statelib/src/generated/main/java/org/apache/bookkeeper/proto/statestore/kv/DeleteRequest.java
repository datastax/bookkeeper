// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kv.proto

package org.apache.bookkeeper.proto.statestore.kv;

/**
 * Protobuf type {@code distributedlog.proto.statestore.kv.DeleteRequest}
 */
public final class DeleteRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:distributedlog.proto.statestore.kv.DeleteRequest)
    DeleteRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeleteRequest.newBuilder() to construct.
  private DeleteRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeleteRequest() {
    key_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeleteRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DeleteRequest(
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
    return org.apache.bookkeeper.proto.statestore.kv.Kv.internal_static_distributedlog_proto_statestore_kv_DeleteRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.bookkeeper.proto.statestore.kv.Kv.internal_static_distributedlog_proto_statestore_kv_DeleteRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.bookkeeper.proto.statestore.kv.DeleteRequest.class, org.apache.bookkeeper.proto.statestore.kv.DeleteRequest.Builder.class);
  }

  public static final int KEY_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString key_;
  /**
   * <code>bytes key = 1;</code>
   * @return The key.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getKey() {
    return key_;
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
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.apache.bookkeeper.proto.statestore.kv.DeleteRequest)) {
      return super.equals(obj);
    }
    org.apache.bookkeeper.proto.statestore.kv.DeleteRequest other = (org.apache.bookkeeper.proto.statestore.kv.DeleteRequest) obj;

    if (!getKey()
        .equals(other.getKey())) return false;
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
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.bookkeeper.proto.statestore.kv.DeleteRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.bookkeeper.proto.statestore.kv.DeleteRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.bookkeeper.proto.statestore.kv.DeleteRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.bookkeeper.proto.statestore.kv.DeleteRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.bookkeeper.proto.statestore.kv.DeleteRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.bookkeeper.proto.statestore.kv.DeleteRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.bookkeeper.proto.statestore.kv.DeleteRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.bookkeeper.proto.statestore.kv.DeleteRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.bookkeeper.proto.statestore.kv.DeleteRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.apache.bookkeeper.proto.statestore.kv.DeleteRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.bookkeeper.proto.statestore.kv.DeleteRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.bookkeeper.proto.statestore.kv.DeleteRequest parseFrom(
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
  public static Builder newBuilder(org.apache.bookkeeper.proto.statestore.kv.DeleteRequest prototype) {
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
   * Protobuf type {@code distributedlog.proto.statestore.kv.DeleteRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:distributedlog.proto.statestore.kv.DeleteRequest)
      org.apache.bookkeeper.proto.statestore.kv.DeleteRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.bookkeeper.proto.statestore.kv.Kv.internal_static_distributedlog_proto_statestore_kv_DeleteRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.bookkeeper.proto.statestore.kv.Kv.internal_static_distributedlog_proto_statestore_kv_DeleteRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.bookkeeper.proto.statestore.kv.DeleteRequest.class, org.apache.bookkeeper.proto.statestore.kv.DeleteRequest.Builder.class);
    }

    // Construct using org.apache.bookkeeper.proto.statestore.kv.DeleteRequest.newBuilder()
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

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.bookkeeper.proto.statestore.kv.Kv.internal_static_distributedlog_proto_statestore_kv_DeleteRequest_descriptor;
    }

    @java.lang.Override
    public org.apache.bookkeeper.proto.statestore.kv.DeleteRequest getDefaultInstanceForType() {
      return org.apache.bookkeeper.proto.statestore.kv.DeleteRequest.getDefaultInstance();
    }

    @java.lang.Override
    public org.apache.bookkeeper.proto.statestore.kv.DeleteRequest build() {
      org.apache.bookkeeper.proto.statestore.kv.DeleteRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.apache.bookkeeper.proto.statestore.kv.DeleteRequest buildPartial() {
      org.apache.bookkeeper.proto.statestore.kv.DeleteRequest result = new org.apache.bookkeeper.proto.statestore.kv.DeleteRequest(this);
      result.key_ = key_;
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
      if (other instanceof org.apache.bookkeeper.proto.statestore.kv.DeleteRequest) {
        return mergeFrom((org.apache.bookkeeper.proto.statestore.kv.DeleteRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.bookkeeper.proto.statestore.kv.DeleteRequest other) {
      if (other == org.apache.bookkeeper.proto.statestore.kv.DeleteRequest.getDefaultInstance()) return this;
      if (other.getKey() != com.google.protobuf.ByteString.EMPTY) {
        setKey(other.getKey());
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
      org.apache.bookkeeper.proto.statestore.kv.DeleteRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.apache.bookkeeper.proto.statestore.kv.DeleteRequest) e.getUnfinishedMessage();
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
     * <code>bytes key = 1;</code>
     * @return The key.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getKey() {
      return key_;
    }
    /**
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
     * <code>bytes key = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearKey() {
      
      key_ = getDefaultInstance().getKey();
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


    // @@protoc_insertion_point(builder_scope:distributedlog.proto.statestore.kv.DeleteRequest)
  }

  // @@protoc_insertion_point(class_scope:distributedlog.proto.statestore.kv.DeleteRequest)
  private static final org.apache.bookkeeper.proto.statestore.kv.DeleteRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.bookkeeper.proto.statestore.kv.DeleteRequest();
  }

  public static org.apache.bookkeeper.proto.statestore.kv.DeleteRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteRequest>
      PARSER = new com.google.protobuf.AbstractParser<DeleteRequest>() {
    @java.lang.Override
    public DeleteRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DeleteRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DeleteRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.apache.bookkeeper.proto.statestore.kv.DeleteRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

