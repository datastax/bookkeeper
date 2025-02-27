// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stream.proto

package org.apache.bookkeeper.stream.proto;

/**
 * Protobuf enum {@code bookkeeper.proto.stream.SplitPolicyType}
 */
public enum SplitPolicyType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>FIXED = 0;</code>
   */
  FIXED(0),
  /**
   * <code>BANDWIDTH = 1;</code>
   */
  BANDWIDTH(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>FIXED = 0;</code>
   */
  public static final int FIXED_VALUE = 0;
  /**
   * <code>BANDWIDTH = 1;</code>
   */
  public static final int BANDWIDTH_VALUE = 1;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static SplitPolicyType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static SplitPolicyType forNumber(int value) {
    switch (value) {
      case 0: return FIXED;
      case 1: return BANDWIDTH;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SplitPolicyType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      SplitPolicyType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<SplitPolicyType>() {
          public SplitPolicyType findValueByNumber(int number) {
            return SplitPolicyType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return org.apache.bookkeeper.stream.proto.Stream.getDescriptor().getEnumTypes().get(3);
  }

  private static final SplitPolicyType[] VALUES = values();

  public static SplitPolicyType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private SplitPolicyType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:bookkeeper.proto.stream.SplitPolicyType)
}

