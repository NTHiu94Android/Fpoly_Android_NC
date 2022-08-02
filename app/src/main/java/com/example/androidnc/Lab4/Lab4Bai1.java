package com.example.androidnc.Lab4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.androidnc.R;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnSuccessListener;

public class Lab4Bai1 extends AppCompatActivity {

    private TextView tv;
    private Button button;
    private FusedLocationProviderClient fused;
    private Location mlocation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab4_bai1);
        tv = findViewById(R.id.tvLocation);
        button = findViewById(R.id.btnLocation);
        fused = LocationServices.getFusedLocationProviderClient(getApplicationContext());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getLocation();
            }
        });
    }

    private void getLocation() {
        String permission = Manifest.permission.ACCESS_FINE_LOCATION;
        if(ContextCompat.checkSelfPermission(getApplicationContext(), permission) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this, new String[]{permission}, 999);
        }else {
            fused.getLastLocation().addOnSuccessListener(new OnSuccessListener<Location>() {
                @Override
                public void onSuccess(Location location) {
                    if(location != null){
                        mlocation = location;
                        double kinhdo = mlocation.getLatitude();
                        double vido = mlocation.getLongitude();
                        double matnuocbien = mlocation.getAltitude();
                        tv.setText("Latitude: "+kinhdo+"\nLongtitude: "+vido+"\nAltitude: "+matnuocbien);
                    }else {
                        tv.setText("Ko co vi tri");
                    }
                }
            });
        }
    }
}