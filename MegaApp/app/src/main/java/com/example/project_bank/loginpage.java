package com.example.project_bank;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class loginpage extends AppCompatActivity {

    TextInputEditText phone;
    TextInputEditText password;
    //TextView forget_password;
    Button login_but;
    TextView Register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);

        phone = findViewById(R.id.phone_edit);
        password = findViewById(R.id.password_edit);
       // forget_password = findViewById(R.id.forgot_password);
        login_but = findViewById(R.id.logButton);
        Register = findViewById(R.id.register);

         Register.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent_sign_page = new Intent(loginpage.this ,signup.class );
                 startActivity(intent_sign_page);
             }
         });
         // set a design and java_code in forgot_page .
       /* forget_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_forgot_password = new Intent(loginpage.this , forgot_page.class);
                startActivity(intent_forgot_password);
            }
        });*/

        login_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });
    }

    public void login() {

        ProgressDialog pd = new ProgressDialog(this);
        pd.show();
        Api service = RetrofitClint.getApiService();
        RequestBody phoneRequestBody = RequestBody.create(MediaType.parse("text/plain") ,phone.getText().toString());
        RequestBody passwordRequestBody = RequestBody.create(MediaType.parse("text/plain"), password.getText().toString());
        RequestBody conCodeRequestBody = RequestBody.create(MediaType.parse("text/plain"), "962");
        Call<UserModel> retCall = service.login(phoneRequestBody, passwordRequestBody, conCodeRequestBody);
        retCall.enqueue(new Callback<UserModel>() {
            @Override

            public void onResponse(Call<UserModel> call, Response<UserModel> response) {
                pd.dismiss();
                if (response.body().isResult()) {
                    Intent i= new Intent(loginpage.this, home_page.class);
                    startActivity(i);

                } else {
                    Toast.makeText(loginpage.this, response.body().getMsg(), Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<UserModel> call, Throwable t) {
                pd.dismiss();
            }
        });

    }
}