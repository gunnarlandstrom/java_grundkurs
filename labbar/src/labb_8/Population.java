package labb_8;

import java.io.*;
import java.util.*;

public class Population {

    private boolean wantsToCount = true;
    Scanner scannerInput = new Scanner(System.in);
    private static String inputPrompt = "input> ";

    // Constructors
    public Population() throws FileNotFoundException {

        try {

            wantsToCount = start();

            if (wantsToCount) {
                countPopulation();

            } else {
                quitProgram();
            }
        } catch (IOException error) {
            System.out.println("Error writing to file:\n");
        }
    }

    // Scanner
    public Scanner scannerFromFile(String fileName) throws FileNotFoundException {
        Scanner fileInput = new Scanner(new File(fileName));

        return fileInput;
    }

    // Counts population for every year, processes the strings and saves to file
    public void countPopulation() throws FileNotFoundException {

        try {

            System.out.println("Enter the textfile you want to sort!");
            String readFileName = scannerInput.nextLine();
            Scanner fileInput = scannerFromFile(readFileName);

            System.out.print("To which file should the data be saved? ");
            String saveFileName = scannerInput.nextLine();

            PrintWriter saveFile = new PrintWriter(new BufferedWriter(new FileWriter(saveFileName)));

            String intro = ("Age          Quantity");
            String splitter = ("--------------------");
            saveFile.println(intro);
            saveFile.println(splitter);

            int populationAmount = 0;
            while (fileInput.hasNext()) {
                int yearlyAmount = 0;
                String populationAge = fileInput.next();
                @SuppressWarnings("unused")
                String populationTemp = fileInput.next();
                String populationMenAmount = fileInput.next();
                populationTemp = fileInput.next();
                String populationWomenAmount = fileInput.next();
                yearlyAmount = (Integer.valueOf(populationMenAmount) + Integer.valueOf(populationWomenAmount));
                populationAmount += (Integer.valueOf(populationMenAmount) + Integer.valueOf(populationWomenAmount));

                saveFile.println(populationAge + "             " + yearlyAmount);
            }
            saveFile.println(splitter);
            saveFile.println(populationAmount);
            saveFile.close();
        } catch (IOException error) {

            System.out.println("Something went wrong!");
        }

    }

    // Asks user if he wants to run program
    public boolean start() {

        System.out.println(
                "This is a program will count and sort the population.");

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

    // Exits program
    public void quitProgram() throws FileNotFoundException {
        System.out.println("Closing program, goodbye!");

        scannerInput.close();

        System.exit(0);

    }

}
