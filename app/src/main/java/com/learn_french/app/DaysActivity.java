package com.learn_french.app;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class DaysActivity extends AppCompatActivity {

    private ImageButton sound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_days);

        sound = findViewById(R.id.mondaybtn);
        final MediaPlayer mpMonday = MediaPlayer.create(this, R.raw.lundi);
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mpMonday.start();
            }
        });

        sound = findViewById(R.id.tuesdaybtn);
        final MediaPlayer mpTuesday = MediaPlayer.create(this, R.raw.mardi);
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mpTuesday.start();
            }
        });

        sound = findViewById(R.id.wednesdaybtn);
        final MediaPlayer mpWednesday = MediaPlayer.create(this, R.raw.mercredi);
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mpWednesday.start();
            }
        });

        sound = findViewById(R.id.thursdaybtn);
        final MediaPlayer mpThursday = MediaPlayer.create(this, R.raw.jeudi);
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mpThursday.start();
            }
        });

        sound = findViewById(R.id.fridaybtn);
        final MediaPlayer mpFriday = MediaPlayer.create(this, R.raw.vendredi);
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mpFriday.start();
            }
        });

        sound = findViewById(R.id.saturdaybtn);
        final MediaPlayer mpSaturday = MediaPlayer.create(this, R.raw.samedi);
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mpSaturday.start();
            }
        });

        sound = findViewById(R.id.sundaybtn);
        final MediaPlayer mpSunday = MediaPlayer.create(this, R.raw.dimanche);
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mpSunday.start();
            }
        });
    }
}