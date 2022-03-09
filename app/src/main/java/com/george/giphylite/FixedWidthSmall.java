
package com.george.giphylite;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FixedWidthSmall {

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
    @SerializedName("mp4_size")
    @Expose
    private String mp4Size;
    @SerializedName("mp4")
    @Expose
    private String mp4;
    @SerializedName("webp_size")
    @Expose
    private String webpSize;
    @SerializedName("webp")
    @Expose
    private String webp;

    /**
     * No args constructor for use in serialization
     * 
     */
    public FixedWidthSmall() {
    }

    /**
     * 
     * @param mp4
     * @param webpSize
     * @param size
     * @param width
     * @param mp4Size
     * @param webp
     * @param url
     * @param height
     */
    public FixedWidthSmall(String height, String width, String size, String url, String mp4Size, String mp4, String webpSize, String webp) {
        super();
        this.height = height;
        this.width = width;
        this.size = size;
        this.url = url;
        this.mp4Size = mp4Size;
        this.mp4 = mp4;
        this.webpSize = webpSize;
        this.webp = webp;
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

    public String getMp4Size() {
        return mp4Size;
    }

    public void setMp4Size(String mp4Size) {
        this.mp4Size = mp4Size;
    }

    public String getMp4() {
        return mp4;
    }

    public void setMp4(String mp4) {
        this.mp4 = mp4;
    }

    public String getWebpSize() {
        return webpSize;
    }

    public void setWebpSize(String webpSize) {
        this.webpSize = webpSize;
    }

    public String getWebp() {
        return webp;
    }

    public void setWebp(String webp) {
        this.webp = webp;
    }

}