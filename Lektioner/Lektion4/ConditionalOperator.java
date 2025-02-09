import java.util.*; // Scanner

/**
 * Ex04_08 - ConditionalOperator
 *
 * Visar exempel på hur vi kan använda villkorsoperatorn.
 *
 * @author Robert Jonsson
 */
public class ConditionalOperator {
    public static void main(String[] args) {
        // Skapar Scanner med vilket vi läser in från tangentbordet
        Scanner input = new Scanner(System.in);

        // Frågar efter två heltal och konverterar strängarna till heltal
        System.out.print("Enter an integer: ");
        int a = Integer.parseInt(input.nextLine());

        System.out.print("Enter an integer: ");
        int b = Integer.parseInt(input.nextLine());

        // Använder vilkorsoperatorn för att ta reda på det minsta talet och lagrar det i variabeln min
        int min = a < b ? a : b;

        System.out.println("\nThe lowest integer is: " + min);

        // Använder villkorsoperatorn direkt i en utskrift
        System.out.println("The highest integer is: " + (a > b ? a : b));

        /* Villkorsoperatorn fungerar med andra ord så här:
           Om uttrycket till vänster om ? är sant antar hela uttrycket
           värdet som står efter ?. Om däremot uttrycket till vänster
           om ? är falskt antar hela uttrycket värdet som står efter :
        */

        /* Finns det andra sätt att i Java ta reda på det största eller
           minsta talet av två? Svar: Klassen Math och dess metoder min och max.
        */
    }
}