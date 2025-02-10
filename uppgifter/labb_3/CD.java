package labb_3;

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
    public void setSongPublisher(Publisher object) {
        songPublisher = object;
    }

    public void setSongPublisher(String inputName, String inputPhone) {
        songPublisher = new Publisher(inputName, inputPhone);

    }

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

    public String toString() {
        return "@ Artist: " + getSongArtist() + "\n Title: " + getSongTitle() + "\n Length: " + getSongLength() + " seconds. \n Publisher: " + getSongPublisher();
    }

}
