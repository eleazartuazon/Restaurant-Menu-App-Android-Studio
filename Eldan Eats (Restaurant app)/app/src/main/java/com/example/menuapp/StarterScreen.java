package com.example.menuapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import app.num.numandroidpagecurleffect.PageCurlView;

public class StarterScreen extends AppCompatActivity {

        PageCurlView pageCurlView;
        List<Integer> images;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.menu_screen);
            getSupportActionBar().hide();

            pageCurlView = findViewById(R.id.pagecurl);
            images=new ArrayList<>();
            images.add(R.drawable.s1);
            images.add(R.drawable.s2);
            images.add(R.drawable.s3);
            images.add(R.drawable.s4);
            pageCurlView.setCurlView(images);
            pageCurlView.setCurlSpeed(200);

        }



    }
