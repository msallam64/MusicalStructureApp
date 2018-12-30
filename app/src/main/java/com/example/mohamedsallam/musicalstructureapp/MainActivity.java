package com.example.mohamedsallam.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button nowplay = (Button) findViewById(R.id.now_play);
        nowplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowplayintactivity = new Intent(MainActivity.this, PlayingNow.class);
                startActivity(nowplayintactivity);
            }
        });
        Button playlist = (Button) findViewById(R.id.playlist);
        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowplayintactivity = new Intent(MainActivity.this, PlayList.class);
                startActivity(nowplayintactivity);
            }
        });
        Button details = (Button) findViewById(R.id.detail_artist);
        details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowplayintactivity = new Intent(MainActivity.this, ArtistDetailsActivity.class);
                startActivity(nowplayintactivity);
            }
        });
        Button buy = (Button) findViewById(R.id.buy_song);
        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowplayintactivity = new Intent(MainActivity.this, BuySong.class);
                startActivity(nowplayintactivity);
            }
        });
    }
}
