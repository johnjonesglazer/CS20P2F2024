package gettingstarted;
import com.phidget22.*;

public class Lesson3 {
    
    static int redButtonPressCount = 0;
    static int greenButtonPressCount = 0;

    public static void main(String[] args) throws Exception {
        
        DigitalInput redButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput greenLED = new DigitalOutput();

        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        redButton.open(1000);
        redLED.open(1000);
        greenButton.open(1000);
        greenLED.open(1000);

        boolean lastRedButtonState = false;
        boolean lastGreenButtonState = false;

        while(true) {
            boolean redButtonState = redButton.getState();
            boolean greenButtonState = greenButton.getState();

            if (redButtonState && !lastRedButtonState) {
                redButtonPressCount++;
                System.out.println("Red Button Pressed! Total presses: " + redButtonPressCount);
            }

            if (greenButtonState && !lastGreenButtonState) {
                greenButtonPressCount++;
                System.out.println("Green Button Pressed! Total presses: " + greenButtonPressCount);
            }

            if(redButtonState) {
                redLED.setState(true);
            } else {
                redLED.setState(false);
            }

            if(greenButtonState) {
                greenLED.setState(true);
            } else {
                greenLED.setState(false);
            }

            lastRedButtonState = redButtonState;
            lastGreenButtonState = greenButtonState;

            Thread.sleep(150);
        }
    }
}