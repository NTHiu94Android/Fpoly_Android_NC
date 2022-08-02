package com.example.androidnc.Lab3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.androidnc.R;

public class Lab3Bai2 extends AppCompatActivity {
    private Fragment fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3_bai2);
        Button btnLab3Bai2Messenger = findViewById(R.id.btnLab3Bai2Messenger);
        Button btnLab3Bai2Media = findViewById(R.id.btnLab3Bai2Media);

        btnLab3Bai2Messenger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragment = new SMSFragment();
                getFragmentLayout(fragment);
            }
        });
        btnLab3Bai2Media.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragment = new PhotoFragment();
                getFragmentLayout(fragment);
            }
        });
    }

    private void getFragmentLayout(Fragment fragment) {
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.contenLayoutLab3Bai2, fragment).commit();
    }
}