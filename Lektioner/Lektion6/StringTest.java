import java.util.Scanner;

/**
 * Ex06_04 - StringTest
 *
 * En klass som visar att String inte är så effektiv
 * att använda om man ska tilldela strängen nya värden
 * många gånger, t.ex. i en loop. Programet kör en loop
 * från 0 till 100 000 och bygger på en sträng med värdet
 * i loopvariabeln. Strängen kommer alltså att se ut så:
 *
 * 012345678910111213141516....99999
 *
 * @author Robert Jonsson
 */
public class StringTest {
    public static void main(String[] args) {
        int noOfStrings = 100_000;
        String s = "";

        System.out.println("Adding " + noOfStrings + " strings");

        // Tar tiden innan vi startar loopen ...
        System.out.print("Start");
        long startTime = System.currentTimeMillis(); // Nuvarande tid i antal millisekunder

        
        for (int i = 0; i < noOfStrings; i++) {
            // Adderar värdet i loopvariabeln till sträng s1.
            // Kom ihåg från lektionen hur skapandet av strängar går till.
            s += i;
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

        System.out.println(s);
    }
}