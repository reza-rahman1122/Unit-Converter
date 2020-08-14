package com.example.reza.unitconverter;

import android.os.Bundle;

import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SettingFragment extends Fragment {
SwitchCompat switchCompat;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View new_view=inflater.inflate(R.layout.fragment_setting, container, false);
        switchCompat=new_view.findViewById(R.id.id_switch_compt);





        return new_view;
    }
}