package labb_5;


public class DVD extends Media {
    private int ageLimit;

    // Constructors
    public DVD() {

    }

    public DVD(String title, int length, int ageLimit, Publisher publisher) {
        setMediaTitle(title);
        setMediaLength(length);
        setDvdAgeLimit(ageLimit);
        setMediaPublisher(publisher);
    }

    // Setter
    public void setDvdAgeLimit(int input) {
        if (input < 0) {
            input = 0;
        } else {

            this.ageLimit = input;
        }
    }

    // Getters
    public int getDvdAgeLimit() {
        return ageLimit;
    }

    public String getDvdLengthAsString() {

        int s = getMediaLength();
        String duration = (String.format("%02dh %02dm %02ds", s / 3600, (s % 3600) / 60, (s % 60)));
        return duration;
    }

    public void printDVD() {
        System.out.println("Title: " + getMediaTitle());
        System.out.println("Length: " + getDvdLengthAsString());
        System.out.println("Age limit: " + getDvdAgeLimit());
        System.out.println("Publisher: " + getMediaPublisher());

    }

    public String toString() {

        return "Title: " + getMediaTitle() + "\nLength: " + getDvdLengthAsString() + "\nAge: " + getDvdAgeLimit()
                + "\n Publisher: " + getMediaPublisher();
    }

}
