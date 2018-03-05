package com.example.android.musicapp;

public class Song {

    private String mSongName;

    private String mArtistName;

    private String mLength;

    private int mAlbumCover;

    public Song(String songName, String artistName, String length, int albumCover) {
        mSongName = songName;
        mArtistName = artistName;
        mLength = length;
        mAlbumCover = albumCover;
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

    public int getAlbumCover() {
        return mAlbumCover;
    }
}
