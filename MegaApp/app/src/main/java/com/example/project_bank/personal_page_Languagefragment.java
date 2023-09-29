package com.example.project_bank;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;


public class personal_page_Languagefragment extends BottomSheetDialogFragment {

   Button cansel , confirm;
   RadioButton english , arabic ;
    public personal_page_Languagefragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_personal_page__languagefragment, container, false);
        cansel = view.findViewById(R.id.cansel);
        confirm = view.findViewById(R.id.confirm);
        if (english.isChecked()) {
            cansel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent language = new Intent(getActivity() , personal_page.class);
                    startActivity(language);
                }
            });

        } else{
            confirm.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        }

        return view;
    }
}