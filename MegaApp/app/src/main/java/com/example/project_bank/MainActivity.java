package com.example.project_bank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView image_basket , image_logo ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image_basket = findViewById(R.id.img_1);
        image_logo = findViewById(R.id.img_2);

        Animation a = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        image_basket.startAnimation(a);
        image_logo.startAnimation(a);
        new Handler().postDelayed(() -> {
            Intent intent_time = new Intent(MainActivity.this , loginpage.class);
            startActivity(intent_time);
            finish();
        }, 3000);

    }
}