package com.example.androidnc.Lab7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import com.example.androidnc.R;

public class Lab7Bai1 extends AppCompatActivity {
    private Animation animation;
    private ImageView imv;
    private Button btn1, btn2, btn3, btn4, btn5, btn6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab7_bai1);
        imv = findViewById(R.id.imvLab7Bai1);
        btn1 = findViewById(R.id.btn1Lab7Bai1);
        btn2 = findViewById(R.id.btn2Lab7Bai1);
        btn3 = findViewById(R.id.btn3Lab7Bai1);
        btn4 = findViewById(R.id.btn4Lab7Bai1);
        btn5 = findViewById(R.id.btn5Lab7Bai1);
        btn6 = findViewById(R.id.btn6Lab7Bai1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha_lab7);
                imv.startAnimation(animation);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_lab7);
                imv.startAnimation(animation);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale_lab7);
                imv.startAnimation(animation);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.translate_lab7);
                imv.startAnimation(animation);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.all_anim_lab7);
                imv.startAnimation(animation);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Lab7Bai3.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_lab7, R.anim.out_lab7);
            }
        });
    }
}