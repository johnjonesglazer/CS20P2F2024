package gettingstarted;
import com.phidget22.*;

public class Buttons {
    public static void main(String[] args) throws Exception {

        DigitalInput redButton = new DigitalInput();
        DigitalInput greenButton = new DigitalInput();

        // Set the red button to HubPort 0 (unchanged)
        redButton.setIsHubPortDevice(true);
        redButton.setHubPort(0);

        // Set the green button to HubPort 5 (as per your clarification)
        greenButton.setIsHubPortDevice(true);
        greenButton.setHubPort(5);

        // Add the state change listener for the red button
        redButton.addStateChangeListener(new DigitalInputStateChangeListener() {
            public void onStateChange(DigitalInputStateChangeEvent e) {
                if (e.getState()) {
                    System.out.println("Red Button Pressed");
                } else {
                    System.out.println("Red Button Not Pressed");
                }
            }
        });

        // Add the state change listener for the green button
        greenButton.addStateChangeListener(new DigitalInputStateChangeListener() {
            public void onStateChange(DigitalInputStateChangeEvent e) {
                if (e.getState()) {
                    System.out.println("Green Button Pressed");
                } else {
                    System.out.println("Green Button Not Pressed");
                }
            }
        });
        redButton.open(1000);
        greenButton.open(1000);
        while (true)
        {
        	Thread.sleep(150);
        }
    }
}