package abstractfactorypattern;

public class NYFeedbackXMLParser implements XMLParser {
    @Override
    public String parse() {
        return "NY Parsing feedback XML...\n" + "NY Feedback XML Message";
    }
}
