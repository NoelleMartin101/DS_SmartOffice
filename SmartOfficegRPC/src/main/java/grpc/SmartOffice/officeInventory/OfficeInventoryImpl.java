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
      "\n\025officeInventory.proto\"+\n\014OrderedItems\022" +
      "\014\n\004item\030\001 \001(\t\022\r\n\005count\030\002 \001(\005\"\"\n\013OrderSta" +
      "tus\022\023\n\013orderStatus\030\001 \001(\t2@\n\017officeInvent" +
      "ory\022-\n\norderItems\022\r.OrderedItems\032\014.Order" +
      "Status\"\000(\001B9\n grpc.SmartOffice.officeInv" +
      "entoryB\023OfficeInventoryImplP\001b\006proto3"
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
        new java.lang.String[] { "Item", "Count", });
    internal_static_OrderStatus_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_OrderStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OrderStatus_descriptor,
        new java.lang.String[] { "OrderStatus", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
