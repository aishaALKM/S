package com.example.space4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        ImageButton c = findViewById(R.id.imageView);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.nasa.gov/press-release/nasa-television-to-air-departure-of-northrop-grumman-s-cygnus-from-space-station"; //
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);

                ImageButton co = findViewById(R.id.imageView2);
                co.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String urlu = "https://www.nasa.gov/feature/goddard/2021/nasa-explores-upper-limits-of-global-navigation-systems-for-artemis"; //
                        Intent ip = new Intent(Intent.ACTION_VIEW);
                        ip.setData(Uri.parse(urlu));
                        startActivity(ip);

                        ImageButton cr = findViewById(R.id.imageView3);
                        cr.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                String urly = "https://www.nasa.gov/feature/langley/nasa-tests-infuses-software-into-blue-origin-landing-tech"; //
                                Intent it = new Intent(Intent.ACTION_VIEW);
                                it.setData(Uri.parse(urly));
                                startActivity(it);

                                ImageButton cpo = findViewById(R.id.imageView4);
                                cpo.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        String urlj = "https://www.nasa.gov/feature/langley/flash-lidar-shining-new-light-on-landing-sites"; //
                                        Intent ir = new Intent(Intent.ACTION_VIEW);
                                        ir.setData(Uri.parse(urlj));
                                        startActivity(ir);

                                        ImageButton cq = findViewById(R.id.imageView5);
                                        cq.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                String urlds = "https://www.nasa.gov/feature/goddard/2021/nasa-s-webb-telescope-looks-back-on-2020-engineering-milestones/"; //
                                                Intent irr = new Intent(Intent.ACTION_VIEW);
                                                irr.setData(Uri.parse(urlds));
                                                startActivity(irr);
                                            }
                                        });
                                    }
                                });
                            }
                        });
                    }

                });

            }
        });
    }}