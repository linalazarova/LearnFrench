package com.learn_french.app;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class NumbersActivity extends AppCompatActivity {

    ImageButton sound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        sound = findViewById(R.id.zerobtn);
        final MediaPlayer mpZero = MediaPlayer.create(this, R.raw.zero);
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mpZero.start();
            }
        });

        sound = findViewById(R.id.onebtn);
        final MediaPlayer mpOne = MediaPlayer.create(this, R.raw.one);
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mpOne.start();
            }
        });

        sound = findViewById(R.id.twobtn);
        final MediaPlayer mpTwo = MediaPlayer.create(this, R.raw.two);
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mpTwo.start();
            }
        });

        sound = findViewById(R.id.threebtn);
        final MediaPlayer mpThree = MediaPlayer.create(this, R.raw.three);
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mpThree.start();
            }
        });

        sound = findViewById(R.id.fourbtn);
        final MediaPlayer mpFour = MediaPlayer.create(this, R.raw.four);
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mpFour.start();
            }
        });

        sound = findViewById(R.id.fivebtn);
        final MediaPlayer mpFive = MediaPlayer.create(this, R.raw.five);
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mpFive.start();
            }
        });

        sound = findViewById(R.id.sixbtn);
        final MediaPlayer mpSix = MediaPlayer.create(this, R.raw.six);
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mpSix.start();
            }
        });

        sound = findViewById(R.id.sevenbtn);
        final MediaPlayer mpSeven = MediaPlayer.create(this, R.raw.seven);
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mpSeven.start();
            }
        });

        sound = findViewById(R.id.eightbtn);
        final MediaPlayer mpEight = MediaPlayer.create(this, R.raw.eight);
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpEight.start();
            }
        });

        sound = findViewById(R.id.ninebtn);
        final MediaPlayer mpNine = MediaPlayer.create(this, R.raw.nine);
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpNine.start();
            }
        });

        sound = findViewById(R.id.tenbtn);
        final MediaPlayer mpTen = MediaPlayer.create(this, R.raw.ten);
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpTen.start();
            }
        });

        sound = findViewById(R.id.twentybtn);
        final MediaPlayer mpTwenty = MediaPlayer.create(this, R.raw.twenty);
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mpTwenty.start();
            }
        });

        sound = findViewById(R.id.thirtybtn);
        final MediaPlayer mpThirty = MediaPlayer.create(this, R.raw.thirty);
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mpThirty.start();
            }
        });

        sound = findViewById(R.id.fourtybtn);
        final MediaPlayer mpFourty = MediaPlayer.create(this, R.raw.fourty);
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mpFourty.start();
            }
        });

        sound = findViewById(R.id.fiftybtn);
        final MediaPlayer mpFifty = MediaPlayer.create(this, R.raw.fifty);
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mpFifty.start();
            }
        });

        sound = findViewById(R.id.sixtybtn);
        final MediaPlayer mpSixty = MediaPlayer.create(this, R.raw.sixty);
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mpSixty.start();
            }
        });

        sound = findViewById(R.id.seventybtn);
        final MediaPlayer mpSeventy = MediaPlayer.create(this, R.raw.seventy);
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mpSeventy.start();
            }
        });

        sound = findViewById(R.id.eightybtn);
        final MediaPlayer mpEighty = MediaPlayer.create(this, R.raw.eighty);
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mpEighty.start();
            }
        });

        sound = findViewById(R.id.ninetybtn);
        final MediaPlayer mpNinety = MediaPlayer.create(this, R.raw.ninety);
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpNinety.start();
            }
        });

        sound = findViewById(R.id.hundredbtn);
        final MediaPlayer mpHundred = MediaPlayer.create(this, R.raw.hundred);
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpHundred.start();
            }
        });
    }
}