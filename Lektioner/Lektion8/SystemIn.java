package lektioner.Lektion8;
import java.io.*;

/**
 * Ex08_05 - SystemIn.java
 *
 * En klass för att demonstrera hur vi läser data från
 * tangentbordet enbart med System.in.
 *
 * @author Robert Jonsson
 */
public class SystemIn {
    /** Klassmetod som läser tecken från tangentbordet med System.in.
     * Returnerar de lästa teckenen som en String när
     * anävndaren trycker enter (radbryt).
     */
    public static String readString() throws IOException {
        // Skriver ut en prompt
        System.out.print("\ninput> ");

        // Deklarerar variabel för att innehålla de inmatade tecknen
        StringBuilder s = new StringBuilder();

        /* Läser första tecknet från tangenbordet. Observera att
           System.in är en byte-ström (int returneras av metoden read)
           så vi måste göra en cast till typen char för att kunna
           skapa en sträng av det. Tecknet \n returneras när användaren
           trycker ner enter.
         */
        char ch = (char)System.in.read(); // read kan kasta IOException (som kastas vidare till main)

        // En while-loop som snurrar så länge som användaren inte trycker enter
        while (ch != '\n') {
            s.append(ch);
            
            // läs nästa tecken
            ch = (char)System.in.read();  // read kan kasta IOException (som kastas vidare till main)
        }

        // Returnerar det användaren matat in fram till radbrytningen.
        return s.toString();
    }

    public static void main(String[] args) throws IOException {
        String input = ""; // måste deklareras här för att nås i while

        // Gör så länge som det inmatade innehåller något tecken
        do {
            input = readString(); // readString kan kasta IOExdeption (som kastas vidare "från" main)
            System.out.println("You wrote: " + input);
        }
        while (input.length() > 1);
    }
}