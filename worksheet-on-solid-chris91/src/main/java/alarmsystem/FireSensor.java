package alarmsystem;

import java.util.Random;

/*
    5% of the time it is called, it raises an alarm
    Drains 10% battery between each poll
 */

public class FireSensor implements Sensor {

    private double batteryStatus;
    private Boolean triggered;
    private String location;

    public FireSensor(){
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
        this.batteryStatus = this.batteryStatus * .9;
        Random rand = new Random();
        int randInt = rand.nextInt(100);
        if(randInt<=5){
            this.triggered = true;
            System.out.println();
        }
    }

    @Override
    public boolean isSecuritySensor() {
        return false;
    }
}
