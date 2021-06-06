package com.hirenpatel.dataapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name,email,phone,passwd;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);
        passwd = findViewById(R.id.passwd);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences preferences = getSharedPreferences("mypref" , MODE_PRIVATE);
                String name1,email1,phone1,passwd1;
                name1 = name.getText().toString();
                email1 = email.getText().toString();
                phone1 = phone.getText().toString();
                passwd1 = passwd.getText().toString();

                SharedPreferences.Editor editor = preferences.edit();
                editor.putString("NAME", name1);
                editor.putString("EMAIL", email1);
                editor.putString("PHONE", phone1);
                editor.putString("PASSWD", passwd1);

                editor.commit();

                Intent intent = new Intent(MainActivity.this , MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}