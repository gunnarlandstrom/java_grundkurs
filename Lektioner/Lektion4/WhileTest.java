import java.util.Scanner;

/**
 * Ex04_14 - WhileTest
 *
 * Provar att använda en while-loop där användaren får skriva 
 * in tal så länge som inte en nolla (0) skrivs in. Programmet har
 * delats upp i flera metoder.
 *
 * @author Robert Jonsson
 */
public class WhileTest {
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

    /** 
     * Överlagrad metoden ovan. Denna tar ingen parameter och i stället
     * skrivs en "standard"-prompt ut om användaren inte själv anger någon.
     */
    public int readInt() {
        // Anropar metoden ovan och returnerar direkt det den 
        // metoden i sin tur returnerar
        return readInt("Enter an integer: ");
    }

    // Main-metoden
    public static void main(String[] args) {
        // Skapar objekt av egna klassen
        WhileTest wt = new WhileTest();

        // Deklarerar en variabel för att hålla summan
        int sum = 0;

        // Frågar efter första talet (använder standard-prompten)
        int number = wt.readInt();

        // Loop som "snurrar" så länge användaren inte skriver 0
        while (number != 0) {
            sum += number;
            number = wt.readInt("Enter an integer (0 to exit): ");
        }

        // Skriver ut summan
        System.out.println("Sum is " + sum);
    }
}