package mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.beans.PropertyChangeListener;
import java.text.DecimalFormat;
import java.beans.PropertyChangeEvent;
import javax.swing.SwingConstants;

public class E2MetricConversion {

	private JFrame frame;
	private JTextField Fn;
	private JTextField unitInput;
	
	DecimalFormat dc = new DecimalFormat("0.00"); // to convert decimals to the nearest hundredth
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					E2MetricConversion window = new E2MetricConversion();
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
	public E2MetricConversion() {
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
		
		
		unitInput = new JTextField();
		unitInput.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				unitInput.setText(null);
			}
		});
		
		unitInput.setText("Input inches");
		unitInput.setBounds(35, 24, 124, 40);
		frame.getContentPane().add(unitInput);
		unitInput.setColumns(10);
		
		
		JLabel output = new JLabel("Waiting For Convert.");
		output.setHorizontalAlignment(SwingConstants.CENTER);
		output.setBounds(163, 77, 124, 40);
		frame.getContentPane().add(output);
		
		JComboBox selection = new JComboBox();
		selection.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				if (selection.getSelectedItem().equals("Inches to Centimeters")) //to change what the unit input text box says to input, and to reset output box's text
				{																 //the rest of the code until line 129, is the exact same with different units being converted to different units														//there is no point in repeating the comments 30 times
					unitInput.setText("Input inches");							// theres no point repeating the comments like 16 times
					output.setText("Waiting For Convert.");						
				}
				else if (selection.getSelectedItem().equals("Feet to Centimeters"))  
				{
					unitInput.setText("Input feet");
					output.setText("Waiting For Convert.");
				}
				else if (selection.getSelectedItem().equals("Yards to Meters")) 
				{
					unitInput.setText("Input yards");
					output.setText("Waiting For Convert.");
				} 
				else if (selection.getSelectedItem().equals("Miles to Kilometers")) 
				{
					unitInput.setText("Input miles");
					output.setText("Waiting For Convert.");						
				}
				else if (selection.getSelectedItem().equals("Centimeters to Inches")) 
				{
					unitInput.setText("Input centimeters");
					output.setText("Waiting For Convert.");						
				}
				else if (selection.getSelectedItem().equals("Centimeters to Feet")) 
				{
					unitInput.setText("Input centimeters");
					output.setText("Waiting For Convert.");						
				}
				else if (selection.getSelectedItem().equals("Meters to Yards")) 
				{
					unitInput.setText("Input meters");
					output.setText("Waiting For Convert.");						
				}
				else if (selection.getSelectedItem().equals("Kilometers to Miles")) 
				{
					unitInput.setText("Input kilometers");
					output.setText("Waiting For Convert.");						
				}
				
				
				
			}
		});
		
		selection.setModel(new DefaultComboBoxModel(new String[] {"Inches to Centimeters", "Feet to Centimeters", "Yards to Meters", "Miles to Kilometers", "Centimeters to Inches", "Centimeters to Feet", "Meters to Yards", "Kilometers to Miles"}));
		selection.setBounds(169, 33, 163, 28);
		frame.getContentPane().add(selection);
		
		
		
		
		JButton pressMe = new JButton("Convert");
		pressMe.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				
				if (selection.getSelectedItem().equals("Inches to Centimeters")) //reads combo box 
				{
					String txtnumb = unitInput.getText(); // accepts user input as a string 
					double numb = Double.parseDouble(txtnumb); //converts user input into a double so we can do math with it and get a decimal
					output.setText(dc.format((numb * 2.54))+ " Centimeters.");	// converts centimeters to inches and then  outputs the user input rounded to the nearest hundredth, 
				}
				else if (selection.getSelectedItem().equals("Feet to Centimeters")) //the rest of the code until line 197, is the exact same with different units being converted to different units
				{																	//there is no point in repeating the comments 30 times
					String txtnumb = unitInput.getText();
					double numb = Double.parseDouble(txtnumb);
					output.setText(dc.format((numb * 30))+ " Centimeters.");
				}
				else if (selection.getSelectedItem().equals("Yards to Meters")) 
				{
					String txtnumb = unitInput.getText();
					double numb = Double.parseDouble(txtnumb);
					output.setText(dc.format((numb * 0.91))+ " Meters.");
				} 
				else if (selection.getSelectedItem().equals("Miles to Kilometers")) 
				{
					String txtnumb = unitInput.getText();
					double numb = Double.parseDouble(txtnumb);
					output.setText(dc.format((numb * 1.6))+ " Kilometers.");						
				}
				else if (selection.getSelectedItem().equals("Centimeters to Inches")) 
				{
					String txtnumb = unitInput.getText();
					double numb = Double.parseDouble(txtnumb);
					output.setText(dc.format((numb / 2.54))+ " Inches.");					
				}
				else if (selection.getSelectedItem().equals("Centimeters to Feet")) 
				{
					String txtnumb = unitInput.getText();
					double numb = Double.parseDouble(txtnumb);
					output.setText(dc.format((numb / 30))+ " Feet.");						
				}
				else if (selection.getSelectedItem().equals("Meters to Yards"))
				{
					String txtnumb = unitInput.getText();
					double numb = Double.parseDouble(txtnumb);
					output.setText(dc.format((numb / 0.91))+ " Yards.");						
				}
				else if (selection.getSelectedItem().equals("Kilometers to Miles")) 
				{
					String txtnumb = unitInput.getText();
					double numb = Double.parseDouble(txtnumb);
					output.setText(dc.format((numb / 1.6))+ " Miles.");						
				}
				
			}
		});
		pressMe.setBounds(45, 77, 102, 40);
		frame.getContentPane().add(pressMe);
		
		
		
		
		
		
		
		
	
	}
}
