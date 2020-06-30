package com.example.chatter;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class SistemskiTestActivity extends AppCompatActivity {

    private Integer poeni = 0;

    @SuppressLint("DefaultLocale")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sistemski_test);

        Fragment newFragment = new FragmentSistemski1(poeni);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        transaction.replace(R.id.fragment_placeholder, newFragment);
        transaction.addToBackStack(null);
        transaction.commit();
//
//
    }
}