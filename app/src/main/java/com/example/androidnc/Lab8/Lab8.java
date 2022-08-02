package com.example.androidnc.Lab8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.androidnc.Lab7.Lab7Bai1;
import com.example.androidnc.Lab7.Lab7Bai2;
import com.example.androidnc.R;

public class Lab8 extends AppCompatActivity {
    private Button btnBai1, btnBai2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab8);
        btnBai1 = findViewById(R.id.btnLab8Bai1);
        btnBai2 = findViewById(R.id.btnLab8Bai2);

        btnBai1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Lab8Bai1.class);
                startActivity(intent);
            }
        });
        btnBai2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Lab8Bai2.class);
                startActivity(intent);
            }
        });

    }
}