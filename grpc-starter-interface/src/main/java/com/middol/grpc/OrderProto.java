// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OrderService.proto

package com.middol.grpc;

public final class OrderProto {
  private OrderProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_middol_grpc_OrderRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_middol_grpc_OrderRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_middol_grpc_OrderReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_middol_grpc_OrderReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022OrderService.proto\022\017com.middol.grpc\"D\n" +
      "\014OrderRequest\022\016\n\006userId\030\001 \001(\t\022\025\n\rcommodi" +
      "tyCode\030\002 \001(\t\022\r\n\005count\030\003 \001(\005\"\035\n\nOrderRepl" +
      "y\022\017\n\007message\030\001 \001(\t2V\n\014OrderService\022F\n\006Cr" +
      "eate\022\035.com.middol.grpc.OrderRequest\032\033.co" +
      "m.middol.grpc.OrderReply\"\000B\037\n\017com.middol" +
      ".grpcB\nOrderProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_middol_grpc_OrderRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_middol_grpc_OrderRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_middol_grpc_OrderRequest_descriptor,
        new java.lang.String[] { "UserId", "CommodityCode", "Count", });
    internal_static_com_middol_grpc_OrderReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_middol_grpc_OrderReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_middol_grpc_OrderReply_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
