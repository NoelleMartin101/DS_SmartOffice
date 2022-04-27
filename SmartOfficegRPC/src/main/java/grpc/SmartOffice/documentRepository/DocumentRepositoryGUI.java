package grpc.SmartOffice.documentRepository;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import grpc.SmartOffice.documentRepository.documentRepositoryGrpc.documentRepositoryBlockingStub;
import grpc.SmartOffice.documentRepository.documentRepositoryGrpc.documentRepositoryStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

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
				}
				catch(Exception e) {
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
		frame.setTitle("Smart Office Documents");
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
		//textPath.setText("C:\\Users\\Noelle\\Dropbox\\College - NCIRL\\Distributed Systems\\Assignment");
		JLabel lblNewLabel_2 = new JLabel(" Contents: ");
		panel_service_1.add(lblNewLabel_2);

		JTextArea jtdirectoryContents = new JTextArea("dirContents");
		jtdirectoryContents = new JTextArea(10,28);
		jtdirectoryContents.setLineWrap(true);
		jtdirectoryContents.setWrapStyleWord(true);
		//jtdirectoryContents.setText("DS_SmartOffice \nDS_SmartOffice - Copy \n21135339_NoelleMartin_DistributedSystems_ProjectProposal.docx \n21135339_NoelleMartin_DistributedSystems_ProjectReport.docx \nDistributedSystems_Project Presentation.pptx");
		
		JScrollPane scrollPane2 = new JScrollPane(jtdirectoryContents);
		panel_service_1.add(scrollPane2);
		
		
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
				lblDirectoryContents.setText(response.toString());
			};
		});
		panel_service_1.add(btnGetPathContents);
		
		JPanel panel_service_2 = new JPanel();
		frame.getContentPane().add(panel_service_2);
		panel_service_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		JButton btnUploadDocument = new JButton("Upload");
		JButton btnDeleteDocument = new JButton("Delete Selected");		
		JButton btnDownloadDocument = new JButton("Download Select");
		panel_service_2.add(btnUploadDocument);
		panel_service_2.add(btnDeleteDocument);
		panel_service_2.add(btnDownloadDocument);
		
	}
}