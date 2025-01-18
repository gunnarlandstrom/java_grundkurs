import java.util.*;  // Scanner

/**
 * Ex07_04 - Multiplication
 *
 * En klass som skapar en 2D-array och tilldelar den
 * värden från multiplikationstabeller. Användaren
 * får sen ange vilken tabell hen vill se.
 *
 * @author Robert Jonsson
 */
public class Multiplication {
    public static void main(String[] args) {
        // Deklarerar och skapar arrayen. Sätter storleken till 11
        // så att vi kan få tabeller för 0-10.
        int[][] multiplicationTable = new int[11][11];

        // Loopar igenom alla element och tilldelar dem värden
        for (int i = 0; i < multiplicationTable.length; i++) {
            for (int j = 0; j < multiplicationTable[i].length; j++) {
                multiplicationTable[i][j] = i * j;
            }
        }

        Scanner input = new Scanner(System.in);

        System.out.print("Which multiplication table do you want to see (0-10): ");
        int tableNumber = input.nextInt();
        input.nextLine();  // läs bort radbrytningen

        // Loopen körs så länge som en giltig tabell anges av användaren
        while (tableNumber >= 0 && tableNumber < multiplicationTable.length) {
            // Visar den tabell som efterfrågades
            for (int i = 0; i < multiplicationTable[tableNumber].length; i++) {
                System.out.println(tableNumber + " x " + i 
                    + " = " + multiplicationTable[tableNumber][i]);
            }

            // Frågar efter ny tabell att visa
            System.out.print("\nWhich multiplication table do you want to see (0-10): ");
            tableNumber = input.nextInt();
            input.nextLine(); // läs bort radbrytningen
        }
    }
}