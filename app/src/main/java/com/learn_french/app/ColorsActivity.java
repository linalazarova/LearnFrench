package com.learn_french.app;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ColorsActivity extends AppCompatActivity {

    private ImageButton sound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        sound = findViewById(R.id.yellowbtn);
        final MediaPlayer mpYellow = MediaPlayer.create(this, R.raw.jaune);
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mpYellow.start();
            }
        });

        sound = findViewById(R.id.redbtn);
        final MediaPlayer mpRed = MediaPlayer.create(this, R.raw.rouge);
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mpRed.start();
            }
        });

        sound = findViewById(R.id.orangebtn);
        final MediaPlayer mpOrange = MediaPlayer.create(this, R.raw.orange);
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mpOrange.start();
            }
        });

        sound = findViewById(R.id.bluebtn);
        final MediaPlayer mpBlue = MediaPlayer.create(this, R.raw.bleu);
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mpBlue.start();
            }
        });

        sound = findViewById(R.id.greenbtn);
        final MediaPlayer mpGreen = MediaPlayer.create(this, R.raw.vert);
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mpGreen.start();
            }
        });

        sound = findViewById(R.id.whitebtn);
        final MediaPlayer mpWhite = MediaPlayer.create(this, R.raw.blanc);
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mpWhite.start();
            }
        });

        sound = findViewById(R.id.rosebtn);
        final MediaPlayer mpRose = MediaPlayer.create(this, R.raw.rose);
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mpRose.start();
            }
        });

        sound = findViewById(R.id.violetbtn);
        final MediaPlayer mpViolet = MediaPlayer.create(this, R.raw.violet);
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mpViolet.start();
            }
        });

        sound = findViewById(R.id.blackbtn);
        final MediaPlayer mpBlack = MediaPlayer.create(this, R.raw.noir);
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mpBlack.start();
            }
        });

    }
}