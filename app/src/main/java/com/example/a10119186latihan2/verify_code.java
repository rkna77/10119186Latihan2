package com.example.a10119186latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class verify_code extends AppCompatActivity {
    //Rika Nur'adila IF5 10119186, 25 April 2022//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activty_verify);
    }

    public void send (View view) {
        Intent intent = new Intent(this, profile.class);
        startActivity(intent);
    }

}