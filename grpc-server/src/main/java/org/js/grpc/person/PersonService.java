// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: person.proto

package org.js.grpc.person;

public final class PersonService {
  private PersonService() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FindPersonRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FindPersonRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FindPersonResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FindPersonResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\014person.proto\"\037\n\021FindPersonRequest\022\n\n\002i" +
      "d\030\001 \001(\005\"<\n\022FindPersonResponse\022\014\n\004name\030\001 " +
      "\001(\t\022\013\n\003age\030\002 \001(\005\022\013\n\003sex\030\003 \001(\0102?\n\006Person\022" +
      "5\n\010FindById\022\022.FindPersonRequest\032\023.FindPe" +
      "rsonResponse\"\000B%\n\022org.js.grpc.personB\rPe" +
      "rsonServiceP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_FindPersonRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FindPersonRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FindPersonRequest_descriptor,
        new String[] { "Id", });
    internal_static_FindPersonResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_FindPersonResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FindPersonResponse_descriptor,
        new String[] { "Name", "Age", "Sex", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}