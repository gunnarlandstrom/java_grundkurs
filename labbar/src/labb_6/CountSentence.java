package labb_6;

import java.util.Scanner;

public class CountSentence {

    private int amountOfSentences;
    private int amountOfWords;
    private int amountOfSpecialChars;
    private static String inputPrompt = "input> ";
    Scanner scannerInput = new Scanner(System.in);

    // Constructors
    public CountSentence() {
        boolean wantsToPlay = start();

        if (wantsToPlay) {
            System.out.println("Enter the string you want to count!");
            System.out.print(inputPrompt);
            String userInput = scannerInput.nextLine();
            new CountSentence(userInput);
        } else {
            quitProgram();
        }
    }

    public CountSentence(String userInput){




    }



    public boolean start() {

        System.out.println(
                "This is a program that will count the amount of sentences, words and special characters you type.");

        System.out.println("Do you want to try it? y/n");
        String userInput = scannerInput.nextLine();

        if (userInput.equals("y") || userInput.equals("Y")) {
            return true;
        } else {
            return false;
        }

    }

    public void quitProgram() {
        scannerInput.close();

        System.exit(0);

    }

    // Sentences
    public void sentenceCounter() {

        amountOfSentences++;
    }

    public int getSentences() {

        return amountOfSentences;
    }

    // Words
    public void wordCounter() {

        amountOfWords++;
    }

    public int getWords() {

        return amountOfWords;
    }

    // Characters
    public void charCounter() {

        amountOfSpecialChars++;
    }

    public int getCharacters() {

        return amountOfSpecialChars;
    }

}
