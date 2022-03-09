
package com.george.giphylite;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Images {

    @SerializedName("original")
    @Expose
    private Original original;
    @SerializedName("downsized")
    @Expose
    private Downsized downsized;
    @SerializedName("downsized_large")
    @Expose
    private DownsizedLarge downsizedLarge;
    @SerializedName("downsized_medium")
    @Expose
    private DownsizedMedium downsizedMedium;
    @SerializedName("downsized_small")
    @Expose
    private DownsizedSmall downsizedSmall;
    @SerializedName("downsized_still")
    @Expose
    private DownsizedStill downsizedStill;
    @SerializedName("fixed_height")
    @Expose
    private FixedHeight fixedHeight;
    @SerializedName("fixed_height_downsampled")
    @Expose
    private FixedHeightDownsampled fixedHeightDownsampled;
    @SerializedName("fixed_height_small")
    @Expose
    private FixedHeightSmall fixedHeightSmall;
    @SerializedName("fixed_height_small_still")
    @Expose
    private FixedHeightSmallStill fixedHeightSmallStill;
    @SerializedName("fixed_height_still")
    @Expose
    private FixedHeightStill fixedHeightStill;
    @SerializedName("fixed_width")
    @Expose
    private FixedWidth fixedWidth;
    @SerializedName("fixed_width_downsampled")
    @Expose
    private FixedWidthDownsampled fixedWidthDownsampled;
    @SerializedName("fixed_width_small")
    @Expose
    private FixedWidthSmall fixedWidthSmall;
    @SerializedName("fixed_width_small_still")
    @Expose
    private FixedWidthSmallStill fixedWidthSmallStill;
    @SerializedName("fixed_width_still")
    @Expose
    private FixedWidthStill fixedWidthStill;
    @SerializedName("looping")
    @Expose
    private Looping looping;
    @SerializedName("original_still")
    @Expose
    private OriginalStill originalStill;
    @SerializedName("original_mp4")
    @Expose
    private OriginalMp4 originalMp4;
    @SerializedName("preview")
    @Expose
    private Preview preview;
    @SerializedName("preview_gif")
    @Expose
    private PreviewGif previewGif;
    @SerializedName("preview_webp")
    @Expose
    private PreviewWebp previewWebp;
    @SerializedName("hd")
    @Expose
    private Hd hd;
    @SerializedName("480w_still")
    @Expose
    private com.george.giphylite._480wStill _480wStill;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Images() {
    }

    /**
     * 
     * @param preview
     * @param fixedWidthDownsampled
     * @param original
     * @param fixedWidth
     * @param fixedWidthSmallStill
     * @param looping
     * @param downsizedMedium
     * @param downsizedStill
     * @param downsizedSmall
     * @param fixedHeight
     * @param previewWebp
     * @param fixedHeightStill
     * @param fixedHeightDownsampled
     * @param originalStill
     * @param fixedWidthSmall
     * @param fixedHeightSmall
     * @param _480wStill
     * @param originalMp4
     * @param previewGif
     * @param fixedHeightSmallStill
     * @param downsizedLarge
     * @param fixedWidthStill
     * @param hd
     * @param downsized
     */
    public Images(Original original, Downsized downsized, DownsizedLarge downsizedLarge, DownsizedMedium downsizedMedium, DownsizedSmall downsizedSmall, DownsizedStill downsizedStill, FixedHeight fixedHeight, FixedHeightDownsampled fixedHeightDownsampled, FixedHeightSmall fixedHeightSmall, FixedHeightSmallStill fixedHeightSmallStill, FixedHeightStill fixedHeightStill, FixedWidth fixedWidth, FixedWidthDownsampled fixedWidthDownsampled, FixedWidthSmall fixedWidthSmall, FixedWidthSmallStill fixedWidthSmallStill, FixedWidthStill fixedWidthStill, Looping looping, OriginalStill originalStill, OriginalMp4 originalMp4, Preview preview, PreviewGif previewGif, PreviewWebp previewWebp, Hd hd, com.george.giphylite._480wStill _480wStill) {
        super();
        this.original = original;
        this.downsized = downsized;
        this.downsizedLarge = downsizedLarge;
        this.downsizedMedium = downsizedMedium;
        this.downsizedSmall = downsizedSmall;
        this.downsizedStill = downsizedStill;
        this.fixedHeight = fixedHeight;
        this.fixedHeightDownsampled = fixedHeightDownsampled;
        this.fixedHeightSmall = fixedHeightSmall;
        this.fixedHeightSmallStill = fixedHeightSmallStill;
        this.fixedHeightStill = fixedHeightStill;
        this.fixedWidth = fixedWidth;
        this.fixedWidthDownsampled = fixedWidthDownsampled;
        this.fixedWidthSmall = fixedWidthSmall;
        this.fixedWidthSmallStill = fixedWidthSmallStill;
        this.fixedWidthStill = fixedWidthStill;
        this.looping = looping;
        this.originalStill = originalStill;
        this.originalMp4 = originalMp4;
        this.preview = preview;
        this.previewGif = previewGif;
        this.previewWebp = previewWebp;
        this.hd = hd;
        this._480wStill = _480wStill;
    }

    public Original getOriginal() {
        return original;
    }

    public void setOriginal(Original original) {
        this.original = original;
    }

    public Downsized getDownsized() {
        return downsized;
    }

    public void setDownsized(Downsized downsized) {
        this.downsized = downsized;
    }

    public DownsizedLarge getDownsizedLarge() {
        return downsizedLarge;
    }

    public void setDownsizedLarge(DownsizedLarge downsizedLarge) {
        this.downsizedLarge = downsizedLarge;
    }

    public DownsizedMedium getDownsizedMedium() {
        return downsizedMedium;
    }

    public void setDownsizedMedium(DownsizedMedium downsizedMedium) {
        this.downsizedMedium = downsizedMedium;
    }

    public DownsizedSmall getDownsizedSmall() {
        return downsizedSmall;
    }

    public void setDownsizedSmall(DownsizedSmall downsizedSmall) {
        this.downsizedSmall = downsizedSmall;
    }

    public DownsizedStill getDownsizedStill() {
        return downsizedStill;
    }

    public void setDownsizedStill(DownsizedStill downsizedStill) {
        this.downsizedStill = downsizedStill;
    }

    public FixedHeight getFixedHeight() {
        return fixedHeight;
    }

    public void setFixedHeight(FixedHeight fixedHeight) {
        this.fixedHeight = fixedHeight;
    }

    public FixedHeightDownsampled getFixedHeightDownsampled() {
        return fixedHeightDownsampled;
    }

    public void setFixedHeightDownsampled(FixedHeightDownsampled fixedHeightDownsampled) {
        this.fixedHeightDownsampled = fixedHeightDownsampled;
    }

    public FixedHeightSmall getFixedHeightSmall() {
        return fixedHeightSmall;
    }

    public void setFixedHeightSmall(FixedHeightSmall fixedHeightSmall) {
        this.fixedHeightSmall = fixedHeightSmall;
    }

    public FixedHeightSmallStill getFixedHeightSmallStill() {
        return fixedHeightSmallStill;
    }

    public void setFixedHeightSmallStill(FixedHeightSmallStill fixedHeightSmallStill) {
        this.fixedHeightSmallStill = fixedHeightSmallStill;
    }

    public FixedHeightStill getFixedHeightStill() {
        return fixedHeightStill;
    }

    public void setFixedHeightStill(FixedHeightStill fixedHeightStill) {
        this.fixedHeightStill = fixedHeightStill;
    }

    public FixedWidth getFixedWidth() {
        return fixedWidth;
    }

    public void setFixedWidth(FixedWidth fixedWidth) {
        this.fixedWidth = fixedWidth;
    }

    public FixedWidthDownsampled getFixedWidthDownsampled() {
        return fixedWidthDownsampled;
    }

    public void setFixedWidthDownsampled(FixedWidthDownsampled fixedWidthDownsampled) {
        this.fixedWidthDownsampled = fixedWidthDownsampled;
    }

    public FixedWidthSmall getFixedWidthSmall() {
        return fixedWidthSmall;
    }

    public void setFixedWidthSmall(FixedWidthSmall fixedWidthSmall) {
        this.fixedWidthSmall = fixedWidthSmall;
    }

    public FixedWidthSmallStill getFixedWidthSmallStill() {
        return fixedWidthSmallStill;
    }

    public void setFixedWidthSmallStill(FixedWidthSmallStill fixedWidthSmallStill) {
        this.fixedWidthSmallStill = fixedWidthSmallStill;
    }

    public FixedWidthStill getFixedWidthStill() {
        return fixedWidthStill;
    }

    public void setFixedWidthStill(FixedWidthStill fixedWidthStill) {
        this.fixedWidthStill = fixedWidthStill;
    }

    public Looping getLooping() {
        return looping;
    }

    public void setLooping(Looping looping) {
        this.looping = looping;
    }

    public OriginalStill getOriginalStill() {
        return originalStill;
    }

    public void setOriginalStill(OriginalStill originalStill) {
        this.originalStill = originalStill;
    }

    public OriginalMp4 getOriginalMp4() {
        return originalMp4;
    }

    public void setOriginalMp4(OriginalMp4 originalMp4) {
        this.originalMp4 = originalMp4;
    }

    public Preview getPreview() {
        return preview;
    }

    public void setPreview(Preview preview) {
        this.preview = preview;
    }

    public PreviewGif getPreviewGif() {
        return previewGif;
    }

    public void setPreviewGif(PreviewGif previewGif) {
        this.previewGif = previewGif;
    }

    public PreviewWebp getPreviewWebp() {
        return previewWebp;
    }

    public void setPreviewWebp(PreviewWebp previewWebp) {
        this.previewWebp = previewWebp;
    }

    public Hd getHd() {
        return hd;
    }

    public void setHd(Hd hd) {
        this.hd = hd;
    }

    public com.george.giphylite._480wStill get480wStill() {
        return _480wStill;
    }

    public void set480wStill(com.george.giphylite._480wStill _480wStill) {
        this._480wStill = _480wStill;
    }

}
