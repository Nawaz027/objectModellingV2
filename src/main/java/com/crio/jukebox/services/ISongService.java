package com.crio.jukebox.services;

import java.util.List;
import com.crio.jukebox.entities.Song;

public interface ISongService {
    public Song create (String id, String name, String album, List<String> artists);
}
