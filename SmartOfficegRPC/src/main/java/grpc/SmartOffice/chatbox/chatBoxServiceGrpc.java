package grpc.SmartOffice.chatbox;

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
  private static volatile io.grpc.MethodDescriptor<grpc.SmartOffice.chatbox.sendChatMessage,
      grpc.SmartOffice.chatbox.receiveChatMessage> getGetChatMessagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetChatMessages",
      requestType = grpc.SmartOffice.chatbox.sendChatMessage.class,
      responseType = grpc.SmartOffice.chatbox.receiveChatMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.SmartOffice.chatbox.sendChatMessage,
      grpc.SmartOffice.chatbox.receiveChatMessage> getGetChatMessagesMethod() {
    io.grpc.MethodDescriptor<grpc.SmartOffice.chatbox.sendChatMessage, grpc.SmartOffice.chatbox.receiveChatMessage> getGetChatMessagesMethod;
    if ((getGetChatMessagesMethod = chatBoxServiceGrpc.getGetChatMessagesMethod) == null) {
      synchronized (chatBoxServiceGrpc.class) {
        if ((getGetChatMessagesMethod = chatBoxServiceGrpc.getGetChatMessagesMethod) == null) {
          chatBoxServiceGrpc.getGetChatMessagesMethod = getGetChatMessagesMethod = 
              io.grpc.MethodDescriptor.<grpc.SmartOffice.chatbox.sendChatMessage, grpc.SmartOffice.chatbox.receiveChatMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "chatBoxService", "GetChatMessages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.SmartOffice.chatbox.sendChatMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.SmartOffice.chatbox.receiveChatMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new chatBoxServiceMethodDescriptorSupplier("GetChatMessages"))
                  .build();
          }
        }
     }
     return getGetChatMessagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.SmartOffice.chatbox.user,
      grpc.SmartOffice.chatbox.chatStatus> getGetChatStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetChatStatus",
      requestType = grpc.SmartOffice.chatbox.user.class,
      responseType = grpc.SmartOffice.chatbox.chatStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.SmartOffice.chatbox.user,
      grpc.SmartOffice.chatbox.chatStatus> getGetChatStatusMethod() {
    io.grpc.MethodDescriptor<grpc.SmartOffice.chatbox.user, grpc.SmartOffice.chatbox.chatStatus> getGetChatStatusMethod;
    if ((getGetChatStatusMethod = chatBoxServiceGrpc.getGetChatStatusMethod) == null) {
      synchronized (chatBoxServiceGrpc.class) {
        if ((getGetChatStatusMethod = chatBoxServiceGrpc.getGetChatStatusMethod) == null) {
          chatBoxServiceGrpc.getGetChatStatusMethod = getGetChatStatusMethod = 
              io.grpc.MethodDescriptor.<grpc.SmartOffice.chatbox.user, grpc.SmartOffice.chatbox.chatStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "chatBoxService", "GetChatStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.SmartOffice.chatbox.user.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.SmartOffice.chatbox.chatStatus.getDefaultInstance()))
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
    public io.grpc.stub.StreamObserver<grpc.SmartOffice.chatbox.sendChatMessage> getChatMessages(
        io.grpc.stub.StreamObserver<grpc.SmartOffice.chatbox.receiveChatMessage> responseObserver) {
      return asyncUnimplementedStreamingCall(getGetChatMessagesMethod(), responseObserver);
    }

    /**
     */
    public void getChatStatus(grpc.SmartOffice.chatbox.user request,
        io.grpc.stub.StreamObserver<grpc.SmartOffice.chatbox.chatStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getGetChatStatusMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetChatMessagesMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                grpc.SmartOffice.chatbox.sendChatMessage,
                grpc.SmartOffice.chatbox.receiveChatMessage>(
                  this, METHODID_GET_CHAT_MESSAGES)))
          .addMethod(
            getGetChatStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.SmartOffice.chatbox.user,
                grpc.SmartOffice.chatbox.chatStatus>(
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
    public io.grpc.stub.StreamObserver<grpc.SmartOffice.chatbox.sendChatMessage> getChatMessages(
        io.grpc.stub.StreamObserver<grpc.SmartOffice.chatbox.receiveChatMessage> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getGetChatMessagesMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void getChatStatus(grpc.SmartOffice.chatbox.user request,
        io.grpc.stub.StreamObserver<grpc.SmartOffice.chatbox.chatStatus> responseObserver) {
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
    public grpc.SmartOffice.chatbox.chatStatus getChatStatus(grpc.SmartOffice.chatbox.user request) {
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
    public com.google.common.util.concurrent.ListenableFuture<grpc.SmartOffice.chatbox.chatStatus> getChatStatus(
        grpc.SmartOffice.chatbox.user request) {
      return futureUnaryCall(
          getChannel().newCall(getGetChatStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CHAT_STATUS = 0;
  private static final int METHODID_GET_CHAT_MESSAGES = 1;

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
          serviceImpl.getChatStatus((grpc.SmartOffice.chatbox.user) request,
              (io.grpc.stub.StreamObserver<grpc.SmartOffice.chatbox.chatStatus>) responseObserver);
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
        case METHODID_GET_CHAT_MESSAGES:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getChatMessages(
              (io.grpc.stub.StreamObserver<grpc.SmartOffice.chatbox.receiveChatMessage>) responseObserver);
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
      return grpc.SmartOffice.chatbox.ChatBoxServiceImpl.getDescriptor();
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
              .addMethod(getGetChatMessagesMethod())
              .addMethod(getGetChatStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
