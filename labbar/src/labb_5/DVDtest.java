package labb_5;

public class DVDtest extends Media {

    public static void main(String[] args){

        
        DVD dvd1 = new DVD("Kalle Kongo", 1337, 18, new Publisher("Publisher one", "Publisher 123"));
        CD cd1 = new CD("Dancing queen", "Abba", 1337 , new Publisher("Publisher two", "Publisher 345"));
        BOOK book1 = new BOOK("The Pope", "The Bible", 1337 , new Publisher("Publisher three", "Publisher 678"));
        
        dvd1.printDVD();
        cd1.printCD();
        book1.printBOOK();
    }

}
