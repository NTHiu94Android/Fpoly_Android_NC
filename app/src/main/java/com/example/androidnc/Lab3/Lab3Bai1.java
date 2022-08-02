package com.example.androidnc.Lab3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.ContentResolver;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.androidnc.R;

import java.util.ArrayList;

public class Lab3Bai1 extends AppCompatActivity {

    private ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3_bai1);
        Button btnShow = findViewById(R.id.btnLab3Bai1);
        lv = findViewById(R.id.lvLab3Bai1);

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showContacts();
            }
        });
    }
    private void showContacts(){
        String permission = Manifest.permission.READ_CONTACTS;
        if(ContextCompat.checkSelfPermission(getApplicationContext(), permission) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this, new String[]{permission}, 999);
        }else {
            Uri uri = ContactsContract.CommonDataKinds.Phone.CONTENT_URI;
            ArrayList<String> list = new ArrayList<>();
            ContentResolver resolver = getContentResolver();
            Cursor cursor = resolver.query(uri, null, null, null, null);
            if(cursor.getCount() != 0){
                cursor.moveToFirst();
                do {
                    //Number id
                    String idColumn = ContactsContract.CommonDataKinds.Phone._ID;
                    int idIndex = cursor.getColumnIndex(idColumn);
                    String strId = cursor.getString(idIndex);

                    //Name contacts
                    String nameColumn = ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME;
                    int nameIndex = cursor.getColumnIndex(nameColumn);
                    String strName = cursor.getString(nameIndex);

                    //Number phone
                    String numberColumn = ContactsContract.CommonDataKinds.Phone.NUMBER;
                    int numberIndex = cursor.getColumnIndex(numberColumn);
                    String strNumberPhone = cursor.getString(numberIndex);

                    list.add(strName + " - ID: " + strId + " \n" + strNumberPhone);
                }while (cursor.moveToNext());
                cursor.close();
            }
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
            lv.setAdapter(adapter);
        }
    }
}