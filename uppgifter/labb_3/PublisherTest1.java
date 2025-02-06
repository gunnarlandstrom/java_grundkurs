package labb_3;

/**
* Filnamn: PublisherTest1.java
* @author Gunnar Landström
* @version 1.0
* Datum: 2025-01-30
*
* Description:
* Constructs three publisher and assigns values to them, prints amount of objects created.
*/

public class PublisherTest1 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++){
            System.out.println();
        }

        // Publisher one.
        Publisher publisherOne = new Publisher("Bookers", "535-555 32 14");
        publisherOne.printPublisher();
        
        // Publisher two.
        Publisher publisherTwo = new Publisher("Letters and Shiet", "535-555 14 32");
        publisherTwo.printPublisher();
        
        // Publisher three.
        Publisher publisherThree = new Publisher("Daily Bugle", "312-475 13 37");
        publisherThree.printPublisher();
        
        System.out.println(publisherThree.toString());
    }

}
