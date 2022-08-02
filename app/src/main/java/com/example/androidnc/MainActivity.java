package com.example.androidnc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.androidnc.Lab1.Lab1;
import com.example.androidnc.Lab2.Lab2;
import com.example.androidnc.Lab3.Lab3;
import com.example.androidnc.Lab4.Lab4;
import com.example.androidnc.Lab5.Lab5;
import com.example.androidnc.Lab6.Lab6;
import com.example.androidnc.Lab7.Lab7;
import com.example.androidnc.Lab8.Lab8;

public class MainActivity extends AppCompatActivity {

    Button btnLab1, btnLab2, btnLab3, btnLab4, btnLab5, btnLab6, btnLab7, btnLab8, btnAsm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLab1 = findViewById(R.id.btnLab1);
        btnLab2 = findViewById(R.id.btnLab2);
        btnLab3 = findViewById(R.id.btnLab3);
        btnLab4 = findViewById(R.id.btnLab4);
        btnLab5 = findViewById(R.id.btnLab5);
        btnLab6 = findViewById(R.id.btnLab6);
        btnLab7 = findViewById(R.id.btnLab7);
        btnLab8 = findViewById(R.id.btnLab8);

        btnLab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Lab1.class);
                startActivity(intent);
            }
        });
        btnLab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Lab2.class);
                startActivity(intent);
            }
        });
        btnLab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Lab3.class);
                startActivity(intent);
            }
        });
        btnLab4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Lab4.class);
                startActivity(intent);
            }
        });
        btnLab5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Lab5.class);
                startActivity(intent);
            }
        });
        btnLab6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Lab6.class);
                startActivity(intent);
            }
        });
        btnLab7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Lab7.class);
                startActivity(intent);
            }
        });
        btnLab8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Lab8.class);
                startActivity(intent);
            }
        });
    }
}