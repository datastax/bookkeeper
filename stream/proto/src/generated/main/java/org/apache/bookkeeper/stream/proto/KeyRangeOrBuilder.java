// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stream.proto

package org.apache.bookkeeper.stream.proto;

public interface KeyRangeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bookkeeper.proto.stream.KeyRange)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 start_hash_key = 1;</code>
   * @return The startHashKey.
   */
  long getStartHashKey();

  /**
   * <code>int64 end_hash_key = 2;</code>
   * @return The endHashKey.
   */
  long getEndHashKey();
}
