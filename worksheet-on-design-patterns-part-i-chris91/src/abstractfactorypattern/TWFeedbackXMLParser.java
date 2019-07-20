package abstractfactorypattern;

public class TWFeedbackXMLParser implements XMLParser {
    @Override
    public String parse() {
        return "TW Parsing feedback XML...\n" + "TW Feedback XML Message";
    }
}
