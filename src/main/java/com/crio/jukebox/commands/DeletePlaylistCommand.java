package com.crio.jukebox.commands;

import java.util.List;
import com.crio.jukebox.entities.Playlist;
import com.crio.jukebox.services.IPlaylistService;

public class DeletePlaylistCommand implements ICommand{

    private final IPlaylistService playlistService;

    public DeletePlaylistCommand (IPlaylistService playlistService) {
        this.playlistService = playlistService;
    }

    //DELETE-PLAYLIST 1 2
    //Output: Delete Successful
    @Override
    public void execute(List<String> tokens) {
        String userId = tokens.get(1);
        String playlistId = tokens.get(2);
        String p = playlistService.deletePlaylist(userId, playlistId);
        System.out.println("Delete Successful");

        
    }

}