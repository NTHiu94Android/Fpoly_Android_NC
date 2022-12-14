package com.example.androidnc.Lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.androidnc.R;

public class Lab5_XemTin extends AppCompatActivity {
    WebView wv;
    String link;
    //ProgressDialog progressbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab5_xem_tin);
        wv = findViewById(R.id.webViewLab5);

        link=getIntent().getExtras().getString("link");
        //progressbar=ProgressDialog.show(this, "cho chut", "loading.....");
        wv.setWebViewClient(new WebViewClient(){
//            @Override
//            public void onPageFinished(WebView view, String url) {
//                // TODO Auto-generated method stub
//                super.onPageFinished(view, url);
//                if(progressbar.isShowing())
//                    progressbar.dismiss();
//            }
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                // TODO Auto-generated method stub
                wv.loadUrl(url);
                return super.shouldOverrideUrlLoading(view, url);
            }
        });
        wv.loadUrl(link);
    }
}