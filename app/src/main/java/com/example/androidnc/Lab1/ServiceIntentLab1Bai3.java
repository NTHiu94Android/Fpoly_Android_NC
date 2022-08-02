package com.example.androidnc.Lab1;

import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class ServiceIntentLab1Bai3 extends IntentService {
    String str = "";
    public ServiceIntentLab1Bai3() {
        super("ServiceIntentLab1Bai3");
    }

    @Override
    public void onStart(@Nullable Intent intent, int startId) {
        super.onStart(intent, startId);
        Bundle bundle = intent.getExtras();
        String chuoi1 = bundle.getString("chuoi1");
        char chuoi2 = bundle.getChar("chuoi2");
        int count = 0;
        char[] arr = chuoi1.toCharArray();
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == chuoi2){
                count++;
            }
        }
        str = "Số lượng ký tự "+chuoi2+" là: "+count;
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.e("onHandleIntent_service", str);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "Service đã dừng", Toast.LENGTH_SHORT).show();
    }
}
