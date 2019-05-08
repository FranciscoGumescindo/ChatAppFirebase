package com.android.gumeoficial.chatappfirebase.fragments;

import com.android.gumeoficial.chatappfirebase.Notifications.MyResponse;
import com.android.gumeoficial.chatappfirebase.Notifications.Sender;

import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.Call;


public interface APIService {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=ADD HERE YOUR KEY FROM FIREBASE PROJECT"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
