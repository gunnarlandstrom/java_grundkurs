package labb_5;

public class DVDtest extends Media {

    public static void main(String[] args){

        
        DVD dvd1 = new DVD("Harry Potter", 123921, 18, new Publisher("Publisher one", "Phone: 123-123"));
        DVD dvd2 = new DVD("The Hobbit", 102817, 18, new Publisher("Publisher one", "Phone: 123-123"));
        CD cd1 = new CD("Dancing queen", "Abba", 1337 , new Publisher("Publisher two", "Phone: 345-345"));
        CD cd2 = new CD("Bohemian Rhapsody", "Queen", 6712 , new Publisher("Publisher two", "Phone: 345-345"));
        BOOK book1 = new BOOK("The Pope", "The Bible", 14281 , new Publisher("Publisher three", "Phone: 678-678"));
        BOOK book2 = new BOOK("Jesus", "The Holocaust", 871 , new Publisher("Publisher three", "Phone: 678-678"));
        
        dvd1.printDVD();
        dvd2.printDVD();
        cd1.printCD();
        cd2.printCD();
        book1.printBOOK();
        book2.printBOOK();
    }

}
