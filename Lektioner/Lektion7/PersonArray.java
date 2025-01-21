package lektioner.Lektion7;
import java.util.*;  // Scanner

/**
 * Ex07_03 - PersonArray
 *
 * En klass som ber användaren skriva in uppgifter om
 * namn och ålder för 3 personer. Programmet skapar Person-
 * objekt och lägger in dessa i en array av Person.
 *
 * @author Robert Jonsson
 */
public class PersonArray {
    // För att läsa från tangentbordet
    private static Scanner input = new Scanner(System.in);

    // Metod som returnerar det användaren skriver in
    private static String getLine(String prompt) {
        // Skriver ut prompt (fårga/uppmaning) till användaren
        System.out.print(prompt);

        // Returnerar det användaren skriver
        return input.nextLine();
    }

    public static void main(String[] args) {
        // Skapar en array som rymmer 3 Person-objekt
        Person[] family = new Person[3];

        // Frågar användaren efter namn och ålder till personerna
        String name = "";
        int age = -1;

        // Loopar igenom alla element i arrayen och frågar efter data om personerna
        for (int i = 0; i < family.length; i++) {
            name = getLine("Enter name of person " + (i + 1) + ":  ");
            age = Integer.parseInt(getLine("Enter name of person " + (i + 1) + ":  "));

            // Skapar ett person-objekt som vi "lägger in" i elementet på position/index i
            family[i] = new Person(name, age);
        }

        // Skriver ut information om personerna
        System.out.println(); // radbrytning
        for (int i = 0; i < family.length; i++) {
            // %02d innebär att ett nummer (d) ska skrivas ut och att det tar upp 2 tecken som fylls ut med 0 (02)
            System.out.format("Person %02d: %s\n", (i + 1), family[i].toString());
        }
    }
}