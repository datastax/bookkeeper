// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: storage.proto

package org.apache.bookkeeper.stream.proto.storage;

/**
 * Protobuf type {@code bookkeeper.proto.storage.OneStorageContainerEndpointResponse}
 */
public final class OneStorageContainerEndpointResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bookkeeper.proto.storage.OneStorageContainerEndpointResponse)
    OneStorageContainerEndpointResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OneStorageContainerEndpointResponse.newBuilder() to construct.
  private OneStorageContainerEndpointResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OneStorageContainerEndpointResponse() {
    statusCode_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OneStorageContainerEndpointResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OneStorageContainerEndpointResponse(
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
          case 8: {
            int rawValue = input.readEnum();

            statusCode_ = rawValue;
            break;
          }
          case 18: {
            org.apache.bookkeeper.stream.proto.storage.StorageContainerEndpoint.Builder subBuilder = null;
            if (endpoint_ != null) {
              subBuilder = endpoint_.toBuilder();
            }
            endpoint_ = input.readMessage(org.apache.bookkeeper.stream.proto.storage.StorageContainerEndpoint.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(endpoint_);
              endpoint_ = subBuilder.buildPartial();
            }

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
    return org.apache.bookkeeper.stream.proto.storage.Storage.internal_static_bookkeeper_proto_storage_OneStorageContainerEndpointResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.bookkeeper.stream.proto.storage.Storage.internal_static_bookkeeper_proto_storage_OneStorageContainerEndpointResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.bookkeeper.stream.proto.storage.OneStorageContainerEndpointResponse.class, org.apache.bookkeeper.stream.proto.storage.OneStorageContainerEndpointResponse.Builder.class);
  }

  public static final int STATUS_CODE_FIELD_NUMBER = 1;
  private int statusCode_;
  /**
   * <code>.bookkeeper.proto.storage.StatusCode status_code = 1;</code>
   * @return The enum numeric value on the wire for statusCode.
   */
  @java.lang.Override public int getStatusCodeValue() {
    return statusCode_;
  }
  /**
   * <code>.bookkeeper.proto.storage.StatusCode status_code = 1;</code>
   * @return The statusCode.
   */
  @java.lang.Override public org.apache.bookkeeper.stream.proto.storage.StatusCode getStatusCode() {
    @SuppressWarnings("deprecation")
    org.apache.bookkeeper.stream.proto.storage.StatusCode result = org.apache.bookkeeper.stream.proto.storage.StatusCode.valueOf(statusCode_);
    return result == null ? org.apache.bookkeeper.stream.proto.storage.StatusCode.UNRECOGNIZED : result;
  }

  public static final int ENDPOINT_FIELD_NUMBER = 2;
  private org.apache.bookkeeper.stream.proto.storage.StorageContainerEndpoint endpoint_;
  /**
   * <code>.bookkeeper.proto.storage.StorageContainerEndpoint endpoint = 2;</code>
   * @return Whether the endpoint field is set.
   */
  @java.lang.Override
  public boolean hasEndpoint() {
    return endpoint_ != null;
  }
  /**
   * <code>.bookkeeper.proto.storage.StorageContainerEndpoint endpoint = 2;</code>
   * @return The endpoint.
   */
  @java.lang.Override
  public org.apache.bookkeeper.stream.proto.storage.StorageContainerEndpoint getEndpoint() {
    return endpoint_ == null ? org.apache.bookkeeper.stream.proto.storage.StorageContainerEndpoint.getDefaultInstance() : endpoint_;
  }
  /**
   * <code>.bookkeeper.proto.storage.StorageContainerEndpoint endpoint = 2;</code>
   */
  @java.lang.Override
  public org.apache.bookkeeper.stream.proto.storage.StorageContainerEndpointOrBuilder getEndpointOrBuilder() {
    return getEndpoint();
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
    if (statusCode_ != org.apache.bookkeeper.stream.proto.storage.StatusCode.SUCCESS.getNumber()) {
      output.writeEnum(1, statusCode_);
    }
    if (endpoint_ != null) {
      output.writeMessage(2, getEndpoint());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (statusCode_ != org.apache.bookkeeper.stream.proto.storage.StatusCode.SUCCESS.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, statusCode_);
    }
    if (endpoint_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getEndpoint());
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
    if (!(obj instanceof org.apache.bookkeeper.stream.proto.storage.OneStorageContainerEndpointResponse)) {
      return super.equals(obj);
    }
    org.apache.bookkeeper.stream.proto.storage.OneStorageContainerEndpointResponse other = (org.apache.bookkeeper.stream.proto.storage.OneStorageContainerEndpointResponse) obj;

    if (statusCode_ != other.statusCode_) return false;
    if (hasEndpoint() != other.hasEndpoint()) return false;
    if (hasEndpoint()) {
      if (!getEndpoint()
          .equals(other.getEndpoint())) return false;
    }
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
    hash = (37 * hash) + STATUS_CODE_FIELD_NUMBER;
    hash = (53 * hash) + statusCode_;
    if (hasEndpoint()) {
      hash = (37 * hash) + ENDPOINT_FIELD_NUMBER;
      hash = (53 * hash) + getEndpoint().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.bookkeeper.stream.proto.storage.OneStorageContainerEndpointResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.bookkeeper.stream.proto.storage.OneStorageContainerEndpointResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.bookkeeper.stream.proto.storage.OneStorageContainerEndpointResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.bookkeeper.stream.proto.storage.OneStorageContainerEndpointResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.bookkeeper.stream.proto.storage.OneStorageContainerEndpointResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.bookkeeper.stream.proto.storage.OneStorageContainerEndpointResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.bookkeeper.stream.proto.storage.OneStorageContainerEndpointResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.bookkeeper.stream.proto.storage.OneStorageContainerEndpointResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.bookkeeper.stream.proto.storage.OneStorageContainerEndpointResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.apache.bookkeeper.stream.proto.storage.OneStorageContainerEndpointResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.bookkeeper.stream.proto.storage.OneStorageContainerEndpointResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.bookkeeper.stream.proto.storage.OneStorageContainerEndpointResponse parseFrom(
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
  public static Builder newBuilder(org.apache.bookkeeper.stream.proto.storage.OneStorageContainerEndpointResponse prototype) {
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
   * Protobuf type {@code bookkeeper.proto.storage.OneStorageContainerEndpointResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bookkeeper.proto.storage.OneStorageContainerEndpointResponse)
      org.apache.bookkeeper.stream.proto.storage.OneStorageContainerEndpointResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.bookkeeper.stream.proto.storage.Storage.internal_static_bookkeeper_proto_storage_OneStorageContainerEndpointResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.bookkeeper.stream.proto.storage.Storage.internal_static_bookkeeper_proto_storage_OneStorageContainerEndpointResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.bookkeeper.stream.proto.storage.OneStorageContainerEndpointResponse.class, org.apache.bookkeeper.stream.proto.storage.OneStorageContainerEndpointResponse.Builder.class);
    }

    // Construct using org.apache.bookkeeper.stream.proto.storage.OneStorageContainerEndpointResponse.newBuilder()
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
      statusCode_ = 0;

      if (endpointBuilder_ == null) {
        endpoint_ = null;
      } else {
        endpoint_ = null;
        endpointBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.bookkeeper.stream.proto.storage.Storage.internal_static_bookkeeper_proto_storage_OneStorageContainerEndpointResponse_descriptor;
    }

    @java.lang.Override
    public org.apache.bookkeeper.stream.proto.storage.OneStorageContainerEndpointResponse getDefaultInstanceForType() {
      return org.apache.bookkeeper.stream.proto.storage.OneStorageContainerEndpointResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.apache.bookkeeper.stream.proto.storage.OneStorageContainerEndpointResponse build() {
      org.apache.bookkeeper.stream.proto.storage.OneStorageContainerEndpointResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.apache.bookkeeper.stream.proto.storage.OneStorageContainerEndpointResponse buildPartial() {
      org.apache.bookkeeper.stream.proto.storage.OneStorageContainerEndpointResponse result = new org.apache.bookkeeper.stream.proto.storage.OneStorageContainerEndpointResponse(this);
      result.statusCode_ = statusCode_;
      if (endpointBuilder_ == null) {
        result.endpoint_ = endpoint_;
      } else {
        result.endpoint_ = endpointBuilder_.build();
      }
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
      if (other instanceof org.apache.bookkeeper.stream.proto.storage.OneStorageContainerEndpointResponse) {
        return mergeFrom((org.apache.bookkeeper.stream.proto.storage.OneStorageContainerEndpointResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.bookkeeper.stream.proto.storage.OneStorageContainerEndpointResponse other) {
      if (other == org.apache.bookkeeper.stream.proto.storage.OneStorageContainerEndpointResponse.getDefaultInstance()) return this;
      if (other.statusCode_ != 0) {
        setStatusCodeValue(other.getStatusCodeValue());
      }
      if (other.hasEndpoint()) {
        mergeEndpoint(other.getEndpoint());
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
      org.apache.bookkeeper.stream.proto.storage.OneStorageContainerEndpointResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.apache.bookkeeper.stream.proto.storage.OneStorageContainerEndpointResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int statusCode_ = 0;
    /**
     * <code>.bookkeeper.proto.storage.StatusCode status_code = 1;</code>
     * @return The enum numeric value on the wire for statusCode.
     */
    @java.lang.Override public int getStatusCodeValue() {
      return statusCode_;
    }
    /**
     * <code>.bookkeeper.proto.storage.StatusCode status_code = 1;</code>
     * @param value The enum numeric value on the wire for statusCode to set.
     * @return This builder for chaining.
     */
    public Builder setStatusCodeValue(int value) {
      
      statusCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.bookkeeper.proto.storage.StatusCode status_code = 1;</code>
     * @return The statusCode.
     */
    @java.lang.Override
    public org.apache.bookkeeper.stream.proto.storage.StatusCode getStatusCode() {
      @SuppressWarnings("deprecation")
      org.apache.bookkeeper.stream.proto.storage.StatusCode result = org.apache.bookkeeper.stream.proto.storage.StatusCode.valueOf(statusCode_);
      return result == null ? org.apache.bookkeeper.stream.proto.storage.StatusCode.UNRECOGNIZED : result;
    }
    /**
     * <code>.bookkeeper.proto.storage.StatusCode status_code = 1;</code>
     * @param value The statusCode to set.
     * @return This builder for chaining.
     */
    public Builder setStatusCode(org.apache.bookkeeper.stream.proto.storage.StatusCode value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      statusCode_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.bookkeeper.proto.storage.StatusCode status_code = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatusCode() {
      
      statusCode_ = 0;
      onChanged();
      return this;
    }

    private org.apache.bookkeeper.stream.proto.storage.StorageContainerEndpoint endpoint_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.apache.bookkeeper.stream.proto.storage.StorageContainerEndpoint, org.apache.bookkeeper.stream.proto.storage.StorageContainerEndpoint.Builder, org.apache.bookkeeper.stream.proto.storage.StorageContainerEndpointOrBuilder> endpointBuilder_;
    /**
     * <code>.bookkeeper.proto.storage.StorageContainerEndpoint endpoint = 2;</code>
     * @return Whether the endpoint field is set.
     */
    public boolean hasEndpoint() {
      return endpointBuilder_ != null || endpoint_ != null;
    }
    /**
     * <code>.bookkeeper.proto.storage.StorageContainerEndpoint endpoint = 2;</code>
     * @return The endpoint.
     */
    public org.apache.bookkeeper.stream.proto.storage.StorageContainerEndpoint getEndpoint() {
      if (endpointBuilder_ == null) {
        return endpoint_ == null ? org.apache.bookkeeper.stream.proto.storage.StorageContainerEndpoint.getDefaultInstance() : endpoint_;
      } else {
        return endpointBuilder_.getMessage();
      }
    }
    /**
     * <code>.bookkeeper.proto.storage.StorageContainerEndpoint endpoint = 2;</code>
     */
    public Builder setEndpoint(org.apache.bookkeeper.stream.proto.storage.StorageContainerEndpoint value) {
      if (endpointBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        endpoint_ = value;
        onChanged();
      } else {
        endpointBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.bookkeeper.proto.storage.StorageContainerEndpoint endpoint = 2;</code>
     */
    public Builder setEndpoint(
        org.apache.bookkeeper.stream.proto.storage.StorageContainerEndpoint.Builder builderForValue) {
      if (endpointBuilder_ == null) {
        endpoint_ = builderForValue.build();
        onChanged();
      } else {
        endpointBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.bookkeeper.proto.storage.StorageContainerEndpoint endpoint = 2;</code>
     */
    public Builder mergeEndpoint(org.apache.bookkeeper.stream.proto.storage.StorageContainerEndpoint value) {
      if (endpointBuilder_ == null) {
        if (endpoint_ != null) {
          endpoint_ =
            org.apache.bookkeeper.stream.proto.storage.StorageContainerEndpoint.newBuilder(endpoint_).mergeFrom(value).buildPartial();
        } else {
          endpoint_ = value;
        }
        onChanged();
      } else {
        endpointBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.bookkeeper.proto.storage.StorageContainerEndpoint endpoint = 2;</code>
     */
    public Builder clearEndpoint() {
      if (endpointBuilder_ == null) {
        endpoint_ = null;
        onChanged();
      } else {
        endpoint_ = null;
        endpointBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.bookkeeper.proto.storage.StorageContainerEndpoint endpoint = 2;</code>
     */
    public org.apache.bookkeeper.stream.proto.storage.StorageContainerEndpoint.Builder getEndpointBuilder() {
      
      onChanged();
      return getEndpointFieldBuilder().getBuilder();
    }
    /**
     * <code>.bookkeeper.proto.storage.StorageContainerEndpoint endpoint = 2;</code>
     */
    public org.apache.bookkeeper.stream.proto.storage.StorageContainerEndpointOrBuilder getEndpointOrBuilder() {
      if (endpointBuilder_ != null) {
        return endpointBuilder_.getMessageOrBuilder();
      } else {
        return endpoint_ == null ?
            org.apache.bookkeeper.stream.proto.storage.StorageContainerEndpoint.getDefaultInstance() : endpoint_;
      }
    }
    /**
     * <code>.bookkeeper.proto.storage.StorageContainerEndpoint endpoint = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.apache.bookkeeper.stream.proto.storage.StorageContainerEndpoint, org.apache.bookkeeper.stream.proto.storage.StorageContainerEndpoint.Builder, org.apache.bookkeeper.stream.proto.storage.StorageContainerEndpointOrBuilder> 
        getEndpointFieldBuilder() {
      if (endpointBuilder_ == null) {
        endpointBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.apache.bookkeeper.stream.proto.storage.StorageContainerEndpoint, org.apache.bookkeeper.stream.proto.storage.StorageContainerEndpoint.Builder, org.apache.bookkeeper.stream.proto.storage.StorageContainerEndpointOrBuilder>(
                getEndpoint(),
                getParentForChildren(),
                isClean());
        endpoint_ = null;
      }
      return endpointBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bookkeeper.proto.storage.OneStorageContainerEndpointResponse)
  }

  // @@protoc_insertion_point(class_scope:bookkeeper.proto.storage.OneStorageContainerEndpointResponse)
  private static final org.apache.bookkeeper.stream.proto.storage.OneStorageContainerEndpointResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.bookkeeper.stream.proto.storage.OneStorageContainerEndpointResponse();
  }

  public static org.apache.bookkeeper.stream.proto.storage.OneStorageContainerEndpointResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OneStorageContainerEndpointResponse>
      PARSER = new com.google.protobuf.AbstractParser<OneStorageContainerEndpointResponse>() {
    @java.lang.Override
    public OneStorageContainerEndpointResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OneStorageContainerEndpointResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OneStorageContainerEndpointResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OneStorageContainerEndpointResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.apache.bookkeeper.stream.proto.storage.OneStorageContainerEndpointResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

