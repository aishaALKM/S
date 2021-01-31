package com.example.space4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Bundle bn = getIntent().getExtras();
          Inventionsjavaclass hi = (Inventionsjavaclass) bn.getSerializable("key");
        bn.getSerializable("key");
        ImageView img8 = findViewById(R.id.imageView14);
        TextView name0 = findViewById(R.id.textView8);
        TextView topicu = findViewById(R.id.textView9);

        img8.setImageResource(hi.getImg());
        name0.setText(hi.getName());
        topicu.setText(hi.getTopic());





    }
}