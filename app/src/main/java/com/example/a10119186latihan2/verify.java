package com.example.a10119186latihan2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class verify extends AppCompatActivity {
    //Rika Nur'adila IF5 10119186, 25 April 2022//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost);
    }

    public void verifyCode (View view) {
        Intent intent = new Intent(this, verify_code.class);
        startActivity(intent);
    }
}