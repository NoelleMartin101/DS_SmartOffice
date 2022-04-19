package grpc.SmartOffice.chatbox;

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

import grpc.SmartOffice.chatbox.chatBoxServiceGrpc.chatBoxServiceBlockingStub;
import grpc.SmartOffice.chatbox.chatBoxServiceGrpc.chatBoxServiceStub;
import grpc.SmartOffice.chatbox.chatBoxServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatBoxGUI{
	private static chatBoxServiceBlockingStub blockingStub;	
	private static chatBoxServiceStub asyncStub;	
	
	private JFrame frame;
	private JTextField textName;
	private JTextArea sentMessage;
	private JTextArea receivedMessage;	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			//overide the run method of runnable
			public void run() {
				try {
					ChatBoxGUI window = new ChatBoxGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ChatBoxGUI() {
		

		int port = 50051;
		String host = "localhost";
		
		ManagedChannel channel = ManagedChannelBuilder
				.forAddress(host, port)
				.usePlaintext()
				.build();

		blockingStub = chatBoxServiceGrpc.newBlockingStub(channel);
		
		initialize();
		/*
		try {
			channel.shutdown().awaitTermination(50, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
	private void initialize()
	{
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
		JLabel lblNewLabel_1 = new JLabel(" Name");
		panel_service_1.add(lblNewLabel_1);
		textName = new JTextField();
		panel_service_1.add(textName);
		textName.setColumns(10);
		//Get the status
		JButton btnGetStatus = new JButton("Get");
		
		JLabel lblNewLabel_2 = new JLabel(" Status : ");
		panel_service_1.add(lblNewLabel_2);

		JLabel lblChatStatus = new JLabel("");
		panel_service_1.add(lblChatStatus);
				
		btnGetStatus.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				
				String userName = textName.getText();

				UserName request = UserName.newBuilder().setUserName(userName).build();
				UserStatus response = blockingStub.getChatStatus(request);
				
				System.out.println("Response " + response.getChatStatus());
				lblChatStatus.setText(response.getChatStatus());
				System.out.println("The chat status for " + userName + " is " + response.getChatStatus());
			}

		});
		panel_service_1.add(btnGetStatus);
		
		sentMessage = new JTextArea(10,20);
		sentMessage.setLineWrap(true);
		sentMessage.setWrapStyleWord(true);
		
		JScrollPane scrollPane = new JScrollPane(sentMessage);
		panel_service_1.add(scrollPane);
		
		receivedMessage = new JTextArea(10,20);
		receivedMessage.setLineWrap(true);
		receivedMessage.setWrapStyleWord(true);
		
		JScrollPane scrollPane2 = new JScrollPane(receivedMessage);
		panel_service_1.add(scrollPane2);
		
	}
}