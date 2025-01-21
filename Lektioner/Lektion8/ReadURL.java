package lektioner.Lektion8;
import java.net.*;  // URL
import java.io.*;   // BufferedReader, InputStreamReader

/**
 * Ex08_10 - ReadURL.java
 *
 * En klass som demonstrerar hur vi kan läsa
 * innehållet från en fil/resurs på internet.
 *
 * @author Robert Jonsson
 */
public class ReadURL {
    public static void main(String[] args) {
        // Koden kan generera både MalformedURLException och IOEXception.
        // Använder try-ctach för att fånga dessa fel.
        try {
            // Skapar en URL till sidan för dokumentionen över klassen URL
            URL url = new URL("https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/net/URL.html");

            // Skapar en URL till filen minfil.txt som ligger direkt på c:
            //URL url = new URL("file:///c:/minfil.txt");

            // Öppnar en ström till aktuell URL
            InputStream in = url.openStream();

            // Kopplar strömmen till en BufferedReader via en InputStreamReader
            BufferedReader input = new BufferedReader(new InputStreamReader(in));

            // Deklarerar sträng för att lagra innehållet i filen
            String line;

            // Läser rad för rad från strömmen. Null returneras när inget mer finns att läsa
            while ((line = input.readLine()) != null) {
                 System.out.println(line);
            }
            
            // Stänger strömmen
            input.close();
        }
        catch (Exception e) {
            // Alla typer av undantag i Java ärver från Exception
            System.err.println("Error: " + e.getMessage());
        }
    }
}