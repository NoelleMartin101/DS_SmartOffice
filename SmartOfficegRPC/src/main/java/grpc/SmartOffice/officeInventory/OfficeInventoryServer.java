package grpc.SmartOffice.officeInventory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import grpc.SmartOffice.officeInventory.*;
import grpc.SmartOffice.officeInventory.officeInventoryGrpc.officeInventoryImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class OfficeInventoryServer extends officeInventoryImplBase {
	public static void main(String[] args) throws IOException, InterruptedException {
		OfficeInventoryServer inventoryServer = new OfficeInventoryServer();
		System.out.println("Starting gRPC Server");
		int port = 50051; 
		Server server = ServerBuilder.forPort(port).addService(inventoryServer).build().start();
		System.out.println("Server is running on port " + port);
	}	
	
	public StreamObserver<OrderedItems> orderItems(StreamObserver<OrderStatus> responseObserver){
		return new StreamObserver<OrderedItems>() {
			//Map<String, Integer> orderedItems = new HashMap<>();
			ArrayList<String> orders = new ArrayList();
			
			public void onNext(OrderedItems request) {
				//OrderedItems responseBuilder = OrderedItems.newBuilder().build();
				orders.add(request.getItem());
				System.out.println("Ordered Item: " + request.getItem());
				//responseObserver.onNext(responseBuilder);
				//System.out.println("Ordered Item: " + request.getItem() + " No. Ordered " + request.getCount());
				//orderedItems.put(request.getItem(), request.getCount());
			}

			@Override
			public void onError(Throwable t) {
				t.printStackTrace();				
			}

			@Override
			public void onCompleted() {
				OrderedItems.Builder responseBuilder = OrderedItems.newBuilder();
				for(String order : orders)
				{
					responseBuilder.setItem(order);
				}
				OrderStatus reply = OrderStatus.newBuilder().setOrderStatus("Items Ordered").build();
				responseObserver.onNext(reply);
				responseObserver.onCompleted();
				
			}
		};
	}
}