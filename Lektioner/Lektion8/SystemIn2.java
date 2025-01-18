import java.io.*;

/**
 * Ex08_06 - SystemIn2.java
 *
 * En klass för att demonstrera hur vi läser data från
 * tangentbordet med System.in nästlad i en BufferedReader.
 *
 * @author Robert Jonsson
 */
public class SystemIn2 {
    /** Klassmetod som läser tecken från tangentbordet med System.in.
     * Returnerar de lästa teckenen som en String när
     * anävndaren trycker enter (radbryt).
     */
    public static String readString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(isr);

        System.out.print("\ninput> ");
        return input.readLine(); // readLine kan kasta ett IOException (som kastas vidare till main)
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