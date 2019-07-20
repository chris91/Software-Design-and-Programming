package abstractfactorypattern;

public class TWErrorXMLParser implements XMLParser {
    @Override
    public String parse() {
        return "TW Parsing error XML...\n" + "TW Error XML Message";
    }
}
