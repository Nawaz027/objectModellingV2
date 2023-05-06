package com.crio.jukebox.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import com.crio.codingame.repositories.IUserRepository;
import com.crio.jukebox.entities.Playlist;
import com.crio.jukebox.entities.Song;
import com.crio.jukebox.repositories.IPlaylistRepository;

public class PlaylistService implements IPlaylistService{

    private final IPlaylistRepository playlistRepository;

  
    public PlaylistService(IPlaylistRepository playlistRepository) {
        this.playlistRepository = playlistRepository;
    }




    @Override
    public Playlist create(String userId, String playlistName, List<String> songIds) {
        Playlist p = new Playlist(userId, playlistName, songIds);
        Playlist playlist = playlistRepository.save(p);
        return playlist;
    }

    @Override
    public String deletePlaylist(String userId, String playlistId) {
        if (playlistRepository.findById(userId) != null) {
            playlistRepository.deleteById(userId);
        };
        return null;
    }




    @Override
    public Song playPlaylist(String userId, String playlistId) {

        Optional<Playlist> p = null;
        if (playlistRepository.findById(userId) != null) {
            p = playlistRepository.findById(userId);
        }
        // String songId = p.songId;
       
        return null;
    }




    @Override
    public Playlist addSongToPlaylist(String userId, String playlistId, String songId) {
        // TODO Auto-generated method stub
        return null;
    }




    @Override
    public Playlist deleteSongFromPlaylist(String userId, String playlistId, String songId) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
