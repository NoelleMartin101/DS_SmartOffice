package grpc.SmartOffice.documentRepository;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.util.Properties;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import grpc.SmartOffice.documentRepository.documentRepositoryGrpc.documentRepositoryImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class DocumentRepositoryServer extends documentRepositoryImplBase {

	public static void main(String[] args) throws IOException, InterruptedException {
		DocumentRepositoryServer documentServer = new DocumentRepositoryServer();
		Properties prop = documentServer.getProperties();
		documentServer.registerService(prop);

		System.out.println("Starting gRPC Server");
		int port = 50051; 
		Server server = ServerBuilder.forPort(port).addService(documentServer).build().start();
		System.out.println("Server is running on port " + port);
		System.out.println("Server is running on port " + port);
	}
	@Override
	public void retrieveFolderList(FolderLocation request, StreamObserver<FolderListing> responseObserver) {
		System.out.println("Getting folder listings" );
		
		String folderLocation = request.toString();		
		String[] filenames;
		//File f = new File(folderLocation);
		File f = new File("C:/Users/Noelle/Dropbox/College - NCIRL/Distributed Systems");
		filenames = f.list();
		for (String file : filenames)
		{
			responseObserver.onNext(FolderListing.newBuilder().setFolderListing(file).build());
		}
		responseObserver.onCompleted();
	}
	
	private Properties getProperties() {		
		Properties prop = null;				
		 try (InputStream input = new FileInputStream("src/main/resources/documentRepository.properties")) {
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