// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: roomAccess.proto

package grpc.SmartOffice.roomAccess;

/**
 * Protobuf type {@code RoomBooking}
 */
public  final class RoomBooking extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:RoomBooking)
    RoomBookingOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RoomBooking.newBuilder() to construct.
  private RoomBooking(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RoomBooking() {
    roomNo_ = 0;
    bookedBy_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RoomBooking(
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
          case 8: {

            roomNo_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            bookedBy_ = s;
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
    return grpc.SmartOffice.roomAccess.RoomAccessImpl.internal_static_RoomBooking_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return grpc.SmartOffice.roomAccess.RoomAccessImpl.internal_static_RoomBooking_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            grpc.SmartOffice.roomAccess.RoomBooking.class, grpc.SmartOffice.roomAccess.RoomBooking.Builder.class);
  }

  public static final int ROOMNO_FIELD_NUMBER = 1;
  private int roomNo_;
  /**
   * <code>int32 roomNo = 1;</code>
   */
  public int getRoomNo() {
    return roomNo_;
  }

  public static final int BOOKEDBY_FIELD_NUMBER = 2;
  private volatile java.lang.Object bookedBy_;
  /**
   * <code>string bookedBy = 2;</code>
   */
  public java.lang.String getBookedBy() {
    java.lang.Object ref = bookedBy_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      bookedBy_ = s;
      return s;
    }
  }
  /**
   * <code>string bookedBy = 2;</code>
   */
  public com.google.protobuf.ByteString
      getBookedByBytes() {
    java.lang.Object ref = bookedBy_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      bookedBy_ = b;
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
    if (roomNo_ != 0) {
      output.writeInt32(1, roomNo_);
    }
    if (!getBookedByBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, bookedBy_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (roomNo_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, roomNo_);
    }
    if (!getBookedByBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, bookedBy_);
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
    if (!(obj instanceof grpc.SmartOffice.roomAccess.RoomBooking)) {
      return super.equals(obj);
    }
    grpc.SmartOffice.roomAccess.RoomBooking other = (grpc.SmartOffice.roomAccess.RoomBooking) obj;

    boolean result = true;
    result = result && (getRoomNo()
        == other.getRoomNo());
    result = result && getBookedBy()
        .equals(other.getBookedBy());
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
    hash = (37 * hash) + ROOMNO_FIELD_NUMBER;
    hash = (53 * hash) + getRoomNo();
    hash = (37 * hash) + BOOKEDBY_FIELD_NUMBER;
    hash = (53 * hash) + getBookedBy().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static grpc.SmartOffice.roomAccess.RoomBooking parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.SmartOffice.roomAccess.RoomBooking parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.SmartOffice.roomAccess.RoomBooking parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.SmartOffice.roomAccess.RoomBooking parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.SmartOffice.roomAccess.RoomBooking parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.SmartOffice.roomAccess.RoomBooking parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.SmartOffice.roomAccess.RoomBooking parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.SmartOffice.roomAccess.RoomBooking parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.SmartOffice.roomAccess.RoomBooking parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static grpc.SmartOffice.roomAccess.RoomBooking parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.SmartOffice.roomAccess.RoomBooking parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.SmartOffice.roomAccess.RoomBooking parseFrom(
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
  public static Builder newBuilder(grpc.SmartOffice.roomAccess.RoomBooking prototype) {
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
   * Protobuf type {@code RoomBooking}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:RoomBooking)
      grpc.SmartOffice.roomAccess.RoomBookingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return grpc.SmartOffice.roomAccess.RoomAccessImpl.internal_static_RoomBooking_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return grpc.SmartOffice.roomAccess.RoomAccessImpl.internal_static_RoomBooking_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              grpc.SmartOffice.roomAccess.RoomBooking.class, grpc.SmartOffice.roomAccess.RoomBooking.Builder.class);
    }

    // Construct using grpc.SmartOffice.roomAccess.RoomBooking.newBuilder()
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
      roomNo_ = 0;

      bookedBy_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return grpc.SmartOffice.roomAccess.RoomAccessImpl.internal_static_RoomBooking_descriptor;
    }

    @java.lang.Override
    public grpc.SmartOffice.roomAccess.RoomBooking getDefaultInstanceForType() {
      return grpc.SmartOffice.roomAccess.RoomBooking.getDefaultInstance();
    }

    @java.lang.Override
    public grpc.SmartOffice.roomAccess.RoomBooking build() {
      grpc.SmartOffice.roomAccess.RoomBooking result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public grpc.SmartOffice.roomAccess.RoomBooking buildPartial() {
      grpc.SmartOffice.roomAccess.RoomBooking result = new grpc.SmartOffice.roomAccess.RoomBooking(this);
      result.roomNo_ = roomNo_;
      result.bookedBy_ = bookedBy_;
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
      if (other instanceof grpc.SmartOffice.roomAccess.RoomBooking) {
        return mergeFrom((grpc.SmartOffice.roomAccess.RoomBooking)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(grpc.SmartOffice.roomAccess.RoomBooking other) {
      if (other == grpc.SmartOffice.roomAccess.RoomBooking.getDefaultInstance()) return this;
      if (other.getRoomNo() != 0) {
        setRoomNo(other.getRoomNo());
      }
      if (!other.getBookedBy().isEmpty()) {
        bookedBy_ = other.bookedBy_;
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
      grpc.SmartOffice.roomAccess.RoomBooking parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (grpc.SmartOffice.roomAccess.RoomBooking) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int roomNo_ ;
    /**
     * <code>int32 roomNo = 1;</code>
     */
    public int getRoomNo() {
      return roomNo_;
    }
    /**
     * <code>int32 roomNo = 1;</code>
     */
    public Builder setRoomNo(int value) {
      
      roomNo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 roomNo = 1;</code>
     */
    public Builder clearRoomNo() {
      
      roomNo_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object bookedBy_ = "";
    /**
     * <code>string bookedBy = 2;</code>
     */
    public java.lang.String getBookedBy() {
      java.lang.Object ref = bookedBy_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        bookedBy_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string bookedBy = 2;</code>
     */
    public com.google.protobuf.ByteString
        getBookedByBytes() {
      java.lang.Object ref = bookedBy_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        bookedBy_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string bookedBy = 2;</code>
     */
    public Builder setBookedBy(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      bookedBy_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string bookedBy = 2;</code>
     */
    public Builder clearBookedBy() {
      
      bookedBy_ = getDefaultInstance().getBookedBy();
      onChanged();
      return this;
    }
    /**
     * <code>string bookedBy = 2;</code>
     */
    public Builder setBookedByBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      bookedBy_ = value;
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


    // @@protoc_insertion_point(builder_scope:RoomBooking)
  }

  // @@protoc_insertion_point(class_scope:RoomBooking)
  private static final grpc.SmartOffice.roomAccess.RoomBooking DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new grpc.SmartOffice.roomAccess.RoomBooking();
  }

  public static grpc.SmartOffice.roomAccess.RoomBooking getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RoomBooking>
      PARSER = new com.google.protobuf.AbstractParser<RoomBooking>() {
    @java.lang.Override
    public RoomBooking parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RoomBooking(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RoomBooking> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RoomBooking> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public grpc.SmartOffice.roomAccess.RoomBooking getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

