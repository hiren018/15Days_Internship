package com.hirenpatel.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name, email,phone,passwd,skill;
    TextView textView,textView5;
    RadioButton male,female,other;
    Button button,button2;
    RadioGroup radioGroup;


    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);
        skill = findViewById(R.id.skill);
        passwd = findViewById(R.id.passwd);
        textView = findViewById(R.id.textView);
        textView5 = findViewById(R.id.textView5);
        male = findViewById(R.id.male);
        female = findViewById(R.id.female);
        other = findViewById(R.id.other);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        radioGroup = findViewById(R.id.radioGroup);



        radioGroup = new RadioGroup(this);
        RadioButton male = new RadioButton(this);
        male.setText("Male");
        male.setChecked(true);
        male.setId(1);

        RadioButton female = new RadioButton(this);
        female.setText("Female");
        female.setId(2);

        RadioButton other = new RadioButton(this);
        other.setText("Other");
        other.setId(3);

        radioGroup.addView(male);
        radioGroup.addView(female);
        radioGroup.addView(other);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name.setText("");
                email.setText("");
                phone.setText("");
                passwd.setText("");
                skill.setText("");
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Your details are submitted...", Toast.LENGTH_SHORT).show();
                String s1 = name.getText().toString();
                String s2 = skill.getText().toString();
                String s3 = email.getText().toString();
                String s4 = phone.getText().toString();
                String s5 = passwd.getText().toString();

                Intent intent = new Intent(MainActivity.this , Dataactivity.class);
                intent.putExtra("NAME" , s1);

               int genderID = radioGroup.getCheckedRadioButtonId();

               switch (genderID){
                   case 1 : intent.putExtra("GENDER", "Male");
                   break;

                   case 2 : intent.putExtra("GENDER", "Female");
                       break;

                   case 3 : intent.putExtra("GENDER", "Other");
                       break;
               }
                intent.putExtra("EMAIL" , s3);
                intent.putExtra("SKILL" , s2);
                intent.putExtra("PHONE" , s4);
                intent.putExtra("PASSWD" , s5);

                startActivity(intent);
            }
        });
    }
}