package com.example.reza.unitconverter;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;


public class FeedbackFragment extends Fragment {
    TextInputLayout textInputLayout;
    TextInputEditText textInputEditText;
    Button button;
    String text;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_feedback, container, false);

        textInputLayout=view.findViewById(R.id.id_feedback_text);
        textInputEditText=view.findViewById(R.id.id_feedback_edit_text);
        button=view.findViewById(R.id.id_button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = textInputEditText.getText().toString();
                if (text.isEmpty())
                {
                    View new_view=LayoutInflater.from(getContext()).inflate(R.layout.toast_activity,(ViewGroup)v.findViewById(R.id.id_toast1),false);
                    Toast t=new Toast(getContext());
                    t.setView(new_view);
                    t.show();
                }
                else
                {
                    if (isConnected())
                    {
                        sendFeedback();
                    }
                    else {
                        View n_view=LayoutInflater.from(getContext()).inflate(R.layout.activity_toast,(ViewGroup)v.findViewById(R.id.id_toast),false);
                        Toast toast=new Toast(getContext());
                        toast.setView(n_view);
                        toast.show();
                    }
                }
            }
        });

        return view;
    }
    private void sendFeedback() {
        final Intent _Intent = new Intent(android.content.Intent.ACTION_SEND);
        _Intent.setType("text/html");
        _Intent.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{ getString(R.string.mail_feedback_email) });
        _Intent.putExtra(android.content.Intent.EXTRA_SUBJECT, getString(R.string.mail_feedback_subject));
        _Intent.putExtra(android.content.Intent.EXTRA_TEXT, text);
        startActivity(Intent.createChooser(_Intent,getString(R.string.title_send_feedback)));
    }

    public boolean isConnected()
    {
        boolean connected =false;
        try {
            ConnectivityManager cm = (ConnectivityManager)getContext().getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo nInfo = cm.getActiveNetworkInfo();
            connected = nInfo != null && nInfo.isAvailable() && nInfo.isConnected();
            return connected;
        } catch (Exception e) {
            Log.e("Connectivity Exception", e.getMessage());
        }
        return connected;
    }
}