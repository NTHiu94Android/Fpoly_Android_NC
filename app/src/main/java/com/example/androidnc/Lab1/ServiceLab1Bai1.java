package com.example.androidnc.Lab1;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.IBinder;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.example.androidnc.R;

public class ServiceLab1Bai1 extends Service {
    MediaPlayer player;
    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(this, "Service đã được khởi tạo", Toast.LENGTH_SHORT).show();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        player = MediaPlayer.create(this, R.raw.takemetochurch_guitar);
        player.start();
        Bundle bundle = intent.getExtras();
        String mssv = bundle.getString("mssv");
        String hoten = bundle.getString("hoten");
        String lop = bundle.getString("lop");
        String str = "SV đã được thêm mới: \nMSSV: "+mssv+"\nHọ tên: "+hoten+"\nLớp: "+lop;
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
        return START_NOT_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        player.stop();
        Toast.makeText(this, "Service đã dừng", Toast.LENGTH_SHORT).show();
    }
}
