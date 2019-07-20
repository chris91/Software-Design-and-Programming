package bridgepattern;

public class CentralLocking implements Product {

    private String cLS;

    public CentralLocking(String central_locking_system) {
        this.cLS = central_locking_system;
    }

    @Override
    public String productName() {
        return this.cLS;
    }

    @Override
    public void produce() {
        System.out.println("Producing Central Locking System");
    }

}
