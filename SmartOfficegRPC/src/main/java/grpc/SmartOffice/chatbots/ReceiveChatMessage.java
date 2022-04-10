// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chatBox.proto

package grpc.SmartOffice.chatbots;

/**
 * Protobuf type {@code ReceiveChatMessage}
 */
public  final class ReceiveChatMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ReceiveChatMessage)
    ReceiveChatMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReceiveChatMessage.newBuilder() to construct.
  private ReceiveChatMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReceiveChatMessage() {
    receivedMessage_ = "";
    receivedFrom_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ReceiveChatMessage(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            receivedMessage_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            receivedFrom_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return grpc.SmartOffice.chatbots.ChatBoxServiceImpl.internal_static_ReceiveChatMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return grpc.SmartOffice.chatbots.ChatBoxServiceImpl.internal_static_ReceiveChatMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            grpc.SmartOffice.chatbots.ReceiveChatMessage.class, grpc.SmartOffice.chatbots.ReceiveChatMessage.Builder.class);
  }

  public static final int RECEIVEDMESSAGE_FIELD_NUMBER = 1;
  private volatile java.lang.Object receivedMessage_;
  /**
   * <code>string receivedMessage = 1;</code>
   */
  public java.lang.String getReceivedMessage() {
    java.lang.Object ref = receivedMessage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      receivedMessage_ = s;
      return s;
    }
  }
  /**
   * <code>string receivedMessage = 1;</code>
   */
  public com.google.protobuf.ByteString
      getReceivedMessageBytes() {
    java.lang.Object ref = receivedMessage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      receivedMessage_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RECEIVEDFROM_FIELD_NUMBER = 2;
  private volatile java.lang.Object receivedFrom_;
  /**
   * <code>string receivedFrom = 2;</code>
   */
  public java.lang.String getReceivedFrom() {
    java.lang.Object ref = receivedFrom_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      receivedFrom_ = s;
      return s;
    }
  }
  /**
   * <code>string receivedFrom = 2;</code>
   */
  public com.google.protobuf.ByteString
      getReceivedFromBytes() {
    java.lang.Object ref = receivedFrom_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      receivedFrom_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getReceivedMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, receivedMessage_);
    }
    if (!getReceivedFromBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, receivedFrom_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getReceivedMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, receivedMessage_);
    }
    if (!getReceivedFromBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, receivedFrom_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof grpc.SmartOffice.chatbots.ReceiveChatMessage)) {
      return super.equals(obj);
    }
    grpc.SmartOffice.chatbots.ReceiveChatMessage other = (grpc.SmartOffice.chatbots.ReceiveChatMessage) obj;

    boolean result = true;
    result = result && getReceivedMessage()
        .equals(other.getReceivedMessage());
    result = result && getReceivedFrom()
        .equals(other.getReceivedFrom());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + RECEIVEDMESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getReceivedMessage().hashCode();
    hash = (37 * hash) + RECEIVEDFROM_FIELD_NUMBER;
    hash = (53 * hash) + getReceivedFrom().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static grpc.SmartOffice.chatbots.ReceiveChatMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.SmartOffice.chatbots.ReceiveChatMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.SmartOffice.chatbots.ReceiveChatMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.SmartOffice.chatbots.ReceiveChatMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.SmartOffice.chatbots.ReceiveChatMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.SmartOffice.chatbots.ReceiveChatMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.SmartOffice.chatbots.ReceiveChatMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.SmartOffice.chatbots.ReceiveChatMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.SmartOffice.chatbots.ReceiveChatMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static grpc.SmartOffice.chatbots.ReceiveChatMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.SmartOffice.chatbots.ReceiveChatMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.SmartOffice.chatbots.ReceiveChatMessage parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(grpc.SmartOffice.chatbots.ReceiveChatMessage prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code ReceiveChatMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ReceiveChatMessage)
      grpc.SmartOffice.chatbots.ReceiveChatMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return grpc.SmartOffice.chatbots.ChatBoxServiceImpl.internal_static_ReceiveChatMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return grpc.SmartOffice.chatbots.ChatBoxServiceImpl.internal_static_ReceiveChatMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              grpc.SmartOffice.chatbots.ReceiveChatMessage.class, grpc.SmartOffice.chatbots.ReceiveChatMessage.Builder.class);
    }

    // Construct using grpc.SmartOffice.chatbots.ReceiveChatMessage.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      receivedMessage_ = "";

      receivedFrom_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return grpc.SmartOffice.chatbots.ChatBoxServiceImpl.internal_static_ReceiveChatMessage_descriptor;
    }

    @java.lang.Override
    public grpc.SmartOffice.chatbots.ReceiveChatMessage getDefaultInstanceForType() {
      return grpc.SmartOffice.chatbots.ReceiveChatMessage.getDefaultInstance();
    }

    @java.lang.Override
    public grpc.SmartOffice.chatbots.ReceiveChatMessage build() {
      grpc.SmartOffice.chatbots.ReceiveChatMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public grpc.SmartOffice.chatbots.ReceiveChatMessage buildPartial() {
      grpc.SmartOffice.chatbots.ReceiveChatMessage result = new grpc.SmartOffice.chatbots.ReceiveChatMessage(this);
      result.receivedMessage_ = receivedMessage_;
      result.receivedFrom_ = receivedFrom_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof grpc.SmartOffice.chatbots.ReceiveChatMessage) {
        return mergeFrom((grpc.SmartOffice.chatbots.ReceiveChatMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(grpc.SmartOffice.chatbots.ReceiveChatMessage other) {
      if (other == grpc.SmartOffice.chatbots.ReceiveChatMessage.getDefaultInstance()) return this;
      if (!other.getReceivedMessage().isEmpty()) {
        receivedMessage_ = other.receivedMessage_;
        onChanged();
      }
      if (!other.getReceivedFrom().isEmpty()) {
        receivedFrom_ = other.receivedFrom_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      grpc.SmartOffice.chatbots.ReceiveChatMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (grpc.SmartOffice.chatbots.ReceiveChatMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object receivedMessage_ = "";
    /**
     * <code>string receivedMessage = 1;</code>
     */
    public java.lang.String getReceivedMessage() {
      java.lang.Object ref = receivedMessage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        receivedMessage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string receivedMessage = 1;</code>
     */
    public com.google.protobuf.ByteString
        getReceivedMessageBytes() {
      java.lang.Object ref = receivedMessage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        receivedMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string receivedMessage = 1;</code>
     */
    public Builder setReceivedMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      receivedMessage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string receivedMessage = 1;</code>
     */
    public Builder clearReceivedMessage() {
      
      receivedMessage_ = getDefaultInstance().getReceivedMessage();
      onChanged();
      return this;
    }
    /**
     * <code>string receivedMessage = 1;</code>
     */
    public Builder setReceivedMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      receivedMessage_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object receivedFrom_ = "";
    /**
     * <code>string receivedFrom = 2;</code>
     */
    public java.lang.String getReceivedFrom() {
      java.lang.Object ref = receivedFrom_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        receivedFrom_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string receivedFrom = 2;</code>
     */
    public com.google.protobuf.ByteString
        getReceivedFromBytes() {
      java.lang.Object ref = receivedFrom_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        receivedFrom_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string receivedFrom = 2;</code>
     */
    public Builder setReceivedFrom(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      receivedFrom_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string receivedFrom = 2;</code>
     */
    public Builder clearReceivedFrom() {
      
      receivedFrom_ = getDefaultInstance().getReceivedFrom();
      onChanged();
      return this;
    }
    /**
     * <code>string receivedFrom = 2;</code>
     */
    public Builder setReceivedFromBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      receivedFrom_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ReceiveChatMessage)
  }

  // @@protoc_insertion_point(class_scope:ReceiveChatMessage)
  private static final grpc.SmartOffice.chatbots.ReceiveChatMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new grpc.SmartOffice.chatbots.ReceiveChatMessage();
  }

  public static grpc.SmartOffice.chatbots.ReceiveChatMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReceiveChatMessage>
      PARSER = new com.google.protobuf.AbstractParser<ReceiveChatMessage>() {
    @java.lang.Override
    public ReceiveChatMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ReceiveChatMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ReceiveChatMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReceiveChatMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public grpc.SmartOffice.chatbots.ReceiveChatMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

