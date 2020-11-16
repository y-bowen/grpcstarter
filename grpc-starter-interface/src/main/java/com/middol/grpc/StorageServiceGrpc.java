package com.middol.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.32.2)",
    comments = "Source: StorageService.proto")
public final class StorageServiceGrpc {

  private StorageServiceGrpc() {}

  public static final String SERVICE_NAME = "com.middol.grpc.StorageService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.middol.grpc.StorageRequest,
      com.middol.grpc.StorageReply> getDeductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deduct",
      requestType = com.middol.grpc.StorageRequest.class,
      responseType = com.middol.grpc.StorageReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.middol.grpc.StorageRequest,
      com.middol.grpc.StorageReply> getDeductMethod() {
    io.grpc.MethodDescriptor<com.middol.grpc.StorageRequest, com.middol.grpc.StorageReply> getDeductMethod;
    if ((getDeductMethod = StorageServiceGrpc.getDeductMethod) == null) {
      synchronized (StorageServiceGrpc.class) {
        if ((getDeductMethod = StorageServiceGrpc.getDeductMethod) == null) {
          StorageServiceGrpc.getDeductMethod = getDeductMethod =
              io.grpc.MethodDescriptor.<com.middol.grpc.StorageRequest, com.middol.grpc.StorageReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.middol.grpc.StorageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.middol.grpc.StorageReply.getDefaultInstance()))
              .setSchemaDescriptor(new StorageServiceMethodDescriptorSupplier("deduct"))
              .build();
        }
      }
    }
    return getDeductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.middol.grpc.StorageRequest,
      com.middol.grpc.StorageRequest> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get",
      requestType = com.middol.grpc.StorageRequest.class,
      responseType = com.middol.grpc.StorageRequest.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.middol.grpc.StorageRequest,
      com.middol.grpc.StorageRequest> getGetMethod() {
    io.grpc.MethodDescriptor<com.middol.grpc.StorageRequest, com.middol.grpc.StorageRequest> getGetMethod;
    if ((getGetMethod = StorageServiceGrpc.getGetMethod) == null) {
      synchronized (StorageServiceGrpc.class) {
        if ((getGetMethod = StorageServiceGrpc.getGetMethod) == null) {
          StorageServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<com.middol.grpc.StorageRequest, com.middol.grpc.StorageRequest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.middol.grpc.StorageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.middol.grpc.StorageRequest.getDefaultInstance()))
              .setSchemaDescriptor(new StorageServiceMethodDescriptorSupplier("get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.middol.grpc.StorageRequest,
      com.middol.grpc.StorageRequest> getBatchUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "batchUpdate",
      requestType = com.middol.grpc.StorageRequest.class,
      responseType = com.middol.grpc.StorageRequest.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.middol.grpc.StorageRequest,
      com.middol.grpc.StorageRequest> getBatchUpdateMethod() {
    io.grpc.MethodDescriptor<com.middol.grpc.StorageRequest, com.middol.grpc.StorageRequest> getBatchUpdateMethod;
    if ((getBatchUpdateMethod = StorageServiceGrpc.getBatchUpdateMethod) == null) {
      synchronized (StorageServiceGrpc.class) {
        if ((getBatchUpdateMethod = StorageServiceGrpc.getBatchUpdateMethod) == null) {
          StorageServiceGrpc.getBatchUpdateMethod = getBatchUpdateMethod =
              io.grpc.MethodDescriptor.<com.middol.grpc.StorageRequest, com.middol.grpc.StorageRequest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "batchUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.middol.grpc.StorageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.middol.grpc.StorageRequest.getDefaultInstance()))
              .setSchemaDescriptor(new StorageServiceMethodDescriptorSupplier("batchUpdate"))
              .build();
        }
      }
    }
    return getBatchUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.middol.grpc.StorageRequest,
      com.middol.grpc.StorageRequest> getBatchDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "batchDelete",
      requestType = com.middol.grpc.StorageRequest.class,
      responseType = com.middol.grpc.StorageRequest.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.middol.grpc.StorageRequest,
      com.middol.grpc.StorageRequest> getBatchDeleteMethod() {
    io.grpc.MethodDescriptor<com.middol.grpc.StorageRequest, com.middol.grpc.StorageRequest> getBatchDeleteMethod;
    if ((getBatchDeleteMethod = StorageServiceGrpc.getBatchDeleteMethod) == null) {
      synchronized (StorageServiceGrpc.class) {
        if ((getBatchDeleteMethod = StorageServiceGrpc.getBatchDeleteMethod) == null) {
          StorageServiceGrpc.getBatchDeleteMethod = getBatchDeleteMethod =
              io.grpc.MethodDescriptor.<com.middol.grpc.StorageRequest, com.middol.grpc.StorageRequest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "batchDelete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.middol.grpc.StorageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.middol.grpc.StorageRequest.getDefaultInstance()))
              .setSchemaDescriptor(new StorageServiceMethodDescriptorSupplier("batchDelete"))
              .build();
        }
      }
    }
    return getBatchDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StorageServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StorageServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StorageServiceStub>() {
        @java.lang.Override
        public StorageServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StorageServiceStub(channel, callOptions);
        }
      };
    return StorageServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StorageServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StorageServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StorageServiceBlockingStub>() {
        @java.lang.Override
        public StorageServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StorageServiceBlockingStub(channel, callOptions);
        }
      };
    return StorageServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StorageServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StorageServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StorageServiceFutureStub>() {
        @java.lang.Override
        public StorageServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StorageServiceFutureStub(channel, callOptions);
        }
      };
    return StorageServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class StorageServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void deduct(com.middol.grpc.StorageRequest request,
        io.grpc.stub.StreamObserver<com.middol.grpc.StorageReply> responseObserver) {
      asyncUnimplementedUnaryCall(getDeductMethod(), responseObserver);
    }

    /**
     */
    public void get(com.middol.grpc.StorageRequest request,
        io.grpc.stub.StreamObserver<com.middol.grpc.StorageRequest> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void batchUpdate(com.middol.grpc.StorageRequest request,
        io.grpc.stub.StreamObserver<com.middol.grpc.StorageRequest> responseObserver) {
      asyncUnimplementedUnaryCall(getBatchUpdateMethod(), responseObserver);
    }

    /**
     */
    public void batchDelete(com.middol.grpc.StorageRequest request,
        io.grpc.stub.StreamObserver<com.middol.grpc.StorageRequest> responseObserver) {
      asyncUnimplementedUnaryCall(getBatchDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDeductMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.middol.grpc.StorageRequest,
                com.middol.grpc.StorageReply>(
                  this, METHODID_DEDUCT)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.middol.grpc.StorageRequest,
                com.middol.grpc.StorageRequest>(
                  this, METHODID_GET)))
          .addMethod(
            getBatchUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.middol.grpc.StorageRequest,
                com.middol.grpc.StorageRequest>(
                  this, METHODID_BATCH_UPDATE)))
          .addMethod(
            getBatchDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.middol.grpc.StorageRequest,
                com.middol.grpc.StorageRequest>(
                  this, METHODID_BATCH_DELETE)))
          .build();
    }
  }

  /**
   */
  public static final class StorageServiceStub extends io.grpc.stub.AbstractAsyncStub<StorageServiceStub> {
    private StorageServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StorageServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StorageServiceStub(channel, callOptions);
    }

    /**
     */
    public void deduct(com.middol.grpc.StorageRequest request,
        io.grpc.stub.StreamObserver<com.middol.grpc.StorageReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void get(com.middol.grpc.StorageRequest request,
        io.grpc.stub.StreamObserver<com.middol.grpc.StorageRequest> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void batchUpdate(com.middol.grpc.StorageRequest request,
        io.grpc.stub.StreamObserver<com.middol.grpc.StorageRequest> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBatchUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void batchDelete(com.middol.grpc.StorageRequest request,
        io.grpc.stub.StreamObserver<com.middol.grpc.StorageRequest> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBatchDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class StorageServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<StorageServiceBlockingStub> {
    private StorageServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StorageServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StorageServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.middol.grpc.StorageReply deduct(com.middol.grpc.StorageRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeductMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.middol.grpc.StorageRequest get(com.middol.grpc.StorageRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.middol.grpc.StorageRequest batchUpdate(com.middol.grpc.StorageRequest request) {
      return blockingUnaryCall(
          getChannel(), getBatchUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.middol.grpc.StorageRequest batchDelete(com.middol.grpc.StorageRequest request) {
      return blockingUnaryCall(
          getChannel(), getBatchDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class StorageServiceFutureStub extends io.grpc.stub.AbstractFutureStub<StorageServiceFutureStub> {
    private StorageServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StorageServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StorageServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.middol.grpc.StorageReply> deduct(
        com.middol.grpc.StorageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.middol.grpc.StorageRequest> get(
        com.middol.grpc.StorageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.middol.grpc.StorageRequest> batchUpdate(
        com.middol.grpc.StorageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBatchUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.middol.grpc.StorageRequest> batchDelete(
        com.middol.grpc.StorageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBatchDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DEDUCT = 0;
  private static final int METHODID_GET = 1;
  private static final int METHODID_BATCH_UPDATE = 2;
  private static final int METHODID_BATCH_DELETE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StorageServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StorageServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DEDUCT:
          serviceImpl.deduct((com.middol.grpc.StorageRequest) request,
              (io.grpc.stub.StreamObserver<com.middol.grpc.StorageReply>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((com.middol.grpc.StorageRequest) request,
              (io.grpc.stub.StreamObserver<com.middol.grpc.StorageRequest>) responseObserver);
          break;
        case METHODID_BATCH_UPDATE:
          serviceImpl.batchUpdate((com.middol.grpc.StorageRequest) request,
              (io.grpc.stub.StreamObserver<com.middol.grpc.StorageRequest>) responseObserver);
          break;
        case METHODID_BATCH_DELETE:
          serviceImpl.batchDelete((com.middol.grpc.StorageRequest) request,
              (io.grpc.stub.StreamObserver<com.middol.grpc.StorageRequest>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class StorageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StorageServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.middol.grpc.StorageProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StorageService");
    }
  }

  private static final class StorageServiceFileDescriptorSupplier
      extends StorageServiceBaseDescriptorSupplier {
    StorageServiceFileDescriptorSupplier() {}
  }

  private static final class StorageServiceMethodDescriptorSupplier
      extends StorageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StorageServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (StorageServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StorageServiceFileDescriptorSupplier())
              .addMethod(getDeductMethod())
              .addMethod(getGetMethod())
              .addMethod(getBatchUpdateMethod())
              .addMethod(getBatchDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
