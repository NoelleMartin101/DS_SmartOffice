// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chatBox.proto

package grpc.SmartOffice.chatbox;

public final class ChatBoxServiceImpl {
  private ChatBoxServiceImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SendMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SendMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ReceiveMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ReceiveMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UserName_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UserName_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UserStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UserStatus_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rchatBox.proto\"J\n\013SendMessage\022\023\n\013sentMe" +
      "ssage\030\001 \001(\t\022\021\n\tmessageTo\030\002 \001(\t\022\023\n\013messag" +
      "eTime\030\003 \001(\t\"S\n\016ReceiveMessage\022\027\n\017receive" +
      "dMessage\030\001 \001(\t\022\023\n\013messageFrom\030\002 \001(\t\022\023\n\013m" +
      "essageTime\030\003 \001(\t\"\034\n\010UserName\022\020\n\010userName" +
      "\030\001 \001(\t\" \n\nUserStatus\022\022\n\nchatStatus\030\001 \001(\t" +
      "2\236\001\n\016chatBoxService\0226\n\017getChatMessages\022\014" +
      ".SendMessage\032\017.ReceiveMessage\"\000(\0010\001\022)\n\rg" +
      "etChatStatus\022\t.UserName\032\013.UserStatus\"\000\022)" +
      "\n\rsetChatStatus\022\t.UserName\032\013.UserStatus\"" +
      "\000B0\n\030grpc.SmartOffice.chatboxB\022ChatBoxSe" +
      "rviceImplP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_SendMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SendMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SendMessage_descriptor,
        new java.lang.String[] { "SentMessage", "MessageTo", "MessageTime", });
    internal_static_ReceiveMessage_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ReceiveMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ReceiveMessage_descriptor,
        new java.lang.String[] { "ReceivedMessage", "MessageFrom", "MessageTime", });
    internal_static_UserName_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_UserName_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UserName_descriptor,
        new java.lang.String[] { "UserName", });
    internal_static_UserStatus_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_UserStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UserStatus_descriptor,
        new java.lang.String[] { "ChatStatus", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
