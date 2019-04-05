package com.maoz.grpc;

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
    value = "by gRPC proto compiler (version 1.16.1)",
    comments = "Source: HelloWorld.proto")
public final class HelloWorldServiceGrpc {

  private HelloWorldServiceGrpc() {}

  public static final String SERVICE_NAME = "com.maoz.grpc.HelloWorldService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.maoz.grpc.Person,
      com.maoz.grpc.Greeting> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sayHello",
      requestType = com.maoz.grpc.Person.class,
      responseType = com.maoz.grpc.Greeting.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.maoz.grpc.Person,
      com.maoz.grpc.Greeting> getSayHelloMethod() {
    io.grpc.MethodDescriptor<com.maoz.grpc.Person, com.maoz.grpc.Greeting> getSayHelloMethod;
    if ((getSayHelloMethod = HelloWorldServiceGrpc.getSayHelloMethod) == null) {
      synchronized (HelloWorldServiceGrpc.class) {
        if ((getSayHelloMethod = HelloWorldServiceGrpc.getSayHelloMethod) == null) {
          HelloWorldServiceGrpc.getSayHelloMethod = getSayHelloMethod = 
              io.grpc.MethodDescriptor.<com.maoz.grpc.Person, com.maoz.grpc.Greeting>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.maoz.grpc.HelloWorldService", "sayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.maoz.grpc.Person.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.maoz.grpc.Greeting.getDefaultInstance()))
                  .setSchemaDescriptor(new HelloWorldServiceMethodDescriptorSupplier("sayHello"))
                  .build();
          }
        }
     }
     return getSayHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.maoz.grpc.Person,
      com.maoz.grpc.Greeting> getLotsOfRepliesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LotsOfReplies",
      requestType = com.maoz.grpc.Person.class,
      responseType = com.maoz.grpc.Greeting.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.maoz.grpc.Person,
      com.maoz.grpc.Greeting> getLotsOfRepliesMethod() {
    io.grpc.MethodDescriptor<com.maoz.grpc.Person, com.maoz.grpc.Greeting> getLotsOfRepliesMethod;
    if ((getLotsOfRepliesMethod = HelloWorldServiceGrpc.getLotsOfRepliesMethod) == null) {
      synchronized (HelloWorldServiceGrpc.class) {
        if ((getLotsOfRepliesMethod = HelloWorldServiceGrpc.getLotsOfRepliesMethod) == null) {
          HelloWorldServiceGrpc.getLotsOfRepliesMethod = getLotsOfRepliesMethod = 
              io.grpc.MethodDescriptor.<com.maoz.grpc.Person, com.maoz.grpc.Greeting>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.maoz.grpc.HelloWorldService", "LotsOfReplies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.maoz.grpc.Person.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.maoz.grpc.Greeting.getDefaultInstance()))
                  .setSchemaDescriptor(new HelloWorldServiceMethodDescriptorSupplier("LotsOfReplies"))
                  .build();
          }
        }
     }
     return getLotsOfRepliesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.maoz.grpc.Person,
      com.maoz.grpc.Greeting> getLotsOfGreetingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LotsOfGreetings",
      requestType = com.maoz.grpc.Person.class,
      responseType = com.maoz.grpc.Greeting.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.maoz.grpc.Person,
      com.maoz.grpc.Greeting> getLotsOfGreetingsMethod() {
    io.grpc.MethodDescriptor<com.maoz.grpc.Person, com.maoz.grpc.Greeting> getLotsOfGreetingsMethod;
    if ((getLotsOfGreetingsMethod = HelloWorldServiceGrpc.getLotsOfGreetingsMethod) == null) {
      synchronized (HelloWorldServiceGrpc.class) {
        if ((getLotsOfGreetingsMethod = HelloWorldServiceGrpc.getLotsOfGreetingsMethod) == null) {
          HelloWorldServiceGrpc.getLotsOfGreetingsMethod = getLotsOfGreetingsMethod = 
              io.grpc.MethodDescriptor.<com.maoz.grpc.Person, com.maoz.grpc.Greeting>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.maoz.grpc.HelloWorldService", "LotsOfGreetings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.maoz.grpc.Person.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.maoz.grpc.Greeting.getDefaultInstance()))
                  .setSchemaDescriptor(new HelloWorldServiceMethodDescriptorSupplier("LotsOfGreetings"))
                  .build();
          }
        }
     }
     return getLotsOfGreetingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.maoz.grpc.Person,
      com.maoz.grpc.Greeting> getBidiHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BidiHello",
      requestType = com.maoz.grpc.Person.class,
      responseType = com.maoz.grpc.Greeting.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.maoz.grpc.Person,
      com.maoz.grpc.Greeting> getBidiHelloMethod() {
    io.grpc.MethodDescriptor<com.maoz.grpc.Person, com.maoz.grpc.Greeting> getBidiHelloMethod;
    if ((getBidiHelloMethod = HelloWorldServiceGrpc.getBidiHelloMethod) == null) {
      synchronized (HelloWorldServiceGrpc.class) {
        if ((getBidiHelloMethod = HelloWorldServiceGrpc.getBidiHelloMethod) == null) {
          HelloWorldServiceGrpc.getBidiHelloMethod = getBidiHelloMethod = 
              io.grpc.MethodDescriptor.<com.maoz.grpc.Person, com.maoz.grpc.Greeting>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.maoz.grpc.HelloWorldService", "BidiHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.maoz.grpc.Person.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.maoz.grpc.Greeting.getDefaultInstance()))
                  .setSchemaDescriptor(new HelloWorldServiceMethodDescriptorSupplier("BidiHello"))
                  .build();
          }
        }
     }
     return getBidiHelloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HelloWorldServiceStub newStub(io.grpc.Channel channel) {
    return new HelloWorldServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HelloWorldServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HelloWorldServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HelloWorldServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HelloWorldServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class HelloWorldServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void sayHello(com.maoz.grpc.Person request,
        io.grpc.stub.StreamObserver<com.maoz.grpc.Greeting> responseObserver) {
      asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    /**
     */
    public void lotsOfReplies(com.maoz.grpc.Person request,
        io.grpc.stub.StreamObserver<com.maoz.grpc.Greeting> responseObserver) {
      asyncUnimplementedUnaryCall(getLotsOfRepliesMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.maoz.grpc.Person> lotsOfGreetings(
        io.grpc.stub.StreamObserver<com.maoz.grpc.Greeting> responseObserver) {
      return asyncUnimplementedStreamingCall(getLotsOfGreetingsMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.maoz.grpc.Person> bidiHello(
        io.grpc.stub.StreamObserver<com.maoz.grpc.Greeting> responseObserver) {
      return asyncUnimplementedStreamingCall(getBidiHelloMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.maoz.grpc.Person,
                com.maoz.grpc.Greeting>(
                  this, METHODID_SAY_HELLO)))
          .addMethod(
            getLotsOfRepliesMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.maoz.grpc.Person,
                com.maoz.grpc.Greeting>(
                  this, METHODID_LOTS_OF_REPLIES)))
          .addMethod(
            getLotsOfGreetingsMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.maoz.grpc.Person,
                com.maoz.grpc.Greeting>(
                  this, METHODID_LOTS_OF_GREETINGS)))
          .addMethod(
            getBidiHelloMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.maoz.grpc.Person,
                com.maoz.grpc.Greeting>(
                  this, METHODID_BIDI_HELLO)))
          .build();
    }
  }

  /**
   */
  public static final class HelloWorldServiceStub extends io.grpc.stub.AbstractStub<HelloWorldServiceStub> {
    private HelloWorldServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloWorldServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloWorldServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloWorldServiceStub(channel, callOptions);
    }

    /**
     */
    public void sayHello(com.maoz.grpc.Person request,
        io.grpc.stub.StreamObserver<com.maoz.grpc.Greeting> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void lotsOfReplies(com.maoz.grpc.Person request,
        io.grpc.stub.StreamObserver<com.maoz.grpc.Greeting> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getLotsOfRepliesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.maoz.grpc.Person> lotsOfGreetings(
        io.grpc.stub.StreamObserver<com.maoz.grpc.Greeting> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getLotsOfGreetingsMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.maoz.grpc.Person> bidiHello(
        io.grpc.stub.StreamObserver<com.maoz.grpc.Greeting> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getBidiHelloMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class HelloWorldServiceBlockingStub extends io.grpc.stub.AbstractStub<HelloWorldServiceBlockingStub> {
    private HelloWorldServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloWorldServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloWorldServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloWorldServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.maoz.grpc.Greeting sayHello(com.maoz.grpc.Person request) {
      return blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.maoz.grpc.Greeting> lotsOfReplies(
        com.maoz.grpc.Person request) {
      return blockingServerStreamingCall(
          getChannel(), getLotsOfRepliesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HelloWorldServiceFutureStub extends io.grpc.stub.AbstractStub<HelloWorldServiceFutureStub> {
    private HelloWorldServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloWorldServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloWorldServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloWorldServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.maoz.grpc.Greeting> sayHello(
        com.maoz.grpc.Person request) {
      return futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;
  private static final int METHODID_LOTS_OF_REPLIES = 1;
  private static final int METHODID_LOTS_OF_GREETINGS = 2;
  private static final int METHODID_BIDI_HELLO = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HelloWorldServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HelloWorldServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((com.maoz.grpc.Person) request,
              (io.grpc.stub.StreamObserver<com.maoz.grpc.Greeting>) responseObserver);
          break;
        case METHODID_LOTS_OF_REPLIES:
          serviceImpl.lotsOfReplies((com.maoz.grpc.Person) request,
              (io.grpc.stub.StreamObserver<com.maoz.grpc.Greeting>) responseObserver);
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
        case METHODID_LOTS_OF_GREETINGS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.lotsOfGreetings(
              (io.grpc.stub.StreamObserver<com.maoz.grpc.Greeting>) responseObserver);
        case METHODID_BIDI_HELLO:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.bidiHello(
              (io.grpc.stub.StreamObserver<com.maoz.grpc.Greeting>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class HelloWorldServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HelloWorldServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.maoz.grpc.HelloWorld.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HelloWorldService");
    }
  }

  private static final class HelloWorldServiceFileDescriptorSupplier
      extends HelloWorldServiceBaseDescriptorSupplier {
    HelloWorldServiceFileDescriptorSupplier() {}
  }

  private static final class HelloWorldServiceMethodDescriptorSupplier
      extends HelloWorldServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HelloWorldServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (HelloWorldServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HelloWorldServiceFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .addMethod(getLotsOfRepliesMethod())
              .addMethod(getLotsOfGreetingsMethod())
              .addMethod(getBidiHelloMethod())
              .build();
        }
      }
    }
    return result;
  }
}
