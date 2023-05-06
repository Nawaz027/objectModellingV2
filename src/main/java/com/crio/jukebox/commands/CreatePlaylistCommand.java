package com.crio.jukebox.commands;

import java.util.Arrays;
import java.util.List;
import com.crio.jukebox.entities.Playlist;
import com.crio.jukebox.services.IPlaylistService;

public class CreatePlaylistCommand implements ICommand{
    
    private final IPlaylistService playlistService;

    public CreatePlaylistCommand (IPlaylistService playlistService) {
        this.playlistService = playlistService;
    }

    // CREATE-PLAYLIST 1 MY_PLAYLIST_1 1 4 5 6         output: Playlist ID - 1\n"
    // CREATE-PLAYLIST 1 MY_PLAYLIST_2 1               output: "Playlist ID - 2\n"

    @Override
    public void execute(List<String> tokens) {
            String userId = tokens.get(1);
            String playlistName = tokens.get(2);
            String songIdString = tokens.get(3);
            String[] ids = songIdString.split(" ");
            List<String> songIds = Arrays.asList(ids);
        
            Playlist p = playlistService.create(userId, playlistName, songIds);
            System.out.println("Playlist ID - " + p.getId());
    }

}

