package prototypepattern;

public class AccessControl implements Prototype {

    private String access;
    private String accessControlLevel;

    @Override
    public AccessControl clone() throws CloneNotSupportedException {
        AccessControl clonedItem = null;

        clonedItem = (AccessControl) super.clone();
        return  clonedItem;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public String getAccess() {
        return this.access;
    }

    public void setAccessControlLevel(String accessControlLevel) {
        this.accessControlLevel = accessControlLevel;
    }

    public String getAccessControlLevel() {
        return this.accessControlLevel;
    }

}
