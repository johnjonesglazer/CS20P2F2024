// Add Phidgets Library
package gettingstarted;
import com.phidget22.*;

public class SmartPhidgetEvents {

    public static void main(String[] args) throws Exception {
        
        // Create
        HumiditySensor humiditySensor = new HumiditySensor();
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        // Humidity Event |  Event code runs when data input from the sensor changes. The following event is a Humidity change event.
        humiditySensor.addHumidityChangeListener(new HumiditySensorHumidityChangeListener() {
            public void onHumidityChange(HumiditySensorHumidityChangeEvent e) {
                System.out.println("Humidity: " + e.getHumidity() + "%RH");
            }
        });
        
        // Temperature Event |  Event code runs when data input from the sensor changes.
        temperatureSensor.addTemperatureChangeListener(new TemperatureSensorTemperatureChangeListener() {
            public void onTemperatureChange(TemperatureSensorTemperatureChangeEvent e) {
                double temperature = e.getTemperature();  // Get the current temperature
                
                if (temperature > 21.0) {
                    // Only print the temperature if it's above 21°C
                    System.out.println("Temperature: " + temperature + "°C");
                } else {
                    // Print this message if the temperature is below or equal to 21°C
                    System.out.println("Room is too cold");
                }
            }
        });

        // Open the sensors
        humiditySensor.open(1000);
        temperatureSensor.open(1000);

        // Keep the program running to listen for sensor events
        while (true) {
            Thread.sleep(150);
        }
    }
}
