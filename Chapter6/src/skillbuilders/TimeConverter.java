package skillbuilders;

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

public class TimeConverter {

	private JFrame frame;
	private JTextField Fn;
	private JTextField timeInput;
	
	DecimalFormat dc = new DecimalFormat("0.00");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TimeConverter window = new TimeConverter();
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
	public TimeConverter() {
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
		
		
		timeInput = new JTextField();
		timeInput.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				timeInput.setText(null);
			}
		});
		
		timeInput.setText("Input hours");
		timeInput.setBounds(35, 24, 124, 40);
		frame.getContentPane().add(timeInput);
		timeInput.setColumns(10);
		
		
		JLabel output = new JLabel("Waiting For Convert.");
		output.setHorizontalAlignment(SwingConstants.CENTER);
		output.setBounds(163, 77, 124, 40);
		frame.getContentPane().add(output);
		
		JComboBox selection = new JComboBox();
		selection.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				if (selection.getSelectedItem().equals("Hours to Minutes")) 
				{
					timeInput.setText("Input Hours");
					output.setText("Waiting For Convert.");
				}
				else if (selection.getSelectedItem().equals("Days to Hours")) 
				{
					timeInput.setText("Input Days");
					output.setText("Waiting For Convert.");
				}
				else if (selection.getSelectedItem().equals("Minutes to Hours")) 
				{
					timeInput.setText("Input Minutes");
					output.setText("Waiting For Convert.");
				} 
				else if (selection.getSelectedItem().equals("Hours to Days")) 
				{
					timeInput.setText("Input Hours");
					output.setText("Waiting For Convert.");
				}
				
			}
		});
		
		selection.setModel(new DefaultComboBoxModel(new String[] {"Hours to Minutes", "Days to Hours", "Minutes to Hours", "Hours to Days"}));
		selection.setBounds(169, 33, 111, 22);
		frame.getContentPane().add(selection);
		
		
		
		
		JButton pressMe = new JButton("Convert");
		pressMe.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				
				if (selection.getSelectedItem().equals("Hours to Minutes")) 
				{
					String txtnumb = timeInput.getText();
					double numb = Double.parseDouble(txtnumb);
					output.setText(String.valueOf(Math.round(((numb * 60) * 100.0) / 100.0))+ " Minutes.");
				}
				else if (selection.getSelectedItem().equals("Days to Hours")) 
				{
					String txtnumb = timeInput.getText();
					double numb = Double.parseDouble(txtnumb);
					output.setText(String.valueOf(Math.round(((numb * 24) * 100.0) / 100.0))+ " Hours.");
				}
				else if (selection.getSelectedItem().equals("Minutes to Hours")) 
				{
					String txtnumb = timeInput.getText();
					double numb = Double.parseDouble(txtnumb);
					output.setText(dc.format((numb / 60))+ " Hours.");
				} 
				else if (selection.getSelectedItem().equals("Hours to Days")) 
				{
					String txtnumb = timeInput.getText();
					double numb = Double.parseDouble(txtnumb);
					output.setText(dc.format((numb / 24))+ " Days.");
					
				}
				
				
				
				
			}
		});
		pressMe.setBounds(45, 77, 102, 40);
		frame.getContentPane().add(pressMe);
		
		
		
		
		
		
		
		
	
	}
}
