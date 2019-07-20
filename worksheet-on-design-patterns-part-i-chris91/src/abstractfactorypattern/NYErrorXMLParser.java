package abstractfactorypattern;

public class NYErrorXMLParser implements XMLParser {
    @Override
    public String parse() {
        return "NY Parsing error XML...\n" + "NY Error XML Message";
    }
}
