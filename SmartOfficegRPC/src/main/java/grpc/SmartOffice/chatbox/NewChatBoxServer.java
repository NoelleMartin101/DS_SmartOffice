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


public class NewChatBoxServer{
	
	private Server server;
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		NewChatBoxServer chatBoxServer = new NewChatBoxServer();

		Properties prop = chatBoxServer.getProperties();
		
		chatBoxServer.registerService(prop);
		chatBoxServer.start();
	}
	private void start() throws IOException, InterruptedException {
		System.out.println("Starting gRPC Server");
		int port = 50051; 
		server = ServerBuilder.forPort(port).addService(new NewChatBoxServerImpl()).build().start();
				//.addService(new ChatBoxServiceImpl()).build().start();	
		System.out.println("Server is running on port " + port);
		
		server.awaitTermination();
	}
	static class NewChatBoxServerImpl extends chatBoxServiceImplBase{
		//@Override
		public void getChatStatus(user request, StreamObserver<chatStatus> responseObserver) {
			String user = request.getUserName();
			System.out.println("We are getting the chat status for " + user);
			/*
			String uStatus;
			if(user == "1") uStatus = "Away";
			else if(user == "2") uStatus = "Busy";
			else if(user == "3") uStatus = "Available";
			else uStatus = "Unknown";			
			System.out.println("User Name: " + user);
			System.out.println("User Status: " + uStatus);
			*/
			
			//now build response
			chatStatus.Builder responseBuilder = chatStatus.newBuilder();
			
			responseBuilder.setUserStatus("Available");
			
			responseObserver.onNext(responseBuilder.build());
			responseObserver.onCompleted();
		}	
		
		//@Override
		public StreamObserver<sendChatMessage> getChatMessages(StreamObserver<receiveChatMessage> responseObserver) {
		    return new StreamObserver<sendChatMessage>() {
		        @Override
		        public void onNext(sendChatMessage request) {
		            for (int i = 1; i <= 5; i++) {
		            	receiveChatMessage responseBuilder =  receiveChatMessage.newBuilder().build();
		                responseObserver.onNext(responseBuilder);
		            }
		        }

		        @Override
		        public void onCompleted() {
		            responseObserver.onCompleted();
		        }

				@Override
				public void onError(Throwable t) {
					
				}

		    };
		}
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
	            System.out.printf("registrering service with type %s and name %s \n", service_type, service_name);
	            
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