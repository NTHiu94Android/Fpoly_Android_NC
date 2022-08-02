package com.example.androidnc.Lab7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.androidnc.Lab2.Lab2Bai1;
import com.example.androidnc.Lab2.Lab2Bai2;
import com.example.androidnc.Lab2.Lab2Bai3;
import com.example.androidnc.R;

public class Lab7 extends AppCompatActivity {
    private Button btnBai1, btnBai2, btnBai3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab7);
        btnBai1 = findViewById(R.id.btnLab7Bai1);
        btnBai2 = findViewById(R.id.btnLab7Bai2);
        btnBai3 = findViewById(R.id.btnLab7Bai3);

        btnBai1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Lab7Bai1.class);
                startActivity(intent);
            }
        });
        btnBai2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Lab7Bai2.class);
                startActivity(intent);
            }
        });
        btnBai3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Lab7Bai3.class);
                startActivity(intent);
            }
        });
    }
}