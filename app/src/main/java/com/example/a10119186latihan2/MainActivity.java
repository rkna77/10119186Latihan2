package com.example.a10119186latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    //Rika Nur'adila IF5 10119186, 25 April 2022//

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void register(View view) {
        Intent intent = new Intent(this, com.example.a10119186latihan2.register.class);
        startActivity(intent);
    }
}