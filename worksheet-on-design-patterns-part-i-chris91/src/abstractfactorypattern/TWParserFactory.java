package abstractfactorypattern;

public class TWParserFactory implements AbstractParserFactory {
    @Override
    public XMLParser getParserInstance(String parserType) {
        if(parserType.equalsIgnoreCase("TWError")){
            return new TWErrorXMLParser();
        }
        else if(parserType.equalsIgnoreCase("TWOrder")){
            return new TWOrderXMLParser();
        }
        else if(parserType.equalsIgnoreCase("TWFeedback")){
            return new TWFeedbackXMLParser();
        }
        else if(parserType.equalsIgnoreCase("TWResponse")){
            return new TWResponseXMLParser();
        }
        return null;
    }
}
