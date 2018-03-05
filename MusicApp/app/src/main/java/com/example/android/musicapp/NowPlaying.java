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
        int albumCover = extras.getInt("album_photo");

        //Setting the song name
        TextView songNameTextView = (TextView) findViewById(R.id.song_name_text_view);
        songNameTextView.setText(songName);

        //Setting the song's artist
        TextView artistNameTextView = (TextView) findViewById(R.id.artist_name_text_view);
        artistNameTextView.setText(artistName);

        //Setting the album cover
        ImageView albumCoverImageView = (ImageView) findViewById(R.id.album_cover_image_view);
        albumCoverImageView.setImageResource(albumCover);

        //Setting a ClickListener on the "Songs Library" button
        View songsLibraryButton = (View) findViewById(R.id.songs_library_button);
        songsLibraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NowPlaying.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
