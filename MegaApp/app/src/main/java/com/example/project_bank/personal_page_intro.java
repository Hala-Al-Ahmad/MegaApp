package com.example.project_bank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class personal_page_intro extends AppCompatActivity {

    ImageView back_personal_page;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_page_intro);

        // translate arrow to personal_page
        back_personal_page = findViewById(R.id.right_2);
        back_personal_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_back_personal= new Intent(personal_page_intro.this , personal_page.class);
                startActivity(intent_back_personal);
            }
        });

        /////////////////////////////////


    }
}