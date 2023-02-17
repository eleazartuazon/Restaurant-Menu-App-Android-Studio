package com.example.menuapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.orhanobut.dialogplus.DialogPlus;
import com.orhanobut.dialogplus.ViewHolder;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class MainActivity extends AppCompatActivity {


    CardView starterCard,mainCard,dessertCard,beverageCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        int[] mImages= new int[]{ R.drawable.bs1,R.drawable.bs2,R.drawable.bs3,R.drawable.bs4};

            CarouselView carou= (CarouselView) findViewById(R.id.carou);
            carou.setPageCount(mImages.length);
            carou.setImageListener(new ImageListener() {
                @Override
                public void setImageForPosition(int position, ImageView imageView) {
                    imageView.setImageResource(mImages[position]);
                }
            });
        ImageListener imageListener = new ImageListener() {
            @Override
            public void setImageForPosition(int position, ImageView imageView) {
                imageView.setImageResource(mImages[position]);
            }

        };

        starterCard=findViewById(R.id.card_starters);

        starterCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startersActivityIntent=new Intent(MainActivity.this, StarterScreen.class);
                startActivity(startersActivityIntent);
                overridePendingTransition(R.anim.slide_out_bottom, R.anim.slide_in_bottom);
            }
        });

        mainCard=findViewById(R.id.card_main);

        mainCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startersActivityIntent=new Intent(MainActivity.this, MainCourseScreen.class);
                startActivity(startersActivityIntent);
                overridePendingTransition(R.anim.slide_out_bottom, R.anim.slide_in_bottom);
            }
        });

        dessertCard=findViewById(R.id.card_dessert);

        dessertCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startersActivityIntent=new Intent(MainActivity.this, DessertScreen.class);
                startActivity(startersActivityIntent);
                overridePendingTransition(R.anim.slide_out_bottom, R.anim.slide_in_bottom);
            }
        });

        beverageCard=findViewById(R.id.card_beverages);

        beverageCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startersActivityIntent=new Intent(MainActivity.this, BeverageScreen.class);
                startActivity(startersActivityIntent);
                overridePendingTransition(R.anim.slide_out_bottom, R.anim.slide_in_bottom);
            }
        });
    }

    @Override
    public void onBackPressed() {

        DialogPlus dialogPlus = DialogPlus.newDialog(MainActivity.this)
                .setContentBackgroundResource(R.color.transparent)
                .setContentHolder(new ViewHolder(R.layout.exit_dialogue))
                .setGravity(Gravity.CENTER)
                .setExpanded(true, 300)
                .setCancelable(true)
                .create();

        View view = dialogPlus.getHolderView();

        Button btnNo = view.findViewById(R.id.btnno);
        btnNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogPlus.dismiss();
            }
        });

        Button btnYes = view.findViewById(R.id.btnyes);
        btnYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
            }
        });

        dialogPlus.show();

    }


}