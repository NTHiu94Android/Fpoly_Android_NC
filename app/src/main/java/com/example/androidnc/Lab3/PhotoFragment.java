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

import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.androidnc.R;

import java.util.ArrayList;

public class PhotoFragment extends Fragment {
    private ListView lv;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_photo, container, false);
        lv = view.findViewById(R.id.lvLab3Bai2Photo);

        getAllPhoto();
        return view;
    }

    private void getAllPhoto() {
        if(ContextCompat.checkSelfPermission(getActivity(), Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(getActivity(), new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 998);
        }else {
            String[] projections = {
                    MediaStore.Images.Media.DISPLAY_NAME
            };
            ArrayList<String> list = new ArrayList<>();
            Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            ContentResolver resolver = getActivity().getContentResolver();
            Cursor cursor = resolver.query(uri, projections, null, null, null);
            if(cursor.getCount() != 0){
                cursor.moveToFirst();
                do {
                    String str = cursor.getString(0);
                    list.add(str);
                }while (cursor.moveToNext());
                cursor.close();
            }
            ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, list);
            lv.setAdapter(adapter);
        }
    }
}