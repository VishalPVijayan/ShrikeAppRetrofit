package com.vishalpvijayan.shrikeappretrofit;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

interface ApiInterface {


    @FormUrlEncoded
    @POST("booking")
    Call<Booking_Response> booking(
            @Field("bike_id")String bikeId,
            @Field("cust_id")String custId,
            @Field("amount")String amount,
            @Field("booking_type")String bookingType,
            @Field("from_date")String fromDate,
            @Field("to_date")String toDate,
            @Field("no_of_bike")String noOfBikes,
            @Field("txn_id")String txn_id

    );


}
