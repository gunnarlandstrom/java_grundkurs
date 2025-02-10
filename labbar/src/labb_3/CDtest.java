
/**
 * Filnamn: PublisherTest2.java
 * @author Gunnar Landström
 * @version 1.0
 * Datum: 2025-02-10
 *
 * Description:
 * Tests the CD and publisher class
 */

import java.util.Scanner;

public class CDtest {

    
    /** 
     * @param args
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Publisher publisherOne = new Publisher("Random records", "022-354 123");
        CD cdOne = new CD("Tribute", "Tenacious D", 412, publisherOne);
        CD cdTwo = new CD();
        CD cdThree = new CD();

        cdTwo.setSongArtist("Falling in Reverse");
        cdTwo.setSongTitle("Popular monster");
        cdTwo.setSongLength(519);
        cdTwo.setSongPublisher("Records and shiet", "071-231 23 12");
        
        System.out.print("What is the artists name?: ");
        String tempArtist = input.nextLine();
        System.out.print("What is the title of the song?: ");
        String tempTitle = input.nextLine();
        System.out.print("How long is the song?: ");
        int tempLength = input.nextInt();
        
        
        cdThree.setSongPublisher(cdOne.getSongPublisher());
        
        cdThree.setSongArtist(tempArtist);
        cdThree.setSongTitle(tempTitle);
        cdThree.setSongLength(tempLength);
        System.out.println();
        
        cdOne.printCD();
        cdTwo.printCD();
        cdThree.printCD();

        System.out.print(cdOne.toString());

        input.close();
    }

}
