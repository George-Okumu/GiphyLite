
package com.george.giphylite;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Looping {

    @SerializedName("mp4_size")
    @Expose
    private String mp4Size;
    @SerializedName("mp4")
    @Expose
    private String mp4;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Looping() {
    }

    /**
     * 
     * @param mp4
     * @param mp4Size
     */
    public Looping(String mp4Size, String mp4) {
        super();
        this.mp4Size = mp4Size;
        this.mp4 = mp4;
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

}
