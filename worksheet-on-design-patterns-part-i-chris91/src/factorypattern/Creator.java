package factorypattern;

public class Creator {

    public Product getProduct(String productType){
        if (productType.equalsIgnoreCase("Default")){
            return new ConcreteProduct();
        }
        return null;
    }
}
