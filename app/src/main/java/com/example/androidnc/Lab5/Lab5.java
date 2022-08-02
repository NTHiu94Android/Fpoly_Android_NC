package com.example.androidnc.Lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.androidnc.R;

public class Lab5 extends AppCompatActivity {
    String [] ten_loai={"thể thao","thoi trang","am thuc", "giao duc"};

    String [] rss_loai={
            "https://cdn.24h.com.vn/upload/rss/bongda.rss",
            "https://cdn.24h.com.vn/upload/rss/thoitrang.rss",
            "https://cdn.24h.com.vn/upload/rss/amthuc.rss",
            "https://vnexpress.net/rss/giao-duc.rss"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab5);
        ListView lv = findViewById(R.id.lvLab5);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,ten_loai);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                // TODO Auto-generated method stub
                //arg2 chính là vị trí (index) được nhấn
                Intent intent=new Intent(getApplicationContext(),tintheoloai.class);
                intent.putExtra("diachi_rss", rss_loai[arg2]);
                startActivity(intent);
            }
        });

    }
}