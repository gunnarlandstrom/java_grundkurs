package labb_3;
import java.util.Scanner;

/**
* Filnamn: PublisherTest2.java
* @author Gunnar Landström
* @version 1.0
* Datum: 2025-01-30
*
* Description:
* Constructs a publisher and asks for inputs of name and number.
*/

public class PublisherTest2 {
    public static void main(String[] args) {

        for (int i = 0; i < 20; i++){
            System.out.println();
        }
        
        Publisher publisherOne = new Publisher();
        Scanner input = new Scanner(System.in);

        System.out.print("What is the publishers name?: ");
        String publisherNameInput = input.nextLine();
        System.out.print("What phone-number can they be reached at?: ");
        String publisherPhoneNumberInput = input.nextLine();

        System.out.println("");
        publisherOne.setPublisherName(publisherNameInput);
        publisherOne.setPublisherPhoneNumber(publisherPhoneNumberInput);
        publisherOne.printPublisher();

        input.close();
    }
}
