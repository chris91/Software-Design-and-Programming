package alarmsystem;
/*
  10% of the time it is called, it raises an alarm
  Drains 20% battery between each poll
 */

import java.util.Random;

public class SmokeSensor implements Sensor {

    private double batteryStatus;
    private Boolean triggered;
    private String location;

    public SmokeSensor(){
        this.batteryStatus = 100;
        this.triggered = false;
        this.location = "";
    }

    @Override
    public boolean isTriggered() {
        if(this.triggered){
            return true;
        }
        return false;
    }

    @Override
    public String getLocation() {
        return this.location;
    }

    @Override
    public void setLocation(String loc) {
        this.location = loc;
    }

    @Override
    public String getSensorType() {
        return this.getClass().getSimpleName();
    }

    public double getBatteryPercentage() {
        return this.batteryStatus;
    }

    @Override
    public void trigger(){
        this.batteryStatus = this.batteryStatus * .8;
        Random rand = new Random();
        int randInt = rand.nextInt(100);
        if(randInt<=10){
            this.triggered = true;
            System.out.println();
        }
    }

    @Override
    public boolean isSecuritySensor() {
        return false;
    }
}
