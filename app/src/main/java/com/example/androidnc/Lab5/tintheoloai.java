package com.example.androidnc.Lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.androidnc.R;

public class tintheoloai extends AppCompatActivity {

    private String diachi_rss;
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tintheoloai);
        lv = findViewById(R.id.lvTinTheoLoai);

        diachi_rss=getIntent().getExtras().getString("diachi_rss");
        MyAsyncTask gandulieu = new MyAsyncTask(tintheoloai.this,diachi_rss);
        gandulieu.execute();

    }

}