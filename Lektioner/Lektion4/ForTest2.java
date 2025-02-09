import java.util.Scanner;

/**
 * Ex04_13 - ForTest2
 *
 * Visar hur nästlade for-loopar kan användas
 * för att skriva ut "tabeller".
 *
 * @author Robert Jonsson
 */
public class ForTest2 {
    public static void main(String[] args) {
        // Skapar objektet för inläsninga från tangentbord
        Scanner input = new Scanner(System.in);

        // Frågar efter höjd och bredd
        System.out.print("Enter height: ");
        int height = input.nextInt();

        System.out.print("Enter width: ");
        int width = input.nextInt();

        // Ritar ut rektangeln
        for (int row = 0; row < height; row++) {        // Antal rader
            for (int col = 0; col < width; col++) {    // Antal kolumner
                System.out.print("#");
            }

            // Radbrytning efter varje "rad i tabellen"
            System.out.println();
        }
    }
}