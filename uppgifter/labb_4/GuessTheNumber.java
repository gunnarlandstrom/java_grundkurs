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
        int userGuess;
        int randomNumber = 0;
        int amountOfGuesses = 0;
        String exitGuess;

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

        System.out.println("So the given interval is between " + lowestNumber + "<-->" + highestNumber);

        // Utför do-while-loopen
        System.out.print("Guess the answer!: ");
        userGuess = input.nextInt();
        exitGuess = Integer.toString(userGuess);
        do {
            // Frågar användaren efter sin gissning
            System.out.println(randomNumber);

            if (userGuess <= highestNumber || userGuess >= lowestNumber) {
                System.out.print(
                        "The number to guess is between" + lowestNumber + " and " + highestNumber + " Guess again!:");
                userGuess = input.nextInt();
                exitGuess = Integer.toString(userGuess);
            } else if (userGuess > highestNumber || userGuess < lowestNumber) {
                System.out.println("Unvalid guess, guess between: " + lowestNumber + "<-->" + highestNumber);
            } else {
                if (userGuess > randomNumber) {
                    System.out.println("Too high, guess again: ");
                    userGuess = input.nextInt();
                    exitGuess = Integer.toString(userGuess);
                } else {
                    System.out.println("Too low, guess again: ");
                    userGuess = input.nextInt();
                    exitGuess = Integer.toString(userGuess);

                }
            }

            // Kollar om användarens gissning är lika med det slumpade talet
            guessIsCorrect = (userGuess == randomNumber);

            if (!guessIsCorrect || exitGuess == "exit") {
                System.out.println(userGuess + " is not the number I'm thinking of");
            }

        } while (!guessIsCorrect);

        System.out.println("Your guess is right!");
        input.close();
    }
}