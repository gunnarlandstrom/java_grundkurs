import java.util.*;  // Scanner

/**
 * Ex07_05 - PassAndReturn
 *
 * En klass som demonstrerar hur vi skickar arrayer
 * som argument till metoder, samt metoder som
 * returnerar arayer.
 *
 * @author Robert Jonsson
 */
public class PassAndReturn {
    /**
     * Metod som frågar användaren hur många element arrayen
     * ska innehålla. Fyller sen arrayen med värden som användaren
     * anger och returnerar slutligen arrayen.
     */
    private int[] createIntArray() {
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers should the array contain? ");
        int noOfNumbers = input.nextInt();

        // Skapar arrayen
        int[] tmp = new int[noOfNumbers];

        // Skriver ut innehållet i arrayen
        printArray(tmp);

        // Frågar efter tal
        System.out.println();
        for (int i = 0; i < tmp.length; i++) {
            System.out.format("Enter number %2d (of %d): ", (i + 1), tmp.length);
            tmp[i] = input.nextInt();
        }

        // returnerar arrayen
        return tmp;
    }

    /**
     * Metod som skriver ut elementen i arrayen i en "snygg" tabell.
     *
     * @param intArray den array vars värden ska skrivas ut i terminalen
     */
    private void printArray(int[] intArray) {
        // Skriver ut en rubrik
        System.out.println("\nArray values");

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

    /**
     * Metod som adderar ett till alla element i en array
     */
    private void addOne(int[] numbers) {
        System.out.println("\nAdding one to each number in the array");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] += 1;
        }
    }

    public static void main(String[] args) {
        // Skapar ett objekt av klassen
        PassAndReturn p = new PassAndReturn();

        // Anropar metoden som skapar arrayen
        int[] numbers = p.createIntArray();

        // Anropar metoden som skriver ut talen
        p.printArray(numbers);

        // Anropar metoden som adderar ett till varje tal i arrayen
        p.addOne(numbers);

        // Anropar metoden som skriver ut talen
        p.printArray(numbers);
    }
}