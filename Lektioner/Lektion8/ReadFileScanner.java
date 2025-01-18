import java.io.*;
import java.util.*;

/**
 * Ex08_10 - ReadFileScanner.java
 *
 * En klass som demonstrerar hur vi kan använda Scanner för 
 * att läsa data från en fil och skriva ut innehållet på skärmen.
 * En Scanner "sväljer" eventuella IOException, men vi behöver 
 * fortfarande hantera FileNotFoundException.
 *
 * @author Robert Jonsson
 */
public class ReadFileScanner {
    public static void main(String[] args) {
        try {
            // Skapar objekt för att läsa från tangentbordet
            Scanner input = new Scanner(System.in);

            // Frågar användaren till vilken fil data ska sparas
            System.out.print("From which file should the data be read? ");
            String filename = input.nextLine();

            // Skapar objekten för att läsa från fil.
            // Vad händer om filen inte finns nu när ingen try-catch används!?
            Scanner file  = new Scanner(new File(filename)); // måste skapa ett File-objekt när vi läser fil med Scanner

            // Läser första raden
            String line = file.nextLine();

            // När filen är slut kommer hasNextLine att returnera false
            while (file.hasNextLine()) {
                System.out.println(line); // Skriver ut på skärmen
                line = file.nextLine();  // Läser nästa rad
            }

            // Stänger strömmen (filen)
            file.close();
        }
        catch (FileNotFoundException e) {
            // Fångar eventuella fel som uppstår för att filen inte finns.
            System.out.println("Error reading file:\n" + e.getMessage());
        }
    }
}