import java.util.Scanner;

/**
 * Ex04_17 - GuessTheNumber
 *
 * Testar att använda do-while och metoder i Math.
 * Ett tal slumpas fram och användaren ska gissa vilket talet är.
 *
 * @author Robert Jonsson
 */
public class GuessTheNumber {
    public static void main(String[] args) {
        // För att kunna läsa in från tangentbordet
        Scanner input = new Scanner(System.in);

        /* Slumpar fram det gömda talet (mellan 0 och 5 inklusive).
           Math.random() returnerar ett tal som större än eller lika
           med 0.0 och mindre än 1.0 (dvs mindre än eller lika med 0.99999).
           Då vi vill ha ett tal 0-5 multiplicerar vi med 6 vilket resulterar
           i ett decimaltal mellan 0 och 5.99994.
           Vi vill ha ett heltal så därför castar vi om det (explicit typkonvertering)
           där decimalerna "slängs" och kvar får vi tal mellan 0-5.
        */
        int randomNumber = (int)(Math.random() * 6); // Slumpar fram 0, 1, 2, 3, 4 eller 5

        /* Skapar en flagga som är tänkt att indikerar när användaren gissat rätt
           (den sätts till true när vi gissar rätt). Vi initierar den till
           false eftersom vi ännu inte gissat och då inte kan ha gissat rätt.
           Flaggan används i do-while-loopen för att avgöra när loopen ska avbrytas
        */
        boolean guessIsCorrect = false;

        // Skriver ut en "rubrik" till användaren
        System.out.println("Guess what number I'm thinking of...\n");

        // Utför do-while-loopen
        do {
          // Frågar användaren efter sin gissning
          System.out.print("your guess> ");
          int userGuess = input.nextInt();

          // Kollar om användarens gissning är lika med det slumpade talet
          guessIsCorrect = (userGuess == randomNumber);

          if (!guessIsCorrect) {
            System.out.println(userGuess + " is not the number I'm thinking of");
          }

        } while (!guessIsCorrect);

        System.out.println("Your guess is right!");
    }
}