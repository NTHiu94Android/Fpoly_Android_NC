package com.example.androidnc.Lab7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.androidnc.R;

public class Lab7Bai2 extends AppCompatActivity {
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab7_bai2);
        btn = findViewById(R.id.btnLab7Bai2Click);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Lab7Bai3.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_lab7, R.anim.out_lab7);
            }
        });
    }
}