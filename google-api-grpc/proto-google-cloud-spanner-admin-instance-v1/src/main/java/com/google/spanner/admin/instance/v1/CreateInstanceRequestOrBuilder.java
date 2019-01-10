// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/admin/instance/v1/spanner_instance_admin.proto

package com.google.spanner.admin.instance.v1;

public interface CreateInstanceRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.spanner.admin.instance.v1.CreateInstanceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the project in which to create the instance. Values
   * are of the form `projects/&lt;project&gt;`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The name of the project in which to create the instance. Values
   * are of the form `projects/&lt;project&gt;`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The ID of the instance to create.  Valid identifiers are of the
   * form `[a-z][-a-z0-9]*[a-z0-9]` and must be between 6 and 30 characters in
   * length.
   * </pre>
   *
   * <code>string instance_id = 2;</code>
   */
  java.lang.String getInstanceId();
  /**
   *
   *
   * <pre>
   * Required. The ID of the instance to create.  Valid identifiers are of the
   * form `[a-z][-a-z0-9]*[a-z0-9]` and must be between 6 and 30 characters in
   * length.
   * </pre>
   *
   * <code>string instance_id = 2;</code>
   */
  com.google.protobuf.ByteString getInstanceIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The instance to create.  The name may be omitted, but if
   * specified must be `&lt;parent&gt;/instances/&lt;instance_id&gt;`.
   * </pre>
   *
   * <code>.google.spanner.admin.instance.v1.Instance instance = 3;</code>
   */
  boolean hasInstance();
  /**
   *
   *
   * <pre>
   * Required. The instance to create.  The name may be omitted, but if
   * specified must be `&lt;parent&gt;/instances/&lt;instance_id&gt;`.
   * </pre>
   *
   * <code>.google.spanner.admin.instance.v1.Instance instance = 3;</code>
   */
  com.google.spanner.admin.instance.v1.Instance getInstance();
  /**
   *
   *
   * <pre>
   * Required. The instance to create.  The name may be omitted, but if
   * specified must be `&lt;parent&gt;/instances/&lt;instance_id&gt;`.
   * </pre>
   *
   * <code>.google.spanner.admin.instance.v1.Instance instance = 3;</code>
   */
  com.google.spanner.admin.instance.v1.InstanceOrBuilder getInstanceOrBuilder();
}