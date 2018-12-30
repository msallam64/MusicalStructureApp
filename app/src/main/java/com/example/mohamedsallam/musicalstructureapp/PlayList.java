package com.example.mohamedsallam.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PlayList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_list);
        Button home = (Button) findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PlayList.this, MainActivity.class);
                startActivity(i);
            }
        });
        Button nowplay = (Button) findViewById(R.id.nowplay);
        nowplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PlayList.this, PlayingNow.class);
                startActivity(i);
            }
        });
        Button details = (Button) findViewById(R.id.detail_artist);
        details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PlayList.this, ArtistDetailsActivity.class);
                startActivity(i);
            }
        });
        Button buy = (Button) findViewById(R.id.buy_song);
        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PlayList.this, BuySong.class);
                startActivity(i);
            }
        });
    }
}
