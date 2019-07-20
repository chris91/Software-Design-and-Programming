package abstractfactorypattern;

public class NYParserFactory implements AbstractParserFactory {
    @Override
    public XMLParser getParserInstance(String parserType) {
        if(parserType.equalsIgnoreCase("NYError")){
            return new NYErrorXMLParser();
        }
        else if(parserType.equalsIgnoreCase("NYOrder")){
            return new NYOrderXMLParser();
        }
        else if(parserType.equalsIgnoreCase("NYFeedback")){
            return new NYFeedbackXMLParser();
        }
        else if(parserType.equalsIgnoreCase("NYResponse")){
            return new NYResponseXMLParser();
        }
        return null;
    }

}
