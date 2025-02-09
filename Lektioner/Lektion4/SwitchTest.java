import java.util.Scanner;

/**
 * Ex04_11 - SwitchTest
 *
 * Visar ett kort exempel på switch samt hur vi kan
 * konvertera den sträng vi skrev in till en char.
 *
 * @author Robert Jonsson
 */
public class SwitchTest {
    public static void main(String[] args) {
        // Skapar objektet för inläsninga från tangentbord
        Scanner input = new Scanner(System.in);

        // Frågar efter en bokstav
        System.out.print("Write a letter (a or b): ");
        String userInput = input.nextLine();

        /* Då String är en klass finns det metoder vi kan anropa
           på objekt av klassen. En metod är charAt som returnerar
           en char på angiven position i strängen. charAt(0) returnerar
           första bokstaven i strängen. Mer om stränger kommer i senare lektioner.
        */
        char ch = userInput.charAt(0);

        // Kollar i en switch-sats vad första bokstaven är
        switch(ch) {
            case 'a': // "faller igenom" till nästa case-gren
            case 'A':
                System.out.println("You wrote a");
                break;
            case 'b':
            case 'B':
                System.out.println("You wrote b");
                break;
            default:
                System.out.println(ch + " is not what I asked you to write!");
        }

        // Prova att skriva in fler tecken än ett för att se att charAt(0) fungerar.

        // Nedan ges exempel på en switch som använder String som jämförare

        // Frågar efter en frukt
        System.out.print("\nWhat is your favorite fruit, banana or orange? ");
        userInput = input.nextLine();

        // Kollar i en switch-sats vad användaren skrev
        switch(userInput) {
            case "banana":
                System.out.println("You like banana");
                break;
            case "orange":
                System.out.println("You like orange");
                break;
            default:
                System.out.println("What, you do not like either banana or orange!");
        }
    }
}