package lektioner.Lektion8;
import java.io.*;
import java.util.*;

/**
 * Ex08_08 - ReadFile.java
 *
 * En klass som demonstrerar hur vi kan läsa
 * text från en fil och skriva ut den på skärmen.
 *
 * @author Robert Jonsson
 */
public class ReadFile {
    public static void main(String[] args) {
        try {
            // Skapar objekt för att läsa från tangentbordet
            Scanner input = new Scanner(System.in);

            // Frågar användaren till vilken fil data ska sparas
            System.out.print("From which file should the data be read? ");
            String filename = input.nextLine();

            // Skapar objekten för att läsa från fil.
            //  Finns inte filen kastas ett FileNotFoundException.
            FileReader in = new FileReader(filename);
            BufferedReader file  = new BufferedReader(in);

            // Läser första raden
            String line = file.readLine();

            // När filen är slut blir 'line' (den lästa raden i filen) null
            while (line != null) {
                System.out.println(line); // Skriver ut på skärmen
                line = file.readLine();  // Läser nästa rad
            }

            // Stänger strömmen (filen)
            file.close();
        }
        catch (IOException e) {
            // Fångar eventuella fel. Prova t.ex. att ange en fil som inte finns.
            System.out.println("Error reading file:\n" + e.getMessage());
        }
    }
}