package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        //Creating an array list of songs
        ArrayList<Song> songs = new ArrayList<Song>();

        //Adding each song and its details: name, artist, album cover
        songs.add(new Song("Only One", "The Score", "3:48", R.drawable.the_score));
        songs.add(new Song("Crossfire", "Stephen", "4:32", R.drawable.stephen));
        songs.add(new Song("I don't know why", "Imagine Dragons", "3:11", R.drawable.imagine_dragons));
        songs.add(new Song("Lane Boy", "twenty one pilots", "3:56", R.drawable.twenty_one_pilots));
        songs.add(new Song("Congratulations", "Post Malone", "3:47", R.drawable.post_malone));
        songs.add(new Song("Stranger Things", "Kygo", "3:43", R.drawable.kygo));
        songs.add(new Song("Line It Up", "Stephen", "3:28", R.drawable.stephen));
        songs.add(new Song("Smells Like Teen Spirit", "Nirvana", "4:38", R.drawable.nirvana));
        songs.add(new Song("Bad Karma", "Axel Thesleff", "7:12", R.drawable.axel_thesleff));
        songs.add(new Song("Whatever It Takes", "Hollywood Undead", "3:15", R.drawable.hollywood_undead));

        //Creating an adapter
        SongAdapter songAdapter= new SongAdapter(this, songs);

        final ListView songsListView = (ListView) findViewById(R.id.songs_library_list_view);

        //Setting the adapter on the layout
        songsListView.setAdapter(songAdapter);

        //Setting a ClickListener on the songs list
        songsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Identifying the selected song
                Song selectedSong = (Song) songsListView.getItemAtPosition(i);

                /**Creating an intent containing the song's name, artist and the album cover
                 * and sending it to the NowPlaying activity
                 */
                Intent intent = new Intent(MainActivity.this, NowPlaying.class);
                Bundle extras = new Bundle();
                extras.putString("song_name", selectedSong.getSongName());
                extras.putString("artist_name", selectedSong.getArtistName());
                extras.putInt("album_photo", selectedSong.getAlbumCover());
                intent.putExtras(extras);
                startActivity(intent);
            }
        });

    }
}
