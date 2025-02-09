import java.util.Scanner;

/**
 * Ex04_15 - DoWhileTest
 *
 * Provar att använda en do-while-loop där användaren får mata in 
 * tal så länge som talet är mellan 1 och 5 (inklusive). Programmet har
 * delats upp i flera metoder.
 *
 * @author Robert Jonsson
 */
public class DoWhileTest {
    // Objektet för inläsninga från tangentbord deklareras som en 
    // instansvariabel då vi behöver använda den i flera metoder
    private Scanner input = new Scanner(System.in);


    /**
     * Metod som returnerar det användaren skriver in som ett heltal
     * Metoden tar en sträng som parameter vilket är den prompt (uppmaning)
     * som ska skrivas ut till användaren.
     */
    public int readInt(String prompt) {
        System.out.print(prompt);
        return input.nextInt();
    }

    // Main-metoden
    public static void main(String[] args) {
        // Skapar ett objekt av egna klassen
        DoWhileTest dwt = new DoWhileTest();

        int number = 0;

        do {
            number = dwt.readInt("Enter a number between 1 and 5 (inclusive) to exit: ");
        }
        while (number < 1 || number > 5);
    }
}