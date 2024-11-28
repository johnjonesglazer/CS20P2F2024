package gettingstarted;
import com.phidget22.*;
public class Lesson2 {
	
	//Handle Exceptions 
	public static void main(String[] args) throws Exception{
	    
	    //Create 
	    DigitalInput redButton = new DigitalInput();
	    DigitalOutput redLED = new DigitalOutput();
	    DigitalInput greenButton = new DigitalInput();
	    DigitalOutput greenLED = new DigitalOutput();
	    
	    //Address 
	    redButton.setHubPort(0);
	    redButton.setIsHubPortDevice(true);
	    redLED.setHubPort(1);
	    redLED.setIsHubPortDevice(true);
	    
	    greenButton.setHubPort(5);
	    greenButton.setIsHubPortDevice(true);
	    greenLED.setHubPort(4);
	    greenLED.setIsHubPortDevice(true);
	    
	    //Open 
	    redButton.open(1000);
	    redLED.open(1000);
	    greenButton.open(1000);
	    greenLED.open(1000);
	    
	    //Use your Phidgets 
	    while(true){
	    	if (redButton.getState() == true) {
	    		redLED.setState(true);
	    		
	    	}
	    	if (greenButton.getState() == true) { 
	    		greenLED.setState(true);
	    	} else {
	    		redLED.setState(false);
	    		greenLED.setState(false);
		    		
		    	}
	    	}
		
	 }
	  
}
