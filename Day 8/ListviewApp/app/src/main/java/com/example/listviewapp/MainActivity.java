package com.example.listviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   ListView listView;
   Button button;
   int[] img = {R.drawable.india, R.drawable.australia, R.drawable.england, R.drawable.south, R.drawable.nuziland, R.drawable.srilanka, R.drawable.windies,R.drawable.pak};
   String name[] = {"India", "Australia", "England", "SouthAfrica", "Newzealand", "Srilanka", "Windies", "Pakistan",};
   String cap[] =  {"Virat Kohli", "Aron Finch", "Eoin Morgan", "Faf Du Plasis", "Kane Willimsion", "Dimuth KarunaRatne", "Keron Pollard", "Babar Azam"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);
        button = findViewById(R.id.button);

        MyAdapter myAdapter = new MyAdapter(MainActivity.this, img, name);
        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("IMG" , img[position]);
                intent.putExtra("NAME" , name[position]);
                intent.putExtra("CAP" , cap[position]);
                startActivity(intent);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Changed to GridView...", Toast.LENGTH_SHORT).show();

                Intent intent1 = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(intent1);
            }
        });


    }
}