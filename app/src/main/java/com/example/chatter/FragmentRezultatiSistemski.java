package com.example.chatter;



import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import org.w3c.dom.Text;

public class FragmentRezultatiSistemski extends Fragment {

    private Integer points;
    public Integer otcena;

    public FragmentRezultatiSistemski(Integer points) {
        super();
        this.points = points;
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_sistemski_rezultati, container, false);
        TextView textView1 = view.findViewById(R.id.sistemski_poeni);
        textView1.setText(String.format("Вие добивте %d поени" ,points));

        if (points < 15){
            otcena = 5;
        }

        if (points == 15) {
            otcena = 6;
        }

        if (points == 20){
            otcena = 7;
        }
        if (points == 25){
            otcena = 8;
        }

        TextView textView2 = view.findViewById(R.id.sistemski_otcena);
        textView2.setText(String.format("Вие добивте отцена %d",otcena));
        return view;

    }

}


