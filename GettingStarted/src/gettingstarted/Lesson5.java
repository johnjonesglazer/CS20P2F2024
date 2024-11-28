package gettingstarted;
import com.phidget22.*;
public class Lesson5 {

	public static void main(String[] args) throws Exception{

		  //Create 
        HumiditySensor humiditySensor = new HumiditySensor();
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        DigitalOutput redLED = new DigitalOutput();
        DigitalOutput greenLED = new DigitalOutput();
        
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);
        
        
        //Open 
        humiditySensor.open(1000);
        temperatureSensor.open(1000);
        redLED.open(1000);
        greenLED.open(1000);

        //Use your Phidgets 
        while(true){
       
        	if (temperatureSensor.getTemperature() > 20 && temperatureSensor.getTemperature() < 24)
        	{
        		greenLED.setState(true);
        		redLED.setState(false);
        	}
        	else
        	{
        		greenLED.setState(false);
        		redLED.setState(true);
        	}
        	System.out.println("Temperature: " + temperatureSensor.getTemperature());
            Thread.sleep(150);
	        }
	    
	}
	  
}


