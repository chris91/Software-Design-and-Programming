package alarmsystem;

public interface Sensor {
    boolean isTriggered();

    String getLocation();

    void setLocation(String loc);

    String getSensorType();

    void trigger();

    boolean isSecuritySensor();
}
