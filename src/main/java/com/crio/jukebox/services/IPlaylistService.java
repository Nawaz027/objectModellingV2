package com.crio.jukebox.services;

import java.util.List;
import com.crio.jukebox.entities.Playlist;
import com.crio.jukebox.entities.Song;

public interface IPlaylistService {
    public Playlist create(String userId, String playlistName, List<String> songIds);
    public String deletePlaylist(String userId, String playlistId);
    public Song playPlaylist(String userId, String playlistId);
    public Playlist addSongToPlaylist(String userId, String playlistId, String songId);
    public Playlist deleteSongFromPlaylist(String userId, String playlistId, String songId);

}
