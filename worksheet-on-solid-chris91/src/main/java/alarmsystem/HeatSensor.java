package alarmsystem;

public class HeatSensor implements Sensor {

    private Boolean triggered;
    private String location;

    public HeatSensor(){
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

    @Override
    public void trigger() {
        this.triggered = true;
        System.out.println();
    }

    @Override
    public boolean isSecuritySensor() {
        return true;
    }
}
