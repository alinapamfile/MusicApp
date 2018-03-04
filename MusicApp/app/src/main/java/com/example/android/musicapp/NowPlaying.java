package com.example.android.musicapp;


import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.media.ImageWriter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

public class NowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing);

        //Extracting the song's details: name, artist and the album cover
        Bundle extras = getIntent().getExtras();
        String song_name = extras.getString("song_name");
        String artist_name = extras.getString("artist_name");
        int album = extras.getInt("album_photo");

        //Setting the song name
        TextView textView = (TextView) findViewById(R.id.song_name);
        textView.setText(song_name);

        //Setting the song's artist
        textView = (TextView) findViewById(R.id.artist_name);
        textView.setText(artist_name);

        //Setting the album cover
        final ImageView imageView = (ImageView) findViewById(R.id.album_photo);
        imageView.setImageResource(album);

    }
}
