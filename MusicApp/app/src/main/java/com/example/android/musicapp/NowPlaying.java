package com.example.android.musicapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class NowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing);

        //Extracting the song's details: name, artist and the album cover
        Bundle extras = getIntent().getExtras();
        String songName = extras.getString("song_name");
        String artistName = extras.getString("artist_name");
        int album = extras.getInt("album_photo");

        //Setting the song name
        TextView textView = (TextView) findViewById(R.id.song_name);
        textView.setText(songName);

        //Setting the song's artist
        textView = (TextView) findViewById(R.id.artist_name);
        textView.setText(artistName);

        //Setting the album cover
        final ImageView imageView = (ImageView) findViewById(R.id.album_photo);
        imageView.setImageResource(album);

        //Setting a ClickListener on the "Songs Library" button
        View view = (View) findViewById(R.id.button);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NowPlaying.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
