package com.example.project_bank;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class home_page_2 extends AppCompatActivity {

    ImageView imageView_arrow;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page2);

        //back intent for home_page
        imageView_arrow = findViewById(R.id.right);
        imageView_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_backHomepage = new Intent(home_page_2.this , home_page.class);
                startActivity(intent_backHomepage);
            }
        });

        ////////////////////////////////////

        //search box :

    }
}