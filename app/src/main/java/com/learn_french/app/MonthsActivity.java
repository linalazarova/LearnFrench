package com.learn_french.app;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MonthsActivity extends AppCompatActivity {

    private ImageButton sound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_months);

        sound = findViewById(R.id.januarybtn);
        final MediaPlayer mpJanuary = MediaPlayer.create(this, R.raw.janvier);
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mpJanuary.start();
            }
        });

        sound = findViewById(R.id.februarybtn);
        final MediaPlayer mpFebruary = MediaPlayer.create(this, R.raw.fevrier);
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mpFebruary.start();
            }
        });

        sound = findViewById(R.id.marchbtn);
        final MediaPlayer mpMarch = MediaPlayer.create(this, R.raw.mars);
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mpMarch.start();
            }
        });

        sound = findViewById(R.id.aprilbtn);
        final MediaPlayer mpApril = MediaPlayer.create(this, R.raw.avril);
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mpApril.start();
            }
        });

        sound = findViewById(R.id.maybtn);
        final MediaPlayer mpMay = MediaPlayer.create(this, R.raw.mai);
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mpMay.start();
            }
        });

        sound = findViewById(R.id.junebtn);
        final MediaPlayer mpJune = MediaPlayer.create(this, R.raw.juin);
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mpJune.start();
            }
        });

        sound = findViewById(R.id.julybtn);
        final MediaPlayer mpJuly = MediaPlayer.create(this, R.raw.juillet);
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mpJuly.start();
            }
        });

        sound = findViewById(R.id.augustbtn);
        final MediaPlayer mpAugust = MediaPlayer.create(this, R.raw.aout);
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mpAugust.start();
            }
        });

        sound = findViewById(R.id.septemberbtn);
        final MediaPlayer mpSeptember = MediaPlayer.create(this, R.raw.septembre);
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mpSeptember.start();
            }
        });

        sound = findViewById(R.id.octoberbtn);
        final MediaPlayer mpOctober = MediaPlayer.create(this, R.raw.octobre);
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mpOctober.start();
            }
        });

        sound = findViewById(R.id.novemberbtn);
        final MediaPlayer mpNovember = MediaPlayer.create(this, R.raw.novembre);
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mpNovember.start();
            }
        });

        sound = findViewById(R.id.decemberbtn);
        final MediaPlayer mpDecember = MediaPlayer.create(this, R.raw.decembre);
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mpDecember.start();
            }
        });

    }
}