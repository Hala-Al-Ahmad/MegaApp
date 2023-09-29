package com.example.project_bank;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class personal_page extends AppCompatActivity {


    ImageView back_home_page;
    ImageView imageTranslate_edit;
    ImageView imageTranslate_his;
    ImageView imageTranslate_about;
    ImageView imageTranslate_policy;
    ImageView imageTranslate_language;
    ImageView imageTranslate_sign_out;
    //notification after
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_page);
        //translate personal page to home page-1-
        back_home_page = findViewById(R.id.right_1);
        back_home_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_home = new Intent(personal_page.this , home_page.class);
                startActivity(intent_home);
            }
        });
        ////////////////////////////////////////////////
        // translate arrow edit_name to personal-intro

        imageTranslate_edit = findViewById(R.id.image_translate_home);
        imageTranslate_edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_intro = new Intent(personal_page.this , personal_page_intro.class);
                startActivity(intent_intro);
            }
        });

        ////////////////////////////////////////////////
       // history make intent
        imageTranslate_his = findViewById(R.id.image_translate_history);
        imageTranslate_his.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_his = new Intent(personal_page.this , personal_page_his.class);
                startActivity(intent_his);
            }
        });

        ////////////////////////////////////////////////
        // about us

        imageTranslate_about = findViewById(R.id.image_translateAbout);
        imageTranslate_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_aboutUs = new Intent(personal_page.this , personal_page_about_us.class);
                startActivity(intent_aboutUs);
            }
        });

        ////////////////////////////////////////////////
        // terms and privacy policy

        imageTranslate_policy = findViewById(R.id.image_translatePolicy);
        imageTranslate_policy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_policy = new Intent(personal_page.this , personal_page_policy.class);
                startActivity(intent_policy);
            }
        });
        ////////////////////////////////////////////////
        // Language

        imageTranslate_language = findViewById(R.id.image_translateLanguage);
        imageTranslate_language.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                personal_page_Languagefragment personal_page_languagefragment = new personal_page_Languagefragment();
                personal_page_languagefragment.show(getSupportFragmentManager(),personal_page_languagefragment.getTag());
            }
        });

        ////////////////////////////////////////////////

        // sign-out

        imageTranslate_sign_out = findViewById(R.id.image_translateSignout);
        imageTranslate_sign_out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  Intent intent_signOut = new Intent(personal_page.this, personal_page_signOut.class);
                  startActivity(intent_signOut);
            }
        });


    }
}