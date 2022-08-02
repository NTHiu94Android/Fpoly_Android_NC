package com.example.androidnc.Lab5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.androidnc.R;

import java.util.ArrayList;

class TinTheoLoaiAdapter extends ArrayAdapter<Item> {

    Context context;
    ArrayList<Item> items;

    public TinTheoLoaiAdapter(Context context, int textViewResourceId, ArrayList<Item> objects) {
        super(context, textViewResourceId, objects);
        // TODO Auto-generated constructor stub
        this.context = context;
        this.items = objects;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        LayoutInflater inf = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowview = inf.inflate(R.layout.item_lab5_tintheoloai, parent, false);
        TextView tv_title = rowview.findViewById(R.id.tv_title_lab5);
        TextView tv_description = rowview.findViewById(R.id.tv_description_lab5);
        TextView tv_pubdate = rowview.findViewById(R.id.tv_pubdate_lab5);

        tv_title.setText(items.get(position).getTitle());
        tv_description.setText(items.get(position).getDescription());
        tv_pubdate.setText(items.get(position).getPubdate());

        return rowview;
    }
}

