package com.example.androidnc.Lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;

import com.example.androidnc.R;

public class Lab4Bai2 extends AppCompatActivity {

    private BroadcastReceiverLab4Bai2 receiverLab4Bai2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab4_bai2);
        receiverLab4Bai2 = new BroadcastReceiverLab4Bai2();
    }

    @Override
    protected void onStart() {
        super.onStart();
        IntentFilter filter = new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
        registerReceiver(receiverLab4Bai2, filter);
    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(receiverLab4Bai2);
    }
}