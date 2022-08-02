package com.example.androidnc.Lab2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class Lab2Bai1BroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context.getApplicationContext(), "BroadcastReceiver dang chay", Toast.LENGTH_SHORT).show();
    }
}
