package com.example.mygallery2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

import androidx.annotation.Nullable;

public class GridViewGallery extends Activity {
    GridView RezeroGrid;
    int ReImages [] = {R.drawable.re1, R.drawable.re4,
            R.drawable.re2, R.drawable.re5,
            R.drawable.re3, R.drawable.re2,
            R.drawable.re4, R.drawable.re5,
            R.drawable.re5, R.drawable.re1,
            R.drawable.re6, R.drawable.re2};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_gridview);
        RezeroGrid = findViewById(R.id.ReGrid);
        RezeroAdapter myRezeroAdapter = new RezeroAdapter(getApplicationContext(), ReImages);
        RezeroGrid.setAdapter(myRezeroAdapter);
    }
}
