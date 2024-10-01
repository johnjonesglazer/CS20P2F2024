package mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;

public class E5AddCoins {

	

	public static String getDollarAmount(double pennies, double nickels, double dimes, double quarters) //creates method to get the total amount of money
	{
		double Mpennies = pennies * 0.01; //turns pennies into dollar amount
		double Mnickels = nickels * 0.05; // turns nickels into dollar amount
		double Mdimes = dimes * 0.10;  // turns dimes into dollar amount
		double Mquarters = quarters * 0.25; // turns quarters into dollar amount
		double dollars = Mpennies + Mnickels + Mdimes + Mquarters; //adds all the values
		return("$" + String.valueOf(dollars));// converts the double to a string, and adds a dollar sign to the front of the output
	
	}


	
	private JFrame frame;
	private JTextField inputPennies;
	private JTextField inputNickels;
	private JTextField inputDimes;
	private JTextField inputQuarters;
	private JButton pressreset;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					E5AddCoins window = new E5AddCoins();
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
	public E5AddCoins() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel dollarOutput = new JLabel("Waiting For Convert");
		dollarOutput.setHorizontalAlignment(SwingConstants.CENTER);
		dollarOutput.setBounds(55, 182, 114, 21);
		frame.getContentPane().add(dollarOutput);
		
		inputPennies = new JTextField();
		inputPennies.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				inputPennies.setText(null);
			}
		});
		inputPennies.setText("Input Pennies");
		inputPennies.setBounds(10, 77, 108, 20);
		frame.getContentPane().add(inputPennies);
		inputPennies.setColumns(10);
		
		inputNickels = new JTextField();
		inputNickels.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				inputNickels.setText(null);
			}
		});
		inputNickels.setText("Input Nickels");
		inputNickels.setColumns(10);
		inputNickels.setBounds(128, 77, 89, 21);
		frame.getContentPane().add(inputNickels);
		
		inputDimes = new JTextField();
		inputDimes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				inputDimes.setText(null);
			}
		});
		inputDimes.setText("Input Dimes");
		inputDimes.setColumns(10);
		inputDimes.setBounds(128, 109, 89, 21);
		frame.getContentPane().add(inputDimes);
		
		inputQuarters = new JTextField();
		inputQuarters.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				inputQuarters.setText(null);
			}
		});
		inputQuarters.setText("Input Quarters");
		inputQuarters.setColumns(10);
		inputQuarters.setBounds(10, 108, 108, 21);
		frame.getContentPane().add(inputQuarters);
		
		JButton press = new JButton("Convert");
		press.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txtpennies = inputPennies.getText(); //converts from string to double so i can do math with this number
				double pennies = Double.parseDouble(txtpennies);
				
				String txtnickels = inputNickels.getText();    //converts from string to double so i can do math with this number
				double nickels = Double.parseDouble(txtnickels);
				
				String txtdimes = inputDimes.getText();   //converts from string to double so i can do math with this number
				double dimes = Double.parseDouble(txtdimes);
				
				String txtquarters = inputQuarters.getText();    //converts from string to double so i can do math with this number
				double quarters = Double.parseDouble(txtquarters);
				
				dollarOutput.setText(getDollarAmount(pennies, nickels, dimes, quarters));//uses my getDollarAmount method to do the math for me above and output the dollar amount
				
			}
		});
		press.setBounds(10, 140, 108, 31);
		frame.getContentPane().add(press);
		
		
		
		pressreset = new JButton("Reset");
		pressreset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputPennies.setText("Input Pennies"); // to reset the labels to tell the user what to input
				inputNickels.setText("Input Nickels");
				inputDimes.setText("Input Dimes");
				inputQuarters.setText("Input Quarters");
				dollarOutput.setText("Waiting For Convert");
			}
		});
		pressreset.setBounds(128, 141, 89, 30);
		frame.getContentPane().add(pressreset);
	}
}
