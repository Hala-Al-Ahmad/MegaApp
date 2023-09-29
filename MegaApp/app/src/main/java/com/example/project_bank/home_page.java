package com.example.project_bank;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class home_page extends AppCompatActivity {

    ImageView personal_pageBasic;
    RecyclerView banner ;
    bannerAdapter bannerAdapter ;
    TextView transit_homepage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        //Recycler View
        banner = findViewById(R.id.banner_rec);
        banner.setLayoutManager(new LinearLayoutManager(this , LinearLayoutManager.HORIZONTAL , false));
        getBannerImages();

        // personal main
        personal_pageBasic = findViewById(R.id.account);
        personal_pageBasic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent connect_personal = new Intent(home_page.this , personal_page.class);
                startActivity(connect_personal);
            }
        });

        //transited between homepage-1- to homepage-2-
        transit_homepage = findViewById(R.id.see_all);
        transit_homepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent transited_homepage_2 = new Intent(home_page.this , home_page_2.class);
                startActivity(transited_homepage_2);
            }
        });


    }

    public void getBannerImages() {


        Api service = RetrofitClint.getApiService();

        Call<List<banner_Cycle>> retCall = service.BannerImages();
        retCall.enqueue(new Callback<List<banner_Cycle>>() {
            @Override
            public void onResponse(Call<List<banner_Cycle>> call, Response<List<banner_Cycle>> response) {
                bannerAdapter = new bannerAdapter(home_page.this, response.body());
                banner.setAdapter(bannerAdapter);

            }

            @Override
            public void onFailure(Call<List<banner_Cycle>> call, Throwable t) {

            }


        });
    }
}