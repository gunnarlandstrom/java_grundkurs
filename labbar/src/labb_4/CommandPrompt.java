package labb_4;

import java.util.Scanner;

public class CommandPrompt {

    String userInput;
    public static final String inputPrompt = "input> ";

    Scanner input = new Scanner(System.in);

    public CommandPrompt() {
        commandPromptHelp();
        start();

    }

    public void start() {
        String commandMenuInput;
        commandPromptHelp();
        System.out.print(inputPrompt);
        commandMenuInput = takeInput();
        commandMenu(commandMenuInput);

    }

    public String takeInput() {
        userInput = input.nextLine();
        commandQuit(userInput);
        return userInput;
    }

    public void commandMenu(String userInput) {
        if (userInput == "1") {
            commandPromptHelp();
            return;
        } else if (userInput == "2") {
            commandPromptHelloWorld();
            return;
        } else if (userInput == "3") {
            commandIsNumberOdd(takeInput());
            return;
        } else if (userInput == "4") {
            repeatString();
            return;
        } else if (userInput == "5") {
            commandCalculator();
            return;
        }
        else if (userInput == "6") {
            start();
            return;
        }
        else if (userInput == "7" || userInput == "q" || userInput == "quit") {
            commandQuit(userInput);
            return;
        }
        else {
            System.out.println("Unrecognized input, try again! ");
            start();
        }

    }

    public void commandPromptHelloWorld() {
        System.out.println("Hello, World!");
    }

    public void commandPromptHelp() {
        System.out.println("Valid commands are:");
        System.out.println("[1] help -  Shows all available commands with a description.");
        System.out.println("[2] hello - Prints out a welcoming sentence.");
        System.out.println("[3] odd - Asks for a number and tells user if it's odd/even.");
        System.out.println("[4] repeat - Gives a choice of how many repetitions of an input the user wants to do.");
        System.out.println(
                "[5] calc or calculate - Takes two inputs and offers addition, subtraction, division and multiplication of those inputs.");
        System.out.println("[6] return - Returns the user to the menu.");
        System.out.println("[7] q or quit - Stops the program.\n");

    }

    public void commandQuit(String input) {
        if (input == "q" || input == "quit" || input == "7") {
            System.out.println("Program terminated.");
            System.exit(0);
        }
    }

    public boolean commandIsNumberOdd(String input) {

        boolean isOdd;
        int inputTemp;

        inputTemp = Integer.parseInt(input);
        /*
         * try {
         * } catch (NumberFormatException e) {
         * inputTemp = 0;
         * }
         */

        if (inputTemp % 2 == 0) {
            isOdd = false;
            System.out.println("The number " + inputTemp + " is even.");

        } else {
            isOdd = true;
            System.out.println("The number " + inputTemp + " is odd.");
        }
        return isOdd;
    }

    public void repeatString() {
        System.out.print("How many times do you want to repeat? ");
        int repeatAmount = Integer.parseInt(takeInput());

        System.out.print("What do you want to repeat? ");
        String reapeatedString = takeInput();

        for (int i = 0; i < repeatAmount; i++) {
            System.out.println(reapeatedString);
        }
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
            System.out.println("[1] Addition. ");
            System.out.println("[2] Subtraktion.");
            System.out.println("[3] Division.");
            System.out.println("[4] Multiplication.");
            System.out.print("Choose an operator [1], [2], [3] or [4]: ");
            tempOperatorChoice = takeInput();

            if (tempOperatorChoice == "1") {
                validChoice = true;
                int addedNumber = calculatorAddition(tempNumberOne, tempNumberTwo);
                System.out.println(tempNumberOne + " + " + tempNumberTwo + " = " + addedNumber);
            } else if (tempOperatorChoice == "2") {
                validChoice = true;
                int subtractedNumber = calculatorSubtraction(tempNumberOne, tempNumberTwo);
                System.out.println(
                        "Your subtraction of " + tempNumberOne + " and " + tempNumberTwo + " = " + subtractedNumber);
            } else if (tempOperatorChoice == "3") {
                validChoice = true;
                float dividedNumber = calculatorDivision(tempNumberOne, tempNumberTwo);
                System.out
                        .println("Your division of " + tempNumberOne + " and " + tempNumberTwo + " = " + dividedNumber);
            } else if (tempOperatorChoice == "4") {
                validChoice = true;
                int multipliedNumber = calculatorMultiplication(tempNumberOne, tempNumberTwo);
                System.out.println(tempNumberOne + " * " + tempNumberTwo + " = " + multipliedNumber);
            } else {
                System.out.println("Something went wrong, try again!");
            }
        } while (!validChoice);

    }

    public int calculatorAddition(int inputOne, int inputTwo) {
        int addedNumber = inputOne + inputTwo;
        return addedNumber;
    }

    public int calculatorSubtraction(int inputOne, int inputTwo) {

        int tempSubtraction;
        System.out.print("Do you want to subtract the first or second number? [1]/[2] ");
        int subtractionChoice = input.nextInt();

        if (subtractionChoice == 1) {
            tempSubtraction = (inputOne - inputTwo);
        } else {
            tempSubtraction = (inputTwo - inputOne);
        }
        return tempSubtraction;
    }

    public int calculatorDivision(int inputOne, int inputTwo) {
        int tempDivision;
        System.out.print("Do you want to divide the first or second number? [1]/[2] : ");
        int divisionChoice = input.nextInt();

        if (divisionChoice == 1) {
            tempDivision = (inputOne / inputTwo);
        } else {
            tempDivision = (inputTwo / inputOne);
        }
        return tempDivision;

    }

    public int calculatorMultiplication(int inputOne, int inputTwo) {
        int tempMultiplication = (inputOne * inputTwo);
        return tempMultiplication;
    }

}
