import java.util.StringTokenizer;
import java.io.*;

/**
 * Ex06_06 - Palindrom
 * 
 * En klass som visar hur vi kan använda StringTokenizerför att 
 * dela upp en sträng i olika delar. I detta fall för att dela 
 * upp en mening i dess ord (dela upp vid varje mellanslag) så 
 * att vi kan avgöra om strängen är ett palindrom.
 *
 * @author Robert Jonsson
 */
public class Palindrom {
    /** 
     * En metod som avgör om strängen som skickas som argument till
     * metoden är ett palindrom eller inte.
     * 
     * @param sentence strängen som ska testas
     * @return sant om meningen är ett palindrom, annars falskt
     */
    public boolean isPalindrom(String sentence) {
        // Använder StringTokenizer för att ta bort alla mellanslag,
        // kommatecken och punkter m.m från strängen.
        StringTokenizer st = new StringTokenizer(sentence, ",.!? ");

        // Skapar en StringBuilder för att lägga till varje ord
        StringBuilder sb = new StringBuilder();

        // Loopar igenom alla tokens och lägger till dem sist i sb
        while (st.hasMoreTokens()) {
            sb.append(st.nextToken());
        }

        // Tilldelar sentence innehållet i sb för senare jämförelse
        sentence = sb.toString();

        // Vänder på innehållet i sb. Observera hur enkelt det är 
        // med en StringBuilder jämfört med exemplet StringReverser.
        sb.reverse();

        // Ta bort kommentarerna nedan om du vill skriva ut innehållet
        //System.out.println(sentence);
        //System.out.println(sb.toString());

        // Jämför nu om sentence och innehållet i StringBuilder är lika
        // och returnerar resultatet.
        return sentence.equalsIgnoreCase(sb.toString());
    }

    public static void main(String[] args) {
        // Skapar ett objekt av klassen
        Palindrom p = new Palindrom();

        String s = "Ni talar bra latin!";

        // Kollar om strängen är ett palindrom
        boolean palindrom = p.isPalindrom(s);

        System.out.print("'" + s + "' is");

        if (!palindrom) {
            System.out.print(" not");
        }
        
        System.out.println(" a palindrom");
           
        // Hur hade du gjort följande utskrift med hjälp av villkorsoperatorn?
    }
}