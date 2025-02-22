package labb_5;

public class BOOK extends Media {
    private String bookAuthor;

    // Constructors 
    public BOOK(){

    }

    public BOOK(String author, String title, int length, Publisher publisher){
        this.bookAuthor = author;
        setMediaTitle(title);
        setMediaLength(length);
        setMediaPublisher(publisher);
    }

    // Setters
    public void setBookAuthor(String author){
        this.bookAuthor = author;
    }

    // Getters
    public String getBookAuthor(){
        return bookAuthor;
    }

    public String getBookLengthAsString(){
        String bookLength = String.valueOf(getMediaLength());

        return bookLength + " pages.";
    }

    public void printBOOK(){
        System.out.println("Author: " + bookAuthor);
        System.out.println("Title: " + getMediaTitle());
        System.out.println("Book length: " + getBookLengthAsString());
        System.out.println("Publisher: " + getMediaPublisher());

    }

    @Override
    public String toString(){
        return "@ Artist: " + getBookAuthor() + "\n Title: " + getMediaTitle() + "\n Length: " + getBookLengthAsString() + ". \n Publisher: " + getMediaPublisher();

    }



    
}
