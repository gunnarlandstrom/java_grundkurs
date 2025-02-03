package labb_3;

import labb_3.Publisher;

import java.util.Scanner;

public class CD {
    private String songTitle;
    private String songArtist;
    private int songLength;
    private Publisher songPublisher;

    // Title Set/Get
    public void setSongTitle(String input) {
        this.songTitle = input;
    }

    public String getSongTitle() {
        return songTitle;
    }

    // Artist Set/Get
    public void setSongArtist(String input) {
        this.songArtist = input;
    }

    public String getSongArtist() {
        return songArtist;
    }

    // Length Set/Get
    public void setSongLength(int input) {
        this.songLength = input;
    }

    public int getSongLength() {
        return songLength;
    }

    // Publisher Set/Get
    public void setSongPublisher(Publisher songPublisher) {
        this.songPublisher = songPublisher;
    }

    public void setSongPublisher(String inputName, String inputPhone) {
        Object publisherName = inputName;
        Object publisherNumber = inputPhone;
    }

    public Publisher getSongPublisher() {
        return songPublisher;
    }

    public void printCD() {
        System.out.println("Artist: " + songArtist);
        System.out.println("Song name: " + songTitle);
        System.out.println("Song length: " + songLength);
        System.out.println("Publisher: " + songPublisher);
    }

    public String toString() {
    return "@ " + getSongArtist() + "\n" + getSongTitle() + "\n" + getSongLength() + "\n";
    }

}
