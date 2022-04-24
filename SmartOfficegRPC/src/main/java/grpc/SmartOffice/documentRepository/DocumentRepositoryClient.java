package grpc.SmartOffice.documentRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

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
	    final CountDownLatch finishLatch = new CountDownLatch(1);
	    final AtomicBoolean completed = new AtomicBoolean(false);
	    String folderLocation = "";
	    
	    StreamObserver<FolderListing> streamObserver = new StreamObserver<FolderListing>() {
	        @Override
	        public void onNext(FolderListing value) {
	            try{
	                fileNames.add(value.getFileName());
	            }catch (Exception e){
	            	e.printStackTrace();
	            }

	        }

	        @Override
	        public void onError(Throwable t) {
	        	t.printStackTrace();
	            finishLatch.countDown();
	        }

	        @Override
	        public void onCompleted() {
				System.out.println("stream is completed");
	            completed.compareAndSet(false, true);
	            finishLatch.countDown();
	        }
	    };

	    try {
	    	asyncStub.retrieveFolderList(folderLocation, streamObserver);
	        finishLatch.await(5, TimeUnit.MINUTES);

	        if (!completed.get()) {
	            throw new Exception("The downloadFile() method did not complete");
	        }

	    } catch (Exception e) {
			System.out.println("Listing the files did not complete");
	    }

	    return fileNames;
	}	
}