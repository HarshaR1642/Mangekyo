package com.anime.mangekyo.model.details;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Name {

    @SerializedName("first")
    @Expose
    private String first;
    @SerializedName("last")
    @Expose
    private String last;
    @SerializedName("full")
    @Expose
    private String full;
    @SerializedName("native")
    @Expose
    private String _native;
    @SerializedName("userPreferred")
    @Expose
    private String userPreferred;

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getFull() {
        return full;
    }

    public void setFull(String full) {
        this.full = full;
    }

    public String getNative() {
        return _native;
    }

    public void setNative(String _native) {
        this._native = _native;
    }

    public String getUserPreferred() {
        return userPreferred;
    }

    public void setUserPreferred(String userPreferred) {
        this.userPreferred = userPreferred;
    }

}