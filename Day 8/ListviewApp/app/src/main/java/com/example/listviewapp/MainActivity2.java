package com.example.listviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    ImageView imageView3;
    TextView textView2,textView3,textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imageView3 = findViewById(R.id.imageView3);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);

        Intent intent = getIntent();

        String name = intent.getStringExtra("NAME");
        String cap = intent.getStringExtra("CAP");
        int img = intent.getIntExtra("IMG",R.drawable.india);

        imageView3.setImageResource(img);
        textView3.setText(cap);
        textView4.setText(name);
    }
}