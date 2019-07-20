package abstractfactorypattern;

public class TWResponseXMLParser implements XMLParser {
    @Override
    public String parse() {
        return "TW Parsing response XML...\n" + "TW Response XML Message";
    }
}
