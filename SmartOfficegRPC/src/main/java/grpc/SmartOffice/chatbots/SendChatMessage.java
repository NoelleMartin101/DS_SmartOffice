// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chatBot.proto

package grpc.SmartOffice.chatbots;

/**
 * Protobuf type {@code SendChatMessage}
 */
public  final class SendChatMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:SendChatMessage)
    SendChatMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SendChatMessage.newBuilder() to construct.
  private SendChatMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SendChatMessage() {
    sentMessage_ = "";
    sentTo_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SendChatMessage(
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

            sentMessage_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            sentTo_ = s;
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
    return grpc.SmartOffice.chatbots.ChatBotServiceImpl.internal_static_SendChatMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return grpc.SmartOffice.chatbots.ChatBotServiceImpl.internal_static_SendChatMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            grpc.SmartOffice.chatbots.SendChatMessage.class, grpc.SmartOffice.chatbots.SendChatMessage.Builder.class);
  }

  public static final int SENTMESSAGE_FIELD_NUMBER = 1;
  private volatile java.lang.Object sentMessage_;
  /**
   * <code>string sentMessage = 1;</code>
   */
  public java.lang.String getSentMessage() {
    java.lang.Object ref = sentMessage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sentMessage_ = s;
      return s;
    }
  }
  /**
   * <code>string sentMessage = 1;</code>
   */
  public com.google.protobuf.ByteString
      getSentMessageBytes() {
    java.lang.Object ref = sentMessage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sentMessage_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SENTTO_FIELD_NUMBER = 2;
  private volatile java.lang.Object sentTo_;
  /**
   * <code>string sentTo = 2;</code>
   */
  public java.lang.String getSentTo() {
    java.lang.Object ref = sentTo_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sentTo_ = s;
      return s;
    }
  }
  /**
   * <code>string sentTo = 2;</code>
   */
  public com.google.protobuf.ByteString
      getSentToBytes() {
    java.lang.Object ref = sentTo_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sentTo_ = b;
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
    if (!getSentMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, sentMessage_);
    }
    if (!getSentToBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, sentTo_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSentMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, sentMessage_);
    }
    if (!getSentToBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, sentTo_);
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
    if (!(obj instanceof grpc.SmartOffice.chatbots.SendChatMessage)) {
      return super.equals(obj);
    }
    grpc.SmartOffice.chatbots.SendChatMessage other = (grpc.SmartOffice.chatbots.SendChatMessage) obj;

    boolean result = true;
    result = result && getSentMessage()
        .equals(other.getSentMessage());
    result = result && getSentTo()
        .equals(other.getSentTo());
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
    hash = (37 * hash) + SENTMESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getSentMessage().hashCode();
    hash = (37 * hash) + SENTTO_FIELD_NUMBER;
    hash = (53 * hash) + getSentTo().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static grpc.SmartOffice.chatbots.SendChatMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.SmartOffice.chatbots.SendChatMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.SmartOffice.chatbots.SendChatMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.SmartOffice.chatbots.SendChatMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.SmartOffice.chatbots.SendChatMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.SmartOffice.chatbots.SendChatMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.SmartOffice.chatbots.SendChatMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.SmartOffice.chatbots.SendChatMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.SmartOffice.chatbots.SendChatMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static grpc.SmartOffice.chatbots.SendChatMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.SmartOffice.chatbots.SendChatMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.SmartOffice.chatbots.SendChatMessage parseFrom(
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
  public static Builder newBuilder(grpc.SmartOffice.chatbots.SendChatMessage prototype) {
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
   * Protobuf type {@code SendChatMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SendChatMessage)
      grpc.SmartOffice.chatbots.SendChatMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return grpc.SmartOffice.chatbots.ChatBotServiceImpl.internal_static_SendChatMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return grpc.SmartOffice.chatbots.ChatBotServiceImpl.internal_static_SendChatMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              grpc.SmartOffice.chatbots.SendChatMessage.class, grpc.SmartOffice.chatbots.SendChatMessage.Builder.class);
    }

    // Construct using grpc.SmartOffice.chatbots.SendChatMessage.newBuilder()
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
      sentMessage_ = "";

      sentTo_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return grpc.SmartOffice.chatbots.ChatBotServiceImpl.internal_static_SendChatMessage_descriptor;
    }

    @java.lang.Override
    public grpc.SmartOffice.chatbots.SendChatMessage getDefaultInstanceForType() {
      return grpc.SmartOffice.chatbots.SendChatMessage.getDefaultInstance();
    }

    @java.lang.Override
    public grpc.SmartOffice.chatbots.SendChatMessage build() {
      grpc.SmartOffice.chatbots.SendChatMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public grpc.SmartOffice.chatbots.SendChatMessage buildPartial() {
      grpc.SmartOffice.chatbots.SendChatMessage result = new grpc.SmartOffice.chatbots.SendChatMessage(this);
      result.sentMessage_ = sentMessage_;
      result.sentTo_ = sentTo_;
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
      if (other instanceof grpc.SmartOffice.chatbots.SendChatMessage) {
        return mergeFrom((grpc.SmartOffice.chatbots.SendChatMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(grpc.SmartOffice.chatbots.SendChatMessage other) {
      if (other == grpc.SmartOffice.chatbots.SendChatMessage.getDefaultInstance()) return this;
      if (!other.getSentMessage().isEmpty()) {
        sentMessage_ = other.sentMessage_;
        onChanged();
      }
      if (!other.getSentTo().isEmpty()) {
        sentTo_ = other.sentTo_;
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
      grpc.SmartOffice.chatbots.SendChatMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (grpc.SmartOffice.chatbots.SendChatMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object sentMessage_ = "";
    /**
     * <code>string sentMessage = 1;</code>
     */
    public java.lang.String getSentMessage() {
      java.lang.Object ref = sentMessage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sentMessage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string sentMessage = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSentMessageBytes() {
      java.lang.Object ref = sentMessage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sentMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string sentMessage = 1;</code>
     */
    public Builder setSentMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sentMessage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string sentMessage = 1;</code>
     */
    public Builder clearSentMessage() {
      
      sentMessage_ = getDefaultInstance().getSentMessage();
      onChanged();
      return this;
    }
    /**
     * <code>string sentMessage = 1;</code>
     */
    public Builder setSentMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sentMessage_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object sentTo_ = "";
    /**
     * <code>string sentTo = 2;</code>
     */
    public java.lang.String getSentTo() {
      java.lang.Object ref = sentTo_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sentTo_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string sentTo = 2;</code>
     */
    public com.google.protobuf.ByteString
        getSentToBytes() {
      java.lang.Object ref = sentTo_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sentTo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string sentTo = 2;</code>
     */
    public Builder setSentTo(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sentTo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string sentTo = 2;</code>
     */
    public Builder clearSentTo() {
      
      sentTo_ = getDefaultInstance().getSentTo();
      onChanged();
      return this;
    }
    /**
     * <code>string sentTo = 2;</code>
     */
    public Builder setSentToBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sentTo_ = value;
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


    // @@protoc_insertion_point(builder_scope:SendChatMessage)
  }

  // @@protoc_insertion_point(class_scope:SendChatMessage)
  private static final grpc.SmartOffice.chatbots.SendChatMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new grpc.SmartOffice.chatbots.SendChatMessage();
  }

  public static grpc.SmartOffice.chatbots.SendChatMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SendChatMessage>
      PARSER = new com.google.protobuf.AbstractParser<SendChatMessage>() {
    @java.lang.Override
    public SendChatMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SendChatMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SendChatMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SendChatMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public grpc.SmartOffice.chatbots.SendChatMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

