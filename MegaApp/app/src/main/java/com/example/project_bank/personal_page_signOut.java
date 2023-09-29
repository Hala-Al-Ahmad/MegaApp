package com.example.project_bank;

import static com.example.project_bank.R.id.signOut;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class personal_page_signOut extends AppCompatActivity {

    Button button_ONE ;
    Button button_TWO ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_page_sign_out);
         button_ONE = findViewById(R.id.signOut);
         button_TWO = findViewById(R.id.delete);

         if (button_ONE.isClickable()) {
               button_ONE.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       Intent intent_homeBack = new Intent(personal_page_signOut.this , loginpage.class);
                       startActivity(intent_homeBack);
                   }
               });
         } else {
             button_TWO.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     Intent intent_personalBack = new Intent(personal_page_signOut.this , personal_page.class);
                     startActivity(intent_personalBack);
                 }
             });
         }
    }
}