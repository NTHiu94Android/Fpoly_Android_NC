package com.example.androidnc.Lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.androidnc.Lab3.Lab3Bai1;
import com.example.androidnc.Lab3.Lab3Bai2;
import com.example.androidnc.R;

public class Lab4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab4);
        Button bai1 = findViewById(R.id.btnLab4Bai1);
        Button bai2 = findViewById(R.id.btnLab4Bai2);

        bai1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Lab4Bai1.class);
                startActivity(intent);
            }
        });
        bai2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Lab4Bai2.class);
                startActivity(intent);
            }
        });
    }
}