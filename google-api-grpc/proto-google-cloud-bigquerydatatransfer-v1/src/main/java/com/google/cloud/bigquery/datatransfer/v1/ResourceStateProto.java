// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/datatransfer/v1/resourcestate.proto

package com.google.cloud.bigquery.datatransfer.v1;

public final class ResourceStateProto {
  private ResourceStateProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n9google/cloud/bigquery/datatransfer/v1/"
          + "resourcestate.proto\022%google.cloud.bigque"
          + "ry.datatransfer.v1\032\034google/api/annotatio"
          + "ns.proto\032\037google/protobuf/timestamp.prot"
          + "oB\344\001\n)com.google.cloud.bigquery.datatran"
          + "sfer.v1B\022ResourceStateProtoP\001ZQgoogle.go"
          + "lang.org/genproto/googleapis/cloud/bigqu"
          + "ery/datatransfer/v1;datatransfer\252\002%Googl"
          + "e.Cloud.BigQuery.DataTransfer.V1\312\002%Googl"
          + "e\\Cloud\\BigQuery\\DataTransfer\\V1b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        },
        assigner);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
