package com.example.azamali.m_parking;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by azam ali on 2/10/2016.
 */
public class Home extends Fragment {

ImageButton TwoWheeler,FourWheeler;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.home, container, false);
        TwoWheeler = (ImageButton)rootView.findViewById(R.id.imageButton4);
        FourWheeler = (ImageButton)rootView.findViewById(R.id.imageButton3);

        FourWheeler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"You clicked fourwheeler",Toast.LENGTH_LONG);
            }
        });

        TwoWheeler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"You clicked TwoWheeler",Toast.LENGTH_LONG);
            }
        });


        return rootView;


    }


}

