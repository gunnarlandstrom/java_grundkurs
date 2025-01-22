package lektioner.Lektion6;

import java.util.*;    // Scanner
import java.io.*;    // File, FileNotFoundException

/**
 * Ex06_07 - ScannerTest
 *
 * En klass som använder Scanner för att läsa data från
 * både tangentbordet och från en fil. Programmet frågar
 * användaren vilken fil som ska läsas in och listar sen
 * filens innehåll på skärmen. Använder även metoden
 * format för att formatera utskriften.
 *
 * @author Robert Jonsson
 */
public class ScannerTest {
    /* Eftersom vi ska läsa från en fil måste main kasta vidare eventuella
       FileNotFoundException. Ett sådant fel sker om vi försöker öppna en
       fil som inte finns. Normalt använder vi try-catch för att hantera
       denna typ av fel, men inte i denna kurs.
    */
    public static void main(String[] args) throws FileNotFoundException {
        // För att läsa från tangentbordet
        Scanner keyboard = new Scanner(System.in);

        // Frågar användaren hur många gånger innehållet i filen ska listas
        System.out.print("How many times should the content of the file be printed: ");
        int noOfTimes = keyboard.nextInt();

        // Eftersom vi nu ska läsa in en sträng (efter ett tal) måste vi "rensa" radbrytstecknet
        keyboard.nextLine();

        // Frågar användaren efter vilken fil som ska läsas in (t.ex: MinFil.txt)
        System.out.print("Enter the name of the file: ");
        String fileName = keyboard.nextLine();

        // Skapar en variabel för att skriva ut radnummer
        int lineNumber = 0;

        // En for-loop som körs lika många gånger som användaren angav
        for (int i = 0; i < noOfTimes; i++) {
            // För att läsa från filen
            Scanner file = new Scanner(new File(fileName));

            // En while-loop som läser alla rader från filen.
            // Metoden hasNext returnerar true så länge som det finns mer
            // data att läsa (spelar ingen roll om det är tal eller text).
            while (file.hasNext()) {
                // Börjar med att öka på radnumret med 1
                lineNumber++;

                // Läser nästa rad från filen till en temporär sträng
                String tmp = file.nextLine();

                // Skriver ut radnummer + raden från filen.
                // Använder System.out.format för att formatera utskriften
                // så att radnummer alltid skrivs ut med minst 3 positioner
				// där siffran 0 används för utfyllnad.
                System.out.format("%03d - %s\n", lineNumber, tmp);
            }

			// När vi läser/skriver filer ska vi alltid stänga filen när vi är klar
            keyboard.close();
			file.close();
        }

		// Radbrytning innan nästa utskrift
		System.out.println();
    }
}