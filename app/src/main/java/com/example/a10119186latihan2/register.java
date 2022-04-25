package com.example.a10119186latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.a10119186latihan2.MainActivity;
import com.example.a10119186latihan2.verify;

public class register extends AppCompatActivity {
    //Rika Nur'adila IF5 10119186, 25 April 2022//
    private RadioGroup genderGroup;
    private RadioButton gender;
    private Spinner blood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        blood = (Spinner) findViewById(R.id.blood_type);
    }

    public void onClick(View v){
        int selectedId = genderGroup.getCheckedRadioButtonId();

        gender = (RadioButton) findViewById(selectedId);
    }

    public void listBlood(View view){
        Toast.makeText(register.this,"Selected"+blood.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
    }


    public void back(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void register(View v){
        Intent intent = new Intent(this, verify.class);
        startActivity(intent);
    }
}