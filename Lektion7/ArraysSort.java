import java.util.Arrays;

/**
 * Ex07_08 - ArraySort
 *
 * Visar hur vi sorterar en array med heltal med hjälp
 * av klassen Arrays och dess sorteringsmetod.
 * För att slippa upprepa kod/metoder för att skapa
 * array med slumpade tal och för att skriva ut en array
 * i en "snygg" tabell, skapar och använder vi "hjälp" i
 * vilken vi samlar "bra-och-ha"-metoder. Se Ex07_15 - Util.
 *
 * @author Robert Jonsson
 */
public class ArraysSort {
    public static void main(String[] args) {
        // Skapa en array med 30 slumpade tal i intervallet -20 och 20
        // Vi använder vår hjälklass för detta
        int[] array = Util.createArrayWithRandomNumbers(30, -20, 20);

        // Skriver ut arrayen (använder hjälpklassen)
        System.out.println("Unsorted");
        Util.printArray(array);

        // Sorterar
        Arrays.sort(array);

        // Skriver ut arrayen igen
        System.out.println("\nSorted");
        Util.printArray(array);
    }
}