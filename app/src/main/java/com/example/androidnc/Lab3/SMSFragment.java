package com.example.androidnc.Lab3;

import android.Manifest;
import android.content.ContentResolver;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.androidnc.R;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class SMSFragment extends Fragment {
    private ListView lv;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sms, container, false);
        lv = view.findViewById(R.id.lvLab3Bai2SMS);
        getAllSMS();
        return view;
    }

    private void getAllSMS() {
        if(ContextCompat.checkSelfPermission(getActivity(), Manifest.permission.READ_SMS) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(getActivity(), new String[]{Manifest.permission.READ_SMS}, 999);
        }else {
            Uri uri = Uri.parse("content://sms");
            ArrayList<String> list = new ArrayList<>();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            ContentResolver resolver = getActivity().getContentResolver();
            Cursor cursor = resolver.query(uri, null, null, null, null);
            if(cursor.getCount() != 0){
                cursor.moveToFirst();
                do {
                    //Body sms
                    int bodyIndex = cursor.getColumnIndex("body");
                    String strBody = cursor.getString(bodyIndex);

                    //Time sms
                    int timeIndex = cursor.getColumnIndex("date");
                    String strTime = cursor.getString(timeIndex);

                    //Number phone
                    int numberIndex = cursor.getColumnIndex("address");
                    String strNumberPhone = cursor.getString(numberIndex);

                    list.add("Account: " + strNumberPhone + "\nTime: " + sdf.format(Long.parseLong(strTime)) + "\n" + strBody);
                }while (cursor.moveToNext());
                cursor.close();
            }
            ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, list);
            lv.setAdapter(adapter);
        }
    }
}