package com.vishalpvijayan.shrikeappretrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Massage {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("booking_id")
    @Expose
    private String bookingId;
    @SerializedName("txn_id")
    @Expose
    private String txnId;
    @SerializedName("booking_code")
    @Expose
    private String bookingCode;
    @SerializedName("bike_id")
    @Expose
    private String bikeId;
    @SerializedName("cust_id")
    @Expose
    private String custId;
    @SerializedName("amount")
    @Expose
    private String amount;
    @SerializedName("booking_type")
    @Expose
    private String bookingType;
    @SerializedName("from_date")
    @Expose
    private String fromDate;
    @SerializedName("to_date")
    @Expose
    private String toDate;
    @SerializedName("total_amount")
    @Expose
    private String totalAmount;
    @SerializedName("booking_date")
    @Expose
    private String bookingDate;
    @SerializedName("condition")
    @Expose
    private String condition;
    @SerializedName("engage")
    @Expose
    private String engage;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("end_ride_status")
    @Expose
    private String endRideStatus;
    @SerializedName("bike_name")
    @Expose
    private Object bikeName;
    @SerializedName("store_id")
    @Expose
    private Object storeId;
    @SerializedName("lat")
    @Expose
    private Object lat;
    @SerializedName("long")
    @Expose
    private Object _long;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getTxnId() {
        return txnId;
    }

    public void setTxnId(String txnId) {
        this.txnId = txnId;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public String getBikeId() {
        return bikeId;
    }

    public void setBikeId(String bikeId) {
        this.bikeId = bikeId;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getBookingType() {
        return bookingType;
    }

    public void setBookingType(String bookingType) {
        this.bookingType = bookingType;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getEngage() {
        return engage;
    }

    public void setEngage(String engage) {
        this.engage = engage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEndRideStatus() {
        return endRideStatus;
    }

    public void setEndRideStatus(String endRideStatus) {
        this.endRideStatus = endRideStatus;
    }

    public Object getBikeName() {
        return bikeName;
    }

    public void setBikeName(Object bikeName) {
        this.bikeName = bikeName;
    }

    public Object getStoreId() {
        return storeId;
    }

    public void setStoreId(Object storeId) {
        this.storeId = storeId;
    }

    public Object getLat() {
        return lat;
    }

    public void setLat(Object lat) {
        this.lat = lat;
    }

    public Object getLong() {
        return _long;
    }

    public void setLong(Object _long) {
        this._long = _long;
    }

}
