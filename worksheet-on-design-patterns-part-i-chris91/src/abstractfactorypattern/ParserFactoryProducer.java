package abstractfactorypattern;

public final class ParserFactoryProducer {

    private ParserFactoryProducer() {
        throw new AssertionError();
    }

    public static AbstractParserFactory getFactory(String factoryType) {
        if(factoryType.equalsIgnoreCase("NYFactory")){
            return new NYParserFactory();
        }
        else if(factoryType.equalsIgnoreCase("TWFactory")){
            return new TWParserFactory();
        }
        return null;
    }

}