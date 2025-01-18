import java.util.Scanner;

/**
 * Ex06_05 - StringBuilderTest
 *
 * En klass som visar att StringBuilder är mer effektiv
 * att använda, än en String, om man ska tilldela strängen
 * nya värden många gånger. Programet kör en loop
 * från 0 till 100000 och bygger på en strängbyggare med värdet
 * i loopvariabeln. Strängen kommer alltså att se ut så:
 *
 * 012345678910111213141516....99999
 *
 * @author Robert Jonsson
 */
public class StringBuilderTest {
    public static void main(String[] args) {
        int noOfStrings = 100_000;
        StringBuilder s = new StringBuilder();

        System.out.println("Appending " + noOfStrings + " strings");

        // Tar tiden innan vi startar loopen ...
        System.out.print("Start");
        long startTime = System.currentTimeMillis(); // Nuvarande tid i antal millisekunder

        
        for (int i = 0; i < noOfStrings; i++) {
            // Adderar värdet i loopvariabeln till sträng s1.
            // Kom ihåg från lektionen hur skapandet av strängar går till.
            s.append(i);
            if (i % 2_000 == 0) {
                // Skriv ut en punkt var 2000:e addition
                System.out.print('.');
            }
        }

        // ... och tiden efter att loopen är klar
        long endTime = System.currentTimeMillis();
        System.out.println("done");

        // Skriver ut skillnaden ==> tiden det tog i ms
        System.out.println("Time " + (endTime - startTime) + " ms");

        // Ber användaren trycka enter innan strängen skrivs ut.
        Scanner input = new Scanner(System.in);

        System.out.print("\nPress enter to print the content of the string");
        input.nextLine();

        System.out.println(s.toString());
    }
}