package grpc.SmartOffice.officeInventory;

import grpc.SmartOffice.officeInventory.officeInventoryGrpc.officeInventoryBlockingStub;
import grpc.SmartOffice.officeInventory.officeInventoryGrpc.officeInventoryStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class OfficeInventoryGUI{
	private static officeInventoryBlockingStub blockingStub;
	private static officeInventoryStub asyncStub; 
	private JFrame frame;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OfficeInventoryGUI window = new OfficeInventoryGUI();
					window.frame.setVisible(true);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public OfficeInventoryGUI() {
		int port = 50051;
		String host = "localhost";
		
		ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
		new OfficeInventoryClient();
		
		asyncStub = officeInventoryGrpc.newStub(channel);
		
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Smart Office Inventory");
		frame.setBounds(100, 100, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		BoxLayout bl = new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS);
		
		frame.getContentPane().setLayout(bl);
		
		JPanel panel_service_1 = new JPanel();
		frame.getContentPane().add(panel_service_1);
		panel_service_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblItems = new JLabel(" Items");
		panel_service_1.add(lblItems);
		
		String[] items = new String[] {"Blue Pens", "Binders", "Mouse & Keyboard", "Headset"};
		//Create combobox and add to panel
		JComboBox comboOperation = new JComboBox();
		comboOperation.setModel(new DefaultComboBoxModel(items));
		panel_service_1.add(comboOperation);
		
		JLabel lblCountItems = new JLabel(" Count");
		panel_service_1.add(lblCountItems);
		String[] countItems = new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
		//Create combobox and add to panel
		JComboBox comboOperation2 = new JComboBox();
		comboOperation2.setModel(new DefaultComboBoxModel(countItems));
		panel_service_1.add(comboOperation2);
		
		JLabel lblOrderStatus = new JLabel("");
		panel_service_1.add(lblOrderStatus);
		
		JButton btnPlaceOrder = new JButton("Place Order");
		
		btnPlaceOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String item = comboOperation.getSelectedItem().toString();
				int countItems = comboOperation2.getSelectedIndex();
				
				StreamObserver<OrderStatus> request = new StreamObserver<OrderStatus>() {

					@Override
					public void onNext(OrderStatus value) {
						System.out.println("Recieving Order Status");				
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
				
				OrderStatus response = OrderStatus.newBuilder().build();
				
				asyncStub.orderItems(request);
				
				lblOrderStatus.setText(response.getOrderStatus());
			}
		});
		panel_service_1.add(btnPlaceOrder);
	}
}