package com.example.galleryfragments;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class CustomAdapter extends BaseAdapter {

    private Context context;
    private int[] images;

    public CustomAdapter(Context c, int[] images) {
        context = c;
        this.images = images;
    }


    public int getCount() {
        return images.length;
    }


    public Object getItem(int position) {
        return position;
    }


    public long getItemId(int position) {
        return position;
    }


    public View getView(int position, View convertView, ViewGroup parent) {


        ImageView imageView = new ImageView(context);
        imageView.setImageResource(images[position]);
        imageView.setLayoutParams(new Gallery.LayoutParams(300, 300)); // set ImageView param
        return imageView;
    }
}