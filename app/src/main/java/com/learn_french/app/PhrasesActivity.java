package com.learn_french.app;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    ListView listView;
    String[] phrases = {"Bonjour (Hello)", "Bonsoir (Good evening)", "Bonne nuit (Goodnight)",
            "Au revoir (Goodbye)", "S'il vous plaît (Please)", "Merci beaucoup (Thank you)",
            "Bienvenu/e (Welcome)", "A bientôt (See you soon)", "Je suis désolé (I'm sorry)",
            "Ça va? (How are you?)", "Parlez-vous français? (Do you speak French?)",
            "Comment vous appelez-vous? (What's your Name?)", "Enchanté (Nice to meet you)"};
    int[] sounds = {R.raw.bonjour, R.raw.bonsoir, R.raw.bonnenuit, R.raw.aurevoir,
            R.raw.silvousplait, R.raw.mercibcp, R.raw.bienvenu, R.raw.abientot,
            R.raw.jesuisdesole, R.raw.cava, R.raw.parlezvousfrancais, R.raw.commentvousappelezvous,
            R.raw.enchante};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        listView=findViewById(R.id.listview);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, phrases);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MediaPlayer mediaPlayer = MediaPlayer.create(PhrasesActivity.this, sounds[position]);
                mediaPlayer.start();
            }
        });

    }
}