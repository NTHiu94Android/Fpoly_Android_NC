package com.example.androidnc.Lab4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

public class BroadcastReceiverLab4Bai2 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        if (activeNetwork != null) {
            // connected to the internet
            switch (activeNetwork.getType()) {
                case ConnectivityManager.TYPE_WIFI:
                    Toast.makeText(context.getApplicationContext(), "Da ket noi wifi", Toast.LENGTH_SHORT).show();
                    break;
                case ConnectivityManager.TYPE_MOBILE:
                    Toast.makeText(context.getApplicationContext(), "Da ket noi 4G", Toast.LENGTH_SHORT).show();
                    break;
            }
        } else {
            Toast.makeText(context.getApplicationContext(), "Da ngat ket noi internet", Toast.LENGTH_SHORT).show();
        }
    }
}
