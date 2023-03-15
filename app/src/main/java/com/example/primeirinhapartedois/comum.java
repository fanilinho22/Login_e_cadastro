package com.example.primeirinhapartedois;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class comum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comum);
        getSupportActionBar().hide();
    }
}