package compositepattern;

public class HtmlElement extends HtmlTag {

    private String startTag;
    private String endTag;
    private String tagBody;

    public HtmlElement(String s) {
        super();
    }

    @Override
    public String getTagName() {
        return String.valueOf(this.startTag.subSequence(1,startTag.length()-1));
    }

    @Override
    public void setStartTag(String tag) {
        this.startTag = tag;
    }

    @Override
    public void setEndTag(String tag) {
        this.endTag = tag;
    }

    @Override
    public void generateHtml() {

    }

    public void setTagBody(String tagBody) {
        this.tagBody = tagBody;
    }
}
