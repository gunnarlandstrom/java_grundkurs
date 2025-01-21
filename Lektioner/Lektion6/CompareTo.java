package lektioner.Lektion6;
import java.util.Scanner;

/**
 * Ex06_03 - CompareTo
 *
 * En klass för att demonstrera metoden compareTo.
 * Användaren får mata in två ord och programet
 * skriver sen ut vilket ord som kommer före i
 * alfabetet. Fungerar inte med de svenska bokstäverna.
 *
 * @author Robert Jonsson
 */
public class CompareTo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word1;  // Första ordet
        String word2;  // Andra ordet

        System.out.print("Enter first word> ");
        word1 = input.nextLine();

        // Loopar så länge som första ordet inte är en tom sträng (enbart tryckt på enter)
        while (!word1.equalsIgnoreCase("")) {
            System.out.print("Enter second word> ");
            word2 = input.nextLine();

            // Kontrollerar vilket ord som kommer först (alfabetisk ordning).
            // Observera att compareTo inte tar hänsyn till åäö.
            if (word1.compareTo(word2) < 0) {
                System.out.println(word1 + " is before " + word2);
            }
            else if (word1.compareTo(word2) > 0) {
                System.out.println(word2 + " is before " + word1);
            }
            else {
                System.out.println(word1 + " and " + word2 + " are equal");
            }

            System.out.print("\nEnter first word> ");
            word1 = input.nextLine();
        }
    }
}