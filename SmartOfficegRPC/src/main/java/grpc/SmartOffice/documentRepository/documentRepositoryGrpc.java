package grpc.SmartOffice.documentRepository;

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
    comments = "Source: documentRepository.proto")
public final class documentRepositoryGrpc {

  private documentRepositoryGrpc() {}

  public static final String SERVICE_NAME = "documentRepository";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.SmartOffice.documentRepository.RequestedDocument,
      grpc.SmartOffice.documentRepository.RequestedDocument> getRetrieveDocumentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "retrieveDocument",
      requestType = grpc.SmartOffice.documentRepository.RequestedDocument.class,
      responseType = grpc.SmartOffice.documentRepository.RequestedDocument.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.SmartOffice.documentRepository.RequestedDocument,
      grpc.SmartOffice.documentRepository.RequestedDocument> getRetrieveDocumentMethod() {
    io.grpc.MethodDescriptor<grpc.SmartOffice.documentRepository.RequestedDocument, grpc.SmartOffice.documentRepository.RequestedDocument> getRetrieveDocumentMethod;
    if ((getRetrieveDocumentMethod = documentRepositoryGrpc.getRetrieveDocumentMethod) == null) {
      synchronized (documentRepositoryGrpc.class) {
        if ((getRetrieveDocumentMethod = documentRepositoryGrpc.getRetrieveDocumentMethod) == null) {
          documentRepositoryGrpc.getRetrieveDocumentMethod = getRetrieveDocumentMethod = 
              io.grpc.MethodDescriptor.<grpc.SmartOffice.documentRepository.RequestedDocument, grpc.SmartOffice.documentRepository.RequestedDocument>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "documentRepository", "retrieveDocument"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.SmartOffice.documentRepository.RequestedDocument.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.SmartOffice.documentRepository.RequestedDocument.getDefaultInstance()))
                  .setSchemaDescriptor(new documentRepositoryMethodDescriptorSupplier("retrieveDocument"))
                  .build();
          }
        }
     }
     return getRetrieveDocumentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.SmartOffice.documentRepository.FolderLocation,
      grpc.SmartOffice.documentRepository.FolderListing> getRetrieveFolderListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "retrieveFolderList",
      requestType = grpc.SmartOffice.documentRepository.FolderLocation.class,
      responseType = grpc.SmartOffice.documentRepository.FolderListing.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.SmartOffice.documentRepository.FolderLocation,
      grpc.SmartOffice.documentRepository.FolderListing> getRetrieveFolderListMethod() {
    io.grpc.MethodDescriptor<grpc.SmartOffice.documentRepository.FolderLocation, grpc.SmartOffice.documentRepository.FolderListing> getRetrieveFolderListMethod;
    if ((getRetrieveFolderListMethod = documentRepositoryGrpc.getRetrieveFolderListMethod) == null) {
      synchronized (documentRepositoryGrpc.class) {
        if ((getRetrieveFolderListMethod = documentRepositoryGrpc.getRetrieveFolderListMethod) == null) {
          documentRepositoryGrpc.getRetrieveFolderListMethod = getRetrieveFolderListMethod = 
              io.grpc.MethodDescriptor.<grpc.SmartOffice.documentRepository.FolderLocation, grpc.SmartOffice.documentRepository.FolderListing>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "documentRepository", "retrieveFolderList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.SmartOffice.documentRepository.FolderLocation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.SmartOffice.documentRepository.FolderListing.getDefaultInstance()))
                  .setSchemaDescriptor(new documentRepositoryMethodDescriptorSupplier("retrieveFolderList"))
                  .build();
          }
        }
     }
     return getRetrieveFolderListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.SmartOffice.documentRepository.SentDocument,
      grpc.SmartOffice.documentRepository.NewDocumentPath> getSendDocumentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendDocument",
      requestType = grpc.SmartOffice.documentRepository.SentDocument.class,
      responseType = grpc.SmartOffice.documentRepository.NewDocumentPath.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.SmartOffice.documentRepository.SentDocument,
      grpc.SmartOffice.documentRepository.NewDocumentPath> getSendDocumentMethod() {
    io.grpc.MethodDescriptor<grpc.SmartOffice.documentRepository.SentDocument, grpc.SmartOffice.documentRepository.NewDocumentPath> getSendDocumentMethod;
    if ((getSendDocumentMethod = documentRepositoryGrpc.getSendDocumentMethod) == null) {
      synchronized (documentRepositoryGrpc.class) {
        if ((getSendDocumentMethod = documentRepositoryGrpc.getSendDocumentMethod) == null) {
          documentRepositoryGrpc.getSendDocumentMethod = getSendDocumentMethod = 
              io.grpc.MethodDescriptor.<grpc.SmartOffice.documentRepository.SentDocument, grpc.SmartOffice.documentRepository.NewDocumentPath>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "documentRepository", "sendDocument"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.SmartOffice.documentRepository.SentDocument.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.SmartOffice.documentRepository.NewDocumentPath.getDefaultInstance()))
                  .setSchemaDescriptor(new documentRepositoryMethodDescriptorSupplier("sendDocument"))
                  .build();
          }
        }
     }
     return getSendDocumentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.SmartOffice.documentRepository.DeleteDocument,
      grpc.SmartOffice.documentRepository.Empty> getDeleteDocumentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteDocument",
      requestType = grpc.SmartOffice.documentRepository.DeleteDocument.class,
      responseType = grpc.SmartOffice.documentRepository.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.SmartOffice.documentRepository.DeleteDocument,
      grpc.SmartOffice.documentRepository.Empty> getDeleteDocumentMethod() {
    io.grpc.MethodDescriptor<grpc.SmartOffice.documentRepository.DeleteDocument, grpc.SmartOffice.documentRepository.Empty> getDeleteDocumentMethod;
    if ((getDeleteDocumentMethod = documentRepositoryGrpc.getDeleteDocumentMethod) == null) {
      synchronized (documentRepositoryGrpc.class) {
        if ((getDeleteDocumentMethod = documentRepositoryGrpc.getDeleteDocumentMethod) == null) {
          documentRepositoryGrpc.getDeleteDocumentMethod = getDeleteDocumentMethod = 
              io.grpc.MethodDescriptor.<grpc.SmartOffice.documentRepository.DeleteDocument, grpc.SmartOffice.documentRepository.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "documentRepository", "deleteDocument"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.SmartOffice.documentRepository.DeleteDocument.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.SmartOffice.documentRepository.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new documentRepositoryMethodDescriptorSupplier("deleteDocument"))
                  .build();
          }
        }
     }
     return getDeleteDocumentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.SmartOffice.documentRepository.UpdateDocument,
      grpc.SmartOffice.documentRepository.Empty> getUpdateDocumentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateDocument",
      requestType = grpc.SmartOffice.documentRepository.UpdateDocument.class,
      responseType = grpc.SmartOffice.documentRepository.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.SmartOffice.documentRepository.UpdateDocument,
      grpc.SmartOffice.documentRepository.Empty> getUpdateDocumentMethod() {
    io.grpc.MethodDescriptor<grpc.SmartOffice.documentRepository.UpdateDocument, grpc.SmartOffice.documentRepository.Empty> getUpdateDocumentMethod;
    if ((getUpdateDocumentMethod = documentRepositoryGrpc.getUpdateDocumentMethod) == null) {
      synchronized (documentRepositoryGrpc.class) {
        if ((getUpdateDocumentMethod = documentRepositoryGrpc.getUpdateDocumentMethod) == null) {
          documentRepositoryGrpc.getUpdateDocumentMethod = getUpdateDocumentMethod = 
              io.grpc.MethodDescriptor.<grpc.SmartOffice.documentRepository.UpdateDocument, grpc.SmartOffice.documentRepository.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "documentRepository", "updateDocument"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.SmartOffice.documentRepository.UpdateDocument.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.SmartOffice.documentRepository.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new documentRepositoryMethodDescriptorSupplier("updateDocument"))
                  .build();
          }
        }
     }
     return getUpdateDocumentMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static documentRepositoryStub newStub(io.grpc.Channel channel) {
    return new documentRepositoryStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static documentRepositoryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new documentRepositoryBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static documentRepositoryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new documentRepositoryFutureStub(channel);
  }

  /**
   */
  public static abstract class documentRepositoryImplBase implements io.grpc.BindableService {

    /**
     */
    public void retrieveDocument(grpc.SmartOffice.documentRepository.RequestedDocument request,
        io.grpc.stub.StreamObserver<grpc.SmartOffice.documentRepository.RequestedDocument> responseObserver) {
      asyncUnimplementedUnaryCall(getRetrieveDocumentMethod(), responseObserver);
    }

    /**
     */
    public void retrieveFolderList(grpc.SmartOffice.documentRepository.FolderLocation request,
        io.grpc.stub.StreamObserver<grpc.SmartOffice.documentRepository.FolderListing> responseObserver) {
      asyncUnimplementedUnaryCall(getRetrieveFolderListMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<grpc.SmartOffice.documentRepository.SentDocument> sendDocument(
        io.grpc.stub.StreamObserver<grpc.SmartOffice.documentRepository.NewDocumentPath> responseObserver) {
      return asyncUnimplementedStreamingCall(getSendDocumentMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<grpc.SmartOffice.documentRepository.DeleteDocument> deleteDocument(
        io.grpc.stub.StreamObserver<grpc.SmartOffice.documentRepository.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(getDeleteDocumentMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<grpc.SmartOffice.documentRepository.UpdateDocument> updateDocument(
        io.grpc.stub.StreamObserver<grpc.SmartOffice.documentRepository.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(getUpdateDocumentMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRetrieveDocumentMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                grpc.SmartOffice.documentRepository.RequestedDocument,
                grpc.SmartOffice.documentRepository.RequestedDocument>(
                  this, METHODID_RETRIEVE_DOCUMENT)))
          .addMethod(
            getRetrieveFolderListMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                grpc.SmartOffice.documentRepository.FolderLocation,
                grpc.SmartOffice.documentRepository.FolderListing>(
                  this, METHODID_RETRIEVE_FOLDER_LIST)))
          .addMethod(
            getSendDocumentMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                grpc.SmartOffice.documentRepository.SentDocument,
                grpc.SmartOffice.documentRepository.NewDocumentPath>(
                  this, METHODID_SEND_DOCUMENT)))
          .addMethod(
            getDeleteDocumentMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                grpc.SmartOffice.documentRepository.DeleteDocument,
                grpc.SmartOffice.documentRepository.Empty>(
                  this, METHODID_DELETE_DOCUMENT)))
          .addMethod(
            getUpdateDocumentMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                grpc.SmartOffice.documentRepository.UpdateDocument,
                grpc.SmartOffice.documentRepository.Empty>(
                  this, METHODID_UPDATE_DOCUMENT)))
          .build();
    }
  }

  /**
   */
  public static final class documentRepositoryStub extends io.grpc.stub.AbstractStub<documentRepositoryStub> {
    private documentRepositoryStub(io.grpc.Channel channel) {
      super(channel);
    }

    private documentRepositoryStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected documentRepositoryStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new documentRepositoryStub(channel, callOptions);
    }

    /**
     */
    public void retrieveDocument(grpc.SmartOffice.documentRepository.RequestedDocument request,
        io.grpc.stub.StreamObserver<grpc.SmartOffice.documentRepository.RequestedDocument> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getRetrieveDocumentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void retrieveFolderList(grpc.SmartOffice.documentRepository.FolderLocation request,
        io.grpc.stub.StreamObserver<grpc.SmartOffice.documentRepository.FolderListing> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getRetrieveFolderListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<grpc.SmartOffice.documentRepository.SentDocument> sendDocument(
        io.grpc.stub.StreamObserver<grpc.SmartOffice.documentRepository.NewDocumentPath> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getSendDocumentMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<grpc.SmartOffice.documentRepository.DeleteDocument> deleteDocument(
        io.grpc.stub.StreamObserver<grpc.SmartOffice.documentRepository.Empty> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getDeleteDocumentMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<grpc.SmartOffice.documentRepository.UpdateDocument> updateDocument(
        io.grpc.stub.StreamObserver<grpc.SmartOffice.documentRepository.Empty> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getUpdateDocumentMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class documentRepositoryBlockingStub extends io.grpc.stub.AbstractStub<documentRepositoryBlockingStub> {
    private documentRepositoryBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private documentRepositoryBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected documentRepositoryBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new documentRepositoryBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<grpc.SmartOffice.documentRepository.RequestedDocument> retrieveDocument(
        grpc.SmartOffice.documentRepository.RequestedDocument request) {
      return blockingServerStreamingCall(
          getChannel(), getRetrieveDocumentMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<grpc.SmartOffice.documentRepository.FolderListing> retrieveFolderList(
        grpc.SmartOffice.documentRepository.FolderLocation request) {
      return blockingServerStreamingCall(
          getChannel(), getRetrieveFolderListMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class documentRepositoryFutureStub extends io.grpc.stub.AbstractStub<documentRepositoryFutureStub> {
    private documentRepositoryFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private documentRepositoryFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected documentRepositoryFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new documentRepositoryFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_RETRIEVE_DOCUMENT = 0;
  private static final int METHODID_RETRIEVE_FOLDER_LIST = 1;
  private static final int METHODID_SEND_DOCUMENT = 2;
  private static final int METHODID_DELETE_DOCUMENT = 3;
  private static final int METHODID_UPDATE_DOCUMENT = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final documentRepositoryImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(documentRepositoryImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RETRIEVE_DOCUMENT:
          serviceImpl.retrieveDocument((grpc.SmartOffice.documentRepository.RequestedDocument) request,
              (io.grpc.stub.StreamObserver<grpc.SmartOffice.documentRepository.RequestedDocument>) responseObserver);
          break;
        case METHODID_RETRIEVE_FOLDER_LIST:
          serviceImpl.retrieveFolderList((grpc.SmartOffice.documentRepository.FolderLocation) request,
              (io.grpc.stub.StreamObserver<grpc.SmartOffice.documentRepository.FolderListing>) responseObserver);
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
        case METHODID_SEND_DOCUMENT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sendDocument(
              (io.grpc.stub.StreamObserver<grpc.SmartOffice.documentRepository.NewDocumentPath>) responseObserver);
        case METHODID_DELETE_DOCUMENT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.deleteDocument(
              (io.grpc.stub.StreamObserver<grpc.SmartOffice.documentRepository.Empty>) responseObserver);
        case METHODID_UPDATE_DOCUMENT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.updateDocument(
              (io.grpc.stub.StreamObserver<grpc.SmartOffice.documentRepository.Empty>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class documentRepositoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    documentRepositoryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.SmartOffice.documentRepository.DocumentRepositoryImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("documentRepository");
    }
  }

  private static final class documentRepositoryFileDescriptorSupplier
      extends documentRepositoryBaseDescriptorSupplier {
    documentRepositoryFileDescriptorSupplier() {}
  }

  private static final class documentRepositoryMethodDescriptorSupplier
      extends documentRepositoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    documentRepositoryMethodDescriptorSupplier(String methodName) {
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
      synchronized (documentRepositoryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new documentRepositoryFileDescriptorSupplier())
              .addMethod(getRetrieveDocumentMethod())
              .addMethod(getRetrieveFolderListMethod())
              .addMethod(getSendDocumentMethod())
              .addMethod(getDeleteDocumentMethod())
              .addMethod(getUpdateDocumentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
