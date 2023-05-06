package com.crio.jukebox.repositories;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import com.crio.jukebox.entities.Song;

public class SongsRepository implements ISongsRepository{
    private final Map<String,Song> songMap;
    private Integer autoIncrement = 0;


    public SongsRepository() {
        songMap = new HashMap<String, Song>();
    }

    public SongsRepository(Map<String, Song> SongMap) {
        this.songMap = SongMap;
        this.autoIncrement = SongMap.size();
    }
    
    public Song save(Song entity) {
        String songId = entity.id.toString();
        songMap.put(songId,entity);
        return entity;
    }

    @Override
    public Optional<Song> findById(String id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteById(String id) {
        // TODO Auto-generated method stub
        
    }
}
