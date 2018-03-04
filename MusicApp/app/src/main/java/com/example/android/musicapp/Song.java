package com.example.android.musicapp;

import android.widget.ImageView;

public class Song {

    private String mSongName;

    private String mArtistName;

    private String mLength;

    private int mAlbumPhoto;

    public Song(String songName, String artistName, String length, int albumPhoto) {
        mSongName = songName;
        mArtistName = artistName;
        mLength = length;
        mAlbumPhoto = albumPhoto;
    }

    public String getSongName() {
        return mSongName;
    }

    public String getArtistName() {
        return mArtistName;
    }

    public String getLength() {
        return mLength;
    }

    public int getAlbumPhoto() {
        return mAlbumPhoto;
    }
}
