package gettingstarted;
// Add Phidgets Library
import com.phidget22.*;
public class AttachDetachEvents {
public static void main(String[] args) throws Exception {
        
        // Create the sensors and components
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        DigitalOutput led = new DigitalOutput();
        DigitalInput button = new DigitalInput();

        // Temperature Event | Event code runs when data input from the sensor changes
        temperatureSensor.addTemperatureChangeListener(new TemperatureSensorTemperatureChangeListener() {
            public void onTemperatureChange(TemperatureSensorTemperatureChangeEvent e) {
                System.out.println("Temperature: " + e.getTemperature() + "°C");
            }
        });

        // Attach Event for Temperature Sensor
        temperatureSensor.addAttachListener(new AttachListener() {
            public void onAttach(AttachEvent e) {
                System.out.println("Attach: Temperature Sensor");
            }
        });

        // Detach Event for Temperature Sensor
        temperatureSensor.addDetachListener(new DetachListener() {
            public void onDetach(DetachEvent e) {
                System.out.println("Detach: Temperature Sensor");
            }
        });

        // Attach Event for LED
        led.addAttachListener(new AttachListener() {
            public void onAttach(AttachEvent e) {
                System.out.println("Attach: LED");
            }
        });

        // Detach Event for LED
        led.addDetachListener(new DetachListener() {
            public void onDetach(DetachEvent e) {
                System.out.println("Detach: LED");
            }
        });

        // Attach Event for Button
        button.addAttachListener(new AttachListener() {
            public void onAttach(AttachEvent e) {
                System.out.println("Attach: Button");
            }
        });

        // Detach Event for Button
        button.addDetachListener(new DetachListener() {
            public void onDetach(DetachEvent e) {
                System.out.println("Detach: Button");
            }
        });

        // Open components
        temperatureSensor.open(1000);
        led.setHubPort(0);  // Set the port for LED
        led.setIsHubPortDevice(true);
        led.open(1000);

        button.setHubPort(1);  // Set the port for Button
        button.setIsHubPortDevice(true);
        button.open(1000);

        // Keep the program running to listen for events
        while (true) {
            Thread.sleep(150);
        }
    }
}