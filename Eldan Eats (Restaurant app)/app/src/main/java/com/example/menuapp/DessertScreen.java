package com.example.menuapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import app.num.numandroidpagecurleffect.PageCurlView;

public class DessertScreen extends AppCompatActivity {

    PageCurlView pageCurlView;
    List<Integer> images;
    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_screen);
        getSupportActionBar().hide();

        title = findViewById(R.id.title);
        title.setText("DESSERT");

        pageCurlView = findViewById(R.id.pagecurl);
        images=new ArrayList<>();
        images.add(R.drawable.d1);
        images.add(R.drawable.d2);
        images.add(R.drawable.d3);
        images.add(R.drawable.d4);
        pageCurlView.setCurlView(images);
        pageCurlView.setCurlSpeed(200);

    }
}

