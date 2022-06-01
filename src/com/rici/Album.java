package com.rici;

import java.util.ArrayList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist, ArrayList<Song> songs) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }
    public Album() {

    }

    public Song findSong(String title) {
        for(Song checkedSong : songs) {
            if(checkedSong.getTitle().equals(title)) return checkedSong;
        }
        return null;
    }
    public boolean addSong(String title, double duration) {
        if(findSong(title) == null) {
            songs.add(new Song(title,duration));
            System.out.println(title + "Uspesne pridane do listu");
            return true;
        }
        else {
            System.out.println("Pesnicka s tymto nazvom"+title+"uz existuje");
            return false;
        }
    }
}
