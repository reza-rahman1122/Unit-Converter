package com.example.reza.unitconverter;

import android.os.Bundle;

import androidx.appcompat.widget.AppCompatSpinner;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SpeedFragment extends Fragment {

    private EditText ed1,ed2;
    private AppCompatSpinner spinner1,spinner2;
    private String value;
    private Button btn_speed;
    private String[] str1={"m/s","km/h","km/s","mph","fps"};
    private String[] str2={"m/s","km/h","km/s","mph","fps"};
    private int position1=0,position2=0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_speed, container, false);

        ed1=view.findViewById(R.id.id_edit1);
        ed2=view.findViewById(R.id.id_edit2);
        spinner1=view.findViewById(R.id.id_sp1);
        spinner2=view.findViewById(R.id.id_sp2);
        btn_speed=view.findViewById(R.id.id_convert_length);

        ArrayAdapter<String> arrayAdapter1=new ArrayAdapter<>(getContext(),R.layout.activity_spinner,str1);
        spinner1.setAdapter(arrayAdapter1);

        ArrayAdapter<String> arrayAdapter2=new ArrayAdapter<>(getContext(),R.layout.activity_spinner,str2);
        spinner2.setAdapter(arrayAdapter2);


        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0)
                {
                    position1=0;
                }
                else if (i==1)
                {


                    position1=1;

                }
                else if (i==2)
                {


                    position1=2;
                }

                else if (i==3)
                {
                    position1=3;
                }
                else
                {
                    position1=4;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0)
                {
                    position2=0;
                }
                else if (i==1)
                {
                    position2=1;

                }
                else if (i==2)
                {

                    position2=2;
                }

                else if (i==3)
                {
                    position2=3;
                }

                else
                    {

                    position2=4;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        btn_speed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    value=ed1.getText().toString();

                    ///meter_per_second
                    if (position1==0 && position2==0)
                    {
                        ed2.setText(SpeedConverter.Meter_perSecond_toMeter_perSecond(Double.valueOf(value))+"");
                    }
                    if (position1==0 && position2==1)
                    {
                        ed2.setText(SpeedConverter.Meter_perSecond_toKiloMeter_perHour(Double.valueOf(value))+"");
                    }
                    if (position1==0 && position2==2)
                    {
                        ed2.setText(SpeedConverter.Meter_perSecond_toKiloMeter_perSecond(Double.valueOf(value))+"");
                    }
                    if (position1==0 && position2==3)
                    {
                        ed2.setText(SpeedConverter.Meter_perSecond_toMile_perHour(Double.valueOf(value))+"");
                    }
                    if (position1==0 && position2==4)
                    {
                        ed2.setText(SpeedConverter.Meter_perSecond_toFoot_perSecond(Double.valueOf(value))+"");
                    }


                    ///kilometer_per_hour
                    if (position1==1 && position2==0)
                    {
                        ed2.setText(SpeedConverter.KiloMeter_perHour_toMeter_perSecond(Double.valueOf(value))+"");
                    }
                    if (position1==1 && position2==1)
                    {
                        ed2.setText(SpeedConverter.KiloMeter_perHour_toKiloMeter_perHour(Double.valueOf(value))+"");
                    }
                    if (position1==1 && position2==2)
                    {
                        ed2.setText(SpeedConverter.KiloMeter_perHour_toKiloMeter_perSecond(Double.valueOf(value))+"");
                    }
                    if (position1==1 && position2==3)
                    {
                        ed2.setText(SpeedConverter.KiloMeter_perHour_toMile_perHour(Double.valueOf(value))+"");
                    }
                    if (position1==1 && position2==4)
                    {
                        ed2.setText(SpeedConverter.KiloMeter_perHour_toFoot_perSecond(Double.valueOf(value))+"");
                    }


                    ///kilometer_per_second
                    if (position1==2 && position2==0)
                    {
                        ed2.setText(SpeedConverter.KiloMeter_perSecond_toMeter_perSecond(Double.valueOf(value))+"");
                    }
                    if (position1==2 && position2==1)
                    {
                        ed2.setText(SpeedConverter.KiloMeter_perSecond_toKiloMeter_perHour(Double.valueOf(value))+"");
                    }
                    if (position1==2 && position2==2)
                    {
                        ed2.setText(SpeedConverter.KiloMeter_perSecond_toKiloMeter_perSecond(Double.valueOf(value))+"");
                    }
                    if (position1==2 && position2==3)
                    {
                        ed2.setText(SpeedConverter.KiloMeter_perSecond_toMile_perHour(Double.valueOf(value))+"");
                    }
                    if (position1==2 && position2==4)
                    {
                        ed2.setText(SpeedConverter.KiloMeter_perSecond_toFoot_perSecond(Double.valueOf(value))+"");
                    }


                    ///mile_per_hour
                    if (position1==3 && position2==0)
                    {
                        ed2.setText(SpeedConverter.Mile_perHour_toMeter_perSecond(Double.valueOf(value))+"");
                    }
                    if (position1==3 && position2==1)
                    {
                        ed2.setText(SpeedConverter.Mile_perHour_toKiloMeter_perHour(Double.valueOf(value))+"");
                    }
                    if (position1==3 && position2==2)
                    {
                        ed2.setText(SpeedConverter.Mile_perHour_toKiloMeter_perSecond(Double.valueOf(value))+"");
                    }
                    if (position1==3 && position2==3)
                    {
                        ed2.setText(SpeedConverter.Mile_perHour_toMile_perHour(Double.valueOf(value))+"");
                    }
                    if (position1==3 && position2==4)
                    {
                        ed2.setText(SpeedConverter.Mile_perHour_toFoot_perSecond(Double.valueOf(value))+"");
                    }


                    ///foot_per_second
                    if (position1==4 && position2==0)
                    {
                        ed2.setText(SpeedConverter.Foot_perSecond_toMeter_perSecond(Double.valueOf(value))+"");
                    }
                    if (position1==4 && position2==1)
                    {
                        ed2.setText(SpeedConverter.Foot_perSecond_toKiloMeter_perHour(Double.valueOf(value))+"");
                    }
                    if (position1==4 && position2==2)
                    {
                        ed2.setText(SpeedConverter.Foot_perSecond_toKiloMeter_perSecond(Double.valueOf(value))+"");
                    }
                    if (position1==4 && position2==3)
                    {
                        ed2.setText(SpeedConverter.Foot_perSecond_toMile_perHour(Double.valueOf(value))+"");
                    }
                    if (position1==4 && position2==4)
                    {
                        ed2.setText(SpeedConverter.Foot_perSecond_toFoot_perSecond(Double.valueOf(value))+"");
                    }
                }
                catch (Exception e)
                {
                    Toast.makeText(getContext(),"Ops!Something wrong",Toast.LENGTH_SHORT).show();

                }
            }
        });

        return view;
    }
}