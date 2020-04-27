package ru.netology.domain;

public class MediaContent {
    private long id;
    private String[] linksContent;
    private String externalLink;
    private int typeContent;
    private String description;
    private String sign;

    public String[] getLinksContent() {
        return linksContent;
    }

    public void setLinksContent(String[] linksContent) {
        this.linksContent = linksContent;
    }

    public String getExternalLink() {
        return externalLink;
    }

    public void setExternalLink(String externalLink) {
        this.externalLink = externalLink;
    }

    public int getTypeContent() {
        return typeContent;
    }

    public void setTypeContent(int typeContent) {
        this.typeContent = typeContent;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
