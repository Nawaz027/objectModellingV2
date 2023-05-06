package com.crio.jukebox.services;

import java.util.List;
import com.crio.jukebox.entities.Song;
import com.crio.jukebox.repositories.ISongsRepository;

public class SongService implements ISongService{
    private final ISongsRepository songsRepository;

  
    public SongService(ISongsRepository songsRepository) {
        this.songsRepository = songsRepository;
    }

    @Override
    public Song create(String id, String name, String album, List<String> artists) {
        Song s = new Song(id, name, album, artists);
        Song song = songsRepository.save(s);
        return song;
    }
    
}
