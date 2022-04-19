// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: documentRepository.proto

package grpc.SmartOffice.documentRepository;

/**
 * Protobuf type {@code FolderContents}
 */
public  final class FolderContents extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:FolderContents)
    FolderContentsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FolderContents.newBuilder() to construct.
  private FolderContents(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FolderContents() {
    filesList_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FolderContents(
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

            filesList_ = s;
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
    return grpc.SmartOffice.documentRepository.DocumentRepositoryImpl.internal_static_FolderContents_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return grpc.SmartOffice.documentRepository.DocumentRepositoryImpl.internal_static_FolderContents_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            grpc.SmartOffice.documentRepository.FolderContents.class, grpc.SmartOffice.documentRepository.FolderContents.Builder.class);
  }

  public static final int FILESLIST_FIELD_NUMBER = 1;
  private volatile java.lang.Object filesList_;
  /**
   * <code>string filesList = 1;</code>
   */
  public java.lang.String getFilesList() {
    java.lang.Object ref = filesList_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      filesList_ = s;
      return s;
    }
  }
  /**
   * <code>string filesList = 1;</code>
   */
  public com.google.protobuf.ByteString
      getFilesListBytes() {
    java.lang.Object ref = filesList_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      filesList_ = b;
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
    if (!getFilesListBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, filesList_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getFilesListBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, filesList_);
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
    if (!(obj instanceof grpc.SmartOffice.documentRepository.FolderContents)) {
      return super.equals(obj);
    }
    grpc.SmartOffice.documentRepository.FolderContents other = (grpc.SmartOffice.documentRepository.FolderContents) obj;

    boolean result = true;
    result = result && getFilesList()
        .equals(other.getFilesList());
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
    hash = (37 * hash) + FILESLIST_FIELD_NUMBER;
    hash = (53 * hash) + getFilesList().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static grpc.SmartOffice.documentRepository.FolderContents parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.SmartOffice.documentRepository.FolderContents parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.SmartOffice.documentRepository.FolderContents parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.SmartOffice.documentRepository.FolderContents parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.SmartOffice.documentRepository.FolderContents parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.SmartOffice.documentRepository.FolderContents parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.SmartOffice.documentRepository.FolderContents parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.SmartOffice.documentRepository.FolderContents parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.SmartOffice.documentRepository.FolderContents parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static grpc.SmartOffice.documentRepository.FolderContents parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.SmartOffice.documentRepository.FolderContents parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.SmartOffice.documentRepository.FolderContents parseFrom(
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
  public static Builder newBuilder(grpc.SmartOffice.documentRepository.FolderContents prototype) {
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
   * Protobuf type {@code FolderContents}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:FolderContents)
      grpc.SmartOffice.documentRepository.FolderContentsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return grpc.SmartOffice.documentRepository.DocumentRepositoryImpl.internal_static_FolderContents_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return grpc.SmartOffice.documentRepository.DocumentRepositoryImpl.internal_static_FolderContents_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              grpc.SmartOffice.documentRepository.FolderContents.class, grpc.SmartOffice.documentRepository.FolderContents.Builder.class);
    }

    // Construct using grpc.SmartOffice.documentRepository.FolderContents.newBuilder()
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
      filesList_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return grpc.SmartOffice.documentRepository.DocumentRepositoryImpl.internal_static_FolderContents_descriptor;
    }

    @java.lang.Override
    public grpc.SmartOffice.documentRepository.FolderContents getDefaultInstanceForType() {
      return grpc.SmartOffice.documentRepository.FolderContents.getDefaultInstance();
    }

    @java.lang.Override
    public grpc.SmartOffice.documentRepository.FolderContents build() {
      grpc.SmartOffice.documentRepository.FolderContents result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public grpc.SmartOffice.documentRepository.FolderContents buildPartial() {
      grpc.SmartOffice.documentRepository.FolderContents result = new grpc.SmartOffice.documentRepository.FolderContents(this);
      result.filesList_ = filesList_;
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
      if (other instanceof grpc.SmartOffice.documentRepository.FolderContents) {
        return mergeFrom((grpc.SmartOffice.documentRepository.FolderContents)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(grpc.SmartOffice.documentRepository.FolderContents other) {
      if (other == grpc.SmartOffice.documentRepository.FolderContents.getDefaultInstance()) return this;
      if (!other.getFilesList().isEmpty()) {
        filesList_ = other.filesList_;
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
      grpc.SmartOffice.documentRepository.FolderContents parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (grpc.SmartOffice.documentRepository.FolderContents) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object filesList_ = "";
    /**
     * <code>string filesList = 1;</code>
     */
    public java.lang.String getFilesList() {
      java.lang.Object ref = filesList_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        filesList_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string filesList = 1;</code>
     */
    public com.google.protobuf.ByteString
        getFilesListBytes() {
      java.lang.Object ref = filesList_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        filesList_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string filesList = 1;</code>
     */
    public Builder setFilesList(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      filesList_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string filesList = 1;</code>
     */
    public Builder clearFilesList() {
      
      filesList_ = getDefaultInstance().getFilesList();
      onChanged();
      return this;
    }
    /**
     * <code>string filesList = 1;</code>
     */
    public Builder setFilesListBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      filesList_ = value;
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


    // @@protoc_insertion_point(builder_scope:FolderContents)
  }

  // @@protoc_insertion_point(class_scope:FolderContents)
  private static final grpc.SmartOffice.documentRepository.FolderContents DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new grpc.SmartOffice.documentRepository.FolderContents();
  }

  public static grpc.SmartOffice.documentRepository.FolderContents getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FolderContents>
      PARSER = new com.google.protobuf.AbstractParser<FolderContents>() {
    @java.lang.Override
    public FolderContents parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FolderContents(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FolderContents> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FolderContents> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public grpc.SmartOffice.documentRepository.FolderContents getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

