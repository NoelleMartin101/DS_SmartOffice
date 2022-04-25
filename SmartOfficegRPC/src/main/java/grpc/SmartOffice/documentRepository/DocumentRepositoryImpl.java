// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: documentRepository.proto

package grpc.SmartOffice.documentRepository;

public final class DocumentRepositoryImpl {
  private DocumentRepositoryImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FolderLocation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FolderLocation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FolderListing_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FolderListing_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FolderContents_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FolderContents_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Empty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Empty_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RequestedDocument_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RequestedDocument_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SentDocument_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SentDocument_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DeleteDocument_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DeleteDocument_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UpdateDocument_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UpdateDocument_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_NewDocumentPath_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_NewDocumentPath_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030documentRepository.proto\"\036\n\016FolderLoca" +
      "tion\022\014\n\004path\030\001 \001(\t\"&\n\rFolderListing\022\025\n\rf" +
      "olderListing\030\001 \001(\t\"#\n\016FolderContents\022\021\n\t" +
      "filesList\030\001 \001(\t\"\007\n\005Empty\"$\n\021RequestedDoc" +
      "ument\022\017\n\007docName\030\001 \001(\t\"\037\n\014SentDocument\022\017" +
      "\n\007docName\030\001 \001(\t\"!\n\016DeleteDocument\022\017\n\007doc" +
      "Name\030\001 \001(\t\"!\n\016UpdateDocument\022\017\n\007docName\030" +
      "\001 \001(\t\"*\n\017NewDocumentPath\022\027\n\017newDocumentP" +
      "ath\030\001 \001(\t2\242\002\n\022documentRepository\022>\n\020retr" +
      "ieveDocument\022\022.RequestedDocument\032\022.Reque" +
      "stedDocument\"\0000\001\0229\n\022retrieveFolderList\022\017" +
      ".FolderLocation\032\016.FolderListing\"\0000\001\0223\n\014s" +
      "endDocument\022\r.SentDocument\032\020.NewDocument" +
      "Path\"\000(\001\022-\n\016deleteDocument\022\017.DeleteDocum" +
      "ent\032\006.Empty\"\000(\001\022-\n\016updateDocument\022\017.Upda" +
      "teDocument\032\006.Empty\"\000(\001B?\n#grpc.SmartOffi" +
      "ce.documentRepositoryB\026DocumentRepositor" +
      "yImplP\001b\006proto3"
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
    internal_static_FolderLocation_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FolderLocation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FolderLocation_descriptor,
        new java.lang.String[] { "Path", });
    internal_static_FolderListing_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_FolderListing_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FolderListing_descriptor,
        new java.lang.String[] { "FolderListing", });
    internal_static_FolderContents_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_FolderContents_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FolderContents_descriptor,
        new java.lang.String[] { "FilesList", });
    internal_static_Empty_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_Empty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Empty_descriptor,
        new java.lang.String[] { });
    internal_static_RequestedDocument_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_RequestedDocument_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RequestedDocument_descriptor,
        new java.lang.String[] { "DocName", });
    internal_static_SentDocument_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_SentDocument_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SentDocument_descriptor,
        new java.lang.String[] { "DocName", });
    internal_static_DeleteDocument_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_DeleteDocument_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DeleteDocument_descriptor,
        new java.lang.String[] { "DocName", });
    internal_static_UpdateDocument_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_UpdateDocument_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UpdateDocument_descriptor,
        new java.lang.String[] { "DocName", });
    internal_static_NewDocumentPath_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_NewDocumentPath_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_NewDocumentPath_descriptor,
        new java.lang.String[] { "NewDocumentPath", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
