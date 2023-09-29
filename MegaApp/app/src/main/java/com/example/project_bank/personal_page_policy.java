package com.example.project_bank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class personal_page_policy extends AppCompatActivity {
  ImageView imageView_policy ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_page_policy);
        imageView_policy = findViewById(R.id.right_policy);
        imageView_policy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_back_policy = new Intent(personal_page_policy.this , personal_page.class);
                startActivity(intent_back_policy);
            }
        });
    }
}