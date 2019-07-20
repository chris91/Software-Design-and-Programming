package alarmsystem;

import java.util.Calendar;
import java.util.Date;

public class SecurityControlUnit extends ControlUnit {

    public SecurityControlUnit(){
        super();
    }

    //remove security sensor if not in valid time range
    public void checkSecuritySensors(){
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        int hour;
        for(Sensor s : super.getSensors()){
            if(s.isSecuritySensor()){
                hour = cal.get(Calendar.HOUR_OF_DAY);
                if(!(hour<=6 || hour>=20)){
                    super.getSensors().remove(s);
                }
            }
        }
        super.pollSensors();
    }

}
