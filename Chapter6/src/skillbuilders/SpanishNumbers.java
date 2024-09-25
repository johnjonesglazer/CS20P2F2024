package skillbuilders;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SpanishNumbers {

    private JFrame frame;
    private JLabel lblNumber;
    private int counter = 1;

    public static void main(String[] args) {
        // Directly create and display the window without EventQueue
        SpanishNumbers window = new SpanishNumbers();
        window.frame.setVisible(true);
    }

    public SpanishNumbers() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        // Button to display next number
        JButton btnNext = new JButton("Next Number");
        btnNext.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displaySpanishNumber(counter);
                counter++;
                if (counter > 10) {
                    counter = 1;
                }
            }
        });
        btnNext.setBounds(90, 100, 120, 30);
        frame.getContentPane().add(btnNext);

        // Label to display the Spanish number
        lblNumber = new JLabel("Click to start");
        lblNumber.setBounds(110, 50, 100, 30);
        frame.getContentPane().add(lblNumber);
    }

    private void displaySpanishNumber(int number) {
        String[] spanishNumbers = {"Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez"};
        lblNumber.setText(spanishNumbers[number - 1]);
    }
}
