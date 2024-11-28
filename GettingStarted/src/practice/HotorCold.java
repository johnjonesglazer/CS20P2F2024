package practice;

import com.phidget22.DigitalOutput;
import com.phidget22.TemperatureSensor;

public class HotorCold {
    public static void main(String[] args) throws Exception {
        
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        temperatureSensor.open(1000);
        
        DigitalOutput redLED = new DigitalOutput();
        DigitalOutput greenLED = new DigitalOutput();
        
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);
        
        redLED.open(1000);
        greenLED.open(1000);

        while (true) {
            double currentTemperature = temperatureSensor.getTemperature();
            System.out.println("Current Temperature: " + currentTemperature + "°C");

            if (currentTemperature >= 20 && currentTemperature <= 24) {
                greenLED.setState(true);
                redLED.setState(false);
            } else {
                redLED.setState(true);
                greenLED.setState(false);
            }
            
            Thread.sleep(100);
        }
    }
}
