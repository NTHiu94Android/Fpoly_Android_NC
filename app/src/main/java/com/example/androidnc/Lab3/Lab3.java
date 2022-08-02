package com.example.androidnc.Lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.androidnc.R;

public class Lab3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3);
        Button bai1 = findViewById(R.id.btnLab3Bai1);
        Button bai2 = findViewById(R.id.btnLab3Bai2);

        bai1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Lab3Bai1.class);
                startActivity(intent);
            }
        });
        bai2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Lab3Bai2.class);
                startActivity(intent);
            }
        });
    }
}