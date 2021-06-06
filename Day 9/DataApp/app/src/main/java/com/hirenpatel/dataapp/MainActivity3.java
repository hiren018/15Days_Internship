package com.hirenpatel.dataapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    TextView textView4,textView5,textView6,textView7;
    Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        textView6 = findViewById(R.id.textView6);
        textView7 = findViewById(R.id.textView7);

        button4 = findViewById(R.id.button4);

        SharedPreferences preferences = getSharedPreferences("mypref" , MODE_PRIVATE);

        String name3 = preferences.getString("NAME", null);
        String email3 = preferences.getString("EMAIL", null);
        String phone3 = preferences.getString("PHONE", null);
        String passwd3 = preferences.getString("PASSWD", null);

        textView4.setText("NAME :" + name3 );
        textView5.setText("MO. :" + phone3);
        textView6.setText("EMAIL :" + email3);
        textView7.setText("PASSWORD :" + passwd3);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences preferences = getSharedPreferences("mypref" , MODE_PRIVATE);
                SharedPreferences.Editor editor = preferences.edit();
                editor.clear();
                editor.commit();
                finish();
                moveTaskToBack(true);
            }
        });
    }
}