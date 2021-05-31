package com.hirenpatel.calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.math.BigDecimal;


public class MainActivity extends AppCompatActivity {
    EditText num1,num2;
    TextView textView,textView2,textView3;
    Button sum,sub,mul,div,mod,clear;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        sum = findViewById(R.id.sum);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        mod = findViewById(R.id.mod);
        clear = findViewById(R.id.clear);


        sum.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String s1 = num1.getText().toString();
                String s2 = num2.getText().toString();

                if (s1.isEmpty() || s2.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter numbers", Toast.LENGTH_SHORT).show();
                } else {
                    float n1 = Float.parseFloat(s1);
                    float n2 = Float.parseFloat(s2);

                    float a = n1 + n2;
                    textView3.setText(Float.toString(a));

                }
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String s1 = num1.getText().toString();
                String s2 = num2.getText().toString();

                if (s1.isEmpty() || s2.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter numbers", Toast.LENGTH_SHORT).show();
                } else {
                    float n1 = Float.parseFloat(s1);
                    float n2 = Float.parseFloat(s2);
                if (n1 < n2){
                    float f = n2-n1;
                    textView3.setText("-" + Double.toString(f));

                }
                    float b = n1 - n2;
                    textView3.setText(Float.toString(b));
                }
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String s1 = num1.getText().toString();
                String s2 = num2.getText().toString();

                if (s1.isEmpty() || s2.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter numbers", Toast.LENGTH_SHORT).show();
                } else {
                    float n1 = Float.parseFloat(s1);
                    float n2 = Float.parseFloat(s2);

                    textView3.setText(Float.toString(n1 * n2));
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String s1 = num1.getText().toString();
                String s2 = num2.getText().toString();

                if (s1.isEmpty() || s2.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter numbers", Toast.LENGTH_SHORT).show();
                } else {
                    float n1 = Float.parseFloat(s1);
                    float n2 = Float.parseFloat(s2);

                    float d = n1 / n2;
                    textView3.setText(Float.toString(d));
                }
            }
        });
        mod.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String s1 = num1.getText().toString();
                String s2 = num2.getText().toString();

                if (s1.isEmpty() || s2.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter numbers", Toast.LENGTH_SHORT).show();
                } else {
                    float n1 = Float.parseFloat(s1);
                    float n2 = Float.parseFloat(s2);

                    float e = n1 % n2;
                    textView3.setText(Float.toString(e));
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView3.setText("");
                num1.setText("");
                num2.setText("");
            }
        });

    }

}