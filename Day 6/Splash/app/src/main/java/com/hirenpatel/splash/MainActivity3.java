package com.hirenpatel.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity3 extends AppCompatActivity {

    MediaPlayer mediaPlayer = new MediaPlayer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_main3);

        mediaPlayer = MediaPlayer.create(MainActivity3.this , R.raw.music3);
        mediaPlayer.start();


        Thread thread = new Thread(){

            @Override
            public void run() {
                try {
                    sleep(10000);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                finally {
                    Intent intent = new Intent(MainActivity3.this , MainActivity4.class);
                    startActivity(intent);
                }
            }
        };
        thread.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mediaPlayer.release();
        finish();
    }

}