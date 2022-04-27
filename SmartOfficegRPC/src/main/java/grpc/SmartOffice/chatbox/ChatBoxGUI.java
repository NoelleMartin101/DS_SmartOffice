package grpc.SmartOffice.chatbox;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import grpc.SmartOffice.chatbox.chatBoxServiceGrpc.chatBoxServiceBlockingStub;
import grpc.SmartOffice.chatbox.chatBoxServiceGrpc.chatBoxServiceStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class ChatBoxGUI{
	private static chatBoxServiceBlockingStub blockingStub;	
	private static chatBoxServiceStub asyncStub;	
	
	private JFrame frame;
	private JTextField textName;
	private JTextArea messages;
	private JTextArea users;	
	private JList jUsersList;

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
		asyncStub = chatBoxServiceGrpc.newStub(channel);
		
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
		frame.setTitle("Smart Office IM");
		frame.setBounds(100, 100, 500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		BoxLayout bl = new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS);
		
		frame.getContentPane().setLayout(bl);
		
		JPanel panel_service_1 = new JPanel();
		frame.getContentPane().add(panel_service_1);
		panel_service_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
				
		String usersList[] = {"Noelle","John","Mary","Peter","Clodagh","Michelle","Audrey",};
		jUsersList = new JList(usersList);
		JPanel pUsersList = new JPanel();
		pUsersList.add(jUsersList);
		
		panel_service_1.add(pUsersList);
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

		jUsersList.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				String selectedValue = jUsersList.getSelectedValue().toString();
				textName.setText(selectedValue);
			}
		});	
		
		
		messages = new JTextArea(10,18);
		messages.setLineWrap(true);
		messages.setWrapStyleWord(true);
		//messages.setText("You: Hi Clodagh, do you know where the FS for that new project we are working on is stored \n\nClodagh: Hi Noelle, yeah its in the repository under Documentation \n\nYou: thanks Clodagh ");
		
		JScrollPane scrollPane2 = new JScrollPane(messages);
		panel_service_1.add(scrollPane2);
		
		JButton btnSendMessage = new JButton("Send");
		panel_service_1.add(btnSendMessage);
		JButton btnViewHistory = new JButton("View History");
		panel_service_1.add(btnViewHistory);
	}

}