package lektioner.Lektion8;
import java.net.*;  // URL
import java.io.*;   // BufferedReader, InputStreamReader

/**
 * Ex08_11 - ReadImageFromURL.java
 *
 * En klass som visar hur vi kan läsa en bild från 
 * internet och spara den till användarens dator.
 *
 * @author Robert Jonsson
 */
public class ReadImageFromURL {
    public static void main(String[] args) {
        // Koden kan generera både MalformedURLException och IOEXception.
        // Använder try-ctach för att fånga dessa fel.
        try {
            // Skapar en URL till sidan som innehåller bilden
            // Bilden hämtas fran NASAs sida "Astronomy Picture of the Day"
            String server = "https://apod.nasa.gov/apod/";
            URL url = new URL(server);

            // Öppnar en ström till aktuell URL
            InputStream in = url.openStream();

            // Kopplar strömmen till en BufferedReader via en InputStreamReader
            BufferedReader input = new BufferedReader(new InputStreamReader(in));

            // Deklarerar sträng för att läsa innehållet i filen
            String line;

            // Läser rad för rad från strömmen. Null returneras när inget mer finns att läsa
            while ((line = input.readLine()) != null) {
                /* I källkoden för html-sidan strömmen är kopplad till finns ett avsnitt med följande innehåll
                
                <a href="image/2112/NGC6822LRGB-1.jpg">
                <IMG SRC="image/2112/NGC6822LRGB-11024.jpg"
                alt="See Explanation.  Clicking on the picture will download
                the highest resolution version available." style="max-width:100%"></a>
                 
                   Vi är intresserad av raden som börjar med <IMG SRC eftersom den innehåller
                   adressen till bildfilen som vi vill ladda ner. Vi kontrollerar därför om raden
                   vi läser börjar med detta. I så fall avbryter vi läsandet och fortsätter med
                   koden efter loopen.
                 */
                if (line.contains("<IMG SRC")) {
                    // avbryt läsandet då vi hittat raden vi är intresserad av
                    break;
                }
            }
            
            // Stäng strömmen
            input.close();
            
            /* strängen line innehåller nu en sträng enligt följande exempel
               <IMG SRC="image/2112/NGC6822LRGB-11024.jpg"
               
               Vi är intresserad av det som står innanför citattecknen. Att plocka ut
               detta kan göras på olika sätt. Här utnyttjas metoden replace och ersätter
               <IMG SRC=" och " med en tom sträng.
             */
            line = line.replace("<IMG SRC=\"", "");
            line = line.replace("\"", ""); // ersätt även det sista " med en tom sträng
            
            /* Nu innehåller line en sträng enligt följande
               image/2112/NGC6822LRGB-11024.jpg
               
               Vi skapar en URL till denna genom att först lägga till
               adressen till servern. Vi skapar därefter en sträng som
               innehåller namnet på filen som bilden ska sparas till
               (en delsträng från sista /).
             */
            URL imageURL = new URL(server + line);
            String filename = line.substring(line.lastIndexOf('/') + 1);
            
            /* Vi kopierar nu bilden till filen på hårddisken genom att
               läsa byte för byte. Inte det effektivaste sättet, men utifrån
               det vi gått igenom hittills är detta det enklaste sättet.
             */            
            in = new BufferedInputStream(imageURL.openStream());
            OutputStream out = new BufferedOutputStream(new FileOutputStream(filename));            
            int i = -1;
            
            // Läser tecken för tecken från strömmen. -1 returneras när inget mer finns att läsa.
            while((i = in.read()) != -1) {
                out.write(i);
            }

            // Stäng in- och utströmmar
            in.close();
            out.close();
        }
        catch (Exception e) {
            // Alla typer av fel i Java ärver från Exception
            System.err.println("Error: " + e.getMessage());
			e.printStackTrace();
        }
    }
}