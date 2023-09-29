package com.example.project_bank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class personal_page_about_us extends AppCompatActivity {

    ImageView back_personalPage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_page_about_us);

        back_personalPage = findViewById(R.id.right_about);
        back_personalPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_backPersonal= new Intent(personal_page_about_us.this , personal_page.class);
                startActivity(intent_backPersonal);
            }
        });
    }
}