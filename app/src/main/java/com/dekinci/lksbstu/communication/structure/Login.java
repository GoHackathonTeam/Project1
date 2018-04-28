package com.dekinci.lksbstu.communication.structure;

import com.google.gson.annotations.SerializedName;

public class Login {
    @SerializedName("access_token")
    private String TOKEN;

    @SerializedName("id")
    private String ID;

    public String getTOKEN() {
        return TOKEN;
    }

    public String getID() {
        return ID;
    }
}