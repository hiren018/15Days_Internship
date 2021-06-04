package com.example.listviewapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter{

    Context context;
    int[] img;
    String name[];
    LayoutInflater layoutInflater;


    public MyAdapter(Context context, int[] img, String[] name) {
        this.context = context;
        this.img = img;
        this.name = name;

        layoutInflater = (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return img.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = layoutInflater.inflate(R.layout.testitem, null);

        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView);
        TextView textView = (TextView) convertView.findViewById(R.id.textView);

        imageView.setImageResource(img[position]);
        textView.setText(name[position]);
        return convertView;
    }
}








