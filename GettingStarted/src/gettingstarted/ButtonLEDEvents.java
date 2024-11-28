package gettingstarted;
import com.phidget22.*;

public class ButtonLEDEvents {
    
    static boolean turnRedLEDOn = false;
    static boolean turnGreenLEDOn = false;
    
    // Initialize counters for button presses
    static int redButtonPressCount = 0;
    static int greenButtonPressCount = 0;

    public static void main(String[] args) throws Exception {

        DigitalInput redButton = new DigitalInput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalOutput greenLED = new DigitalOutput();

        // Set Hub Port for Buttons and LEDs
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        // Event listener for red button
        redButton.addStateChangeListener(new DigitalInputStateChangeListener() {
            public void onStateChange(DigitalInputStateChangeEvent e) {
                if (e.getState()) {
                    redButtonPressCount++;  // Increment press count when button is pressed
                    System.out.println("Red Button Pressed. Total: " + redButtonPressCount);
                }
            }
        });

        // Event listener for green button
        greenButton.addStateChangeListener(new DigitalInputStateChangeListener() {
            public void onStateChange(DigitalInputStateChangeEvent e) {
                if (e.getState()) {
                    greenButtonPressCount++;  // Increment press count when button is pressed
                    System.out.println("Green Button Pressed. Total: " + greenButtonPressCount);
                }
            }
        });

        // Open the devices
        redLED.open(1000);
        greenLED.open(1000);
        redButton.open(1000);
        greenButton.open(1000);

        // Run the game loop
        while (true) {
            // Check if either player has reached 10 presses
            if (redButtonPressCount >= 10) {
                System.out.println("Red Player Wins!");
                redLED.setState(true);   // Turn on Red LED
                greenLED.setState(true); // Turn on Green LED
                break; // Exit the loop to end the game
            }
            if (greenButtonPressCount >= 10) {
                System.out.println("Green Player Wins!");
                redLED.setState(true);   // Turn on Red LED
                greenLED.setState(true); // Turn on Green LED
                break; // Exit the loop to end the game
            }

            // Update LED states based on button presses
            redLED.setState(turnRedLEDOn);
            greenLED.setState(turnGreenLEDOn);

            // Sleep for a short period to allow for button events
            Thread.sleep(150);
        }

        // Keep the program running long enough to see the winner's LEDs
        Thread.sleep(2000);
        
        // Close the devices after the game ends
        redButton.close();
        greenButton.close();
        redLED.close();
        greenLED.close();
    }
}
