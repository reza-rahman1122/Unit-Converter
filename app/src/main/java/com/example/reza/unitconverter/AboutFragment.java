package com.example.reza.unitconverter;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class AboutFragment extends Fragment {

ImageButton btn_call,btn_mail;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view= inflater.inflate(R.layout.fragment_about, container, false);

        btn_call=view.findViewById(R.id.id_about_call);
        btn_mail=view.findViewById(R.id.id_about_mail);

        btn_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:01772711529"));
                startActivity(intent);
            }
        });

        btn_mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent email=new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL,new String[] {"mdalireza021@gmail.com"});
                email.setType("text/html");
                startActivity(Intent.createChooser(email,"Choose an email client"));
            }
        });
    return view;
    }
}