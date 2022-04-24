package grpc.SmartOffice.chatbox;

import java.util.concurrent.TimeUnit;
import java.util.Random;

import grpc.SmartOffice.chatbox.chatBoxServiceGrpc.chatBoxServiceBlockingStub;
import grpc.SmartOffice.chatbox.chatBoxServiceGrpc.chatBoxServiceStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

public class NewChatBoxClient{
	private static ManagedChannel channel;
	private static chatBoxServiceBlockingStub blockingStub;
	private static chatBoxServiceStub asyncStub;
	
	public static void main(String[] args) throws Exception
	{
		int port = 50051;
		String host = "localhost";
		//the channel is the connection between the client and the server 
		channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();	
		NewChatBoxClient client = new NewChatBoxClient();
		
		blockingStub = chatBoxServiceGrpc.newBlockingStub(channel);
		asyncStub = chatBoxServiceGrpc.newStub(channel);
		
		GetChatStatus();	
		GetChatMessages();	
	}

	public static void GetChatStatus()
			throws InterruptedException {
		try
		{
			String userName = "Noelle";
			UserName request = UserName.newBuilder().setUserName(userName).build();
			UserStatus response = blockingStub.getChatStatus(request);
		}
		catch (StatusRuntimeException e) {
			e.printStackTrace();
		}
		finally {
			channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
		}
	}
	
	public static void GetChatMessages()
	{
		StreamObserver<ReceiveMessage> responseObserver = new StreamObserver<ReceiveMessage>(){
			
			@Override
			public void onNext(ReceiveMessage msg) {
				System.out.println("receiving message " + msg.getReceivedMessage() );
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
		
		StreamObserver<SendMessage> requestObserver = asyncStub.getChatMessages(responseObserver);
		try {
			
			requestObserver.onNext(SendMessage.newBuilder().setSentMessage("Hello").build());
			requestObserver.onNext(SendMessage.newBuilder().setSentMessage("how are you?").build());
		
			requestObserver.onCompleted();
			Thread.sleep(new Random().nextInt(1000) + 500);


		} catch (RuntimeException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}

		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}