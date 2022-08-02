package com.example.androidnc.Lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.androidnc.R;

public class Lab2 extends AppCompatActivity {
    private Button btnLab2Bai1, btnLab2Bai2, btnLab2Bai3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab2);
        btnLab2Bai1 = findViewById(R.id.btnLab2Bai1);
        btnLab2Bai2 = findViewById(R.id.btnLab2Bai2);
        btnLab2Bai3 = findViewById(R.id.btnLab2Bai3);

        btnLab2Bai1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Lab2Bai1.class);
                startActivity(intent);
            }
        });
        btnLab2Bai2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Lab2Bai2.class);
                startActivity(intent);
            }
        });
        btnLab2Bai3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Lab2Bai3.class);
                startActivity(intent);
            }
        });
    }
}