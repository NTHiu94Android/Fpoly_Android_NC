package com.example.androidnc.Lab7;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.androidnc.R;

public class Lab7Bai3 extends AppCompatActivity {
    private ImageView imv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab7_bai3);
        imv = findViewById(R.id.imvLab7Bai3);
        imv.setBackgroundResource(R.drawable.anim_list);
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        AnimationDrawable a_drawable = (AnimationDrawable) imv.getBackground();
        if(hasFocus){
            a_drawable.start();
        }else {
            a_drawable.stop();
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.in_lab7, R.anim.out_lab7);
    }
}