// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1beta2/workflow_templates.proto

package com.google.cloud.dataproc.v1beta2;

public interface UpdateWorkflowTemplateRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1beta2.UpdateWorkflowTemplateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The updated workflow template.
   * The `template.version` field must match the current version.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.WorkflowTemplate template = 1;</code>
   */
  boolean hasTemplate();
  /**
   *
   *
   * <pre>
   * Required. The updated workflow template.
   * The `template.version` field must match the current version.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.WorkflowTemplate template = 1;</code>
   */
  com.google.cloud.dataproc.v1beta2.WorkflowTemplate getTemplate();
  /**
   *
   *
   * <pre>
   * Required. The updated workflow template.
   * The `template.version` field must match the current version.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.WorkflowTemplate template = 1;</code>
   */
  com.google.cloud.dataproc.v1beta2.WorkflowTemplateOrBuilder getTemplateOrBuilder();
}
