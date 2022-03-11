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
    comments = "Source: chatBot.proto")
public final class chatBotServiceGrpc {

  private chatBotServiceGrpc() {}

  public static final String SERVICE_NAME = "chatBotService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.SmartOffice.chatbots.SendChatMessage,
      grpc.SmartOffice.chatbots.ReceiveChatMessage> getChatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "chat",
      requestType = grpc.SmartOffice.chatbots.SendChatMessage.class,
      responseType = grpc.SmartOffice.chatbots.ReceiveChatMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.SmartOffice.chatbots.SendChatMessage,
      grpc.SmartOffice.chatbots.ReceiveChatMessage> getChatMethod() {
    io.grpc.MethodDescriptor<grpc.SmartOffice.chatbots.SendChatMessage, grpc.SmartOffice.chatbots.ReceiveChatMessage> getChatMethod;
    if ((getChatMethod = chatBotServiceGrpc.getChatMethod) == null) {
      synchronized (chatBotServiceGrpc.class) {
        if ((getChatMethod = chatBotServiceGrpc.getChatMethod) == null) {
          chatBotServiceGrpc.getChatMethod = getChatMethod = 
              io.grpc.MethodDescriptor.<grpc.SmartOffice.chatbots.SendChatMessage, grpc.SmartOffice.chatbots.ReceiveChatMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "chatBotService", "chat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.SmartOffice.chatbots.SendChatMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.SmartOffice.chatbots.ReceiveChatMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new chatBotServiceMethodDescriptorSupplier("chat"))
                  .build();
          }
        }
     }
     return getChatMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static chatBotServiceStub newStub(io.grpc.Channel channel) {
    return new chatBotServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static chatBotServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new chatBotServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static chatBotServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new chatBotServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class chatBotServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<grpc.SmartOffice.chatbots.SendChatMessage> chat(
        io.grpc.stub.StreamObserver<grpc.SmartOffice.chatbots.ReceiveChatMessage> responseObserver) {
      return asyncUnimplementedStreamingCall(getChatMethod(), responseObserver);
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
          .build();
    }
  }

  /**
   */
  public static final class chatBotServiceStub extends io.grpc.stub.AbstractStub<chatBotServiceStub> {
    private chatBotServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private chatBotServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected chatBotServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new chatBotServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<grpc.SmartOffice.chatbots.SendChatMessage> chat(
        io.grpc.stub.StreamObserver<grpc.SmartOffice.chatbots.ReceiveChatMessage> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getChatMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class chatBotServiceBlockingStub extends io.grpc.stub.AbstractStub<chatBotServiceBlockingStub> {
    private chatBotServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private chatBotServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected chatBotServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new chatBotServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class chatBotServiceFutureStub extends io.grpc.stub.AbstractStub<chatBotServiceFutureStub> {
    private chatBotServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private chatBotServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected chatBotServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new chatBotServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_CHAT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final chatBotServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(chatBotServiceImplBase serviceImpl, int methodId) {
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
        case METHODID_CHAT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.chat(
              (io.grpc.stub.StreamObserver<grpc.SmartOffice.chatbots.ReceiveChatMessage>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class chatBotServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    chatBotServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.SmartOffice.chatbots.ChatBotServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("chatBotService");
    }
  }

  private static final class chatBotServiceFileDescriptorSupplier
      extends chatBotServiceBaseDescriptorSupplier {
    chatBotServiceFileDescriptorSupplier() {}
  }

  private static final class chatBotServiceMethodDescriptorSupplier
      extends chatBotServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    chatBotServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (chatBotServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new chatBotServiceFileDescriptorSupplier())
              .addMethod(getChatMethod())
              .build();
        }
      }
    }
    return result;
  }
}
