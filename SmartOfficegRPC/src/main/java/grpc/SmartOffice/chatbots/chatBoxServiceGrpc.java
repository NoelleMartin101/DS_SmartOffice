package grpc.SmartOffice.chatbots;

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
    comments = "Source: chatBox.proto")
public final class chatBoxServiceGrpc {

  private chatBoxServiceGrpc() {}

  public static final String SERVICE_NAME = "chatBoxService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.SmartOffice.chatbots.SendChatMessage,
      grpc.SmartOffice.chatbots.ReceiveChatMessage> getChatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Chat",
      requestType = grpc.SmartOffice.chatbots.SendChatMessage.class,
      responseType = grpc.SmartOffice.chatbots.ReceiveChatMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.SmartOffice.chatbots.SendChatMessage,
      grpc.SmartOffice.chatbots.ReceiveChatMessage> getChatMethod() {
    io.grpc.MethodDescriptor<grpc.SmartOffice.chatbots.SendChatMessage, grpc.SmartOffice.chatbots.ReceiveChatMessage> getChatMethod;
    if ((getChatMethod = chatBoxServiceGrpc.getChatMethod) == null) {
      synchronized (chatBoxServiceGrpc.class) {
        if ((getChatMethod = chatBoxServiceGrpc.getChatMethod) == null) {
          chatBoxServiceGrpc.getChatMethod = getChatMethod = 
              io.grpc.MethodDescriptor.<grpc.SmartOffice.chatbots.SendChatMessage, grpc.SmartOffice.chatbots.ReceiveChatMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "chatBoxService", "Chat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.SmartOffice.chatbots.SendChatMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.SmartOffice.chatbots.ReceiveChatMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new chatBoxServiceMethodDescriptorSupplier("Chat"))
                  .build();
          }
        }
     }
     return getChatMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.SmartOffice.chatbots.ChatStatus,
      grpc.SmartOffice.chatbots.ChatStatus> getGetChatStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetChatStatus",
      requestType = grpc.SmartOffice.chatbots.ChatStatus.class,
      responseType = grpc.SmartOffice.chatbots.ChatStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.SmartOffice.chatbots.ChatStatus,
      grpc.SmartOffice.chatbots.ChatStatus> getGetChatStatusMethod() {
    io.grpc.MethodDescriptor<grpc.SmartOffice.chatbots.ChatStatus, grpc.SmartOffice.chatbots.ChatStatus> getGetChatStatusMethod;
    if ((getGetChatStatusMethod = chatBoxServiceGrpc.getGetChatStatusMethod) == null) {
      synchronized (chatBoxServiceGrpc.class) {
        if ((getGetChatStatusMethod = chatBoxServiceGrpc.getGetChatStatusMethod) == null) {
          chatBoxServiceGrpc.getGetChatStatusMethod = getGetChatStatusMethod = 
              io.grpc.MethodDescriptor.<grpc.SmartOffice.chatbots.ChatStatus, grpc.SmartOffice.chatbots.ChatStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "chatBoxService", "GetChatStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.SmartOffice.chatbots.ChatStatus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.SmartOffice.chatbots.ChatStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new chatBoxServiceMethodDescriptorSupplier("GetChatStatus"))
                  .build();
          }
        }
     }
     return getGetChatStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static chatBoxServiceStub newStub(io.grpc.Channel channel) {
    return new chatBoxServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static chatBoxServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new chatBoxServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static chatBoxServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new chatBoxServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class chatBoxServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<grpc.SmartOffice.chatbots.SendChatMessage> chat(
        io.grpc.stub.StreamObserver<grpc.SmartOffice.chatbots.ReceiveChatMessage> responseObserver) {
      return asyncUnimplementedStreamingCall(getChatMethod(), responseObserver);
    }

    /**
     */
    public void getChatStatus(grpc.SmartOffice.chatbots.ChatStatus request,
        io.grpc.stub.StreamObserver<grpc.SmartOffice.chatbots.ChatStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getGetChatStatusMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getChatMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                grpc.SmartOffice.chatbots.SendChatMessage,
                grpc.SmartOffice.chatbots.ReceiveChatMessage>(
                  this, METHODID_CHAT)))
          .addMethod(
            getGetChatStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.SmartOffice.chatbots.ChatStatus,
                grpc.SmartOffice.chatbots.ChatStatus>(
                  this, METHODID_GET_CHAT_STATUS)))
          .build();
    }
  }

  /**
   */
  public static final class chatBoxServiceStub extends io.grpc.stub.AbstractStub<chatBoxServiceStub> {
    private chatBoxServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private chatBoxServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected chatBoxServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new chatBoxServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<grpc.SmartOffice.chatbots.SendChatMessage> chat(
        io.grpc.stub.StreamObserver<grpc.SmartOffice.chatbots.ReceiveChatMessage> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getChatMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void getChatStatus(grpc.SmartOffice.chatbots.ChatStatus request,
        io.grpc.stub.StreamObserver<grpc.SmartOffice.chatbots.ChatStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetChatStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class chatBoxServiceBlockingStub extends io.grpc.stub.AbstractStub<chatBoxServiceBlockingStub> {
    private chatBoxServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private chatBoxServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected chatBoxServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new chatBoxServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.SmartOffice.chatbots.ChatStatus getChatStatus(grpc.SmartOffice.chatbots.ChatStatus request) {
      return blockingUnaryCall(
          getChannel(), getGetChatStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class chatBoxServiceFutureStub extends io.grpc.stub.AbstractStub<chatBoxServiceFutureStub> {
    private chatBoxServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private chatBoxServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected chatBoxServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new chatBoxServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.SmartOffice.chatbots.ChatStatus> getChatStatus(
        grpc.SmartOffice.chatbots.ChatStatus request) {
      return futureUnaryCall(
          getChannel().newCall(getGetChatStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CHAT_STATUS = 0;
  private static final int METHODID_CHAT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final chatBoxServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(chatBoxServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CHAT_STATUS:
          serviceImpl.getChatStatus((grpc.SmartOffice.chatbots.ChatStatus) request,
              (io.grpc.stub.StreamObserver<grpc.SmartOffice.chatbots.ChatStatus>) responseObserver);
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
        case METHODID_CHAT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.chat(
              (io.grpc.stub.StreamObserver<grpc.SmartOffice.chatbots.ReceiveChatMessage>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class chatBoxServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    chatBoxServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.SmartOffice.chatbots.ChatBoxServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("chatBoxService");
    }
  }

  private static final class chatBoxServiceFileDescriptorSupplier
      extends chatBoxServiceBaseDescriptorSupplier {
    chatBoxServiceFileDescriptorSupplier() {}
  }

  private static final class chatBoxServiceMethodDescriptorSupplier
      extends chatBoxServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    chatBoxServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (chatBoxServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new chatBoxServiceFileDescriptorSupplier())
              .addMethod(getChatMethod())
              .addMethod(getGetChatStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
