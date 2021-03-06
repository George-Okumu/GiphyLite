
package com.george.giphylite;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TrendingResponse {

    @SerializedName("data")
    @Expose
    private List<Datum> data = null;
    @SerializedName("pagination")
    @Expose
    private Pagination pagination;
    @SerializedName("meta")
    @Expose
    private Meta meta;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TrendingResponse() {
    }

    /**
     * 
     * @param pagination
     * @param data
     * @param meta
     */
    public TrendingResponse(List<Datum> data, Pagination pagination, Meta meta) {
        super();
        this.data = data;
        this.pagination = pagination;
        this.meta = meta;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

}
