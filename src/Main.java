import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class Main extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel_main;
	private JPanel panel_header;
	private JPanel panel_transport;
	private JPanel panel_choice;
	private JPanel panel_transport_detail;
	private JButton btnTaxi;
	private JButton btnTrain;
	private JButton btnBus;
	private JButton btnYes;
	private JButton btnNo;
	private JPanel panel_YesNo;
	private JPanel panel_result;
	private JTextArea txtrchooseTransportfrom;
	private JPanel panel_number;
	private JPanel panel_behavior;
	private JButton btn5;
	private JButton btn1;
	private JButton btn3;
	private JButton btn4;
	private JButton btn2;
	private JButton btn8;
	private JButton btn0;
	private JButton btn6;
	private JButton btn9;
	private JButton btnEnter;
	private JButton btn7;
	private JButton btnCancel;
	private JPanel panel_title;
	private JPanel panel_title_empty1;
	private JPanel panel_title_empty2;
	private JLabel lblNewLabel;
	private JPanel panel_logo;
	private JLabel lblLogo;
	private JButton btnClear;
	private JPanel panel_number_empty;
	
	//variable for controlling input
	private String inputSpace = "";
	private String inputValue = "";
	
	//list for adding transport object	
	List <PublicTransport> transports = new ArrayList<>();
	
	//for station class
	Station station = new Station(0,0);
	private double farePerStation;
	private int nStations;

	//variable for all classes
	private double baseFare;
	
	//variable for taxi class
	private double farePerKm;
	private double distance;
	
	//variable for dealing state with command
	private int state = 0;
	private String command;
	
	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 549, 634);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		panel_main = new JPanel();
		contentPane.add(panel_main, BorderLayout.CENTER);
		panel_main.setLayout(new GridLayout(2, 0, 0, 0));
		
		
		panel_result = new JPanel();
		panel_result.setLayout(new BorderLayout());
		panel_main.add(panel_result);
		
		txtrchooseTransportfrom = new JTextArea();
		txtrchooseTransportfrom.setText("Choose transport (from left menu): "); //basic text

		panel_result.add(txtrchooseTransportfrom);
		
		panel_number = new JPanel();
		panel_main.add(panel_number);
		panel_number.setLayout(new GridLayout(4, 3, 0, 0));
		
		//btn0~btn9 receive input from 0~9
		btn1 = new JButton("");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputValue = "1";
				inputSpace+=inputValue;
				txtrchooseTransportfrom.setText(txtrchooseTransportfrom.getText()+inputValue);
			}
		});
		btn1.setIcon(new ImageIcon(Main.class.getResource("/assets/1.png")));
		panel_number.add(btn1);
		
		btn2 = new JButton("");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputValue = "2";
				inputSpace+=inputValue;
				txtrchooseTransportfrom.setText(txtrchooseTransportfrom.getText()+inputValue);
			}
		});
		btn2.setIcon(new ImageIcon(Main.class.getResource("/assets/2.png")));
		panel_number.add(btn2);
		
		btn3 = new JButton("");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputValue = "3";
				inputSpace+=inputValue;
				txtrchooseTransportfrom.setText(txtrchooseTransportfrom.getText()+inputValue);
			}
		});
		btn3.setIcon(new ImageIcon(Main.class.getResource("/assets/3.png")));
		panel_number.add(btn3);
		
		btn4 = new JButton("");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputValue = "4";
				inputSpace+=inputValue;
				txtrchooseTransportfrom.setText(txtrchooseTransportfrom.getText()+inputValue);
			}
		});
		btn4.setIcon(new ImageIcon(Main.class.getResource("/assets/4.png")));
		panel_number.add(btn4);
		
		btn5 = new JButton("");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputValue = "5";
				inputSpace+=inputValue;
				txtrchooseTransportfrom.setText(txtrchooseTransportfrom.getText()+inputValue);
			}
		});
		
		btn5.setIcon(new ImageIcon(Main.class.getResource("/assets/5.png")));
		panel_number.add(btn5);
		
		btn6 = new JButton("");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputValue = "6";
				inputSpace+=inputValue;
				txtrchooseTransportfrom.setText(txtrchooseTransportfrom.getText()+inputValue);
			}
		});
		btn6.setIcon(new ImageIcon(Main.class.getResource("/assets/6.png")));
		panel_number.add(btn6);
		
		btn7 = new JButton("");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputValue = "7";
				inputSpace+=inputValue;
				txtrchooseTransportfrom.setText(txtrchooseTransportfrom.getText()+inputValue);
			}
		});
		btn7.setIcon(new ImageIcon(Main.class.getResource("/assets/7.png")));
		panel_number.add(btn7);
		
		btn8 = new JButton("");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputValue = "8";
				inputSpace+=inputValue;
				txtrchooseTransportfrom.setText(txtrchooseTransportfrom.getText()+inputValue);
			}
		});
		btn8.setIcon(new ImageIcon(Main.class.getResource("/assets/8.png")));
		panel_number.add(btn8);
		
		btn9 = new JButton("");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputValue = "9";
				inputSpace+=inputValue;
				txtrchooseTransportfrom.setText(txtrchooseTransportfrom.getText()+inputValue);
			}
		});
		
		btn9.setIcon(new ImageIcon(Main.class.getResource("/assets/9.png")));
		panel_number.add(btn9);
		
		panel_number_empty = new JPanel();
		panel_number.add(panel_number_empty);
		
		btn0 = new JButton("");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputValue = "0";
				inputSpace+=inputValue;
				txtrchooseTransportfrom.setText(txtrchooseTransportfrom.getText()+inputValue);
			}
		});
		btn0.setIcon(new ImageIcon(Main.class.getResource("/assets/0.png")));
		panel_number.add(btn0);
		
		panel_header = new JPanel();
		contentPane.add(panel_header, BorderLayout.NORTH);
		panel_header.setLayout(new BorderLayout(0, 0));
		
		panel_title = new JPanel();
		panel_header.add(panel_title, BorderLayout.SOUTH);
		panel_title.setLayout(new GridLayout(0, 3, 0, 0));
		
		panel_title_empty1 = new JPanel();
		panel_title.add(panel_title_empty1);
		
		panel_title_empty2 = new JPanel();
		panel_title.add(panel_title_empty2);
		
		lblNewLabel = new JLabel("TRIP PLANNER");
		panel_title_empty2.add(lblNewLabel);
		
		panel_logo = new JPanel();
		panel_header.add(panel_logo, BorderLayout.CENTER);
		
		lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(Main.class.getResource("/assets/planner_logo.png")));
		panel_logo.add(lblLogo);
		
		panel_transport = new JPanel();
		contentPane.add(panel_transport, BorderLayout.WEST);
		panel_transport.setLayout(new GridLayout(2, 0, 0, 0));
		
		panel_transport_detail = new JPanel();
		panel_transport.add(panel_transport_detail);
		panel_transport_detail.setLayout(new GridLayout(3, 1, 0, 0));
		
		btnTrain = new JButton("TRAIN");
		btnTrain.setIcon(new ImageIcon(Main.class.getResource("/assets/train.png")));
		btnTrain.setActionCommand("Train"); 
		panel_transport_detail.add(btnTrain);
		
		btnBus = new JButton("BUS");
		btnBus.setIcon(new ImageIcon(Main.class.getResource("/assets/bus.png")));
		btnBus.setActionCommand("Bus");
		panel_transport_detail.add(btnBus);
		
		btnTaxi = new JButton("TAXI");
		btnTaxi.setIcon(new ImageIcon(Main.class.getResource("/assets/taxi.png")));
		btnTaxi.setActionCommand("Taxi");
		panel_transport_detail.add(btnTaxi);
		
		panel_choice = new JPanel();
		contentPane.add(panel_choice, BorderLayout.EAST);
		panel_choice.setLayout(new GridLayout(2, 0, 0, 0));
		
		panel_YesNo = new JPanel();
		panel_choice.add(panel_YesNo);
		panel_YesNo.setLayout(new GridLayout(3, 0, 0, 0));
		
		//button for adding new transport(train, bus, taxi)
		btnYes = new JButton("Yes");
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtrchooseTransportfrom.setText("Choose transport (from left menu): ");
				state=0; //initializing state for new transport	
			}
		});
		btnYes.setIcon(new ImageIcon(Main.class.getResource("/assets/enterSmall.png")));
		panel_YesNo.add(btnYes);
		
		//button for show sum of transport calculation
		btnNo = new JButton("No");
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showResult(); 
			}
		});
		btnNo.setIcon(new ImageIcon(Main.class.getResource("/assets/cancelSmall.png")));
		panel_YesNo.add(btnNo);
		
		panel_behavior = new JPanel();
		panel_choice.add(panel_behavior);
		panel_behavior.setLayout(new GridLayout(4, 0, 0, 0));
		
		//button for loading new plan
		btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    transports.clear(); // initialize transports list
			    station = new Station(0, 0); // initialize station object
			    baseFare = 0; // initialize baseFare variable
			    farePerStation = 0; // initialize farePerStation variable
			    nStations = 0; // initialize nStations variable
			    farePerKm = 0; // initialize farePerKm variable
			    distance = 0; // initialize distance variable
			    inputSpace = ""; // initialize inputSpace variable
			    inputValue = ""; // initialize inputValue variable
			    state = 0; // initialize state variable
			    
				txtrchooseTransportfrom.setText("Cancelled!\n"
						+ "New Plan:\n"
						+"Choose transport (from left menu): ");
			}
		});
		btnCancel.setIcon(new ImageIcon(Main.class.getResource("/assets/cancel.png")));
		panel_behavior.add(btnCancel);
		
		//button for clearing all input
		btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText = txtrchooseTransportfrom.getText();
				String nonNumericText = currentText.replaceAll("[0-9]", "");
				inputValue = "";
				inputSpace = "";
				txtrchooseTransportfrom.setText(nonNumericText+inputValue);
			}
		});
		btnClear.setIcon(new ImageIcon(Main.class.getResource("/assets/clear.png")));
		panel_behavior.add(btnClear);
		
		//button for calling corresponding function according to the command(Train, Bus, Taxi)
		btnEnter = new JButton("ENTER");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ("Train".equals(command)) {
					handleTrainState();
				} else if ("Bus".equals(command)) {
					handleBusState();
				} else if ("Taxi".equals(command)) {
					handleTaxiState();
				}
			}
		});
		btnEnter.setIcon(new ImageIcon(Main.class.getResource("/assets/enter.png")));
		panel_behavior.add(btnEnter);
		
		// addActionListner to transportBtn in actionPerformed
		btnTrain.addActionListener(this);
		btnBus.addActionListener(this);
		btnTaxi.addActionListener(this);	
	}
	
	/**
	 * Launch the application.
	 */
	//function for handling state if user click the train button
	public void handleTrainState() {
		if (state == 0) {
			baseFare=Double.parseDouble(inputSpace);
			inputSpace="";
			txtrchooseTransportfrom.setText("Enter fare per station (for extra stations): ");
			state++;
		} else if(state == 1) {
			farePerStation = Double.parseDouble(inputSpace);
			inputSpace="";
			txtrchooseTransportfrom.setText("Enter number of stations: ");
			state++;
		} else if (state == 2) {
			nStations = Integer.parseInt(inputSpace);
			inputSpace="";
			//create object considering input 
			station = new Station(farePerStation, nStations);
			Train train = new Train("Train", baseFare, 0, station);
			train.calculatePayment();
			transports.add(train);
			//text for moving on to the next step
			txtrchooseTransportfrom.setText("Add more transport (from right menu)?");
		}	
	}
	//function for handling state if user click the bus button
	public void handleBusState() {
		if (state == 0) {
			baseFare=Double.parseDouble(inputSpace);
			inputSpace="";
			txtrchooseTransportfrom.setText("Enter fare per station (for extra stations): ");
			state++;
		} else if(state == 1) {
			farePerStation = Double.parseDouble(inputSpace);
			inputSpace="";
			txtrchooseTransportfrom.setText("Enter number of stations: ");
			state++;
		} else if (state == 2) {
			nStations = Integer.parseInt(inputSpace);
			inputSpace="";
			//create object considering input 
			station = new Station(farePerStation, nStations);
			Bus bus = new Bus("Bus", baseFare, 0, station);
			bus.calculatePayment();
			transports.add(bus);
			//text for moving on to the next step
			txtrchooseTransportfrom.setText("Add more transport (from right menu)?");
		}	
	}
	//function for handling state if user click the taxi button
	public void handleTaxiState() {
		if (state == 0) {
			baseFare=Double.parseDouble(inputSpace);
			inputSpace="";
			txtrchooseTransportfrom.setText("Enter fare per km: ");
			state++;
		} else if(state == 1) {
			farePerKm = Double.parseDouble(inputSpace);
			inputSpace="";
			txtrchooseTransportfrom.setText("Enter distance (in km): ");
			state++;
		} else if (state == 2) {
			distance = Double.parseDouble(inputSpace);
			inputSpace="";
			state++;
			//create object considering input 
			Taxi taxi = new Taxi("Taxi",baseFare,0);
			taxi.setFarePerKm(farePerKm);
			taxi.setDistance(distance);
			taxi.calculatePayment();
			transports.add(taxi);
			//text for moving on to the next step
			txtrchooseTransportfrom.setText("Add more transport (from right menu)?");
		}	
	}
	//function for show result of each total fare and all total fares
	public void showResult() {
		StringBuilder resultText = new StringBuilder();
		double totalTripFare = 0;
		for (int i = 0; i< transports.size();i++) {
			PublicTransport transport = transports.get(i);
			totalTripFare += transport.getTotalFare();
			resultText.append("Transport ").append(i + 1).append(": ").append(transport.getModel()).append("\n");
		    resultText.append(String.format("Fare: %.2f", transport.getTotalFare())).append("\n");	
		}
		resultText.append(String.format("==========================\n"
				+ "Total Trip Fare: %.2f",totalTripFare));
		txtrchooseTransportfrom.setText(resultText.toString());
	}
	

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnTrain) {
			command = e.getActionCommand(); //btnTrain clicked
			txtrchooseTransportfrom.setText("You choose TRAIN\nEnter base fare: ");	
		}else if(e.getSource() == btnBus) {
			command = e.getActionCommand(); //btnBus clicked
			txtrchooseTransportfrom.setText("You choose BUS\nEnter base fare: ");
		}else if (e.getSource() == btnTaxi) {
			command = e.getActionCommand(); //btnTaxi clicked
			txtrchooseTransportfrom.setText("You choose TAXI\nEnter base fare: ");
		}
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}	
		});
	}
}
