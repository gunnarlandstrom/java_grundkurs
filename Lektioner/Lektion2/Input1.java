// Importerar klassen Scanner som används för att läsa in data
import java.util.Scanner;
/**
 * Ex02_01 - Input1
 *
 * Visar hur vi använder Scanner för att läsa data från tangentbordet.
 *
 * @author Robert Jonsson, modifierad av Lars Lundin
 */
public class Input1 {
    public static void main(String[] args) {
        /* Deklarerar två variabler av typen String. När vi läser från tangentbordet
           med Scanner returneras användarens inmatning som en sträng.
        */
        String firstName;
        String lastName;

        /* Skapar ett objekt av klassen Scanner (kallar objektet för input).
           Detta objekt använder vi när vi vill läsa från tangentbordet. Med Scanner
           kan vi enkelt läsa in olika datatyper som strängar, heltal eller flyttal.
        */
        Scanner input = new Scanner(System.in);

        /* Frågar efter förnamnet och lagrar det i variabeln firstName.
           OBS! Vi använder inte println eftersom vi vill att det användaren skriver
           in med tangentbordet ska hamna på samma rad som uppmaningen 'Ange ditt förnamn...'.
        */
        System.out.print("Ange ditt förnamn.... ");
        firstName = input.nextLine();

        // Frågar efter efternamnet och lagrar det i lastName
        System.out.print("Ange ditt efternamn.. ");
        lastName = input.nextLine();

        // Skriver ut användarens namn (inleder med en radbrytning med tecknet \n)
        System.out.println("\nDu heter " + firstName + " " + lastName);

        /* Stänger Scanner-objektet för att frigöra resurser. Detta är god praxis
           när vi använder Scanner för att läsa från System.in.
        */
        input.close();
    }
}
