package com.example.musicplayer;
import java.util.ArrayList;
public class MusicList {
    private static  ArrayList<Music> musicarray = new ArrayList<>();
    private MusicList(){}

    public static ArrayList<Music> getMusicList()
    {
        return musicarray;
    }
}
