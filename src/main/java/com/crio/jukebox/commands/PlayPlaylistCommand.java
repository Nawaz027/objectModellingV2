package com.crio.jukebox.commands;

import java.util.List;
import com.crio.jukebox.entities.Song;
import com.crio.jukebox.services.IPlaylistService;

public class PlayPlaylistCommand implements ICommand{

    private final IPlaylistService playlistService;

    public PlayPlaylistCommand (IPlaylistService playlistService) {
        this.playlistService = playlistService;
    }

    //PLAY-PLAYLIST 1 1
    //output: "Current Song Playing\n"+
        // "Song - South of the Border\n"+
        // "Album - No.6 Collaborations Project\n"+
        // "Artists - Ed Sheeran,Cardi.B,Camilla Cabello\n"+
    @Override
    public void execute(List<String> tokens) {
       String userId = tokens.get(1);
       String playlistId = tokens.get(2);
       Song s = playlistService.playPlaylist(userId, playlistId);
       System.out.println("Current Song Playing" + s.name + s.album + s.artists);
       
        
    }
}
