package ru.netology.domain;

public class PostSource {
    private String type;  // Source type.
    private String platform;  // Platform (if available).
    private String data;  // Action type (only for type = vk or widget).
    private String url;  // Source URL

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
