package lektioner.Lektion7;
import java.util.Arrays;

/**
 * Ex07_07 - SelectionSort
 *
 * Visar hur vi sorterar en array, som innehåller heltal, med
 * en implementation av urvalssortering (selection sort).
 *
 * @author Robert Jonsson
 */
public class SelectionSort {
    // Skapar en array med x antal och fyller den med slumpade tal
    // i intervallet min - max (inklusive). Arrayen returneras.
    public int[] createArrayWithRandomNumbers(int noOfNumbers, int min, int max) {
        // Skapar en array lika stor som antalet tal som ska slumpas
        int[] randomNumbers = new int[noOfNumbers];

        // En for-loop som tilldelar arrayen slumpvärden inom intervallet min-max (inklusive)
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int)(Math.random() * (max - min + 1) + min);
        }

        // Känns koden ovan igen? Den användes även i exemplet RandomArray.
        // Hur skulle vi kunna göra för att slippa upprepa denna kod i två klassen?

        return randomNumbers;
    }

    // Sorterar telen i arrayen med urvalsmetoden
    public void sort(int[] intArray) {
        for (int i = 0; i < intArray.length - 1; i++) {
            // Sätter startgissning för minsta talet till index i
            int minIndex = i;

            for (int j = i + 1; j < intArray.length; j++) {
                // Är talet i index j mindre än nuvarande minsta tal, får vi ett nytt minIndex
                if (intArray[j] < intArray[minIndex])
                    minIndex = j;
            }

            // Byter plats så att minsta talet kommer på rätt plats
            int tmp = intArray[i];
            intArray[i] = intArray[minIndex];
            intArray[minIndex] = tmp;
        }
    }

    /**
     * Metod som skriver ut elementen i arrayen i en "snygg" tabell.
     * Känns denna metod igen? Den användes även i exemplet PassAndReturn.
     * Hur skulle vi kunna göra för att slippa upprepa denna kod i två klassen?
     *
     * @param intArray den array vars värden ska skrivas ut i terminalen
     */
    private void printArray(int[] intArray) {
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
     * En privat metod som returnerar en sträng innehållandes
     * 'noOfNumbers' antal av tecknet 'ch'.
     */
    private String fillString(int noOfNumbers, char ch) {
        // Skapar en array med 'noOfNumbers' element
        char[] c = new char[noOfNumbers];

        // Fyller alla element i arrayen med tecknet ch
        // Detta görs genom metoden fill i klassen Arrays (se API)
        Arrays.fill(c, ch);

        // Returnerar en ny sträng genom att använda konstruktorn som tar
        // en array av typen char
        return new String(c);
    }

    public static void main(String[] args) {
        // Skapar ett objekt av denna klass
        SelectionSort sr = new SelectionSort();

        // Skapa en array med slumpade tal
        // 30 tal mellan -20 och 20
        int[] array = sr.createArrayWithRandomNumbers(30, -20, 20);

        // Skriver ut arrayen
        System.out.println("Unsorted");
        sr.printArray(array);

        // Sorterar
        sr.sort(array);

        // Skriver ut arrayen igen
        System.out.println("\nSorted");
        sr.printArray(array);
    }
}