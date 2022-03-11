package grpc.SmartOffice.roomAccess;

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
    comments = "Source: roomAccess.proto")
public final class roomAccessGrpc {

  private roomAccessGrpc() {}

  public static final String SERVICE_NAME = "roomAccess";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.SmartOffice.roomAccess.RoomAvailable,
      grpc.SmartOffice.roomAccess.RoomStatus> getRoomAvaliableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "roomAvaliable",
      requestType = grpc.SmartOffice.roomAccess.RoomAvailable.class,
      responseType = grpc.SmartOffice.roomAccess.RoomStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.SmartOffice.roomAccess.RoomAvailable,
      grpc.SmartOffice.roomAccess.RoomStatus> getRoomAvaliableMethod() {
    io.grpc.MethodDescriptor<grpc.SmartOffice.roomAccess.RoomAvailable, grpc.SmartOffice.roomAccess.RoomStatus> getRoomAvaliableMethod;
    if ((getRoomAvaliableMethod = roomAccessGrpc.getRoomAvaliableMethod) == null) {
      synchronized (roomAccessGrpc.class) {
        if ((getRoomAvaliableMethod = roomAccessGrpc.getRoomAvaliableMethod) == null) {
          roomAccessGrpc.getRoomAvaliableMethod = getRoomAvaliableMethod = 
              io.grpc.MethodDescriptor.<grpc.SmartOffice.roomAccess.RoomAvailable, grpc.SmartOffice.roomAccess.RoomStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "roomAccess", "roomAvaliable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.SmartOffice.roomAccess.RoomAvailable.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.SmartOffice.roomAccess.RoomStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new roomAccessMethodDescriptorSupplier("roomAvaliable"))
                  .build();
          }
        }
     }
     return getRoomAvaliableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.SmartOffice.roomAccess.RoomBooking,
      grpc.SmartOffice.roomAccess.RoomStatus> getRoomBookingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "roomBooking",
      requestType = grpc.SmartOffice.roomAccess.RoomBooking.class,
      responseType = grpc.SmartOffice.roomAccess.RoomStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.SmartOffice.roomAccess.RoomBooking,
      grpc.SmartOffice.roomAccess.RoomStatus> getRoomBookingMethod() {
    io.grpc.MethodDescriptor<grpc.SmartOffice.roomAccess.RoomBooking, grpc.SmartOffice.roomAccess.RoomStatus> getRoomBookingMethod;
    if ((getRoomBookingMethod = roomAccessGrpc.getRoomBookingMethod) == null) {
      synchronized (roomAccessGrpc.class) {
        if ((getRoomBookingMethod = roomAccessGrpc.getRoomBookingMethod) == null) {
          roomAccessGrpc.getRoomBookingMethod = getRoomBookingMethod = 
              io.grpc.MethodDescriptor.<grpc.SmartOffice.roomAccess.RoomBooking, grpc.SmartOffice.roomAccess.RoomStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "roomAccess", "roomBooking"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.SmartOffice.roomAccess.RoomBooking.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.SmartOffice.roomAccess.RoomStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new roomAccessMethodDescriptorSupplier("roomBooking"))
                  .build();
          }
        }
     }
     return getRoomBookingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.SmartOffice.roomAccess.RoomBooked,
      grpc.SmartOffice.roomAccess.BoookedBy> getRoomBookedByMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "roomBookedBy",
      requestType = grpc.SmartOffice.roomAccess.RoomBooked.class,
      responseType = grpc.SmartOffice.roomAccess.BoookedBy.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.SmartOffice.roomAccess.RoomBooked,
      grpc.SmartOffice.roomAccess.BoookedBy> getRoomBookedByMethod() {
    io.grpc.MethodDescriptor<grpc.SmartOffice.roomAccess.RoomBooked, grpc.SmartOffice.roomAccess.BoookedBy> getRoomBookedByMethod;
    if ((getRoomBookedByMethod = roomAccessGrpc.getRoomBookedByMethod) == null) {
      synchronized (roomAccessGrpc.class) {
        if ((getRoomBookedByMethod = roomAccessGrpc.getRoomBookedByMethod) == null) {
          roomAccessGrpc.getRoomBookedByMethod = getRoomBookedByMethod = 
              io.grpc.MethodDescriptor.<grpc.SmartOffice.roomAccess.RoomBooked, grpc.SmartOffice.roomAccess.BoookedBy>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "roomAccess", "roomBookedBy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.SmartOffice.roomAccess.RoomBooked.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.SmartOffice.roomAccess.BoookedBy.getDefaultInstance()))
                  .setSchemaDescriptor(new roomAccessMethodDescriptorSupplier("roomBookedBy"))
                  .build();
          }
        }
     }
     return getRoomBookedByMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static roomAccessStub newStub(io.grpc.Channel channel) {
    return new roomAccessStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static roomAccessBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new roomAccessBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static roomAccessFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new roomAccessFutureStub(channel);
  }

  /**
   */
  public static abstract class roomAccessImplBase implements io.grpc.BindableService {

    /**
     */
    public void roomAvaliable(grpc.SmartOffice.roomAccess.RoomAvailable request,
        io.grpc.stub.StreamObserver<grpc.SmartOffice.roomAccess.RoomStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getRoomAvaliableMethod(), responseObserver);
    }

    /**
     */
    public void roomBooking(grpc.SmartOffice.roomAccess.RoomBooking request,
        io.grpc.stub.StreamObserver<grpc.SmartOffice.roomAccess.RoomStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getRoomBookingMethod(), responseObserver);
    }

    /**
     */
    public void roomBookedBy(grpc.SmartOffice.roomAccess.RoomBooked request,
        io.grpc.stub.StreamObserver<grpc.SmartOffice.roomAccess.BoookedBy> responseObserver) {
      asyncUnimplementedUnaryCall(getRoomBookedByMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRoomAvaliableMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.SmartOffice.roomAccess.RoomAvailable,
                grpc.SmartOffice.roomAccess.RoomStatus>(
                  this, METHODID_ROOM_AVALIABLE)))
          .addMethod(
            getRoomBookingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.SmartOffice.roomAccess.RoomBooking,
                grpc.SmartOffice.roomAccess.RoomStatus>(
                  this, METHODID_ROOM_BOOKING)))
          .addMethod(
            getRoomBookedByMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                grpc.SmartOffice.roomAccess.RoomBooked,
                grpc.SmartOffice.roomAccess.BoookedBy>(
                  this, METHODID_ROOM_BOOKED_BY)))
          .build();
    }
  }

  /**
   */
  public static final class roomAccessStub extends io.grpc.stub.AbstractStub<roomAccessStub> {
    private roomAccessStub(io.grpc.Channel channel) {
      super(channel);
    }

    private roomAccessStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected roomAccessStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new roomAccessStub(channel, callOptions);
    }

    /**
     */
    public void roomAvaliable(grpc.SmartOffice.roomAccess.RoomAvailable request,
        io.grpc.stub.StreamObserver<grpc.SmartOffice.roomAccess.RoomStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRoomAvaliableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void roomBooking(grpc.SmartOffice.roomAccess.RoomBooking request,
        io.grpc.stub.StreamObserver<grpc.SmartOffice.roomAccess.RoomStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRoomBookingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void roomBookedBy(grpc.SmartOffice.roomAccess.RoomBooked request,
        io.grpc.stub.StreamObserver<grpc.SmartOffice.roomAccess.BoookedBy> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getRoomBookedByMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class roomAccessBlockingStub extends io.grpc.stub.AbstractStub<roomAccessBlockingStub> {
    private roomAccessBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private roomAccessBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected roomAccessBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new roomAccessBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.SmartOffice.roomAccess.RoomStatus roomAvaliable(grpc.SmartOffice.roomAccess.RoomAvailable request) {
      return blockingUnaryCall(
          getChannel(), getRoomAvaliableMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.SmartOffice.roomAccess.RoomStatus roomBooking(grpc.SmartOffice.roomAccess.RoomBooking request) {
      return blockingUnaryCall(
          getChannel(), getRoomBookingMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<grpc.SmartOffice.roomAccess.BoookedBy> roomBookedBy(
        grpc.SmartOffice.roomAccess.RoomBooked request) {
      return blockingServerStreamingCall(
          getChannel(), getRoomBookedByMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class roomAccessFutureStub extends io.grpc.stub.AbstractStub<roomAccessFutureStub> {
    private roomAccessFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private roomAccessFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected roomAccessFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new roomAccessFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.SmartOffice.roomAccess.RoomStatus> roomAvaliable(
        grpc.SmartOffice.roomAccess.RoomAvailable request) {
      return futureUnaryCall(
          getChannel().newCall(getRoomAvaliableMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.SmartOffice.roomAccess.RoomStatus> roomBooking(
        grpc.SmartOffice.roomAccess.RoomBooking request) {
      return futureUnaryCall(
          getChannel().newCall(getRoomBookingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ROOM_AVALIABLE = 0;
  private static final int METHODID_ROOM_BOOKING = 1;
  private static final int METHODID_ROOM_BOOKED_BY = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final roomAccessImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(roomAccessImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ROOM_AVALIABLE:
          serviceImpl.roomAvaliable((grpc.SmartOffice.roomAccess.RoomAvailable) request,
              (io.grpc.stub.StreamObserver<grpc.SmartOffice.roomAccess.RoomStatus>) responseObserver);
          break;
        case METHODID_ROOM_BOOKING:
          serviceImpl.roomBooking((grpc.SmartOffice.roomAccess.RoomBooking) request,
              (io.grpc.stub.StreamObserver<grpc.SmartOffice.roomAccess.RoomStatus>) responseObserver);
          break;
        case METHODID_ROOM_BOOKED_BY:
          serviceImpl.roomBookedBy((grpc.SmartOffice.roomAccess.RoomBooked) request,
              (io.grpc.stub.StreamObserver<grpc.SmartOffice.roomAccess.BoookedBy>) responseObserver);
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

  private static abstract class roomAccessBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    roomAccessBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.SmartOffice.roomAccess.RoomAccessImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("roomAccess");
    }
  }

  private static final class roomAccessFileDescriptorSupplier
      extends roomAccessBaseDescriptorSupplier {
    roomAccessFileDescriptorSupplier() {}
  }

  private static final class roomAccessMethodDescriptorSupplier
      extends roomAccessBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    roomAccessMethodDescriptorSupplier(String methodName) {
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
      synchronized (roomAccessGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new roomAccessFileDescriptorSupplier())
              .addMethod(getRoomAvaliableMethod())
              .addMethod(getRoomBookingMethod())
              .addMethod(getRoomBookedByMethod())
              .build();
        }
      }
    }
    return result;
  }
}
