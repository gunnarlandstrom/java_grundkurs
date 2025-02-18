package labb_4;

import java.util.Scanner;

public class CommandPrompt {

    Scanner scannerInput = new Scanner(System.in);
    public static final String inputPrompt = "input> ";
    private static int showHelpMessage = 0;

    public CommandPrompt() {
        start();

    }

    public void start() {
        String commandMenuInput;
        if (showHelpMessage == 0) {

            showHelpMessage = +1;
            commandPromptHelp();
        }
        System.out.print(inputPrompt);
        commandMenuInput = takeInput();

        commandMenu(commandMenuInput);

    }

    public String takeInput() {
        String userInput = scannerInput.nextLine();
        commandQuit(userInput);
        return userInput;
    }

    public void commandMenu(String userInput) {
        if (userInput.equals("1")) {
            commandPromptHelp();
            return;
        } else if (userInput.equals("2")) {
            commandPromptHelloWorld();
            return;
        } else if (userInput.equals("3")) {
            commandIsNumberOdd();
            return;
        } else if (userInput.equals("4")) {
            repeatString();
            return;
        } else if (userInput.equals("5") || userInput.equals("calc") || userInput.equals("calculator")) {
            commandCalculator();
            return;
        } else if (userInput.equals("6") || userInput.equals("q") || userInput.equals("quit")) {
            commandQuit(userInput);
            return;
        } else {
            System.out.println("Unrecognized input, try again! ");
            start();
        }

    }

    public void commandPromptHelloWorld() {
        System.out.println("Hello, World!");
        showHelpMessage = 0;
        start();
    }

    public void commandPromptHelp() {
        for (int i = 0; i < 3; i++) {
            System.out.println("");
        }
        System.out.println("Valid commands are:");
        System.out.println("[1] help -  Shows all available commands with a description.");
        System.out.println("[2] hello - Prints out a welcoming sentence.");
        System.out.println("[3] odd - Asks for a number and tells user if it's odd/even.");
        System.out.println("[4] repeat - Gives a choice of how many repetitions of an input the user wants to do.");
        System.out.println(
                "[5] calculate - Takes two inputs and offers addition, subtraction, division and multiplication of those inputs.");
        System.out.println("[6] quit - Stops the program.\n");
        start();
    }

    public void commandQuit(String input) {

        if (input.equals("6") || input.equals("q") || input.equals("quit")) {
            scannerInput.close();
            System.out.println("Program terminated.");
            System.exit(0);
        }
        return;
    }

    public void commandIsNumberOdd() {

        System.out.print("Enter a number you want to check if odd/even: " + inputPrompt);
        boolean validNumber = false;
        int inputTemp = 0;

        while (!validNumber) {

            try {
                inputTemp = Integer.parseInt(takeInput());
            } catch (NumberFormatException e) {
                validNumber = false;
                System.out.print("Something went wrong, try again! " + inputPrompt);
                continue;
            }

            if (inputTemp % 2 == 0) {
                System.out.println("The number " + inputTemp + " is even.");
                validNumber = true;

            } else if (inputTemp % 2 != 0) {
                System.out.println("The number " + inputTemp + " is odd.");
                validNumber = true;
            } else {
            }
        }
        showHelpMessage = 0;
        start();
    }

    public void repeatString() {
        boolean validChoice = false;
        int repeatAmount = 0;
        System.out.print("How many times do you want to repeat? ");
        while (!validChoice) {

            try {
                repeatAmount = Integer.parseInt(takeInput());
                validChoice = true;
            } catch (NumberFormatException e) {
                System.out.println("Something went wrong, try again!");
                System.out.print("How many times do you want to repeat? " + inputPrompt);
                continue;
            }

            System.out.print("What do you want to repeat? ");
            String reapeatedString = takeInput();

            for (int i = 0; i < repeatAmount; i++) {
                System.out.println(reapeatedString);
            }
        }

        showHelpMessage = 0;
        start();
    }

    public void commandCalculator() {

        String tempOperatorChoice;
        boolean validChoice = false;
        System.out.println("Enter two numbers!:");
        System.out.print("Number one: ");
        int tempNumberOne = Integer.parseInt(takeInput());

        System.out.print("Number two: ");
        int tempNumberTwo = Integer.parseInt(takeInput());

        do {
            System.out.println("");
            System.out.println("[1] Addition. ");
            System.out.println("[2] Subtraktion.");
            System.out.println("[3] Division.");
            System.out.println("[4] Multiplication.");
            System.out.println("Choose an operator [1], [2], [3] or [4]: ");
            System.out.print(inputPrompt);
            tempOperatorChoice = takeInput();

            if (tempOperatorChoice.equals("1")) {
                validChoice = true;
                int addedNumber = calculatorAddition(tempNumberOne, tempNumberTwo);
                System.out.println(tempNumberOne + " + " + tempNumberTwo + " = " + addedNumber);
            } else if (tempOperatorChoice.equals("2")) {
                validChoice = true;
                int subtractedNumber = calculatorSubtraction(tempNumberOne, tempNumberTwo);
                System.out.println(
                        "Your subtraction of " + tempNumberOne + " and " + tempNumberTwo + " = " + subtractedNumber);
            } else if (tempOperatorChoice.equals("3")) {
                validChoice = true;
                double dividedNumber = calculatorDivision(tempNumberOne, tempNumberTwo);
                System.out
                        .println("Your division of " + tempNumberOne + " and " + tempNumberTwo + " = " + dividedNumber);
            } else if (tempOperatorChoice.equals("4")) {
                validChoice = true;
                int multipliedNumber = calculatorMultiplication(tempNumberOne, tempNumberTwo);
                System.out.println(tempNumberOne + " * " + tempNumberTwo + " = " + multipliedNumber);
            } else {
                System.out.println("Something went wrong, try again!");
            }
        } while (!validChoice);
        showHelpMessage = 0;
        start();

    }

    public int calculatorAddition(int inputOne, int inputTwo) {
        int addedNumber = inputOne + inputTwo;
        return addedNumber;
    }

    public int calculatorSubtraction(int inputOne, int inputTwo) {

        int subtractionChoice = 0;
        int tempSubtraction = 0;
        System.out.print("Do you want to subtract the first or second number? [1]/[2] ");
        boolean validChoice = false;

        while (!validChoice) {

            try {
                subtractionChoice = Integer.parseInt(takeInput());
            } catch (NumberFormatException e) {
                System.out.print("Something went wrong, try again! " + inputPrompt);
                continue;
            }
            // int subtractionChoice = Integer.parseInt(takeInput());

            if (subtractionChoice == 1) {
                tempSubtraction = (inputOne - inputTwo);
                validChoice = true;
            } else {
                tempSubtraction = (inputTwo - inputOne);
                validChoice = true;
            }
        }
        return tempSubtraction;
    }

    public double calculatorDivision(double inputOne, double inputTwo) {
        boolean validChoice = false;
        double tempDivision = 0;
        int divisionChoice = 0;
        System.out.print("Do you want to divide the first or second number? [1]/[2] : ");

        while (!validChoice) {

            try {
                divisionChoice = Integer.parseInt(takeInput());
            } catch (NumberFormatException e) {
                System.out.print("Something went wrong, try again! " + inputPrompt);
                continue;
            }

            if (divisionChoice == 1) {
                tempDivision = (inputOne / inputTwo);
                validChoice = true;
            } else {
                validChoice = true;
                tempDivision = (inputTwo / inputOne);
            }
        }
        return tempDivision;

    }

    public int calculatorMultiplication(int inputOne, int inputTwo) {
        int tempMultiplication = (inputOne * inputTwo);
        return tempMultiplication;
    }

}
