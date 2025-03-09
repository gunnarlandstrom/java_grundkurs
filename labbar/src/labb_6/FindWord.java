package labb_6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindWord {

    private int amountOfWords;

    public FindWord() throws FileNotFoundException {

        start();
    }

    public void start() throws FileNotFoundException {
        Scanner userInput = scannerFromKeyboard();

        System.out.println("This is a program that searches for a specific word from a textfile!");
        System.out.print("What word do you want to search for? ");
        String wantedWord = userInput.nextLine();
        System.out.print("In which file do you want to search for the word? ");
        String wantedFile = userInput.nextLine();

        countWordsInFile(wantedWord, wantedFile);

    }

    public Scanner scannerFromKeyboard() {
        Scanner keyboardInput = new Scanner(System.in);
        return keyboardInput;
    }

    public Scanner scannerFromFile(String fileName) throws FileNotFoundException {
        Scanner fileInput = new Scanner(new File(fileName));

        return fileInput;
    }

    public void countWordsInFile(String wantedWord, String wantedFile) throws FileNotFoundException {

        boolean foundWord = false;
        boolean wordExists;
        String searchedWord = wantedWord;
        Scanner fileInput = scannerFromFile(wantedFile);
        long startTime = System.currentTimeMillis();
        while (fileInput.hasNext()) {
            String tempString = fileInput.nextLine();
            if (tempString.equals(wantedWord)) {
                foundWord = true;
            }

            System.out.println(tempString);
            amountOfWords++;

        }
        long endTime = System.currentTimeMillis();

        wordExists = wasWordFound(foundWord);
        System.out.println("The file: " + wantedFile + " contains " + amountOfWords + " words.");
        System.out.println("It took: " + (endTime - startTime) + " ms to itterate.");
        if (wordExists) {
            System.out.println("The word '" + searchedWord + "' exists in this file.");
        }
        else {
            System.out.println("The word '" + searchedWord + "' does NOT exist in this file.");

        }

    }

    public boolean wasWordFound(boolean input) {

        if (input == true) {
            return true;
        } else {
            return false;
        }

    }
}
