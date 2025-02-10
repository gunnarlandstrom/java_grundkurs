package labb_3;

/**
 * Filnamn: PublisherTest2.java
 * @author Gunnar Landström
 * @version 1.0
 * Datum: 2025-01-30
 *
 * Description:
 * Declares the class Publisher and the desired methods.
 */


public class CD extends Publisher {
    private String songTitle;
    private String songArtist;
    private int songLength;
    private Publisher songPublisher;

    // Constructors
    public CD() {

    }

    public CD(String title, String artist, int length, Publisher objectPublisher) {

        this.songTitle = title;
        this.songArtist = artist;
        this.songLength = length;
        songPublisher = objectPublisher;
    }

    
    /** 
     * @param input
     */
    // Title Set/Get
    public void setSongTitle(String input) {
        this.songTitle = input;
    }

    
    /** 
     * @return String
     */
    public String getSongTitle() {
        return songTitle;
    }

    
    /** 
     * @param input
     */
    // Artist Set/Get
    public void setSongArtist(String input) {
        this.songArtist = input;
    }

    
    /** 
     * @return String
     */
    public String getSongArtist() {
        return songArtist;
    }

    
    /** 
     * @param input
     */
    // Length Set/Get
    public void setSongLength(int input) {
        this.songLength = input;
    }

    
    /** 
     * @return int
     */
    public int getSongLength() {
        return songLength;
    }

    
    /** 
     * @param object
     */
    // Publisher Set/Get
    public void setSongPublisher(Publisher object) {
        songPublisher = object;
    }

    
    /** 
     * @param inputName
     * @param inputPhone
     */
    public void setSongPublisher(String inputName, String inputPhone) {
        songPublisher = new Publisher(inputName, inputPhone);

    }

    
    /** 
     * @return Publisher
     */
    public Publisher getSongPublisher() {
        return songPublisher;
    }

    // Prints
    public void printCD() {
        System.out.println("Artist: " + songArtist);
        System.out.println("Song name: " + songTitle);
        System.out.println("Song length: " + songLength + " seconds.");
        System.out.println("Publisher: " + songPublisher);
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "@ Artist: " + getSongArtist() + "\n Title: " + getSongTitle() + "\n Length: " + getSongLength() + " seconds. \n Publisher: " + getSongPublisher();
    }

}
