package labb_6;

import java.util.Scanner;

public class CountSentence {

    private int amountOfSentences;
    private int amountOfWords;
    private int amountOfChars;
    private boolean wantsToCount = true;
    private static String inputPrompt = "input> ";
    Scanner scannerInput = new Scanner(System.in);

    // Constructors
    public CountSentence() {
        wantsToCount = start();

        if (wantsToCount) {
            System.out.println("");
            System.out.println("Enter the string you want to count!");
            System.out.print(inputPrompt);
            String userInput = scannerInput.nextLine();
            String countedSentence = countingSentence(userInput);
        } else {
            quitProgram();
        }
    }

    public String countingSentence(String userInput) {

        sentenceCounter(userInput);
        wordCounter(userInput);
        charCounter(userInput);

        countingPrinter();

        return "a";
    }

    public boolean start() {

        System.out.println(
                "This is a program that will count the amount of sentences, words and special characters you type.");

        while (wantsToCount) {

            System.out.println("Do you want to try it? y/n");

            System.out.print(inputPrompt);
            String userInput = scannerInput.nextLine();

            if (userInput.equals("y") || userInput.equals("Y")) {
                return true;
            } else if (userInput.equals("n") || userInput.equals("N")) {
                return false;
            } else {
                System.out.println("");
                System.out.println("Something went wrong, try again.");
                System.out.print(inputPrompt);
                continue;
            }
        }
        return false;
    }

    public void quitProgram() {
        System.out.println("Closing program, goodbye!");

        scannerInput.close();

        System.exit(0);

    }

    public void countingPrinter() {

        System.out.println("Sentences: " + amountOfSentences);
        System.out.println("Words: " + amountOfWords);
        System.out.println("Special characters: " + amountOfChars);
    }

    // Sentences
    public void sentenceCounter(String userInput) {

        for (int i = 0; i < userInput.length(); i++) {
            if (userInput.charAt(i) == '.' || userInput.charAt(i) == '?' || userInput.charAt(i) == '!'
                    || userInput.charAt(i) == 13) {
                amountOfSentences++;
            }

        }

    }

    public int getSentences() {

        return amountOfSentences;
    }

    // Words
    public void wordCounter(String userInput) {

        for (int i = 0; i < userInput.length(); i++) {
            if (userInput.charAt(i) == ' ') {
                amountOfWords++;
            }
        }
        amountOfWords++;

    }

    public int getWords() {

        return amountOfWords;
    }

    // Characters
    public void charCounter(String userInput) {

        for (int i = 0; i < userInput.length(); i++) {
            amountOfChars++;
        }
    }

    public int getCharacters() {

        return amountOfChars;
    }

}
