package com.example.mohamedsallam.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ArtistDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arttist__details);
        Button home = (Button) findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ArtistDetailsActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
        Button nowplay = (Button) findViewById(R.id.nowplay);
        nowplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ArtistDetailsActivity.this, PlayingNow.class);
                startActivity(i);
            }
        });
        Button listt = (Button) findViewById(R.id.list);
        listt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ArtistDetailsActivity.this, PlayList.class);
                startActivity(i);
            }
        });
        Button buy = (Button) findViewById(R.id.buy_song);
        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ArtistDetailsActivity.this, BuySong.class);
                startActivity(i);
            }
        });
    }
}
