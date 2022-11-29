package chapter16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutionException;

public class JukeBox3 {
    ArrayList<Song> songArrayList = new ArrayList<Song>();

    public static void main(String[] args) {

    }

    public void go() {
        getSongs();
        System.out.println(songArrayList);

        System.out.println(songArrayList);
    }

    void getSongs() {
        try {
            File file = new File("SongList.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null) {
                addSong(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void addSong(String lineToParse) {
        String[] tokens = lineToParse.split("/");

        Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
        songArrayList.add(nextSong);
    }
}
