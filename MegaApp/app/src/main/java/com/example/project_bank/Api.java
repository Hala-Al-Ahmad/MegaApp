package com.example.project_bank;

import java.util.List;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface Api {

    @Multipart
    @POST("login.php")
    Call<UserModel> login(@Part("Phone") RequestBody phone,
                          @Part("Password") RequestBody password,
                          @Part("ConCode") RequestBody conCode
    );
    @Multipart
    @POST("SignUp.php")
    Call<UserModel> SignUp(@Part("Name") RequestBody Name,
                           @Part("Phone") RequestBody Phone,   // parameter we are send to api
                           @Part("Password") RequestBody Password,
                           @Part("ConCode") RequestBody ConCode,
                           @Part("Email") RequestBody Email);

    @GET("getBannerImages.php")
    Call<List<banner_Cycle>> BannerImages();

}





