package grpc.mallang;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.48.1)",
    comments = "Source: helloworld.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MallangGrpc {

  private MallangGrpc() {}

  public static final String SERVICE_NAME = "grpc.mallang.Mallang";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.mallang.Helloworld.HelloRequest,
      grpc.mallang.Helloworld.HelloReply> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHello",
      requestType = grpc.mallang.Helloworld.HelloRequest.class,
      responseType = grpc.mallang.Helloworld.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.mallang.Helloworld.HelloRequest,
      grpc.mallang.Helloworld.HelloReply> getSayHelloMethod() {
    io.grpc.MethodDescriptor<grpc.mallang.Helloworld.HelloRequest, grpc.mallang.Helloworld.HelloReply> getSayHelloMethod;
    if ((getSayHelloMethod = MallangGrpc.getSayHelloMethod) == null) {
      synchronized (MallangGrpc.class) {
        if ((getSayHelloMethod = MallangGrpc.getSayHelloMethod) == null) {
          MallangGrpc.getSayHelloMethod = getSayHelloMethod =
              io.grpc.MethodDescriptor.<grpc.mallang.Helloworld.HelloRequest, grpc.mallang.Helloworld.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.mallang.Helloworld.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.mallang.Helloworld.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new MallangMethodDescriptorSupplier("SayHello"))
              .build();
        }
      }
    }
    return getSayHelloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MallangStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MallangStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MallangStub>() {
        @java.lang.Override
        public MallangStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MallangStub(channel, callOptions);
        }
      };
    return MallangStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MallangBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MallangBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MallangBlockingStub>() {
        @java.lang.Override
        public MallangBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MallangBlockingStub(channel, callOptions);
        }
      };
    return MallangBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MallangFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MallangFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MallangFutureStub>() {
        @java.lang.Override
        public MallangFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MallangFutureStub(channel, callOptions);
        }
      };
    return MallangFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class MallangImplBase implements io.grpc.BindableService {

    /**
     */
    public void sayHello(grpc.mallang.Helloworld.HelloRequest request,
        io.grpc.stub.StreamObserver<grpc.mallang.Helloworld.HelloReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpc.mallang.Helloworld.HelloRequest,
                grpc.mallang.Helloworld.HelloReply>(
                  this, METHODID_SAY_HELLO)))
          .build();
    }
  }

  /**
   */
  public static final class MallangStub extends io.grpc.stub.AbstractAsyncStub<MallangStub> {
    private MallangStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MallangStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MallangStub(channel, callOptions);
    }

    /**
     */
    public void sayHello(grpc.mallang.Helloworld.HelloRequest request,
        io.grpc.stub.StreamObserver<grpc.mallang.Helloworld.HelloReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MallangBlockingStub extends io.grpc.stub.AbstractBlockingStub<MallangBlockingStub> {
    private MallangBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MallangBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MallangBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.mallang.Helloworld.HelloReply sayHello(grpc.mallang.Helloworld.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MallangFutureStub extends io.grpc.stub.AbstractFutureStub<MallangFutureStub> {
    private MallangFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MallangFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MallangFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.mallang.Helloworld.HelloReply> sayHello(
        grpc.mallang.Helloworld.HelloRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MallangImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MallangImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((grpc.mallang.Helloworld.HelloRequest) request,
              (io.grpc.stub.StreamObserver<grpc.mallang.Helloworld.HelloReply>) responseObserver);
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

  private static abstract class MallangBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MallangBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.mallang.Helloworld.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Mallang");
    }
  }

  private static final class MallangFileDescriptorSupplier
      extends MallangBaseDescriptorSupplier {
    MallangFileDescriptorSupplier() {}
  }

  private static final class MallangMethodDescriptorSupplier
      extends MallangBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MallangMethodDescriptorSupplier(String methodName) {
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
      synchronized (MallangGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MallangFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .build();
        }
      }
    }
    return result;
  }
}
