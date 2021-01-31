package com.example.space4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivityPage3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page3);

        Button red = findViewById(R.id.imageButton8);
        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent red1 = new Intent(MainActivityPage3.this, MainActivity2.class);
                startActivity(red1);
            }
        });

        Button white = findViewById(R.id.imageButton9);
        white.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent white1 = new Intent(MainActivityPage3.this, MainActivity.activitygif.class);
                startActivity(white1);
            }
        });

        Button orange = findViewById(R.id.startButton);
        orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent orange1 = new Intent(MainActivityPage3.this, MainActivity4.class);
                startActivity(orange1);

            }
        });

        Button pink = findViewById(R.id.pineapple);
        pink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pink1 = new Intent(MainActivityPage3.this, MainActivity5.class);
                startActivity(pink1);
            }
        });

        Button black = findViewById(R.id.orange);
        black.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent black1 = new Intent(MainActivityPage3.this, MainActivity6.class);
                startActivity(black1);
            }
        });


        ImageButton yellow = findViewById(R.id.Button2);
        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String yello1 = "https://www.amazon.com/"; //
                Intent yello2 = new Intent(Intent.ACTION_VIEW);
                yello2.setData(Uri.parse(yello1));
                startActivity(yello2);

            }
        });
    }
}


  