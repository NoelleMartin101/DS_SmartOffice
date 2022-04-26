package grpc.SmartOffice.officeInventory;

import grpc.SmartOffice.officeInventory.officeInventoryGrpc.officeInventoryBlockingStub;
import grpc.SmartOffice.officeInventory.officeInventoryGrpc.officeInventoryStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class OfficeInventoryClient{
	private static ManagedChannel channel;
	private static officeInventoryStub asyncStub;
	
	public static void main(String[] args) throws InterruptedException {
		int port = 50051;
		String host = "localhost";
		
		channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
				
		asyncStub = officeInventoryGrpc.newStub(channel);
		
		PlaceOrder();
	}
	public static void PlaceOrder() throws InterruptedException {
		StreamObserver<OrderStatus> responseObserver = new StreamObserver<OrderStatus>() {

			@Override
			public void onNext(OrderStatus value) {
				System.out.println("Recieving Order Status");				
			}

			@Override
			public void onError(Throwable t) {
				t.printStackTrace();				
			}

			@Override
			public void onCompleted() {
				System.out.println("stream is completed");				
			}			
		};
		
		StreamObserver<OrderedItems> requestObserver = asyncStub.orderItems(responseObserver);
		try
		{
			requestObserver.onNext(OrderedItems.newBuilder().setItem("Blue Pen").setCount(1).build());
			Thread.sleep(500);
			requestObserver.onNext(OrderedItems.newBuilder().setItem("Optical Mouse").setCount(2).build());
			Thread.sleep(500);
			
			requestObserver.onCompleted();		
			Thread.sleep(10000);
			
		} 
		catch (RuntimeException e) {
			e.printStackTrace();
		} 
		catch (InterruptedException e) {			
			e.printStackTrace();
		}
	}
}