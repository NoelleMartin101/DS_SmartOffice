// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: officeInventory.proto

package grpc.SmartOffice.officeInventory;

public final class OfficeInventoryImpl {
  private OfficeInventoryImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OrderedItems_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_OrderedItems_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OrderStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_OrderStatus_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025officeInventory.proto\"\034\n\014OrderedItems\022" +
      "\014\n\004item\030\001 \001(\t\"\"\n\013OrderStatus\022\023\n\013orderSta" +
      "tus\030\001 \001(\t2@\n\017officeInventory\022-\n\norderIte" +
      "ms\022\r.OrderedItems\032\014.OrderStatus\"\000(\001B9\n g" +
      "rpc.SmartOffice.officeInventoryB\023OfficeI" +
      "nventoryImplP\001b\006proto3"
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
    internal_static_OrderedItems_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_OrderedItems_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OrderedItems_descriptor,
        new java.lang.String[] { "Item", });
    internal_static_OrderStatus_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_OrderStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OrderStatus_descriptor,
        new java.lang.String[] { "OrderStatus", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
