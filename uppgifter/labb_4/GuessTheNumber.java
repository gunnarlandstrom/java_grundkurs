package labb_4;

import java.util.Scanner;

/**
 * GuessTheNumber
 *
 * Testar att använda do-while och metoder i Math.
 * Ett tal slumpas fram och användaren ska gissa vilket talet är.
 *
 * @author Gunnar Landström
 */

public class GuessTheNumber extends GuessingMethods {
    public static void main(String[] args) {
        // För att kunna läsa in från tangentbordet
        Scanner input = new Scanner(System.in);

        boolean guessIsCorrect = false;
        int highestNumber;
        int lowestNumber;
        String tempGuess = "1";
        int userGuess;
        int randomNumber = 0;
        int amountOfGuesses = 0;

        System.out.println(
                "We are going to play a guessing game, enter two numbers to assign the interval to guess between: ");
        System.out.print("\nWhat is the first number?: ");
        int firstNumber = input.nextInt();
        System.out.print("What is the second number?: ");
        int secondNumber = input.nextInt();

        if (firstNumber > secondNumber) {
            highestNumber = firstNumber;
            lowestNumber = secondNumber;
        } else {
            highestNumber = secondNumber;
            lowestNumber = firstNumber;
        }

        // Slumpar ett tal
        randomNumber = (int) (Math.random() * (highestNumber - lowestNumber) + lowestNumber);
        if (randomNumber == (highestNumber - 1)) {
            randomNumber = randomNumber + 1;
            System.out.println("Random number is: " + randomNumber);
        }

        // Utför do-while-loopen
        do {
            // Frågar användaren efter sin gissning
            try {
                tempGuess = input.nextLine();
                userGuess = Integer.parseInt(tempGuess);
                amountOfGuesses++;
            } catch (NumberFormatException e) {
                if (tempGuess == "exit") {
                    break;
                } else {
                    System.out.println("So the given interval is between " + lowestNumber + "<-->" + highestNumber);
                    System.out.print("Guess the answer!: ");
                    continue;
                }
            }

            if (userGuess > highestNumber || userGuess < lowestNumber) {
                System.out.print(
                        "Unvalid guess, guess between: " + lowestNumber + " <--> " + highestNumber + "Guess again!: ");
                continue;
            } else {
                if (userGuess == randomNumber) {
                    guessIsCorrect = true;
                    break;
                } else if (userGuess > randomNumber) {
                    System.out.print("Too high! " + "\n" + "Guess again: ");
                } else {
                    System.out.print("Too low! " + "\n" + "Guess again: ");
                }
            }

            // Kollar om användarens gissning är lika med det slumpade talet
            guessIsCorrect = (userGuess == randomNumber);

        } while (!guessIsCorrect || tempGuess == "exit");

        System.out.println("Your guess is right! You got it in: " + amountOfGuesses + " guesses! Good job!");
        input.close();
    }
}