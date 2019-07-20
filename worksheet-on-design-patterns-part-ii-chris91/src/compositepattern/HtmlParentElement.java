package compositepattern;

import java.util.List;

public class HtmlParentElement extends HtmlTag {

    private String startTag;
    private String endTag;
    private List<HtmlTag> listOfTags;

    public HtmlParentElement(String s) {
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

    public void addChildTag(HtmlTag htmlTag) {
        this.listOfTags.add(htmlTag);
    }

    public void removeChildTag(HtmlTag htmlTag) {
        this.listOfTags.remove(htmlTag);
    }

    public List<HtmlTag> getChildren() {
        return this.listOfTags;
    }
}
