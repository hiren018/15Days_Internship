package com.hirenpatel.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Dataactivity extends AppCompatActivity {
        TextView textView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dataactivity);

        textView4 = findViewById(R.id.textView4);

        Intent intent = getIntent();
        String name = intent.getStringExtra("NAME");
       String gender = intent.getStringExtra("GENDER");
        String email = intent.getStringExtra("EMAIL");
        String phone = intent.getStringExtra("PHONE");
        String passwd = intent.getStringExtra("PASSWD");
        String skill = intent.getStringExtra("SKILL");

        textView4.setText("Name    :" + name + "\n" +"\n" +
                          "Gender  :" + gender + "\n" +"\n" +
                          "E=mail  :" + email + "\n" +"\n" +
                          "Phone   :" + phone + "\n" +"\n" +
                          "Passwd  :" + passwd + "\n" +"\n" +
                          "Skills  :" + skill);
    }
}