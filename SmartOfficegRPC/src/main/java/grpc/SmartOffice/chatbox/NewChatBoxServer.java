package grpc.SmartOffice.chatbox;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.util.Properties;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import grpc.SmartOffice.chatbox.chatBoxServiceGrpc.chatBoxServiceImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;


public class NewChatBoxServer extends chatBoxServiceImplBase{
	
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		NewChatBoxServer chatBoxServer = new NewChatBoxServer();

		Properties prop = chatBoxServer.getProperties();
		
		chatBoxServer.registerService(prop);
		System.out.println("Starting gRPC Server");
		int port = 50051; 
		Server server = ServerBuilder.forPort(port).addService(chatBoxServer).build().start();
				//.addService(new ChatBoxServiceImpl()).build().start();	
		System.out.println("Server is running on port " + port);
		
		server.awaitTermination();
	}
		
	public void getChatStatus(UserName request, StreamObserver<UserStatus>responseObserver)
	{
		System.out.println("Getting the chat status for " + request.getUserName());
				
		String chatStatus = "Available";
		if(request.getUserName() == "Noelle")
			chatStatus = "Available";
		else if(request.getUserName() == "John")
			chatStatus = "Away";
		else if(request.getUserName() == "Ann")
			chatStatus = "Busy";
		//Allow the Client/GUI to handle the message to go with the chatStatus
		UserStatus reply = UserStatus.newBuilder().setChatStatus(chatStatus).build();
			
		responseObserver.onNext(reply);
		responseObserver.onCompleted();
	}
	
	@Override
	public StreamObserver<SendMessage> getChatMessages(StreamObserver<ReceiveMessage> responseObserver) {
	    return new StreamObserver<SendMessage>() {
	        @Override
	        public void onNext(SendMessage request) {
	        	System.out.println("Recieving getChatMessages");
	            	ReceiveMessage responseBuilder =  ReceiveMessage.newBuilder().build();
	                responseObserver.onNext(responseBuilder);
	        }

	        @Override
	        public void onCompleted() {
	        	System.out.println("receiving getChatMessages completed ");
	            responseObserver.onCompleted();
	        }

			@Override
			public void onError(Throwable t) {
				t.printStackTrace();				
			}

	    };
	}
	
	
	private Properties getProperties() {		
		Properties prop = null;		
		
		 try (InputStream input = new FileInputStream("src/main/resources/chatBox.properties")) {
	            prop = new Properties();
	            prop.load(input);

	     } 
		 catch (IOException ex) {
	            ex.printStackTrace();
	     }
	
		 return prop;
	}	
	
	private  void registerService(Properties prop) {		
		 try {
	            // Create a JmDNS instance
	            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
	            
	            String service_type = prop.getProperty("service_type");//"_http._tcp.local.";
	            String service_name = prop.getProperty("service_name");// "example";
	            int service_port = Integer.valueOf( prop.getProperty("service_port") );	            
	            String service_description_properties = prop.getProperty("service_description");//"path=index.html";	            
	            // Register a service
	            ServiceInfo serviceInfo = ServiceInfo.create(service_type, service_name, service_port, service_description_properties);
	            jmdns.registerService(serviceInfo);	            
	            System.out.printf("Registering service with type %s and name %s \n", service_type, service_name);
	            
	            // Wait a bit
	            Thread.sleep(1000);

	            // Unregister all services
	            jmdns.unregisterAllServices();

	        } catch (IOException e) {
	            System.out.println(e.getMessage());
	        } catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	    
	}	
}