package alarmsystem;

import java.util.ArrayList;
import java.util.List;

public class ControlUnit {

    private List<Sensor> sensors;

    public ControlUnit(){
        this.sensors = new ArrayList<>();
    }

    public void setSensors(List<Sensor> sensors){
        this.sensors = sensors;
    }

    public void setSensor(Sensor s){
        this.sensors.add(s);
    }

    public List<Sensor> getSensors(){
        return sensors;
    }

    public void pollSensors() {
        for (Sensor sensor : sensors) {
            sensor.trigger();
        }
    }
}
