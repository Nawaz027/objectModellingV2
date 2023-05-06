package com.crio.jukebox;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import com.crio.jukebox.appConfig.ApplicationConfig;
import com.crio.jukebox.commands.CommandInvoker;
import com.crio.jukebox.dtos.SongInfoDto;



public class App {
    // To run the application  ./gradlew run --args="INPUT_FILE=jukebox-input.txt"
	public static void main(String[] args) {
        List<String> commandLineArgs = new LinkedList<>(Arrays.asList(args));
        String expectedSequence = "INPUT-FILE";
        String actualSequence = commandLineArgs.stream()
                .map(a -> a.split("=")[0])
                .collect(Collectors.joining("$"));
        if(expectedSequence.equals(actualSequence)){
            run(commandLineArgs);
        }
		
	}
    

    public static void run(List<String> commandLineArgs) {
    // Complete the final logic to run the complete program.
    ApplicationConfig applicationConfig = new ApplicationConfig();
    System.out.print(commandLineArgs);
        CommandInvoker commandInvoker = applicationConfig.getCommandInvoker();
        BufferedReader reader;
        String inputFile = commandLineArgs.get(0).split("=")[1];
        commandLineArgs.remove(0);
        try {
            reader = new BufferedReader(new FileReader(inputFile));
            String line = reader.readLine();
            while (line != null) {
                List<String> tokens = Arrays.asList(line.split(" "));
                commandInvoker.executeCommand(tokens.get(0),tokens);
                // read next line
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}



// public static void main(String[] args) {
//     List<String> commandLineArgs = new LinkedList<>(Arrays.asList(args));
//     String expectedSequence = "INPUT-FILE";
//     String actualSequence = commandLineArgs.stream()
//             .map(a -> a.split("=")[0])
//             .collect(Collectors.joining("$"));
//     if(expectedSequence.equals(actualSequence)){
//         run(commandLineArgs);
//     }
// }

// public static void run(List<String> commandLineArgs) {
// // Complete the final logic to run the complete program.

// }

























// List<SongInfoDto> songsList = getSongDetails("/home/crio-user/workspace/nawazsiddiqui27-ME_OBJECT_MODELING_V2/songs.csv");
//         for (SongInfoDto info: songsList) {
//             System.out.println(info);
//         }

//     private static List<SongInfoDto> getSongDetails(String file) {
//         List<SongInfoDto> songsList = new ArrayList<>();
//         Path pathToFile = Paths.get(file);
        
//         try(BufferedReader br = Files.newBufferedReader(pathToFile)) {
//             String row = br.readLine();
//             while (row != null) {
//                 String[] attributes = row.split(",");
//                 SongInfoDto info = getOneSongInfo(attributes);
//                 songsList.add(info);
//                 row = br.readLine();
//             }
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
        
//         return songsList;
//     }

//     private static SongInfoDto getOneSongInfo(String[] attributes) {
//         Integer id = Integer.parseInt(attributes[0]);
//         String songName = attributes[1];
//         String genre = attributes[2];
//         String albumName = attributes[3];
//         String leadArtist = attributes[4];
//         String allArtist = attributes[5];

//         SongInfoDto info = new SongInfoDto(id, songName, genre, albumName, leadArtist, allArtist);
//         return info;
//     }