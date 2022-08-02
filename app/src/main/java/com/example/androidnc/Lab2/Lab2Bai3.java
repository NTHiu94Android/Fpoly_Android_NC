package com.example.androidnc.Lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.androidnc.R;

import java.lang.reflect.Array;

public class Lab2Bai3 extends AppCompatActivity {
    private EditText edtMaKM;
    private Button btnKiemTra;
    private String[] arr = {"MEM111111", "MEM222222", "VIP333333", "VIP555555"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab2_bai3);
        edtMaKM = findViewById(R.id.edtSendBRLab2Bai3);
        btnKiemTra = findViewById(R.id.btnSendBRLab2Bai3);

        btnKiemTra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Lab2Bai3BroadcastReceiver.class);
                String str = edtMaKM.getText().toString().trim();
                String kq = "";
                if(str.length() != 9){
                    kq = "Ma khuyen mai phai co 9 ky tu";
                    intent.putExtra("data", kq);
                    sendBroadcast(intent);
                    //Toast.makeText(getApplicationContext(), "Ma khuyen mai phai co 9 ky tu", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(str.substring(0, 3).equals("MEM") || str.substring(0, 3).equals("VIP")){
                    if(str.equals(arr[0])){
                        kq = "Khuyen mai 10%";
                        //Toast.makeText(getApplicationContext(), "Khuyen mai 10%", Toast.LENGTH_SHORT).show();
                    }else if(str.equals(arr[1])){
                        kq = "Khuyen mai 20%";
                        //Toast.makeText(getApplicationContext(), "Khuyen mai 10%", Toast.LENGTH_SHORT).show();
                    }else if(str.equals(arr[2])){
                        kq = "Khuyen mai 30%";
                        //Toast.makeText(getApplicationContext(), "Khuyen mai 10%", Toast.LENGTH_SHORT).show();
                    }else if(str.equals(arr[3])){
                        kq = "Khuyen mai 50%";
                        //Toast.makeText(getApplicationContext(), "Khuyen mai 10%", Toast.LENGTH_SHORT).show();
                    }else {
                        kq = "Ma khuyen mai khong dung";
                        //Toast.makeText(getApplicationContext(), "Ma khuyen mai khong dung", Toast.LENGTH_SHORT).show();
                    }
                }else {
                    kq = "Ma khuyen mai bat dau la MEM hoac VIP";
                }
                intent.putExtra("data", kq);
                sendBroadcast(intent);
            }
        });
    }
}