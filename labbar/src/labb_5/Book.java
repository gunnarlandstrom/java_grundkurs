package labb_5;

public class Book extends Media {
    private String bookAuthor;

    // Constructors 
    public Book(){

    }

    public Book(String author, String title, int length, Publisher publisher){
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

    public String getBookLength(){
        String bookLength = String.valueOf(getMediaLength());

        return bookLength;
    }

    public void bookPrint(){

    }

    @Override
    public String toString(){

        return "fuck you";
    }



    
}
