package practice;

import com.phidget22.DigitalInput;
import com.phidget22.DigitalOutput;
import com.phidget22.TemperatureSensor;

public class Thermostat {
	public static void main(String[] args) throws Exception{
		
	TemperatureSensor temperatureSensor = new TemperatureSensor();
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
    
    temperatureSensor.open(1000);
    redButton.open(1000);
    redLED.open(1000);
    greenButton.open(1000);
    greenLED.open(1000);
    
    boolean redButtonWasPressed = false;  // Track the red button state
    boolean greenButtonWasPressed = false;  // Track the green button state
    
    int x = 21;
  
    
    while(true){
        
    	if (redButton.getState() == true && !redButtonWasPressed) {
            x -= 1;
            redButtonWasPressed = true;
        }

        if (greenButton.getState() == true && !greenButtonWasPressed) {
            x += 1;
            greenButtonWasPressed = true;
        }

        if (redButton.getState() == false) {
            redButtonWasPressed = false;
        }
        if (greenButton.getState() == false) {
            greenButtonWasPressed = false;
        }   
        if (Math.abs(temperatureSensor.getTemperature() - x) <= 2) {
        	greenLED.setState(true);
        	redLED.setState(false);
        } else {
        	greenLED.setState(false);
        	redLED.setState(true);
        }
        System.out.println(x);
        Thread.sleep(100);
        
        }
	}
}
