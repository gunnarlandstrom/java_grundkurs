// Imorterar alla klasser i paketet java.util där bl.a klassen Scanner finns.
import java.util.*;

/**
 * Ex02_02 - Input2
 *
 * Visar hur vi använder klassen Scanner för att läsa data från tangentbordet.
 */
public class Input2 {
    // Med en Scanner behöver vi inte kasta bort några I/O-fel
    public static void main(String[] args) {
        /* Deklarerar två variabler av typen String. När vi läser från tangentbordet 
           med Scanner är det en sträng som returnerars av nextLine.
        */
        String firstName;
        String lastName;
        
        /* Skapar ett objekt av klassen Scanner (kallar objektet för input).
           Detta objekt använder vi när vi vill läsa från tangentbordet.
        */
        Scanner input = new Scanner(System.in);
        
        /* Vi kan nu använda objektet input när vi vill läsa från tangentbordet genom 
           att anropa metoden nextLine. Denna metod returnerar alla inskrivna tecken
           fram till och med när tangenten Enter trycks in.
        */
        
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
    }
}