package practice;
import com.phidget22.*;

public class TugofWar {

    public static void main(String[] args) throws Exception {
        
        DigitalInput redButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput greenLED = new DigitalOutput();

        redButton.setHubPort(0); 
        redLED.setHubPort(1);
        greenButton.setHubPort(5); 
        greenLED.setHubPort(4);

        redButton.setIsHubPortDevice(true); 
        redLED.setIsHubPortDevice(true);
        greenButton.setIsHubPortDevice(true); 
        greenLED.setIsHubPortDevice(true);

        redButton.open(1000); 
        redLED.open(1000);
        greenButton.open(1000); 
        greenLED.open(1000);

        int redCount = 0;
        int greenCount = 0;
        boolean lastRed = false;
        boolean lastGreen = false;

        while (redCount < 10 && greenCount < 10) {
            if (redButton.getState() && !lastRed) redCount++;
            if (greenButton.getState() && !lastGreen) greenCount++;
            lastRed = redButton.getState();
            lastGreen = greenButton.getState();
            Thread.sleep(150);
        }

        redLED.setState(true); greenLED.setState(true);
        Thread.sleep(500);
        redLED.setState(false); greenLED.setState(false);
        Thread.sleep(500);

        DigitalOutput winnerLED = (redCount == 10) ? redLED : greenLED;
        for (int i = 0; i < 5; i++) {
            winnerLED.setState(true);
            Thread.sleep(500);
            winnerLED.setState(false);
            Thread.sleep(500);
        }
    }
}

