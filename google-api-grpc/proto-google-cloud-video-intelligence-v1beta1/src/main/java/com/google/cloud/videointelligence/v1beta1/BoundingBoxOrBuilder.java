// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1beta1/video_intelligence.proto

package com.google.cloud.videointelligence.v1beta1;

public interface BoundingBoxOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1beta1.BoundingBox)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Left X coordinate.
   * </pre>
   *
   * <code>int32 left = 1;</code>
   */
  int getLeft();

  /**
   *
   *
   * <pre>
   * Right X coordinate.
   * </pre>
   *
   * <code>int32 right = 2;</code>
   */
  int getRight();

  /**
   *
   *
   * <pre>
   * Bottom Y coordinate.
   * </pre>
   *
   * <code>int32 bottom = 3;</code>
   */
  int getBottom();

  /**
   *
   *
   * <pre>
   * Top Y coordinate.
   * </pre>
   *
   * <code>int32 top = 4;</code>
   */
  int getTop();
}