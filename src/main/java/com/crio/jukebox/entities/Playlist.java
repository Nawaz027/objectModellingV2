package com.crio.jukebox.entities;

import java.util.List;

public class Playlist extends BaseEntity {
    public final String userId;
    public final String name;
    public final List<String> songIds;

    public Playlist (Playlist playlist) {
        this(playlist.id, playlist.userId, playlist.name, playlist.songIds);
    }

    public Playlist (String id, String userId, String name, List<String> songid) {
        // this(id, userId, name);
        this.id = id;
        this.userId = userId;
        this.name = name;
        this.songIds = songid;
    }

    public Playlist (String userId, String name, List<String> id) {
        this.userId = userId;
        this.name = name;
        this.songIds = id;
    }

    

    


}