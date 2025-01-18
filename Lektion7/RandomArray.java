import java.util.*;  // Klassen Scanner, Stringtokenizer

/**
 * Ex07_02 - RandomArray
 *
 * En klass som slumpar ett antal heltal till en array.
 * Användaren får ange hur många tal som ska slumpas fram
 * och programmet skriver sen ut alla tal, summan av alla 
 * tal och medelvärdet av alla tal.
 *
 * @author Robert Jonsson
 */
public class RandomArray {
    public static void main(String[] args) {
        // Objekt för att läsa från tangentbordet
        Scanner input = new Scanner(System.in);

        // Frågar hur många tal som ska slumpas
        System.out.print("How many numbers should be randomized? ");
        int noOfNumbers = input.nextInt();
        input.nextLine(); // Läser bort radbrytningen

        // Frågar användaren inom vilket intervall talen ska slumpas
        // Intervallet måste anges på formen min-max där min är minsta värdet
        // och max är största värdet. Min- och max-värdet måste åtskiljas av
        // tecknet - (minus) för vi kommer att använda String och dess metod
        // split för att dela upp inmatningen i min och max.
        System.out.print("In which interval should the numbers be randomized (min-max)? ");
        String interval = input.nextLine();

        // Delar strängen efter tecknet - och räknar antalet delar.
        // Finns det inte exakt två delar är inmatningen felaktig
        // varpå vi avslutar programmet. Kom ihåg att split returnerar
        // en array.
        String[] minMax = interval.split("-");
        if (minMax.length != 2) {
            // Notera hur vi anävnder System.err för att skriva 
            // felmeddelanden till konsolen/terminalen.
            System.err.println("Incorrect interval!");
            System.exit(-1);
        }

        // Konverterar min och max från respektive index i strängarrayen
        int min = Integer.parseInt(minMax[0]);
        int max = Integer.parseInt(minMax[1]);

        // Skapar en array lika stor som antalet tal som ska slumpas
        int[] randomNumbers = new int[noOfNumbers];

        // En for-loop som tilldelar arrayen slumpvärden inom intervallet min-max (inklusive)
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int)(Math.random() * (max - min + 1) + min);
        }

        // Beräknar summan av slumptalen (hade vi kunnat göra direkt i loopen ovan)
        int sum = 0;
        for (int i = 0; i < randomNumbers.length; i++) {
            sum += randomNumbers[i];
        }

        // Beräknar medelvärdet
        // Observera att vi måste casta om sum till en double för att beräkningen ska bli korrekt,
        // om inte utförs ju heltalsdivision!
        double average = (double)sum / randomNumbers.length;

        
        System.out.println(); // Radbryt

        // Skriver ut de slumpade talen i en lång rad (separerade med mellanslag)
        for (int i : randomNumbers) {
            System.out.print(i + " ");
        }

        // Skriver ut summa och medel
        System.out.println("\nSum: " + sum);
        System.out.println("Average: " + average);
    }
}