package com.vishalpvijayan.shrikeappretrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ApiInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        apiInterface.booking("1","29","40","Testing","2020-11-10","2020-11-15","1","1110").enqueue(new Callback<Booking_Response>() {
            @Override
            public void onResponse(Call<Booking_Response> call, Response<Booking_Response> response) {

               if(response.isSuccessful()){
                   Booking_Response history = response.body();
                   Log.e("Data booking code", history.getMassage().getBookingCode());
               }else
                   {
                   Log.e("Failed","Failed");
               }

            }

            @Override
            public void onFailure(Call<Booking_Response> call, Throwable t) {
                Log.e("Failed",t.getMessage());
            }
        });
    }
}