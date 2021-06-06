package com.hirenpatel.dataapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    EditText email2,passwd2;
    Button button3,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        email2 = findViewById(R.id.email2);
        passwd2 = findViewById(R.id.passwd2);
        button3 = findViewById(R.id.button3);
        button2 = findViewById(R.id.button2);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity2.this , MainActivity.class);
                startActivity(intent1);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username,userpasswd;

                username = email2.getText().toString();
                userpasswd = passwd2.getText().toString();

                SharedPreferences preferences = getSharedPreferences("mypref", MODE_PRIVATE);
                String email = preferences.getString("EMAIL", null);
                String passwd = preferences.getString("PASSWD", null);

                if(username.equals(email) && userpasswd.equals(passwd)){

                    Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(MainActivity2.this, "Invalid Email OR Password", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
}