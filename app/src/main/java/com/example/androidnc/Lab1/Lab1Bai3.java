package com.example.androidnc.Lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.androidnc.R;
import com.google.android.material.textfield.TextInputEditText;

public class Lab1Bai3 extends AppCompatActivity {
    private TextInputEditText edtChuoiNhap, edtChuoiTim;
    private Button btnTim;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab1_bai3);
        edtChuoiNhap = findViewById(R.id.edtChuoiNhapLab1);
        edtChuoiTim = findViewById(R.id.edtChuoiTimLab1);
        btnTim = findViewById(R.id.btnLab1Bai3Tim);

        intent = new Intent(Lab1Bai3.this, ServiceIntentLab1Bai3.class);

        btnTim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onStartIntentService();
            }
        });
    }

    private void onStartIntentService() {
        if(edtChuoiNhap.getText().toString().trim().equals("") || edtChuoiTim.getText().toString().trim().equals("")){
            Toast.makeText(this, "Chưa nhập dữ liệu", Toast.LENGTH_SHORT).show();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("chuoi1", edtChuoiNhap.getText().toString().trim());
        bundle.putChar("chuoi2", edtChuoiTim.getText().charAt(0));
        intent.putExtras(bundle);
        startService(intent);
    }
}