package skillbuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exponentiation {
	
	

	private JFrame frame;
	public JTextField input1;
	private JTextField input2;
	private JLabel lblNewLabel_1;

	
	public static double powerOf(double x, double y ) 
	{
			
		return(Math.pow(x, y));
	
			
		
	}
		
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exponentiation window = new Exponentiation();
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
	public Exponentiation() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		input1 = new JTextField();
		input1.setBounds(21, 138, 110, 20);
		frame.getContentPane().add(input1);
		input1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("<html>What is the number you want on the bottom?</html>");
		lblNewLabel.setLabelFor(input1);
		lblNewLabel.setBounds(21, 104, 120, 32);
		frame.getContentPane().add(lblNewLabel);
		
		input2 = new JTextField();
		input2.setBounds(179, 138, 86, 20);
		frame.getContentPane().add(input2);
		input2.setColumns(10);
		
		lblNewLabel_1 = new JLabel("<html>What is the number you want on the top?</html>");
		lblNewLabel_1.setBounds(169, 101, 110, 38);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel output = new JLabel("");
		output.setHorizontalAlignment(SwingConstants.CENTER);
		output.setBounds(130, 197, 46, 14);
		frame.getContentPane().add(output);
		
		JButton run = new JButton("Go!");
		run.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String txtnumb1 = input1.getText();
				double numb1 = Double.parseDouble(txtnumb1);
				
				String txtnumb2 = input2.getText();
				double numb2 = Double.parseDouble(txtnumb2);
							
				output.setText(String.valueOf(powerOf(numb1, numb2)));
				
				
			}
		});
		run.setBounds(107, 169, 89, 23);
		frame.getContentPane().add(run);
	}
	
	
}
