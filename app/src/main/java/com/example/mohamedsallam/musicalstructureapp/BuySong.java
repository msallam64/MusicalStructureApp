package com.example.mohamedsallam.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class BuySong extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy__song);
        Button home = (Button) findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(BuySong.this, MainActivity.class);
                startActivity(i);
            }
        });
        Button nowplay = (Button) findViewById(R.id.nowplay);
        nowplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(BuySong.this, PlayingNow.class);
                startActivity(i);
            }
        });
        Button details = (Button) findViewById(R.id.detail_artist);
        details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(BuySong.this, ArtistDetailsActivity.class);
                startActivity(i);
            }
        });
        Button list = (Button) findViewById(R.id.play);
        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(BuySong.this, PlayList.class);
                startActivity(i);
            }
        });
    }
}
