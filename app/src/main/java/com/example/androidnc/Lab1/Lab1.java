package com.example.androidnc.Lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.androidnc.R;

public class Lab1 extends AppCompatActivity {

    Button btnLab1Bai1_2, btnLab1Bai3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab1);
        btnLab1Bai1_2 = findViewById(R.id.btnLab1Bai1_2);
        btnLab1Bai3 = findViewById(R.id.btnLab1Bai3);

        btnLab1Bai1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Lab1.this, Lab1Bai1_2.class);
                startActivity(intent);
            }
        });
        btnLab1Bai3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Lab1.this, Lab1Bai3.class);
                startActivity(intent);
            }
        });
    }
}