package grpc.SmartOffice.officeInventory;

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
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: officeInventory.proto")
public final class officeInventoryGrpc {

  private officeInventoryGrpc() {}

  public static final String SERVICE_NAME = "officeInventory";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.SmartOffice.officeInventory.OrderedItems,
      grpc.SmartOffice.officeInventory.OrderStatus> getOrderItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "orderItems",
      requestType = grpc.SmartOffice.officeInventory.OrderedItems.class,
      responseType = grpc.SmartOffice.officeInventory.OrderStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.SmartOffice.officeInventory.OrderedItems,
      grpc.SmartOffice.officeInventory.OrderStatus> getOrderItemsMethod() {
    io.grpc.MethodDescriptor<grpc.SmartOffice.officeInventory.OrderedItems, grpc.SmartOffice.officeInventory.OrderStatus> getOrderItemsMethod;
    if ((getOrderItemsMethod = officeInventoryGrpc.getOrderItemsMethod) == null) {
      synchronized (officeInventoryGrpc.class) {
        if ((getOrderItemsMethod = officeInventoryGrpc.getOrderItemsMethod) == null) {
          officeInventoryGrpc.getOrderItemsMethod = getOrderItemsMethod = 
              io.grpc.MethodDescriptor.<grpc.SmartOffice.officeInventory.OrderedItems, grpc.SmartOffice.officeInventory.OrderStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "officeInventory", "orderItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.SmartOffice.officeInventory.OrderedItems.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.SmartOffice.officeInventory.OrderStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new officeInventoryMethodDescriptorSupplier("orderItems"))
                  .build();
          }
        }
     }
     return getOrderItemsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static officeInventoryStub newStub(io.grpc.Channel channel) {
    return new officeInventoryStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static officeInventoryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new officeInventoryBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static officeInventoryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new officeInventoryFutureStub(channel);
  }

  /**
   */
  public static abstract class officeInventoryImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<grpc.SmartOffice.officeInventory.OrderedItems> orderItems(
        io.grpc.stub.StreamObserver<grpc.SmartOffice.officeInventory.OrderStatus> responseObserver) {
      return asyncUnimplementedStreamingCall(getOrderItemsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getOrderItemsMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                grpc.SmartOffice.officeInventory.OrderedItems,
                grpc.SmartOffice.officeInventory.OrderStatus>(
                  this, METHODID_ORDER_ITEMS)))
          .build();
    }
  }

  /**
   */
  public static final class officeInventoryStub extends io.grpc.stub.AbstractStub<officeInventoryStub> {
    private officeInventoryStub(io.grpc.Channel channel) {
      super(channel);
    }

    private officeInventoryStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected officeInventoryStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new officeInventoryStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<grpc.SmartOffice.officeInventory.OrderedItems> orderItems(
        io.grpc.stub.StreamObserver<grpc.SmartOffice.officeInventory.OrderStatus> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getOrderItemsMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class officeInventoryBlockingStub extends io.grpc.stub.AbstractStub<officeInventoryBlockingStub> {
    private officeInventoryBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private officeInventoryBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected officeInventoryBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new officeInventoryBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class officeInventoryFutureStub extends io.grpc.stub.AbstractStub<officeInventoryFutureStub> {
    private officeInventoryFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private officeInventoryFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected officeInventoryFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new officeInventoryFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_ORDER_ITEMS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final officeInventoryImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(officeInventoryImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ORDER_ITEMS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.orderItems(
              (io.grpc.stub.StreamObserver<grpc.SmartOffice.officeInventory.OrderStatus>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class officeInventoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    officeInventoryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.SmartOffice.officeInventory.OfficeInventoryImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("officeInventory");
    }
  }

  private static final class officeInventoryFileDescriptorSupplier
      extends officeInventoryBaseDescriptorSupplier {
    officeInventoryFileDescriptorSupplier() {}
  }

  private static final class officeInventoryMethodDescriptorSupplier
      extends officeInventoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    officeInventoryMethodDescriptorSupplier(String methodName) {
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
      synchronized (officeInventoryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new officeInventoryFileDescriptorSupplier())
              .addMethod(getOrderItemsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
