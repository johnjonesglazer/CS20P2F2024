package mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class E3PrimeNumber {
	
	
	
	public static boolean isPrime(int inputNumb) { //creates a method to check if the number is prime
		
		//makes a variable to see if number is prime
		boolean isprime = true; 
		
		if (inputNumb <= 1) {
	        isprime = false; // to change is prime variable to false saying the number is not prime
	    } else { 
	        for (int i = 2; i < inputNumb; i++) { //loop to cycle if number is a prime
	            if (inputNumb % i == 0) { //if number can be divided without an reminds 
	                isprime = false; // to change is prime variable to false saying the number is not prime
	                break; // to end loop
	            }
	        }
	    }
		return(isprime);//returns an output
	}
	
	private JFrame frame;
	private JTextField numbinput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					E3PrimeNumber window = new E3PrimeNumber();
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
	public E3PrimeNumber() {
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
		
		JLabel output = new JLabel("Waiting For Check");
		output.setHorizontalAlignment(SwingConstants.CENTER);
		output.setBounds(65, 157, 117, 28);
		frame.getContentPane().add(output);
		
		numbinput = new JTextField();
		numbinput.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				numbinput.setText(null); //to set the text box to no text when user clicks
			}
		});
		numbinput.setHorizontalAlignment(SwingConstants.CENTER);
		numbinput.setText("Input your number");
		numbinput.setBounds(38, 75, 166, 37);
		frame.getContentPane().add(numbinput);
		numbinput.setColumns(10);
		
		JButton press = new JButton("Is prime?");
		press.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txtinput = numbinput.getText();  //pulls value that user inputed
				int numberinput = Integer.parseInt(txtinput); // converts input to integer so i can use math functions on it
				
				
				if (isPrime(numberinput)) { // to check if the number is prime
		            output.setText("Prime.");//states it is prime
		        } else { // if the number is not a prime number
		        	output.setText("Not prime."); //it is not prime
		        }
			}
		});
		press.setBounds(27, 123, 89, 23);
		frame.getContentPane().add(press);
		
		
		JButton resetpress = new JButton("Reset");
		resetpress.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numbinput.setText("Input your number");//to reset text
				output.setText("Waiting For Check"); // to reset text
			}
		});
		resetpress.setBounds(126, 123, 89, 23);
		frame.getContentPane().add(resetpress);
	}

}
