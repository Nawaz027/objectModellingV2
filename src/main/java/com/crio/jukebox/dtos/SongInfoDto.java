package com.crio.jukebox.dtos;

public class SongInfoDto {
    public Integer songId;
    public String songName;
    public String genre;
    public String albumName;
    public String leadArtist;
    public String allArtist;


    public SongInfoDto() {

    }

    public SongInfoDto(Integer id, String name, String genre, String albumName, String leadArtist, String allArtist) {
        this.songId = id;
        this.songName = name;
        this.genre = genre;
        this.albumName = albumName;
        this.leadArtist = leadArtist;
        this.allArtist = allArtist;
    }

    @Override
    public String toString() {
        return "[Id: " + songId + ", Name: " + songName + ", Genre: " + genre + ", Album: " + albumName + ", Lead Artist: " 
        + leadArtist + ", allArtist: " + allArtist + "]";
    }
}
