package lektioner.Lektion6;

import java.util.Scanner;

/**
 * Ex06_01 - StringReverser
 *
 * En klass för att testa enkla operationer på en sträng.
 * Användaren får mata in ett ord/mening och programet
 * skriver ut strängen fast bakvänt. Använder metoderna
 * charAt och length till detta.
 *
 * @author Robert Jonsson
 */
public class StringReverser {
    public static void main(String[] args) {
        // Skapar objekt för att läsa från tangentbord
        Scanner input = new Scanner(System.in);

        System.out.print("Write something and I will reverse it> ");
        String sentence = input.nextLine();

        // Tar reda på den inmatade strängens längd
        int length = sentence.length();

        //En for-loop vars initieringsvariabel börjar på högsta index
        // i strängen och minskar med ett efter varje varv i loopen.
        for (int i = length - 1; i >= 0; i--) {
            // Skriver ut tecknet på index i
            System.out.print(sentence.charAt(i));
        }

        // Radbrytning
        System.out.println();
    }
}