package com.vishalpvijayan.shrikeappretrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

class Booking_Response {

    @SerializedName("responce")
    @Expose
    private Boolean responce;
    @SerializedName("massage")
    @Expose
    private Massage massage;

    public Boolean getResponce() {
        return responce;
    }

    public void setResponce(Boolean responce) {
        this.responce = responce;
    }

    public Massage getMassage() {
        return massage;
    }

    public void setMassage(Massage massage) {
        this.massage = massage;
    }

}
