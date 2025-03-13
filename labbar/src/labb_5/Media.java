package labb_5;

public class Media extends Publisher {

    protected String mediaTitle;
    protected int mediaLength;
    protected Publisher mediaPublisher;


    // Constructors

    public Media() {

    }

    public Media(String title, int length, Publisher publisher) {

        if (length < 0) {
            length = 0;
        } else {

            this.mediaTitle = title;
            this.mediaLength = length;
            this.mediaPublisher = publisher;
        }

    }

    // Setters
    public void setMediaTitle(String title) {
        this.mediaTitle = title;
    }

    public void setMediaLength(int length) {
        this.mediaLength = length;
    }

    public void setMediaPublisher(Publisher publisher) {
        this.mediaPublisher = publisher;
    }

    public void setMediaPublisher(String name, String phone) {
        new Publisher(name, phone);
    }

    // Getters
    public String getMediaTitle() {
        return mediaTitle;
    }

    public int getMediaLength() {
        return mediaLength;
    }

    public Publisher getMediaPublisher() {
        return mediaPublisher;
    }

    // Printers
    public void mediaPrint() {

        System.out.println("Title: " + getMediaTitle());
        System.out.println("Length: " + getMediaLength());
        System.out.println("Publisher : " + getMediaPublisher());
    }

    @Override
    public String toString() {

        return "Fuck you";
    }

}
