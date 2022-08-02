package com.example.androidnc.Lab2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class Lab2Bai3BroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String data = intent.getStringExtra("data");
        Toast.makeText(context.getApplicationContext(), "My BroadcastReceiver: "+data, Toast.LENGTH_SHORT).show();
    }
}
