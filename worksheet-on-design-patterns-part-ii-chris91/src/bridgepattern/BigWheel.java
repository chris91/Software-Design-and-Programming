package bridgepattern;

public class BigWheel extends Car {


    public BigWheel(Product product, String carType) {
        super(product, carType);
    }

    @Override
    public void assemble() {
        System.out.println("Assembling " + super.getProduct().productName() + " for BigWheel xz model");
    }

    @Override
    public void produceProduct() {
        super.getProduct().produce();
        System.out.println("Modifing product " + super.getProduct().productName() + " according to BigWheel xz model");
    }

}
