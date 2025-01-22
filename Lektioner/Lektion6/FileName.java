package lektioner.Lektion6;

import java.util.Scanner;

/**
 * Ex06_02 - Filename
 *
 * En klass för att testa enkla operationer på en sträng.
 * Användaren får mata in ett filnamn som programmet sen
 * delar upp i filnamn och filändelse. Använder metoderna
 * lastIndexOf och substring till detta.
 *
 * @author Robert Jonsson
 */
public class FileName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter filename, inluding file ending> ");
        String userInput = input.nextLine();

        // Använder en while-loop för att kunna göra flera inmatningar
        while (userInput.length() > 0) {
            /*
             * Vi börjar med att kolla om en punkt finns för annars är det
             * inte ett gilltigt filnamn. Använder lastIndexof så att vi
             * är säker på att vi får index för sista punkten i namnet (ett
             * filnamn kan innehålla punkter i själva namnet).
             */
            int dotIndex = userInput.lastIndexOf('.');

            // Kollar om -1 returnerades vilket i så fall innebär att det
            // inte finns någon punkt i inmatningen.
            if (dotIndex == -1) {
                System.out.println("Wrong filename format (missing .)\n");
            } else {
                // Med hjälp av index för sista punkten använder vi metoden
                // substring för att ta reda på filnamnet och filändelsen.
                String suffix = userInput.substring(dotIndex + 1);
                String filename = userInput.substring(0, dotIndex);

                System.out.println("\nFilename:    " + filename);
                System.out.println("File ending: " + suffix + "\n");
            }

            // Ny inmatning, bara 'enter' för att sluta
            System.out.print("Enter a new filename (only enter will exit)> ");
            userInput = input.nextLine();
        }
        input.close();
    }
}