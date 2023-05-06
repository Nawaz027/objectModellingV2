package com.crio.jukebox.entities;


import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("UserTest")
public class UserTest {

//     @Test
//     @DisplayName("checkIfPlaylistExists should Return True If Playlist Found")
//     public void checkIfPlaylistExists_ShouldReturnTrue(){

//     String id = "1";
//     String userName = "Nawaz";
//     // List<String> artistNames = new ArrayList<>();
//     List<Song> songs = new ArrayList<Song>() {
//         {
//             add(new Song("1", "abc", "def", null));
//             add(new Song("2", "fke", "xyz", null));
//         }
        
//     };
//     // User user = new User("2",name, 0, new ArrayList<Contest>(){{ add(contest); }});
//     List<String> songId = new ArrayList<>();
//     for (Song s : songs) {
//         songId.add(s.getId());
//     }
//     Playlist playlist = new Playlist("2", "1", userName, songId);
//     // List<Playlist> playlist = new ArrayList<Playlist>();
//     User user = new User(id, userName, new ArrayList<Playlist>() {{ add(playlist);}});
//     Assertions.assertTrue(user.checkIfPlaylistExists(playlist));

// }

// @Test
// @DisplayName("checkIfPlaylistExists should Return False If Playlist Not Found")
// public void checkIfPlaylistExists_ShouldReturnFalse(){

// String id = "1";
// String userName = "Nawaz";
// // List<String> artistNames = new ArrayList<>();
// List<Song> songs = new ArrayList<Song>() {
//     {
//         add(new Song("1", "abc", "def", null));
//         add(new Song("2", "fke", "xyz", null));
//     }
    
// };
// // User user = new User("2",name, 0, new ArrayList<Contest>(){{ add(contest); }});
// List<String> songId = new ArrayList<>();
// for (Song s : songs) {
//     songId.add(s.getId());
// }
// Playlist playlist1 = new Playlist("3", "1", userName, songId);
// Playlist playlist2 = new Playlist("2", "2", userName, songId);

// // List<Playlist> playlist = new ArrayList<Playlist>();
// User user = new User(id, userName);
// Assertions.assertFalse(user.checkIfPlaylistExists(playlist2));

}
