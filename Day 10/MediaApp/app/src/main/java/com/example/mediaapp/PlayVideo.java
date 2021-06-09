package com.example.mediaapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

public class PlayVideo extends AppCompatActivity {
    private Button button4;
    private SurfaceView surface;
    private MediaPlayer mediaplayer;
    private SeekBar seekbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_video);

        surface = findViewById(R.id.surface);
        button4 = findViewById(R.id.button4);
        seekbar = findViewById(R.id.seekbar);
        mediaplayer = MediaPlayer.create(this, R.raw.video1);
        surface.setKeepScreenOn(true);
        SurfaceHolder surfaceholder = surface.getHolder();
        surfaceholder.addCallback(new SurfaceHolder.Callback() {
            @Override
            public void surfaceCreated(@NonNull SurfaceHolder holder) {
                mediaplayer.setDisplay(surfaceholder);
            }

            @Override
            public void surfaceChanged(@NonNull SurfaceHolder holder, int format, int width, int height) {

            }

            @Override
            public void surfaceDestroyed(@NonNull SurfaceHolder holder) {

            }
        });
        seekbar.setMax(mediaplayer.getDuration());
        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser)
                    mediaplayer.seekTo(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaplayer.isPlaying()) {
                    mediaplayer.pause();
                    button4.setText("PLAY");
                } else {
                    mediaplayer.start();
                    button4.setText("PAUSE");
                }
            }
        });



    }

    @Override
    protected void onPause() {
        super.onPause();
        mediaplayer.stop();
    }
}