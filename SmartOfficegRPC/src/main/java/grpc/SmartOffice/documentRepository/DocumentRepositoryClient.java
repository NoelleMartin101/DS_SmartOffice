package grpc.SmartOffice.documentRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import grpc.SmartOffice.documentRepository.documentRepositoryGrpc.documentRepositoryBlockingStub;
import grpc.SmartOffice.documentRepository.documentRepositoryGrpc.documentRepositoryStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class DocumentRepositoryClient{
	private static ManagedChannel channel;
	private static documentRepositoryBlockingStub blockingStub;
	private static documentRepositoryStub asyncStub;
	
	public static void main(String[] args)
	{
		int port = 50051;
		String host = "localhost";
		
		channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
		DocumentRepositoryClient client = new DocumentRepositoryClient();
		
		blockingStub = documentRepositoryGrpc.newBlockingStub(channel);
		asyncStub = documentRepositoryGrpc.newStub(channel);
		
		GetFolderListing();
	}
	public static void GetFolderListing()
	{
		List<String> fileNames = new ArrayList<>();
	    FolderLocation request = FolderLocation.newBuilder().build();
	    
	    StreamObserver<FolderListing> responseObserver = new StreamObserver<FolderListing>() {
	        @Override
	        public void onNext(FolderListing filename) {	            
	                fileNames.add(filename.getFolderListing());	           
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
	    asyncStub.retrieveFolderList(request, responseObserver);
	    
	    try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
}