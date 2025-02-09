import java.util.Scanner; // I stället för * kan vi specificera klass att importera

/**
 * Ex04_10 - IfTest
 *
 * Visar olika sätt att använda if-satsen.
 * Frågar användaren efter ett tal och utför
 * därefter några testar på talet.
 *
 * @author Robert Jonsson
 */
public class IfTest {
    public static void main(String[] args) {
        // Skapar objektet för inläsninga från tangentbord
        Scanner input = new Scanner(System.in);

        // Fråga användaren efter ett tal
        System.out.print("Enter an integer: ");
        int number = input.nextInt(); // Med Scanner kan vi direkt läsa tal

        // Kollar om talet är positivt eller negativt
        if (number > 0) {
            System.out.println("Your number is positive");
        }
        else if (number < 0) {
            System.out.println("Your number is negative");
        }
        else {
            System.out.println("Your number is zero");
        }


        // Kollar om talet är större än 10 men mindre än 20
        if (number > 10) {
            if (number < 20) {
                System.out.println("Your number is between 10 and 20");
            }
            else {
                System.out.println("Your number is 20 or higher");
            }
        }
        else {
            System.out.println("Your number is 10 or lower");
        }
        
        // Ett annat sätt att kolla om talet är > 10 men < 20
        if (number > 10 && number < 20) {
            System.out.println("Your number is between 10 and 20");
        }
        else {
            System.out.println("Your number is not between 10 and 20");
        }

        // Testar om talet multiplicerat med 2 är lika med 30.
        // Resultatet (true eller false) lagrar vi i variabeln equals30.
        boolean equals30 = number * 2 == 30;

        System.out.print(number + " * 2 == 30 is ");

        // Kollar om vårt test är sant eller falskt
        if (equals30) {
            System.out.println("true!");
        }
        else {
            System.out.println("not true!");
        }

        // Här kan vi använda villkorsoperatorn för att kontrollera om
        //sant eller falskt ska användas direkt i utskriften
        System.out.println(number + " * 2 == 30 is " + (equals30 ? "true!" : "not true!"));
    }
}