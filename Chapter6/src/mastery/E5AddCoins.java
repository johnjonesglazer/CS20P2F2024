package mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class E5AddCoins {

	

	public static String getDollarAmount(double pennies, double nickels, double dimes, double quarters) 
	{
		
		double Mpennies = pennies * 0.01;
		double Mnickels = nickels * 0.05;
		double Mdimes = dimes * 0.10;
		double Mquarters = quarters * 0.25;
		double dollars = Mpennies + Mnickels + Mdimes + Mquarters;
		return("$" + String.valueOf(dollars));
	
	}


	
	private JFrame frame;

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
	}

}
