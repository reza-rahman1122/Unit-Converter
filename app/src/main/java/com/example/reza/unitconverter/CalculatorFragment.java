package com.example.reza.unitconverter;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;


public class CalculatorFragment extends Fragment {

    TextView tv1, tv2;
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, button_add, button_sub, button_mul, button_div, button_dot, button_clear, button_convert, button_equal, button_mod, button_left_bracket, button_right_bracket;
    ImageButton button_back;
    boolean add, sub, mul, div, dot, mod, right_br, left_br;
    String value = "";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_calculator, container, false);

        tv1 = view.findViewById(R.id.text1);
        tv2 = view.findViewById(R.id.text2);
        button0 = view.findViewById(R.id.btn_zero);
        button1 = view.findViewById(R.id.btn_one);
        button2 = view.findViewById(R.id.btn_two);
        button3 = view.findViewById(R.id.btn_three);
        button4 = view.findViewById(R.id.btn_four);
        button5 = view.findViewById(R.id.btn_five);
        button6 = view.findViewById(R.id.btn_six);
        button7 = view.findViewById(R.id.btn_seven);
        button8 = view.findViewById(R.id.btn_eight);
        button9 = view.findViewById(R.id.btn_nine);
        button_dot = view.findViewById(R.id.btn_dot);
        button_add = view.findViewById(R.id.btn_add);
        button_sub = view.findViewById(R.id.btn_sub);
        button_mul = view.findViewById(R.id.btn_mul);
        button_div = view.findViewById(R.id.btn_div);
        button_left_bracket = view.findViewById(R.id.btn_left_br);
        button_right_bracket = view.findViewById(R.id.btn_right_br);
        button_mod = view.findViewById(R.id.btn_modulus);
        button_clear = view.findViewById(R.id.btn_clear);
        button_back = view.findViewById(R.id.btn_back);
        button_equal = view.findViewById(R.id.btn_equal);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tv1.setText(value + "0");
                value += "0";
                check();
            }

        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(value + "1");
                value += "1";
                check();

            }

        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(value + "2");
                value += "2";
                check();

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(value + "3");
                value += "3";
                check();

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(value + "4");
                value += "4";
                check();

            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(value + "5");
                value += "5";
                check();

            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(value + "6");
                value += "6";
                check();

            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(value + "7");
                value += "7";
                check();

            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(value + "8");
                value += "8";
                check();

            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(value + "9");
                value += "9";
                check();

            }
        });


        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (add == false) {
                    tv1.setText(value + "+");
                    value += "+";
                    add = true;
                }

            }

        });

        button_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (sub == false) {
                    tv1.setText(value + "-");
                    value += "-";
                    sub = true;

                }
            }
        });

        button_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mul == false) {
                    tv1.setText(value + "×");
                    value += "×";
                    mul = true;
                }
            }
        });

        button_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (div == false) {
                    tv1.setText(value + "÷");
                    value += "÷";
                    div = true;
                }
            }
        });

        button_left_bracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (left_br == false) {
                    tv1.setText(value + "(");
                    value += "(";
                    left_br = true;
                }
            }
        });
        button_right_bracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (right_br == false) {
                    tv1.setText(value + ")");
                    value += ")";
                    right_br = true;
                }
            }

        });


        button_mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mod == false) {

                    tv1.setText(value + "%");
                    value += "%";
                    mod = true;
                }
            }
        });

        button_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (dot == false) {
                    tv1.setText(value + ".");
                    value += ".";
                    dot = true;
                }

            }
        });

        button_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    RhinoEngine evaluateEngine = new RhinoEngine();
                    value = value.replaceAll("×", "*");
                    value = value.replaceAll("÷", "/");
                    value = value.replaceAll("%", "/100");
                    Double answer = evaluateEngine.evaluate(value);
                    tv2.setText(answer.toString());

                    value = "";

                } catch (Exception e) {


                }

            }
        });


        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (value.length() > 0) {
                    value = value.substring(0, value.length() - 1);
                    tv1.setText(value);
                }

            }
        });


        button_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = "";
                tv1.setText("");
                tv2.setText("");

            }

        });








        return view;
    }
    public void check() {

        add = false;
        sub = false;
        mul = false;
        div = false;
        dot = false;
        mod = false;
        left_br = false;
        right_br = false;
    }
}