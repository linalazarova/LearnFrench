package com.learn_french.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.color);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openColorsActivity();
            }
        });

        button = findViewById(R.id.numbers);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNumbersActivity();
            }
        });

        button = findViewById(R.id.days);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openDaysActivity();
            }
        });

        button = findViewById(R.id.months);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openMonthsActivity();
            }
        });

        button = findViewById(R.id.phrases);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openPhrasesActivity();
            }
        });
    }

    public void openColorsActivity(){
        Intent intent = new Intent(this, ColorsActivity.class);
        startActivity(intent);
    }

    public void openNumbersActivity(){
        Intent intent = new Intent(this, NumbersActivity.class);
        startActivity(intent);
    }

    public void openDaysActivity(){
        Intent intent = new Intent(this, DaysActivity.class);
        startActivity(intent);
    }

    public void openMonthsActivity(){
        Intent intent = new Intent(this, MonthsActivity.class);
        startActivity(intent);
    }

    public void openPhrasesActivity(){
        Intent intent = new Intent(this, PhrasesActivity.class);
        startActivity(intent);
    }
}