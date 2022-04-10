package grpc.SmartOffice.chatbox;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class NewChatBoxClient{
	public static void main(String[] args)
	{
		int port = 50051;
		String host = "localhost";
		//the channel is the connection between the client and the server 
		ManagedChannel newChannel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
		 
	}
}