package grpc.SmartOffice.documentRepository;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import grpc.SmartOffice.documentRepository.documentRepositoryGrpc.documentRepositoryBlockingStub;
import grpc.SmartOffice.documentRepository.documentRepositoryGrpc.documentRepositoryStub;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class DocumentRepositoryGUI{
	private static documentRepositoryBlockingStub blockingStub;
	private static documentRepositoryStub asyncStub;
	
	private JFrame frame;
	private JTextField textPath;
	private JTextArea directoryContents;
	
	public static void main (String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DocumentRepositoryGUI window = new DocumentRepositoryGUI();
					window.frame.setVisible(true);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public DocumentRepositoryGUI() {
		int port = 50051;
		String host = "localhost";
		
		ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
		
		asyncStub = documentRepositoryGrpc.newStub(channel);
		
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Client - Service Controller");
		frame.setBounds(100, 100, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		BoxLayout bl = new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS);
		
		frame.getContentPane().setLayout(bl);
		
		JPanel panel_service_1 = new JPanel();
		frame.getContentPane().add(panel_service_1);
		panel_service_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		//Allow user to add the staff name they want to get the status for
		JLabel lblNewLabel_1 = new JLabel(" Path:");
		panel_service_1.add(lblNewLabel_1);
		textPath = new JTextField();
		panel_service_1.add(textPath);
		textPath.setColumns(40);
		
		JLabel lblNewLabel_2 = new JLabel(" Contents: ");
		panel_service_1.add(lblNewLabel_2);

		JLabel lblDirectoryContents = new JLabel("");
		panel_service_1.add(lblDirectoryContents);
		
		//Get the status
		JButton btnGetPathContents = new JButton("Get");
		
		btnGetPathContents.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String path = textPath.getText();
				List<String> fileNames = new ArrayList<>();

			    FolderLocation request = FolderLocation.newBuilder().build();
			    StreamObserver<FolderListing> response = new StreamObserver<FolderListing>() {

					@Override
					public void onNext(FolderListing filename) {
						fileNames.add(filename.getFolderListing());	   
						directoryContents.append(filename.getFolderListing());
					}

					@Override
					public void onError(Throwable t) {
						t.printStackTrace();						
					}

					@Override
					public void onCompleted() {
						// TODO Auto-generated method stub						
					}
			    };	
				asyncStub.retrieveFolderList(request, response);
				
			};
		});
		panel_service_1.add(btnGetPathContents);
	}
}