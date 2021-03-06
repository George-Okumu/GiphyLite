
package com.george.giphylite;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OriginalStill {

    @SerializedName("height")
    @Expose
    private String height;
    @SerializedName("width")
    @Expose
    private String width;
    @SerializedName("size")
    @Expose
    private String size;
    @SerializedName("url")
    @Expose
    private String url;

    /**
     * No args constructor for use in serialization
     * 
     */
    public OriginalStill() {
    }

    /**
     * 
     * @param size
     * @param width
     * @param url
     * @param height
     */
    public OriginalStill(String height, String width, String size, String url) {
        super();
        this.height = height;
        this.width = width;
        this.size = size;
        this.url = url;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
