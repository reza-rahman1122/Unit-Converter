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

public class WeightFragment extends Fragment {
    private EditText ed1,ed2;
    private AppCompatSpinner spinner1,spinner2;
    private String value;
    private Button btn_weight;
    private String[] str1={"Kilogram kg","Gram g","Milligram mg","MicroGram g","QuinTal q","Tonne","Pound Ib","Ounce oz"};
    private String[] str2={"Kilogram kg","Gram g","Milligram mg","Microgram g","Quintal q","Pound Ib","Ounce oz"};
    private int position1=0,position2=0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_weight, container, false);

        ed1=view.findViewById(R.id.id_edit1);
        ed2=view.findViewById(R.id.id_edit2);
        spinner1=view.findViewById(R.id.id_sp1);
        spinner2=view.findViewById(R.id.id_sp2);
        btn_weight=view.findViewById(R.id.id_convert_length);

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
                else if (i==3){


                    position1=3;

                }
                else if (i==4)
                {
                    position1=4;
                }
                else if (i==5)
                {
                    position1=5;
                }
                else if (i==6)
                {
                    position1=6;
                }
                else
                {
                    position1=7;
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
                else if (i==3){


                    position2=3;

                }
                else if (i==4)
                {
                    position2=4;
                }
                else if (i==5)
                {
                    position2=5;
                }
                else if (i==6)
                {
                    position2=6;
                }
                else
                {
                    position2=7;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        btn_weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    value=ed1.getText().toString();

                    ///kilogram
                    if (position1==0 && position2==0)
                    {
                        ed2.setText(WeightConverter.Kilogram_toKilogram(Double.valueOf(value))+"");
                    }
                    if (position1==0 && position2==1)
                    {
                        ed2.setText(WeightConverter.Kilogram_toGram(Double.valueOf(value))+"");
                    }
                    if (position1==0 && position2==2)
                    {
                        ed2.setText(WeightConverter.Kilogram_toMilligram(Double.valueOf(value))+"");
                    }
                    if (position1==0 && position2==3)
                    {
                        ed2.setText(WeightConverter.Kilogram_toMicroGram(Double.valueOf(value))+"");
                    }
                    if (position1==0 && position2==4)
                    {
                        ed2.setText(WeightConverter.Kilogram_toQuinTal(Double.valueOf(value))+"");
                    }
                    if (position1==0 && position2==5)
                    {
                        ed2.setText(WeightConverter.Kilogram_toTonne(Double.valueOf(value))+"");
                    }
                    if (position1==0 && position2==6)
                    {
                        ed2.setText(WeightConverter.Kilogram_toPound(Double.valueOf(value))+"");
                    }
                    if (position1==0 && position2==7)
                    {
                        ed2.setText(WeightConverter.Kilogram_toOunce(Double.valueOf(value))+"");
                    }

                    ///gram
                    if (position1==1 && position2==0)
                    {
                        ed2.setText(WeightConverter.Gram_toKilogram(Double.valueOf(value))+"");
                    }
                    if (position1==1 && position2==1)
                    {
                        ed2.setText(WeightConverter.Gram_toGram(Double.valueOf(value))+"");
                    }
                    if (position1==1 && position2==2)
                    {
                        ed2.setText(WeightConverter.Gram_toMilligram(Double.valueOf(value))+"");
                    }
                    if (position1==1 && position2==3)
                    {
                        ed2.setText(WeightConverter.Gram_toMicroGram(Double.valueOf(value))+"");
                    }
                    if (position1==1 && position2==4)
                    {
                        ed2.setText(WeightConverter.Gram_toQuinTal(Double.valueOf(value))+"");
                    }
                    if (position1==1 && position2==5)
                    {
                        ed2.setText(WeightConverter.Gram_toTonne(Double.valueOf(value))+"");
                    }
                    if (position1==1 && position2==6)
                    {
                        ed2.setText(WeightConverter.Gram_toPound(Double.valueOf(value))+"");
                    }
                    if (position1==1 && position2==7)
                    {
                        ed2.setText(WeightConverter.Gram_toOunce(Double.valueOf(value))+"");
                    }

                    ///milligram
                    if (position1==2 && position2==0)
                    {
                        ed2.setText(WeightConverter.Milligram_toKilogram(Double.valueOf(value))+"");
                    }
                    if (position1==2 && position2==1)
                    {
                        ed2.setText(WeightConverter.Milligram_toGram(Double.valueOf(value))+"");
                    }
                    if (position1==2 && position2==2)
                    {
                        ed2.setText(WeightConverter.Milligram_toMilligram(Double.valueOf(value))+"");
                    }
                    if (position1==2 && position2==3)
                    {
                        ed2.setText(WeightConverter.Milligram_toMicroGram(Double.valueOf(value))+"");
                    }
                    if (position1==2 && position2==4)
                    {
                        ed2.setText(WeightConverter.Milligram_toQuinTal(Double.valueOf(value))+"");
                    }
                    if (position1==2 && position2==5)
                    {
                        ed2.setText(WeightConverter.Milligram_toTonne(Double.valueOf(value))+"");
                    }
                    if (position1==2 && position2==6)
                    {
                        ed2.setText(WeightConverter.Milligram_toPound(Double.valueOf(value))+"");
                    }
                    if (position1==2 && position2==7)
                    {
                        ed2.setText(WeightConverter.Milligram_toOunce(Double.valueOf(value))+"");
                    }


                    ///microGram
                    if (position1==3 && position2==0)
                    {
                        ed2.setText(WeightConverter.MicroGram_toKilogram(Double.valueOf(value))+"");
                    }
                    if (position1==3 && position2==1)
                    {
                        ed2.setText(WeightConverter.MicroGram_toGram(Double.valueOf(value))+"");
                    }
                    if (position1==3 && position2==2)
                    {
                        ed2.setText(WeightConverter.MicroGram_toMilligram(Double.valueOf(value))+"");
                    }
                    if (position1==3 && position2==3)
                    {
                        ed2.setText(WeightConverter.MicroGram_toMicroGram(Double.valueOf(value))+"");
                    }
                    if (position1==3 && position2==4)
                    {
                        ed2.setText(WeightConverter.MicroGram_toQuinTal(Double.valueOf(value))+"");
                    }
                    if (position1==3 && position2==5)
                    {
                        ed2.setText(WeightConverter.MicroGram_toTonne(Double.valueOf(value))+"");
                    }
                    if (position1==3 && position2==6)
                    {
                        ed2.setText(WeightConverter.MicroGram_toPound(Double.valueOf(value))+"");
                    }
                    if (position1==3 && position2==7)
                    {
                        ed2.setText(WeightConverter.MicroGram_toOunce(Double.valueOf(value))+"");
                    }


                    ///quintal
                    if (position1==4 && position2==0)
                    {
                        ed2.setText(WeightConverter.QuinTal_toKilogram(Double.valueOf(value))+"");
                    }
                    if (position1==4 && position2==1)
                    {
                        ed2.setText(WeightConverter.QuinTal_toGram(Double.valueOf(value))+"");
                    }
                    if (position1==4 && position2==2)
                    {
                        ed2.setText(WeightConverter.QuinTal_toMilligram(Double.valueOf(value))+"");
                    }
                    if (position1==4 && position2==3)
                    {
                        ed2.setText(WeightConverter.QuinTal_toMicroGram(Double.valueOf(value))+"");
                    }
                    if (position1==4 && position2==4)
                    {
                        ed2.setText(WeightConverter.QuinTal_toQuinTal(Double.valueOf(value))+"");
                    }
                    if (position1==4 && position2==5)
                    {
                        ed2.setText(WeightConverter.QuinTal_toTonne(Double.valueOf(value))+"");
                    }
                    if (position1==4 && position2==6)
                    {
                        ed2.setText(WeightConverter.QuinTal_toPound(Double.valueOf(value))+"");
                    }
                    if (position1==4 && position2==7)
                    {
                        ed2.setText(WeightConverter.QuinTal_toOunce(Double.valueOf(value))+"");
                    }


                    ///tonne
                    if (position1==5 && position2==0)
                    {
                        ed2.setText(WeightConverter.Tonne_toKilogram(Double.valueOf(value))+"");
                    }
                    if (position1==5 && position2==1)
                    {
                        ed2.setText(WeightConverter.Tonne_toGram(Double.valueOf(value))+"");
                    }
                    if (position1==5 && position2==2)
                    {
                        ed2.setText(WeightConverter.Tonne_toMilligram(Double.valueOf(value))+"");
                    }
                    if (position1==5 && position2==3)
                    {
                        ed2.setText(WeightConverter.Tonne_toMicroGram(Double.valueOf(value))+"");
                    }
                    if (position1==5 && position2==4)
                    {
                        ed2.setText(WeightConverter.Tonne_toQuinTal(Double.valueOf(value))+"");
                    }
                    if (position1==5 && position2==5)
                    {
                        ed2.setText(WeightConverter.Tonne_toTonne(Double.valueOf(value))+"");
                    }
                    if (position1==5 && position2==6)
                    {
                        ed2.setText(WeightConverter.Tonne_toPound(Double.valueOf(value))+"");
                    }
                    if (position1==5 && position2==7)
                    {
                        ed2.setText(WeightConverter.Tonne_toOunce(Double.valueOf(value))+"");
                    }


                    ///pound
                    if (position1==6 && position2==0)
                    {
                        ed2.setText(WeightConverter.Pound_toKilogram(Double.valueOf(value))+"");
                    }
                    if (position1==6 && position2==1)
                    {
                        ed2.setText(WeightConverter.Pound_toGram(Double.valueOf(value))+"");
                    }
                    if (position1==6 && position2==2)
                    {
                        ed2.setText(WeightConverter.Pound_toMilligram(Double.valueOf(value))+"");
                    }
                    if (position1==6 && position2==3)
                    {
                        ed2.setText(WeightConverter.Pound_toMicroGram(Double.valueOf(value))+"");
                    }
                    if (position1==6 && position2==4)
                    {
                        ed2.setText(WeightConverter.Pound_toQuinTal(Double.valueOf(value))+"");
                    }
                    if (position1==6 && position2==5)
                    {
                        ed2.setText(WeightConverter.Pound_toTonne(Double.valueOf(value))+"");
                    }
                    if (position1==6 && position2==6)
                    {
                        ed2.setText(WeightConverter.Pound_toPound(Double.valueOf(value))+"");
                    }
                    if (position1==6 && position2==7)
                    {
                        ed2.setText(WeightConverter.Pound_toOunce(Double.valueOf(value))+"");
                    }


                    ///ounce
                    if (position1==7 && position2==0)
                    {
                        ed2.setText(WeightConverter.Ounce_toKilogram(Double.valueOf(value))+"");
                    }
                    if (position1==7 && position2==1)
                    {
                        ed2.setText(WeightConverter.Ounce_toGram(Double.valueOf(value))+"");
                    }
                    if (position1==7 && position2==2)
                    {
                        ed2.setText(WeightConverter.Ounce_toMilligram(Double.valueOf(value))+"");
                    }
                    if (position1==7 && position2==3)
                    {
                        ed2.setText(WeightConverter.Ounce_toMicroGram(Double.valueOf(value))+"");
                    }
                    if (position1==7 && position2==4)
                    {
                        ed2.setText(WeightConverter.Ounce_toQuiTal(Double.valueOf(value))+"");
                    }
                    if (position1==7 && position2==5)

                    {
                        ed2.setText(WeightConverter.Ounce_toTonne(Double.valueOf(value))+"");
                    }
                    if (position1==7 && position2==6)
                    {
                        ed2.setText(WeightConverter.Ounce_toPound(Double.valueOf(value))+"");
                    }
                    if (position1==7 && position2==7)

                    {
                        ed2.setText(WeightConverter.Ounce_toOunce(Double.valueOf(value))+"");

                    }

                }

                catch (Exception e)
                {


                }

            }
        });


        return  view;
    }
}