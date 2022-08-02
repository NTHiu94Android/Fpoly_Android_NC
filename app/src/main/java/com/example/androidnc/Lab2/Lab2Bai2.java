package com.example.androidnc.Lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.androidnc.R;

public class Lab2Bai2 extends AppCompatActivity {
    private Button btnSendBR;
    private EditText edtSendBR;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab2_bai2);
        edtSendBR = findViewById(R.id.edtSendBRLab2Bai2);
        btnSendBR = findViewById(R.id.btnSendBRLab2Bai2);

        btnSendBR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Lab2Bai2BroadcastReceiver.class);
                String data = edtSendBR.getText().toString().trim();
                intent.putExtra("data", data);
                sendBroadcast(intent);
            }
        });
    }
}