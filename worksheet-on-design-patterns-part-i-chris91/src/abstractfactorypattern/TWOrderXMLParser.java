package abstractfactorypattern;

public class TWOrderXMLParser implements XMLParser {
    @Override
    public String parse() {
        return "TW Parsing order XML...\n" + "TW Order XML Message";
    }
}
