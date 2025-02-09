import java.util.Scanner;

/**
 * Ex04_12 - ForTest
 *
 * Visar användning for-loopen för att upprepa.
 * Frågar användaren efter hur många tal som ska adderas
 * och därefter får användaren mata in lika många tal.
 *
 * @author Robert Jonsson
 */
public class ForTest {
    public static void main(String[] args) {
        // Skapar objektet för inläsninga från tangentbord
        Scanner input = new Scanner(System.in);

        // Fråga användaren efter antal additioner
        System.out.print("How many numbers do you want to add? ");
        int noOfNumbers = input.nextInt();

        // Deklarerar en variabel för summan
        int sum = 0;

        // Loop som frågar efter tal att addera
        for (int i = 0; i < noOfNumbers; i++) {
            System.out.print("Enter integer no. " + (i + 1) + ": ");
            sum += input.nextInt();
        }

        // Skriver ut summan
        System.out.println("The sum of all the numbers is " + sum);
    }
}