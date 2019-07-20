package alarmsystem;

import java.io.IOException;
import java.util.Scanner;

/*
    USAGE: Enter "set" to set Sensors, "poll" to poll between them, "exit" to leave the app;
    if "set" is chosen: enter hazard and/or security for appropriate sensors to be created
    if "poll" is chosen: enter hazard and/or security for appropriate sensors to be polled
 */

public class App {
    private static final String EXIT = "exit";
    private static final String POLL = "poll";
    private static final String SETSENSORS = "set";
    private  static final String HAZARD = "hazard";
    private  static final String SECURITY = "security";

    public static void main(String[] args) throws IOException {
        ControlUnit controlUnit = new SecurityControlUnit();

        System.out.println("Enter the name of a Sensor with its location to create:");
        Scanner scanner = new Scanner(System.in);

        //System.out.println(scanner.hasNextLine());
        String input = scanner.next();

        while(!input.equals(EXIT)){
            // TODO implement alarm logic 10.
            //System.out.println(scanner.nextLine());
            //((SecurityControlUnit) controlUnit).checkSecuritySensors();

            //Sensor fireSensor = new FireSensor();
            //sensors.add(fireSensor);
            //Sensor smokeSensor = new SmokeSensor();
            //sensors.add(smokeSensor);

            //System.out.println(input);
            if(input.equals(POLL)){
                //poll
                input = scanner.next();
            }
            if(input.equals(SETSENSORS)){
                input = scanner.next();

            }
        }
    }
}
