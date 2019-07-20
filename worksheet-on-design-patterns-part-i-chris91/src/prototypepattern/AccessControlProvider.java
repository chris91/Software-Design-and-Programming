package prototypepattern;

public class AccessControlProvider {
    public static AccessControl getAccessControlObject(String controlLevel) {
        try {
            if (controlLevel.equalsIgnoreCase("USER")) {
                AccessControl aC = new AccessControl();
                aC.clone();
                aC.setAccessControlLevel("USER");
                aC.setAccess("DO WORK");
                return aC;
            } else if (controlLevel.equalsIgnoreCase("ADMIN")) {
                AccessControl aC = new AccessControl();
                aC.clone();
                aC.setAccessControlLevel("ADMIN");
                aC.setAccess("GOD MODE");
                return aC;
            } else if (controlLevel.equalsIgnoreCase("MANAGER")) {
                AccessControl aC = new AccessControl();
                aC.clone();
                aC.setAccessControlLevel("MANAGER");
                aC.setAccess("GENERATE/READ REPORTS");
                return aC;
            }

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
