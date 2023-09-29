package com.example.project_bank;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.textfield.TextInputEditText;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class signup extends AppCompatActivity {


    TextInputEditText fullName , phone , email , password , passwordConfirm ;
    Button click_continue;


    CheckBox sure_box ;

    TextView link_web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        fullName = findViewById(R.id.fullname_edit);
        phone = findViewById(R.id.phone_edit);
        email = findViewById(R.id.email_edit);
        password=findViewById(R.id.password_edit);
        passwordConfirm = findViewById(R.id.passwordcomfirm_edit);

        // step one -> signup page
        // step two -> check box if click (run) , no toast message
        click_continue = findViewById(R.id.conButton);
        sure_box= findViewById(R.id.agreeBox);
        click_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sure_box.isChecked()) {
                    signup();
                } else {
                    Toast.makeText(signup.this, "No Action", Toast.LENGTH_SHORT).show();
                }

            }
        });

        // link policy -->

        link_web = findViewById(R.id.terms);
        link_web.setMovementMethod(LinkMovementMethod.getInstance());

    }



    public void signup() {

        ProgressDialog pd = new ProgressDialog(this);
        pd.show();
        Api service = RetrofitClint.getApiService();

        RequestBody nameRequestBody = RequestBody.create(MediaType.parse("text/plain"),  fullName.getText().toString());
        RequestBody phoneRequestBody = RequestBody.create(MediaType.parse("text/plain"), phone.getText().toString());
        RequestBody emailRequestBody = RequestBody.create(MediaType.parse("text/plain"), email.getText().toString());
        RequestBody passwordRequestBody = RequestBody.create(MediaType.parse("text/plain"), password.getText().toString());
        RequestBody conCodeRequestBody = RequestBody.create(MediaType.parse("text/plain"), "962");

        Call<UserModel> retCall = service.SignUp(nameRequestBody, phoneRequestBody, passwordRequestBody, conCodeRequestBody, emailRequestBody);
        retCall.enqueue(new Callback<UserModel>() {
            @Override

            public void onResponse(Call<UserModel> call, Response<UserModel> response) {
                pd.dismiss();
                if (response.body().isResult()) {
                    bottomFragment bottomFragment = new bottomFragment();
                    bottomFragment.show(getSupportFragmentManager(), bottomFragment.getTag());

                } else {
                    Toast.makeText(signup.this, response.body().getMsg(), Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<UserModel> call, Throwable t) {
                pd.dismiss();
            }
        });

    }
}