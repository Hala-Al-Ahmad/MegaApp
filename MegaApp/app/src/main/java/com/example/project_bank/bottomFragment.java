package com.example.project_bank;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;


public class bottomFragment extends BottomSheetDialogFragment {



    public bottomFragment() {
        // Required empty public constructor
    }

    Button got;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       View view = inflater.inflate(R.layout.fragment_bottom, container, false);
       got = view.findViewById(R.id.got_it);
       got.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent_connect = new Intent(getActivity(), home_page.class);
               startActivity(intent_connect);
           }
       });
        return view;
    }
}