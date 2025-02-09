// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: storage.proto

package org.apache.bookkeeper.stream.proto.storage;

public interface GetStorageContainerEndpointResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bookkeeper.proto.storage.GetStorageContainerEndpointResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.bookkeeper.proto.storage.StatusCode status_code = 1;</code>
   * @return The enum numeric value on the wire for statusCode.
   */
  int getStatusCodeValue();
  /**
   * <code>.bookkeeper.proto.storage.StatusCode status_code = 1;</code>
   * @return The statusCode.
   */
  org.apache.bookkeeper.stream.proto.storage.StatusCode getStatusCode();

  /**
   * <code>repeated .bookkeeper.proto.storage.OneStorageContainerEndpointResponse responses = 2;</code>
   */
  java.util.List<org.apache.bookkeeper.stream.proto.storage.OneStorageContainerEndpointResponse> 
      getResponsesList();
  /**
   * <code>repeated .bookkeeper.proto.storage.OneStorageContainerEndpointResponse responses = 2;</code>
   */
  org.apache.bookkeeper.stream.proto.storage.OneStorageContainerEndpointResponse getResponses(int index);
  /**
   * <code>repeated .bookkeeper.proto.storage.OneStorageContainerEndpointResponse responses = 2;</code>
   */
  int getResponsesCount();
  /**
   * <code>repeated .bookkeeper.proto.storage.OneStorageContainerEndpointResponse responses = 2;</code>
   */
  java.util.List<? extends org.apache.bookkeeper.stream.proto.storage.OneStorageContainerEndpointResponseOrBuilder> 
      getResponsesOrBuilderList();
  /**
   * <code>repeated .bookkeeper.proto.storage.OneStorageContainerEndpointResponse responses = 2;</code>
   */
  org.apache.bookkeeper.stream.proto.storage.OneStorageContainerEndpointResponseOrBuilder getResponsesOrBuilder(
      int index);
}
