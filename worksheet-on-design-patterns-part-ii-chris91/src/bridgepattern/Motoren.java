package bridgepattern;

public class Motoren extends Car {
    @Override
    public void assemble() {
        System.out.println("Assembling " + super.getProduct().productName() + " for Motoren lm model");
    }

    @Override
    public void produceProduct() {
        super.getProduct().produce();
        System.out.println("Modifing product " + super.getProduct().productName() + " according to Motoren lm model");
    }

    public Motoren(Product product, String carType) {
        super(product, carType);
    }
}
