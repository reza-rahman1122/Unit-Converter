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
import android.widget.Spinner;

public class TemperatureFragment extends Fragment {

    private EditText ed1,ed2;
    private AppCompatSpinner spinner1,spinner2;
    private String value;
    private Button btn_temp;
    private String[] str1={"Celsius °C","Fahrenheit °F","Kelvin °K","Rankine °R"};
    private String[] str2={"Celsius °C","Fahrenheit °F","Kelvin °K","Rankine °R"};
    private int position1=0,position2=0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_temperature, container, false);

        ed1=v.findViewById(R.id.id_edit1);
        ed2=v.findViewById(R.id.id_edit2);
        spinner1=v.findViewById(R.id.id_sp1);
        spinner2=v.findViewById(R.id.id_sp2);
        btn_temp=v.findViewById(R.id.id_convert_length);

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

                else
                {
                    position1=3;
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

                else
                {
                    position2=3;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        btn_temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               try {
                   value=ed1.getText().toString();

                   ///celsius
                   if (position1==0 && position2==0)
                   {
                       ed2.setText(TemperatureConversion.Celsius_toCelsius(Double.valueOf(value))+"");
                   }
                   if (position1==0 && position2==1)
                   {
                       ed2.setText(TemperatureConversion.Celsius_toFahrenheit(Double.valueOf(value))+"");
                   }
                   if (position1==0 && position2==2)
                   {
                       ed2.setText(TemperatureConversion.Celsius_toKelvin(Double.valueOf(value))+"");
                   }
                   if (position1==0 && position2==3)
                   {
                       ed2.setText(TemperatureConversion.Celsius_toRankine(Double.valueOf(value))+"");
                   }


                   ///fahrenheit
                   if (position1==1 && position2==0)
                   {
                       ed2.setText(TemperatureConversion.Fahrenheit_toCelsius(Double.valueOf(value))+"");
                   }
                   if (position1==1 && position2==1)
                   {
                       ed2.setText(TemperatureConversion.Fahrenheit_toFahrenheit(Double.valueOf(value))+"");
                   }
                   if (position1==1 && position2==2)
                   {
                       ed2.setText(TemperatureConversion.Fahrenheit_toKelvin(Double.valueOf(value))+"");
                   }
                   if (position1==1 && position2==3)
                   {
                       ed2.setText(TemperatureConversion.Fahrenheit_toRankine(Double.valueOf(value))+"");
                   }


                   ///kelvin
                   if (position1==2 && position2==0)
                   {
                       ed2.setText(TemperatureConversion.Kelvin_toCelsius(Double.valueOf(value))+"");
                   }
                   if (position1==2 && position2==1)
                   {
                       ed2.setText(TemperatureConversion.Kelvin_toFahrenheit(Double.valueOf(value))+"");
                   }
                   if (position1==2 && position2==2)
                   {
                       ed2.setText(TemperatureConversion.Kelvin_toKelvin(Double.valueOf(value))+"");
                   }
                   if (position1==2 && position2==3)
                   {
                       ed2.setText(TemperatureConversion.Kelvin_toRankine(Double.valueOf(value))+"");
                   }


                   ///Rankine
                   if (position1==3 && position2==0)
                   {
                       ed2.setText(TemperatureConversion.Rankine_toCelsius(Double.valueOf(value))+"");
                   }
                   if (position1==3 && position2==1)
                   {
                       ed2.setText(TemperatureConversion.Rankine_toFahrenheit(Double.valueOf(value))+"");
                   }
                   if (position1==3 && position2==2)
                   {
                       ed2.setText(TemperatureConversion.Rankine_toKelvin(Double.valueOf(value))+"");
                   }
                   if (position1==3 && position2==3)
                   {
                       ed2.setText(TemperatureConversion.Rankine_toRankine(Double.valueOf(value))+"");
                   }

               }
               catch (Exception e)
               {

               }

            }
        });





        return v;

    }
}