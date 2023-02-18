package com.example.menuapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import app.num.numandroidpagecurleffect.PageCurlView;

public class MainCourseScreen extends AppCompatActivity {

    PageCurlView pageCurlView;
    List<Integer> images;
    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_screen);
        getSupportActionBar().hide();

        title = findViewById(R.id.title);
        title.setText("MAIN COURSE");

        pageCurlView = findViewById(R.id.pagecurl);
        images=new ArrayList<>();
        images.add(R.drawable.m1);
        images.add(R.drawable.m2);
        images.add(R.drawable.m3);
        images.add(R.drawable.m4);
        images.add(R.drawable.m5);
        images.add(R.drawable.m6);
        pageCurlView.setCurlView(images);
        pageCurlView.setCurlSpeed(200);

    }
}
