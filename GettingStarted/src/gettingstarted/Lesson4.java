package gettingstarted;
import com.phidget22.*;
public class Lesson4 {
	
	public static void main(String[] args) throws Exception {
	
	    TemperatureSensor temperatureSensor = new TemperatureSensor();
	
	    temperatureSensor.open(1000);
	
	    while (true) {
	        double celsius = temperatureSensor.getTemperature();
	        double fahrenheit = (celsius * 1.8) + 32;
	        System.out.println("Temperature: " + celsius + " °C / " + fahrenheit + " °F");
	            Thread.sleep(150);
        }
    }
}

