package abstractfactorypattern;

public class NYOrderXMLParser implements XMLParser {
    @Override
    public String parse() {
        return "NY Parsing order XML...\n" + "NY Order XML Message";
    }
}
