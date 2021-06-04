package com.example.listviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity3 extends AppCompatActivity {

    GridView gridView;
    int[] img = {R.drawable.india, R.drawable.australia, R.drawable.england, R.drawable.south, R.drawable.nuziland, R.drawable.srilanka, R.drawable.windies,R.drawable.pak};
    String name[] = {"India", "Australia", "England", "SouthAfrica", "Newzealand", "Srilanka", "Windies", "Pakistan",};
    String cap[] =  {"Virat Kohli", "Aron Finch", "Eoin Morgan", "Faf Du Plasis", "Kane Willimsion", "Dimuth KarunaRatne", "Keron Pollard", "Babar Azam"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        gridView = findViewById(R.id.gridView);


        MyAdapter myAdapter = new MyAdapter(MainActivity3.this, img, name);
        gridView.setAdapter(myAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity3.this, MainActivity2.class);
                intent.putExtra("IMG" , img[position]);
                intent.putExtra("NAME" , name[position]);
                intent.putExtra("CAP" , cap[position]);
                startActivity(intent);
            }
        });
    }
}