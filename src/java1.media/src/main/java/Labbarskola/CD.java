package Labbarskola;
/**
 * Filnamn: PublisherTest2.java
 * @author Gunnar Landström
 * @version 1.0
 * Datum: 2025-01-30
 *
 * Description:
 * Declares the class Publisher and the desired methods.
 */


public class CD extends Media {
    private String songArtist;

    // Constructors
    public CD() {

    }

    public CD(String title, String artist, int length, Publisher objectPublisher) {

        this.songArtist = artist;
        setMediaTitle(title);
        setMediaLength(length);
        setMediaPublisher(objectPublisher);
    }

    // Artist Set/Get
    public void setSongArtist(String input) {
        this.songArtist = input;
    }

    
     // Return artist
    public String getSongArtist() {
        return songArtist;
    }

    // Get song length 00:00:00
    public String getSongLengthAsString() {
        int tempTime = getMediaLength();
        String songLength = (String.format("%02d:%02d:%02d seconds.", tempTime / 3600, (tempTime % 3600) / 60, (tempTime % 60)));

        return songLength;
    }

    // Prints
    public void printCD() {
        System.out.println("Artist: " + songArtist);
        System.out.println("Song name: " + getMediaTitle());
        System.out.println("Song length: " + getSongLengthAsString());
        System.out.println("Publisher: " + getMediaPublisher());
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "@ Artist: " + getSongArtist() + "\n Title: " + getMediaTitle() + "\n Length: " + getSongLengthAsString() + ". \n Publisher: " + getMediaPublisher();
    }

}
