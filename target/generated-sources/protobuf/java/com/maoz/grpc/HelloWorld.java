// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HelloWorld.proto

package com.maoz.grpc;

public final class HelloWorld {
  private HelloWorld() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_maoz_grpc_Person_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_maoz_grpc_Person_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_maoz_grpc_Greeting_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_maoz_grpc_Greeting_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020HelloWorld.proto\022\rcom.maoz.grpc\"/\n\006Per" +
      "son\022\022\n\nfirst_name\030\001 \001(\t\022\021\n\tlast_name\030\002 \001" +
      "(\t\"\033\n\010Greeting\022\017\n\007message\030\001 \001(\t2\230\002\n\021Hell" +
      "oWorldService\022:\n\010sayHello\022\025.com.maoz.grp" +
      "c.Person\032\027.com.maoz.grpc.Greeting\022A\n\rLot" +
      "sOfReplies\022\025.com.maoz.grpc.Person\032\027.com." +
      "maoz.grpc.Greeting0\001\022C\n\017LotsOfGreetings\022" +
      "\025.com.maoz.grpc.Person\032\027.com.maoz.grpc.G" +
      "reeting(\001\022?\n\tBidiHello\022\025.com.maoz.grpc.P" +
      "erson\032\027.com.maoz.grpc.Greeting(\0010\001B\002P\001b\006" +
      "proto3"
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
    internal_static_com_maoz_grpc_Person_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_maoz_grpc_Person_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_maoz_grpc_Person_descriptor,
        new java.lang.String[] { "FirstName", "LastName", });
    internal_static_com_maoz_grpc_Greeting_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_maoz_grpc_Greeting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_maoz_grpc_Greeting_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}