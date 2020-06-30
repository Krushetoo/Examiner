package com.example.chatter;



import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class FragmentSistemski5 extends Fragment {

    private Integer points;


    public FragmentSistemski5(Integer points){
        super();
        this.points = points;

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_sistemski5, container, false);

        final RadioGroup group = view.findViewById(R.id.radioGroup5);
        Button button = view.findViewById(R.id.dugmeNext5);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentAnswerId = group.getCheckedRadioButtonId();

                if (currentAnswerId == R.id.win2) {
                    points += 5;
                }

                Fragment newFragment = new FragmentRezultatiSistemski(points);
                FragmentTransaction transaction = getFragmentManager().beginTransaction();

                transaction.replace(R.id.fragment_placeholder, newFragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        return view;
    }
}

