package com.example.reza.unitconverter;

import android.os.Bundle;

import androidx.appcompat.widget.AppCompatSpinner;
import androidx.fragment.app.Fragment;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class LengthFragment extends Fragment {

    private EditText ed1,ed2;
    private Spinner spinner1,spinner2;
    private String value;
    private Button btn_length;
    private String[] str1={"Feet","Meter ","Mile","Yard","KM","CM","MM"};
    private String[] str2={"Feet","Meter","Mile","Yard","KM","CM","MM"};
    private int position1=0,position2=0;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_length, container, false);

        ed1=view.findViewById(R.id.id_edit1);
        ed2=view.findViewById(R.id.id_edit2);
        spinner1=view.findViewById(R.id.id_sp1);
        spinner2=view.findViewById(R.id.id_sp2);
        btn_length=view.findViewById(R.id.id_convert_length);



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
               else
                {
                    position1=6;
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
                else
                {
                    position2=6;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        btn_length.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               try {
                   value=ed1.getText().toString();


                   ///feet
                   if (position1==0 && position2==0)
                   {
                       ed2.setText(LengthConversion.feetToFeet(Double.valueOf(value))+"");
                   }
                   if (position1==0 && position2==1)
                   {
                       ed2.setText(LengthConversion.feetToMeters(Double.valueOf(value))+"");
                   }
                   if (position1==0 && position2==2)
                   {
                       ed2.setText(LengthConversion.feetToMiles(Double.valueOf(value))+"");
                   }
                   if (position1==0 && position2==3)
                   {
                       ed2.setText(LengthConversion.feetToYards(Double.valueOf(value))+"");
                   }


                   if (position1==0 && position2==4)
                   {
                       ed2.setText(LengthConversion.feetToKM(Double.valueOf(value))+"");
                   }
                   if (position1==0 && position2==5)
                   {
                       ed2.setText(LengthConversion.feetToCM(Double.valueOf(value))+"");
                   }
                   if (position1==0 && position2==6)
                   {
                       ed2.setText(LengthConversion.feetToMM(Double.valueOf(value))+"");
                   }

                   ///meter
                   if (position1==1 && position2==0)
                   {
                       ed2.setText(LengthConversion.metersToFeet(Double.valueOf(value))+"");
                   }
                   if (position1==1 && position2==1)
                   {
                       ed2.setText(LengthConversion.metersToMeters(Double.valueOf(value))+"");
                   }
                   if (position1==1 && position2==2)
                   {
                       ed2.setText(LengthConversion.metersToMiles(Double.valueOf(value))+"");
                   }
                   if (position1==1 && position2==3)
                   {
                       ed2.setText(LengthConversion.metersToYards(Double.valueOf(value))+"");
                   }


                   if (position1==1 && position2==4)

                   {
                       ed2.setText(LengthConversion.metersToKM(Double.valueOf(value))+"");
                   }
                   if (position1==1 && position2==5)
                   {
                       ed2.setText(LengthConversion.metersToCM(Double.valueOf(value))+"");
                   }
                   if (position1==1 && position2==6)
                   {
                       ed2.setText(LengthConversion.metersToMM(Double.valueOf(value))+"");
                   }




                   ///miles
                   if (position1==2 && position2==0)
                   {
                       ed2.setText(LengthConversion.milesToFeet(Double.valueOf(value))+"");
                   }
                   if (position1==2 && position2==1)
                   {
                       ed2.setText(LengthConversion.milesToMeters(Double.valueOf(value))+"");
                   }
                   if (position1==2 && position2==2)
                   {
                       ed2.setText(LengthConversion.milesToMiles(Double.valueOf(value))+"");
                   }
                   if (position1==2 && position2==3)
                   {
                       ed2.setText(LengthConversion.milesToYards(Double.valueOf(value))+"");
                   }


                   if (position1==2 && position2==4)
                   {
                       ed2.setText(LengthConversion.milesToKM(Double.valueOf(value))+"");
                   }
                   if (position1==2 && position2==5)
                   {
                       ed2.setText(LengthConversion.milesToCM(Double.valueOf(value))+"");
                   }
                   if (position1==2 && position2==6)
                   {
                       ed2.setText(LengthConversion.milesToMM(Double.valueOf(value))+"");
                   }




                   ///yard
                   if (position1==3 && position2==0)
                   {
                       ed2.setText(LengthConversion.yardsToFeet(Double.valueOf(value))+"");
                   }
                   if (position1==3 && position2==1)
                   {
                       ed2.setText(LengthConversion.yardsToMeters(Double.valueOf(value))+"");
                   }
                   if (position1==3 && position2==2)
                   {
                       ed2.setText(LengthConversion.yardsToMiles(Double.valueOf(value))+"");
                   }
                   if (position1==3 && position2==3)
                   {
                       ed2.setText(LengthConversion.yardsToYards(Double.valueOf(value))+"");
                   }

                   if (position1==3 && position2==4)
                   {
                       ed2.setText(LengthConversion.yardsToKM(Double.valueOf(value))+"");
                   }
                   if (position1==3 && position2==5)
                   {
                       ed2.setText(LengthConversion.yardsToCM(Double.valueOf(value))+"");
                   }
                   if (position1==3 && position2==6)
                   {
                       ed2.setText(LengthConversion.yardsToMM(Double.valueOf(value))+"");
                   }


                   ///km
                   if (position1==4 && position2==0)
                   {
                       ed2.setText(LengthConversion.kmToFeet(Double.valueOf(value))+"");
                   }
                   if (position1==4 && position2==1)
                   {
                       ed2.setText(LengthConversion.kmToMeters(Double.valueOf(value))+"");
                   }
                   if (position1==4 && position2==2)
                   {
                       ed2.setText(LengthConversion.kmToMiles(Double.valueOf(value))+"");
                   }
                   if (position1==4 && position2==3)
                   {
                       ed2.setText(LengthConversion.kmToYards(Double.valueOf(value))+"");
                   }

                   if (position1==4 && position2==4)
                   {
                       ed2.setText(LengthConversion.kmToKM(Double.valueOf(value))+"");
                   }
                   if (position1==4 && position2==5)
                   {
                       ed2.setText(LengthConversion.kmToCM(Double.valueOf(value))+"");
                   }
                   if (position1==4 && position2==6)
                   {
                       ed2.setText(LengthConversion.kmToMM(Double.valueOf(value))+"");
                   }



                   ///cm
                   if (position1==5 && position2==0)
                   {
                       ed2.setText(LengthConversion.cmToFeet(Double.valueOf(value))+"");
                   }
                   if (position1==5 && position2==1)
                   {
                       ed2.setText(LengthConversion.cmToMeters(Double.valueOf(value))+"");
                   }
                   if (position1==5 && position2==2)
                   {
                       ed2.setText(LengthConversion.cmToMiles(Double.valueOf(value))+"");
                   }
                   if (position1==5 && position2==3)
                   {
                       ed2.setText(LengthConversion.cmToYards(Double.valueOf(value))+"");
                   }

                   if (position1==5 && position2==4)
                   {
                       ed2.setText(LengthConversion.cmToKM(Double.valueOf(value))+"");
                   }
                   if (position1==5 && position2==5)
                   {
                       ed2.setText(LengthConversion.cmToCM(Double.valueOf(value))+"");
                   }
                   if (position1==5 && position2==6)
                   {
                       ed2.setText(LengthConversion.cmToMM(Double.valueOf(value))+"");
                   }


                   ///mm
                   if (position1==6 && position2==0)
                   {
                       ed2.setText(LengthConversion.mmToFeet(Double.valueOf(value))+"");
                   }
                   if (position1==6 && position2==1)
                   {
                       ed2.setText(LengthConversion.mmToMeters(Double.valueOf(value))+"");
                   }
                   if (position1==6 && position2==2)
                   {
                       ed2.setText(LengthConversion.mmToMiles(Double.valueOf(value))+"");
                   }
                   if (position1==6 && position2==3)
                   {
                       ed2.setText(LengthConversion.mmToYards(Double.valueOf(value))+"");
                   }

                   if (position1==6 && position2==4)
                   {
                       ed2.setText(LengthConversion.mmToKM(Double.valueOf(value))+"");
                   }
                   if (position1==6 && position2==5)
                   {
                       ed2.setText(LengthConversion.mmToCM(Double.valueOf(value))+"");
                   }
                   if (position1==6 && position2==6)
                   {
                       ed2.setText(LengthConversion.mmToMM(Double.valueOf(value))+"");
                   }


               }
               catch (Exception e)
               {


               }


            }
        });
        return view;
    }

    }