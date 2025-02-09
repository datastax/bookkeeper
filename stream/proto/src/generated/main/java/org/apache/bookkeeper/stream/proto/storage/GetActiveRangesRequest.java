// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: storage.proto

package org.apache.bookkeeper.stream.proto.storage;

/**
 * Protobuf type {@code bookkeeper.proto.storage.GetActiveRangesRequest}
 */
public final class GetActiveRangesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bookkeeper.proto.storage.GetActiveRangesRequest)
    GetActiveRangesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetActiveRangesRequest.newBuilder() to construct.
  private GetActiveRangesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetActiveRangesRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetActiveRangesRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetActiveRangesRequest(
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

            streamId_ = input.readInt64();
            break;
          }
          case 18: {
            org.apache.bookkeeper.stream.proto.StreamProperties.Builder subBuilder = null;
            if (streamProps_ != null) {
              subBuilder = streamProps_.toBuilder();
            }
            streamProps_ = input.readMessage(org.apache.bookkeeper.stream.proto.StreamProperties.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(streamProps_);
              streamProps_ = subBuilder.buildPartial();
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
    return org.apache.bookkeeper.stream.proto.storage.Storage.internal_static_bookkeeper_proto_storage_GetActiveRangesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.bookkeeper.stream.proto.storage.Storage.internal_static_bookkeeper_proto_storage_GetActiveRangesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.bookkeeper.stream.proto.storage.GetActiveRangesRequest.class, org.apache.bookkeeper.stream.proto.storage.GetActiveRangesRequest.Builder.class);
  }

  public static final int STREAM_ID_FIELD_NUMBER = 1;
  private long streamId_;
  /**
   * <code>int64 stream_id = 1;</code>
   * @return The streamId.
   */
  @java.lang.Override
  public long getStreamId() {
    return streamId_;
  }

  public static final int STREAM_PROPS_FIELD_NUMBER = 2;
  private org.apache.bookkeeper.stream.proto.StreamProperties streamProps_;
  /**
   * <pre>
   * create stream if not exists
   * </pre>
   *
   * <code>.bookkeeper.proto.stream.StreamProperties stream_props = 2;</code>
   * @return Whether the streamProps field is set.
   */
  @java.lang.Override
  public boolean hasStreamProps() {
    return streamProps_ != null;
  }
  /**
   * <pre>
   * create stream if not exists
   * </pre>
   *
   * <code>.bookkeeper.proto.stream.StreamProperties stream_props = 2;</code>
   * @return The streamProps.
   */
  @java.lang.Override
  public org.apache.bookkeeper.stream.proto.StreamProperties getStreamProps() {
    return streamProps_ == null ? org.apache.bookkeeper.stream.proto.StreamProperties.getDefaultInstance() : streamProps_;
  }
  /**
   * <pre>
   * create stream if not exists
   * </pre>
   *
   * <code>.bookkeeper.proto.stream.StreamProperties stream_props = 2;</code>
   */
  @java.lang.Override
  public org.apache.bookkeeper.stream.proto.StreamPropertiesOrBuilder getStreamPropsOrBuilder() {
    return getStreamProps();
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
    if (streamId_ != 0L) {
      output.writeInt64(1, streamId_);
    }
    if (streamProps_ != null) {
      output.writeMessage(2, getStreamProps());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (streamId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, streamId_);
    }
    if (streamProps_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getStreamProps());
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
    if (!(obj instanceof org.apache.bookkeeper.stream.proto.storage.GetActiveRangesRequest)) {
      return super.equals(obj);
    }
    org.apache.bookkeeper.stream.proto.storage.GetActiveRangesRequest other = (org.apache.bookkeeper.stream.proto.storage.GetActiveRangesRequest) obj;

    if (getStreamId()
        != other.getStreamId()) return false;
    if (hasStreamProps() != other.hasStreamProps()) return false;
    if (hasStreamProps()) {
      if (!getStreamProps()
          .equals(other.getStreamProps())) return false;
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
    hash = (37 * hash) + STREAM_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getStreamId());
    if (hasStreamProps()) {
      hash = (37 * hash) + STREAM_PROPS_FIELD_NUMBER;
      hash = (53 * hash) + getStreamProps().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.bookkeeper.stream.proto.storage.GetActiveRangesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.bookkeeper.stream.proto.storage.GetActiveRangesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.bookkeeper.stream.proto.storage.GetActiveRangesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.bookkeeper.stream.proto.storage.GetActiveRangesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.bookkeeper.stream.proto.storage.GetActiveRangesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.bookkeeper.stream.proto.storage.GetActiveRangesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.bookkeeper.stream.proto.storage.GetActiveRangesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.bookkeeper.stream.proto.storage.GetActiveRangesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.bookkeeper.stream.proto.storage.GetActiveRangesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.apache.bookkeeper.stream.proto.storage.GetActiveRangesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.bookkeeper.stream.proto.storage.GetActiveRangesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.bookkeeper.stream.proto.storage.GetActiveRangesRequest parseFrom(
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
  public static Builder newBuilder(org.apache.bookkeeper.stream.proto.storage.GetActiveRangesRequest prototype) {
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
   * Protobuf type {@code bookkeeper.proto.storage.GetActiveRangesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bookkeeper.proto.storage.GetActiveRangesRequest)
      org.apache.bookkeeper.stream.proto.storage.GetActiveRangesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.bookkeeper.stream.proto.storage.Storage.internal_static_bookkeeper_proto_storage_GetActiveRangesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.bookkeeper.stream.proto.storage.Storage.internal_static_bookkeeper_proto_storage_GetActiveRangesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.bookkeeper.stream.proto.storage.GetActiveRangesRequest.class, org.apache.bookkeeper.stream.proto.storage.GetActiveRangesRequest.Builder.class);
    }

    // Construct using org.apache.bookkeeper.stream.proto.storage.GetActiveRangesRequest.newBuilder()
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
      streamId_ = 0L;

      if (streamPropsBuilder_ == null) {
        streamProps_ = null;
      } else {
        streamProps_ = null;
        streamPropsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.bookkeeper.stream.proto.storage.Storage.internal_static_bookkeeper_proto_storage_GetActiveRangesRequest_descriptor;
    }

    @java.lang.Override
    public org.apache.bookkeeper.stream.proto.storage.GetActiveRangesRequest getDefaultInstanceForType() {
      return org.apache.bookkeeper.stream.proto.storage.GetActiveRangesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public org.apache.bookkeeper.stream.proto.storage.GetActiveRangesRequest build() {
      org.apache.bookkeeper.stream.proto.storage.GetActiveRangesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.apache.bookkeeper.stream.proto.storage.GetActiveRangesRequest buildPartial() {
      org.apache.bookkeeper.stream.proto.storage.GetActiveRangesRequest result = new org.apache.bookkeeper.stream.proto.storage.GetActiveRangesRequest(this);
      result.streamId_ = streamId_;
      if (streamPropsBuilder_ == null) {
        result.streamProps_ = streamProps_;
      } else {
        result.streamProps_ = streamPropsBuilder_.build();
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
      if (other instanceof org.apache.bookkeeper.stream.proto.storage.GetActiveRangesRequest) {
        return mergeFrom((org.apache.bookkeeper.stream.proto.storage.GetActiveRangesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.bookkeeper.stream.proto.storage.GetActiveRangesRequest other) {
      if (other == org.apache.bookkeeper.stream.proto.storage.GetActiveRangesRequest.getDefaultInstance()) return this;
      if (other.getStreamId() != 0L) {
        setStreamId(other.getStreamId());
      }
      if (other.hasStreamProps()) {
        mergeStreamProps(other.getStreamProps());
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
      org.apache.bookkeeper.stream.proto.storage.GetActiveRangesRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.apache.bookkeeper.stream.proto.storage.GetActiveRangesRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long streamId_ ;
    /**
     * <code>int64 stream_id = 1;</code>
     * @return The streamId.
     */
    @java.lang.Override
    public long getStreamId() {
      return streamId_;
    }
    /**
     * <code>int64 stream_id = 1;</code>
     * @param value The streamId to set.
     * @return This builder for chaining.
     */
    public Builder setStreamId(long value) {
      
      streamId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 stream_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStreamId() {
      
      streamId_ = 0L;
      onChanged();
      return this;
    }

    private org.apache.bookkeeper.stream.proto.StreamProperties streamProps_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.apache.bookkeeper.stream.proto.StreamProperties, org.apache.bookkeeper.stream.proto.StreamProperties.Builder, org.apache.bookkeeper.stream.proto.StreamPropertiesOrBuilder> streamPropsBuilder_;
    /**
     * <pre>
     * create stream if not exists
     * </pre>
     *
     * <code>.bookkeeper.proto.stream.StreamProperties stream_props = 2;</code>
     * @return Whether the streamProps field is set.
     */
    public boolean hasStreamProps() {
      return streamPropsBuilder_ != null || streamProps_ != null;
    }
    /**
     * <pre>
     * create stream if not exists
     * </pre>
     *
     * <code>.bookkeeper.proto.stream.StreamProperties stream_props = 2;</code>
     * @return The streamProps.
     */
    public org.apache.bookkeeper.stream.proto.StreamProperties getStreamProps() {
      if (streamPropsBuilder_ == null) {
        return streamProps_ == null ? org.apache.bookkeeper.stream.proto.StreamProperties.getDefaultInstance() : streamProps_;
      } else {
        return streamPropsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * create stream if not exists
     * </pre>
     *
     * <code>.bookkeeper.proto.stream.StreamProperties stream_props = 2;</code>
     */
    public Builder setStreamProps(org.apache.bookkeeper.stream.proto.StreamProperties value) {
      if (streamPropsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        streamProps_ = value;
        onChanged();
      } else {
        streamPropsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * create stream if not exists
     * </pre>
     *
     * <code>.bookkeeper.proto.stream.StreamProperties stream_props = 2;</code>
     */
    public Builder setStreamProps(
        org.apache.bookkeeper.stream.proto.StreamProperties.Builder builderForValue) {
      if (streamPropsBuilder_ == null) {
        streamProps_ = builderForValue.build();
        onChanged();
      } else {
        streamPropsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * create stream if not exists
     * </pre>
     *
     * <code>.bookkeeper.proto.stream.StreamProperties stream_props = 2;</code>
     */
    public Builder mergeStreamProps(org.apache.bookkeeper.stream.proto.StreamProperties value) {
      if (streamPropsBuilder_ == null) {
        if (streamProps_ != null) {
          streamProps_ =
            org.apache.bookkeeper.stream.proto.StreamProperties.newBuilder(streamProps_).mergeFrom(value).buildPartial();
        } else {
          streamProps_ = value;
        }
        onChanged();
      } else {
        streamPropsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * create stream if not exists
     * </pre>
     *
     * <code>.bookkeeper.proto.stream.StreamProperties stream_props = 2;</code>
     */
    public Builder clearStreamProps() {
      if (streamPropsBuilder_ == null) {
        streamProps_ = null;
        onChanged();
      } else {
        streamProps_ = null;
        streamPropsBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * create stream if not exists
     * </pre>
     *
     * <code>.bookkeeper.proto.stream.StreamProperties stream_props = 2;</code>
     */
    public org.apache.bookkeeper.stream.proto.StreamProperties.Builder getStreamPropsBuilder() {
      
      onChanged();
      return getStreamPropsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * create stream if not exists
     * </pre>
     *
     * <code>.bookkeeper.proto.stream.StreamProperties stream_props = 2;</code>
     */
    public org.apache.bookkeeper.stream.proto.StreamPropertiesOrBuilder getStreamPropsOrBuilder() {
      if (streamPropsBuilder_ != null) {
        return streamPropsBuilder_.getMessageOrBuilder();
      } else {
        return streamProps_ == null ?
            org.apache.bookkeeper.stream.proto.StreamProperties.getDefaultInstance() : streamProps_;
      }
    }
    /**
     * <pre>
     * create stream if not exists
     * </pre>
     *
     * <code>.bookkeeper.proto.stream.StreamProperties stream_props = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.apache.bookkeeper.stream.proto.StreamProperties, org.apache.bookkeeper.stream.proto.StreamProperties.Builder, org.apache.bookkeeper.stream.proto.StreamPropertiesOrBuilder> 
        getStreamPropsFieldBuilder() {
      if (streamPropsBuilder_ == null) {
        streamPropsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.apache.bookkeeper.stream.proto.StreamProperties, org.apache.bookkeeper.stream.proto.StreamProperties.Builder, org.apache.bookkeeper.stream.proto.StreamPropertiesOrBuilder>(
                getStreamProps(),
                getParentForChildren(),
                isClean());
        streamProps_ = null;
      }
      return streamPropsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bookkeeper.proto.storage.GetActiveRangesRequest)
  }

  // @@protoc_insertion_point(class_scope:bookkeeper.proto.storage.GetActiveRangesRequest)
  private static final org.apache.bookkeeper.stream.proto.storage.GetActiveRangesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.bookkeeper.stream.proto.storage.GetActiveRangesRequest();
  }

  public static org.apache.bookkeeper.stream.proto.storage.GetActiveRangesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetActiveRangesRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetActiveRangesRequest>() {
    @java.lang.Override
    public GetActiveRangesRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetActiveRangesRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetActiveRangesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetActiveRangesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.apache.bookkeeper.stream.proto.storage.GetActiveRangesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

