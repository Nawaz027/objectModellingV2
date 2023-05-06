package com.crio.jukebox.commands;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.crio.jukebox.dtos.SongInfoDto;
import com.crio.jukebox.entities.Song;
import com.crio.jukebox.services.ISongService;
import com.crio.jukebox.services.ISongService;

public class LoadDataCommand implements ICommand{

    private final ISongService songService;

    public LoadDataCommand (ISongService songService) {
        this.songService = songService;
    }



    // LOAD-DATA songs.csv
    @Override
    public void execute(List<String> tokens) {
        List<SongInfoDto> songs = getSongDetails("/home/crio-user/workspace/nawazsiddiqui27-ME_OBJECT_MODELING_V2/songs.csv");
        
        for (SongInfoDto info: songs) {
            String temp = info.allArtist;
            String[] artistNames = temp.split("#");
            List<String> artists = Arrays.asList(artistNames);
            songService.create(info.songId.toString(), info.songName, info.albumName, artists);
        }
        System.out.println("Songs Loaded successfully");
    }

    // String userId = tokens.get(1);
    //         String playlistName = tokens.get(2);
    //         String songIdString = tokens.get(3);
    //         String[] ids = songIdString.split(" ");
    //         List<String> songIds = Arrays.asList(ids);
        
    //         Playlist p = playlistService.create(userId, playlistName, songIds);
    //         System.out.println("Playlist ID - " + p.getId());
        


      public List<SongInfoDto> getSongDetails(String file) {
            List<SongInfoDto> songsList = new ArrayList<>();
            Path pathToFile = Paths.get(file);
            
            try(BufferedReader br = Files.newBufferedReader(pathToFile)) {
                String row = br.readLine();
                while (row != null) {
                    String[] attributes = row.split(",");
                    SongInfoDto info = getOneSongInfo(attributes);
                    songsList.add(info);
                    row = br.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            
            return songsList;
        }
    
        public static SongInfoDto getOneSongInfo(String[] attributes) {
            Integer id = Integer.parseInt(attributes[0]);
            String songName = attributes[1];
            String genre = attributes[2];
            String albumName = attributes[3];
            String leadArtist = attributes[4];
            String allArtist = attributes[5];
    
            SongInfoDto info = new SongInfoDto(id, songName, genre, albumName, leadArtist, allArtist);
            return info;
        }
        
    
    
}