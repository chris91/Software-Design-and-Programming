package abstractfactorypattern;

public class NYResponseXMLParser implements XMLParser {
    @Override
    public String parse() {
        return "NY Parsing response XML...\n" + "NY Response XML Message";
    }
}
