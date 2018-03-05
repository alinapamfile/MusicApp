package com.example.android.musicapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Activity context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        //Identifying the current song
        Song currentSong = getItem(position);

        //Setting the song's name
        TextView songNameTextView = (TextView) listItemView.findViewById(R.id.song_name_text_view);
        songNameTextView.setText(currentSong.getSongName());

        //Setting the song's artist
        TextView artistNameTextView = (TextView) listItemView.findViewById(R.id.artist_name_text_view);
        artistNameTextView.setText(currentSong.getArtistName());

        //Setting the song's length
        TextView songLengthTextView = (TextView) listItemView.findViewById(R.id.song_length_text_view);
        songLengthTextView.setText(currentSong.getLength());

        //Setting the album cover
        ImageView albumCoverImageView = (ImageView) listItemView.findViewById(R.id.album_cover_image_view);
        albumCoverImageView.setImageResource(currentSong.getAlbumCover());

        return listItemView;
    }

}
