package com.crio.jukebox.entities;

import java.util.List;

public class Song extends BaseEntity {
    public final String name;
    public final String album;
    public final List<String> artists;

    public Song (Song song) {
        this(song.id, song.name, song.album, song.artists);
    }

    public Song (String id, String name, String album, List<String> artists) {
        this.id = id;
        this.name = name;
        this.album = album;
        this.artists = artists;
    }

    public Song (String name, String album, List<String> artists) {
        this.name = name;
        this.album = album;
        this.artists = artists;
    }

    public String getSongName() {
        return name;
    }

    public String getAlbumName() {
        return album;
    }

    public List<String> getArtistName(){
        return artists;
 }
    // public void addPlaylist(Playlist playlist){
    //     playlists.add(playlist);
    // }

    // public void deletePlaylist(Playlist playlist){
    //     playlists.removeIf(c -> c.getId() == playlist.getId());
    // }
}