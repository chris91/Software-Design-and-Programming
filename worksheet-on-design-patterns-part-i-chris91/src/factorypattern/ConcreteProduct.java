package factorypattern;

public class ConcreteProduct implements Product{
    @Override
    public void createProduct() {
        System.out.println("Product created");
    }
}
