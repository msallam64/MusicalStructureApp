package com.example.mohamedsallam.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PlayingNow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing__now);
        Button main = (Button) findViewById(R.id.home);
        main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PlayingNow.this, MainActivity.class);
                startActivity(i);
            }
        });
        Button playlist = (Button) findViewById(R.id.playlist);
        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PlayingNow.this, PlayList.class);
                startActivity(i);
            }
        });
        Button details = (Button) findViewById(R.id.detail_artist);
        details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PlayingNow.this, ArtistDetailsActivity.class);
                startActivity(i);
            }
        });
        Button buysong = (Button) findViewById(R.id.buy_song);
        buysong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PlayingNow.this, BuySong.class);
                startActivity(i);
            }
        });
    }
}
