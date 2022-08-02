package com.example.androidnc.Lab8;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.androidnc.R;

public class Lab8Bai2 extends AppCompatActivity {

    ImageView iv;
    Button btnClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab8_bai2);

        iv = findViewById(R.id.imvLab8Bai22);
        btnClick = findViewById(R.id.btnLab8Bai22);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pick = new Intent(Intent.ACTION_GET_CONTENT);
                pick.setType("image/*");
                Intent photo = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                Intent choser = Intent.createChooser(pick, "chon");
                choser.putExtra(Intent.EXTRA_INITIAL_INTENTS, new Intent[]{photo});
                startActivityForResult(choser, 999);

            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 999 && resultCode == RESULT_OK){
            if (data.getExtras() != null){
                Bundle extras = data.getExtras();
                Bitmap imageBitmap = (Bitmap) extras.get("data");
                iv.setImageBitmap(imageBitmap);
            }else {
                Uri uri = data.getData();
                iv.setImageURI(uri);
            }
        }
    }
}