/**
 * Ex04_16 - BreakContinue.java
 *
 * Visar skillnaden mellan break och continue i en loop.
 *
 * @author Robert Jonsson
 */
public class BreakContinue {
    public static void main(String[] args) {
        // Loopar från 0 till 10. Break när i == 5
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.print(i + " ");
        }

        // Radbryt
        System.out.println();

        // Loopar från 0 till 10. Continue när i == 5
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.print(i + " ");
        }

        // Radbryt
        System.out.println();

        //Exemplet nedan visar på hur en label kan användas för att
        // i en nästlad for-loop avbryta den yttre loopen
        forI: // en label för yttre loopen
        for (int i = 0; i < 100; i++) {
            forJ: // en label för inre loopen (som dock inte används)
            for (int j = 0; j < 10; j++) {
                System.out.print('.'); // Skriver ut punkter efter varandra

                if (i * j == 50) {
                    // avbryt den yttre loopen
                    break forI;
                }
            }
        }
    }
}