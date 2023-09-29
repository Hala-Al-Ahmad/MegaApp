package com.example.project_bank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class personal_page_his extends AppCompatActivity {


    ImageView imageView_back ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_page_his);
        imageView_back = findViewById(R.id.right_3);
        imageView_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_back = new Intent(personal_page_his.this,personal_page.class);
                startActivity(intent_back);
            }
        });

    }
}