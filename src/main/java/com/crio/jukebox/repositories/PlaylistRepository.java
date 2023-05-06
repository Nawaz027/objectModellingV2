package com.crio.jukebox.repositories;

import java.util.Map;
import java.util.Optional;
import java.util.HashMap;
import com.crio.jukebox.entities.Playlist;
import com.crio.jukebox.entities.User;


public class PlaylistRepository implements IPlaylistRepository {
    private final Map<String,Playlist> playlistMap;
    private Integer autoIncrement = 0;

    public PlaylistRepository() {
        playlistMap = new HashMap<String, Playlist>();
    }

    public PlaylistRepository(Map<String, Playlist> playlistMap) {
        this.playlistMap = playlistMap;
        this.autoIncrement = playlistMap.size();
    }

    @Override
    public Playlist save(Playlist entity) {
        playlistMap.put(entity.userId,entity);
        return entity;
    }


   

    @Override
    public Optional<Playlist> findById(String id) {
        return Optional.ofNullable(playlistMap.get(id));
    }



    @Override
    public void deleteById(String id) {
        playlistMap.remove(id);
    }



}
