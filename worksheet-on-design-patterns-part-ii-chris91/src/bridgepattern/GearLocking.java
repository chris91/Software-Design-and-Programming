package bridgepattern;

public class GearLocking implements Product {

    private String gLS;

    public GearLocking(String gear_locking_system) {
        this.gLS = gear_locking_system;
    }

    @Override
    public String productName() {
        return this.gLS;
    }

    @Override
    public void produce() {
        System.out.println("Producing Gear Locking System");
    }

}
