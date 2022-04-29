package com.example.mygallery2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class RezeroAdapter extends BaseAdapter {
    int MyRezeroImg [];
    Context myContext;
    LayoutInflater myInflater;
    public RezeroAdapter (Context MyContext, int myRezeroImg []){
        this.myContext = MyContext;
        this.MyRezeroImg = myRezeroImg;
        myInflater = (LayoutInflater.from(MyContext));
    }
    @Override
    public int getCount() {
        return MyRezeroImg.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = myInflater.inflate(R.layout.layout_imagesrc, null);
        ImageView myImagesrc = view.findViewById(R.id.ImageSrc);
        myImagesrc.setImageResource(MyRezeroImg[i]);
        return view;
    }
}
