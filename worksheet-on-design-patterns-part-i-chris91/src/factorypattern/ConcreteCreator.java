package factorypattern;

public class ConcreteCreator extends Creator{

    @Override
    public ConcreteProduct getProduct(String productType){
        return new ConcreteProduct();
    }

}
