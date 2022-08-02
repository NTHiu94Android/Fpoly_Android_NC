package com.example.androidnc.Lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.androidnc.R;

public class Lab1Bai1_2 extends AppCompatActivity {
    Button btnStartService, btnStopService;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab1_bai12);
        btnStartService = findViewById(R.id.btnLab1StartService);
        btnStopService = findViewById(R.id.btnLab1StopService);
        intent = new Intent(getApplicationContext(), ServiceLab1Bai1.class);

        btnStartService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onStartService();
            }
        });
        btnStopService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onStopService();
            }
        });
    }

    private void onStopService() {
        stopService(intent);
    }

    private void onStartService() {
        Bundle bundle = new Bundle();
        bundle.putString("mssv", "PS19597");
        bundle.putString("hoten", "Nguyen Trong Hieu");
        bundle.putString("lop", "CP17201");
        intent.putExtras(bundle);
        startService(intent);
    }
}