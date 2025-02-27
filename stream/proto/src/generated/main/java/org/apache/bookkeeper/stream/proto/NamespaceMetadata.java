// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stream.proto

package org.apache.bookkeeper.stream.proto;

/**
 * <pre>
 * the whole metadata for a namespace (including both public and private)
 * </pre>
 *
 * Protobuf type {@code bookkeeper.proto.stream.NamespaceMetadata}
 */
public final class NamespaceMetadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bookkeeper.proto.stream.NamespaceMetadata)
    NamespaceMetadataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NamespaceMetadata.newBuilder() to construct.
  private NamespaceMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NamespaceMetadata() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NamespaceMetadata();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NamespaceMetadata(
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
            org.apache.bookkeeper.stream.proto.NamespaceProperties.Builder subBuilder = null;
            if (props_ != null) {
              subBuilder = props_.toBuilder();
            }
            props_ = input.readMessage(org.apache.bookkeeper.stream.proto.NamespaceProperties.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(props_);
              props_ = subBuilder.buildPartial();
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
    return org.apache.bookkeeper.stream.proto.Stream.internal_static_bookkeeper_proto_stream_NamespaceMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.bookkeeper.stream.proto.Stream.internal_static_bookkeeper_proto_stream_NamespaceMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.bookkeeper.stream.proto.NamespaceMetadata.class, org.apache.bookkeeper.stream.proto.NamespaceMetadata.Builder.class);
  }

  public static final int PROPS_FIELD_NUMBER = 1;
  private org.apache.bookkeeper.stream.proto.NamespaceProperties props_;
  /**
   * <code>.bookkeeper.proto.stream.NamespaceProperties props = 1;</code>
   * @return Whether the props field is set.
   */
  @java.lang.Override
  public boolean hasProps() {
    return props_ != null;
  }
  /**
   * <code>.bookkeeper.proto.stream.NamespaceProperties props = 1;</code>
   * @return The props.
   */
  @java.lang.Override
  public org.apache.bookkeeper.stream.proto.NamespaceProperties getProps() {
    return props_ == null ? org.apache.bookkeeper.stream.proto.NamespaceProperties.getDefaultInstance() : props_;
  }
  /**
   * <code>.bookkeeper.proto.stream.NamespaceProperties props = 1;</code>
   */
  @java.lang.Override
  public org.apache.bookkeeper.stream.proto.NamespacePropertiesOrBuilder getPropsOrBuilder() {
    return getProps();
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
    if (props_ != null) {
      output.writeMessage(1, getProps());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (props_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getProps());
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
    if (!(obj instanceof org.apache.bookkeeper.stream.proto.NamespaceMetadata)) {
      return super.equals(obj);
    }
    org.apache.bookkeeper.stream.proto.NamespaceMetadata other = (org.apache.bookkeeper.stream.proto.NamespaceMetadata) obj;

    if (hasProps() != other.hasProps()) return false;
    if (hasProps()) {
      if (!getProps()
          .equals(other.getProps())) return false;
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
    if (hasProps()) {
      hash = (37 * hash) + PROPS_FIELD_NUMBER;
      hash = (53 * hash) + getProps().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.bookkeeper.stream.proto.NamespaceMetadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.bookkeeper.stream.proto.NamespaceMetadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.bookkeeper.stream.proto.NamespaceMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.bookkeeper.stream.proto.NamespaceMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.bookkeeper.stream.proto.NamespaceMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.bookkeeper.stream.proto.NamespaceMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.bookkeeper.stream.proto.NamespaceMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.bookkeeper.stream.proto.NamespaceMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.bookkeeper.stream.proto.NamespaceMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.apache.bookkeeper.stream.proto.NamespaceMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.bookkeeper.stream.proto.NamespaceMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.bookkeeper.stream.proto.NamespaceMetadata parseFrom(
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
  public static Builder newBuilder(org.apache.bookkeeper.stream.proto.NamespaceMetadata prototype) {
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
   * <pre>
   * the whole metadata for a namespace (including both public and private)
   * </pre>
   *
   * Protobuf type {@code bookkeeper.proto.stream.NamespaceMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bookkeeper.proto.stream.NamespaceMetadata)
      org.apache.bookkeeper.stream.proto.NamespaceMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.bookkeeper.stream.proto.Stream.internal_static_bookkeeper_proto_stream_NamespaceMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.bookkeeper.stream.proto.Stream.internal_static_bookkeeper_proto_stream_NamespaceMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.bookkeeper.stream.proto.NamespaceMetadata.class, org.apache.bookkeeper.stream.proto.NamespaceMetadata.Builder.class);
    }

    // Construct using org.apache.bookkeeper.stream.proto.NamespaceMetadata.newBuilder()
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
      if (propsBuilder_ == null) {
        props_ = null;
      } else {
        props_ = null;
        propsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.bookkeeper.stream.proto.Stream.internal_static_bookkeeper_proto_stream_NamespaceMetadata_descriptor;
    }

    @java.lang.Override
    public org.apache.bookkeeper.stream.proto.NamespaceMetadata getDefaultInstanceForType() {
      return org.apache.bookkeeper.stream.proto.NamespaceMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public org.apache.bookkeeper.stream.proto.NamespaceMetadata build() {
      org.apache.bookkeeper.stream.proto.NamespaceMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.apache.bookkeeper.stream.proto.NamespaceMetadata buildPartial() {
      org.apache.bookkeeper.stream.proto.NamespaceMetadata result = new org.apache.bookkeeper.stream.proto.NamespaceMetadata(this);
      if (propsBuilder_ == null) {
        result.props_ = props_;
      } else {
        result.props_ = propsBuilder_.build();
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
      if (other instanceof org.apache.bookkeeper.stream.proto.NamespaceMetadata) {
        return mergeFrom((org.apache.bookkeeper.stream.proto.NamespaceMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.bookkeeper.stream.proto.NamespaceMetadata other) {
      if (other == org.apache.bookkeeper.stream.proto.NamespaceMetadata.getDefaultInstance()) return this;
      if (other.hasProps()) {
        mergeProps(other.getProps());
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
      org.apache.bookkeeper.stream.proto.NamespaceMetadata parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.apache.bookkeeper.stream.proto.NamespaceMetadata) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private org.apache.bookkeeper.stream.proto.NamespaceProperties props_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.apache.bookkeeper.stream.proto.NamespaceProperties, org.apache.bookkeeper.stream.proto.NamespaceProperties.Builder, org.apache.bookkeeper.stream.proto.NamespacePropertiesOrBuilder> propsBuilder_;
    /**
     * <code>.bookkeeper.proto.stream.NamespaceProperties props = 1;</code>
     * @return Whether the props field is set.
     */
    public boolean hasProps() {
      return propsBuilder_ != null || props_ != null;
    }
    /**
     * <code>.bookkeeper.proto.stream.NamespaceProperties props = 1;</code>
     * @return The props.
     */
    public org.apache.bookkeeper.stream.proto.NamespaceProperties getProps() {
      if (propsBuilder_ == null) {
        return props_ == null ? org.apache.bookkeeper.stream.proto.NamespaceProperties.getDefaultInstance() : props_;
      } else {
        return propsBuilder_.getMessage();
      }
    }
    /**
     * <code>.bookkeeper.proto.stream.NamespaceProperties props = 1;</code>
     */
    public Builder setProps(org.apache.bookkeeper.stream.proto.NamespaceProperties value) {
      if (propsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        props_ = value;
        onChanged();
      } else {
        propsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.bookkeeper.proto.stream.NamespaceProperties props = 1;</code>
     */
    public Builder setProps(
        org.apache.bookkeeper.stream.proto.NamespaceProperties.Builder builderForValue) {
      if (propsBuilder_ == null) {
        props_ = builderForValue.build();
        onChanged();
      } else {
        propsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.bookkeeper.proto.stream.NamespaceProperties props = 1;</code>
     */
    public Builder mergeProps(org.apache.bookkeeper.stream.proto.NamespaceProperties value) {
      if (propsBuilder_ == null) {
        if (props_ != null) {
          props_ =
            org.apache.bookkeeper.stream.proto.NamespaceProperties.newBuilder(props_).mergeFrom(value).buildPartial();
        } else {
          props_ = value;
        }
        onChanged();
      } else {
        propsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.bookkeeper.proto.stream.NamespaceProperties props = 1;</code>
     */
    public Builder clearProps() {
      if (propsBuilder_ == null) {
        props_ = null;
        onChanged();
      } else {
        props_ = null;
        propsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.bookkeeper.proto.stream.NamespaceProperties props = 1;</code>
     */
    public org.apache.bookkeeper.stream.proto.NamespaceProperties.Builder getPropsBuilder() {
      
      onChanged();
      return getPropsFieldBuilder().getBuilder();
    }
    /**
     * <code>.bookkeeper.proto.stream.NamespaceProperties props = 1;</code>
     */
    public org.apache.bookkeeper.stream.proto.NamespacePropertiesOrBuilder getPropsOrBuilder() {
      if (propsBuilder_ != null) {
        return propsBuilder_.getMessageOrBuilder();
      } else {
        return props_ == null ?
            org.apache.bookkeeper.stream.proto.NamespaceProperties.getDefaultInstance() : props_;
      }
    }
    /**
     * <code>.bookkeeper.proto.stream.NamespaceProperties props = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.apache.bookkeeper.stream.proto.NamespaceProperties, org.apache.bookkeeper.stream.proto.NamespaceProperties.Builder, org.apache.bookkeeper.stream.proto.NamespacePropertiesOrBuilder> 
        getPropsFieldBuilder() {
      if (propsBuilder_ == null) {
        propsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.apache.bookkeeper.stream.proto.NamespaceProperties, org.apache.bookkeeper.stream.proto.NamespaceProperties.Builder, org.apache.bookkeeper.stream.proto.NamespacePropertiesOrBuilder>(
                getProps(),
                getParentForChildren(),
                isClean());
        props_ = null;
      }
      return propsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bookkeeper.proto.stream.NamespaceMetadata)
  }

  // @@protoc_insertion_point(class_scope:bookkeeper.proto.stream.NamespaceMetadata)
  private static final org.apache.bookkeeper.stream.proto.NamespaceMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.bookkeeper.stream.proto.NamespaceMetadata();
  }

  public static org.apache.bookkeeper.stream.proto.NamespaceMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NamespaceMetadata>
      PARSER = new com.google.protobuf.AbstractParser<NamespaceMetadata>() {
    @java.lang.Override
    public NamespaceMetadata parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NamespaceMetadata(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NamespaceMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NamespaceMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.apache.bookkeeper.stream.proto.NamespaceMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

