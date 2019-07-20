package prototypepattern;

public class User {
    private String username;
    private String usrLevel;
    private AccessControl uAC;

    public User(String user_a, String user_level, AccessControl userAccessControl) {
        this.username = user_a;
        this.usrLevel = user_level;
        this.uAC = userAccessControl;
    }

    public String getUserName() {
        return this.username;
    }

    public void setUserName(String userName) {
        this.username = userName;
    }

    public String getLevel() {
        return this.usrLevel;
    }

    public void setLevel(String level) {
        this.usrLevel = level;
    }

    public AccessControl getAccessControl() {
        return this.uAC;
    }

    public void setAccessControl(AccessControl accessControl) {
        this.uAC = accessControl;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" Name: ");
        sb.append(this.username);
        sb.append(", Level: ");
        sb.append(this.usrLevel);
        sb.append(", Access Control Level: ");
        sb.append(this.uAC.getAccessControlLevel());
        sb.append(", Access: ");
        sb.append(this.uAC.getAccess());

        return sb.toString();
    }
}