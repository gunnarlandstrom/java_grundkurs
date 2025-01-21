package lektioner.Lektion8;
import java.io.*;
import java.util.*;

/**
 * Ex08_07 - WriteFile.java
 *
 * En klass som demonstrerar hur vi kan spara det användaren 
 * matar in från tangentbordet till en fil på hårddisken.
 * Utnyttjar felhantering med try och catch, men kunde
 * lika gärna slänga felen vidare med throws.
 * 
 * @author Robert Jonsson
 */
public class WriteFile {
    public static void main(String[] args) {
        // Try-block med de rader som kan generera något Exception
        try {
            // Skapar objekt för att läsa från tangentbordet
            Scanner input = new Scanner(System.in);

            // Frågar användaren till vilken fil data ska sparas
            System.out.print("To which file should the data be saved? ");
            String filename = input.nextLine();

            // Skapar objekt för att skriva till fil.
            // Finns inte filen sen tidigare skapas den.
            // Finns filen sen tidigare skrivs den över.
            FileWriter fw = new FileWriter(filename);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter output = new PrintWriter(bw);

            // Vi kan även kombinera allt på en rad enligt nedan (vilket är att föredra)
            // PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter(filename)));


            // Ber användaren skriva in första raden som ska sparas.
            // Trycker användaren enbart enter avslutar vi (loopen körs då inte).
            System.out.print("input> ");
            String line = input.nextLine();

            // Loopar så länge som längden på det inskrivna
            // är större än 0, dvs tills vi bara trycker enter.
            while (line.length() != 0) {
                // Skriver till filen med println (println-metoden finns i klassen PrintWriter)
                output.println(line);

                // Frågar efter en ny inmatning
                System.out.print("input> ");
                line = input.nextLine();
            }

            // Vi har nu läst in alla rader och anropar close för
            // att stänga filen, annars finns risk att inte allt sparas.
            output.close();
        }
        catch (IOException error) {
            // Här följer kod som tar hand om enventuella fel som fångats i try.
            // Vi skriver endast ut felmeddelandet.
            System.out.println("Error writing to file:\n" + error.getMessage());
        }
    }
}