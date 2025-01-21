package lektioner.Lektion7;
import java.util.Arrays;

/**
 * Ex07_15 - Util
 *
 * För att undvika upprepning av kod/metoder som används
 * i flera klasser, kan vi samla detta i en hjälp-klass
 * eller nytto-klass (utility på engelska). Ofta kan dessa
 * metoder vara statiska så att de som vill använda sig av
 * metoderna inte behöver skapa ett objekt av denna klass.
 *
 * @author Robert Jonsson
 */
public class Util {
    /**
     * Creates and returns an array filled with random integers.
     *
     * @param noOfNumbers array size (number of elements in the array)
     * @param min lower limit for the random numbers
     * @param max upper limit for the random numbers
     * @return an array with random integers
     */
    public static int[] createArrayWithRandomNumbers(int noOfNumbers, int min, int max) {
        // Skapar en array lika stor som antalet tal som ska slumpas
        int[] randomNumbers = new int[noOfNumbers];

        // En for-loop som tilldelar arrayen slumpvärden inom intervallet min-max (inklusive)
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = getRandomNumber(min, max);
        }

        // Känns koden ovan igen? Den användes även i exemplet RandomArray.
        // Hur skulle vi kunna göra för att slippa upprepa denna kod i två klassen?

        return randomNumbers;
    }

    /**
     * Returns a random number between min and max (inclusive).
     *
     * @param min lower limit for the random number
     * @param max upper limit for the random number
     * @return a random number within the given interval
    */
    public static int getRandomNumber(int min, int max) {
        return (int)(Math.random() * (max - min + 1) + min);
    }

    /**
     * Prints the contents of an integer array in a "nice-looking" table.
     *
     * @param intArray the array whose values are to be printed
     */
    public static void printArray(int[] intArray) {
        // Skriver ut en rubrik
        System.out.println("Array values");

        // Skriver ut tabellens övre linje
        // -------------------------------
        System.out.print("\u2554");  // Övre vänstra hörnet ╔

        for (int i = 0; i < intArray.length; i++) {
            // Konverterar talet till en sträng så vi kan ta
            // reda på hur många positioner som behövs vid utskrift
            int pos = Integer.toString(intArray[i]).length();
            System.out.print(fillString(pos, '\u2550') + (i == intArray.length - 1 ? "\u2557" : "\u2566"));
        }

        // Tabellens värden
        //-----------------
        System.out.print("\n\u2551");  // Vänstra kanten ║

        for (int i : intArray) {
            System.out.print(i + "\u2551"); // Efter varje tal ║
        }

        // Skriver ut tabellens nedre linje
        // -------------------------------
        System.out.print("\n\u255A");  // Nedre vänstra hörnet ╚

        for (int i = 0; i < intArray.length; i++) {
            // Konverterar talet till en sträng så vi kan ta
            // reda på hur många positioner som behövs vid utskrift
            int pos = Integer.toString(intArray[i]).length();
            System.out.print(fillString(pos, '\u2550') + (i == intArray.length - 1 ? "\u255D" : "\u2569"));
        }

        System.out.println();
    }

    /**
     * Creates and returns a String of a given length filled with given character.
     *
     * @param length length of the String to be returned
     * @param ch the character to fill the String with
     * @return a String containing only given character
     */
    public static String fillString(int length, char ch) {
        // Skapar en array med 'noOfNumbers' element
        char[] c = new char[length];

        // Fyller alla element i arrayen med tecknet ch
        // Detta görs genom metoden fill i klassen Arrays (se API)
        Arrays.fill(c, ch);

        // Returnerar en ny sträng genom att använda konstruktorn som tar
        // en array av typen char
        return new String(c);
    }
}