package javaprojekt;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CommandPrompter extends Person {

    ArrayList<Person> personArrayList = new ArrayList<Person>();
    Scanner scannerInput = new Scanner(System.in);

    public CommandPrompter() {
        start();
    }

    public void start() {
        int commandMenuInput;
        do {

            commandPromptList();
            System.out.print("input> ");
            commandMenuInput = Integer.valueOf(takeInput());
            commandMenu(commandMenuInput);
        } while (commandMenuInput != 9);
    }

    public String takeInput() {

        String userInput = scannerInput.nextLine();
        return userInput;

    }

    public ArrayList<Person> getArrayList() {

        return personArrayList;
    }

    public void commandMenu(int userInput) {
        switch (userInput) {
            case 1:
                commandAddPersonToList();
                return;
            case 2:
                commandRemovePersonFromList();
                return;
            case 3:
                // commandSearchList();
                return;
            case 4:
                commandPrintList();
                return;
            case 5:
                // commandSortList();
                return;
            case 6:
                // commandRandomizeList();
                return;
            case 7:
                // commandSaveToFile();
                return;
            case 8:
                // commandReadFile();
                return;
            case 9:
                commandQuit(userInput);
            default:
            System.out.println("Unrecognized input, try again! ");
            System.out.println("");
                start();
        }
    }

    public void commandPromptList() {
        System.out.println("Amount of people in the current list: " + getAmountOfPersons());
        System.out.println("Valid commands are:");
        System.out.println("[1] Add - Add a new person to the list.");
        System.out.println("[2] Remove - Remove a person from the list.");
        System.out.println("[3] Search - Searches the list.");
        System.out.println("[4] Print - Prints the list.");
        System.out.println("[5] Sort - Sorts the list.");
        System.out.println("[6] Randomize - Randomizes the list.");
        System.out.println("[7] Save file - Saves the list to desired file.");
        System.out.println("[8] Read file - Imports list to program.");
        System.out.println("[9] Quit - Stops the program.\n");
    }

    public void commandQuit(int input) {

        if (input == 9) {
            scannerInput.close();
            System.out.println("Program terminated.");
            System.exit(0);
        }
    }

    // Adds new person to Arraylist, creates username, checks if unique
    public void commandAddPersonToList() {

        System.out.println("Enter the personal information!");

        System.out.print("First name: ");
        String firstName = takeInput();

        System.out.print("Last name: ");
        String lastName = takeInput();

        // Creates username
        String userName = commandUserName(firstName.toLowerCase(), lastName.toLowerCase());
        userName = isUserNameUnique(userName);

        System.out.print("Height in centimeters: ");
        int height = Integer.valueOf(takeInput());

        System.out.print("Place of residence: ");
        String residence = takeInput();

        System.out.print("Address: ");
        String address = takeInput();

        System.out.print("Zip code: ");
        String zipCode = takeInput();

        System.out.println(userName);

        Address newAddress = new Address(address, zipCode, residence);
        Person newPerson = new Person(userName, firstName, lastName, height, newAddress);

        personArrayList.add(newPerson);
    }

    // Prints ArrayList
    public void commandPrintList() {

        for (int i = 0; i < personArrayList.size(); i++) {
            Person temp = personArrayList.get(i);
            temp.printPerson();
        }

    }

    // Creates UserName
    public String commandUserName(String firstName, String lastName) {

        String tempUserFirst;
        String tempUserLast;
        String tempUserShort;
        if (firstName.length() > 2) {
            tempUserFirst = firstName.substring(0, 3);
        } else {
            tempUserFirst = firstName;
            if (tempUserFirst.length() == 2) {
                tempUserFirst = tempUserFirst + "x";
            } else if (tempUserFirst.length() == 1) {
                tempUserFirst = tempUserFirst + "xx";
            } else {
                tempUserFirst = "ano";
            }
        }
        if (lastName.length() > 2) {
            tempUserLast = lastName.substring(0, 3);
        } else {
            tempUserLast = lastName;
            if (tempUserLast.length() == 2) {
                tempUserLast = tempUserLast + "x";
            } else if (tempUserLast.length() == 1) {
                tempUserLast = tempUserLast + "xx";
            } else {
                tempUserLast = "nym";
            }
        }

        return tempUserFirst + tempUserLast;

    }

    // Checks if username of new person is unique, else increments counter
    public String isUserNameUnique(String userName) {
        int k = 1;
        String tempUserName;
        String uniqueCounter;

        tempUserName = userName;
        for (int i = 0; i < personArrayList.size(); i++) {

            Person temp = personArrayList.get(i);
            String tempName = temp.getUserName().substring(0,6);


            if (tempName.equals(tempUserName)) {

                k++;
                uniqueCounter = String.valueOf(k);
                uniqueCounter = (String.format("%02d", k));
                tempUserName = userName + uniqueCounter;
                return tempUserName;
            }

        }
        uniqueCounter = String.valueOf(k);
        uniqueCounter = (String.format("%02d", k));

        tempUserName = userName + uniqueCounter;
        return tempUserName;

    }

    // Removes user from the list by username.
    public void commandRemovePersonFromList(){





    }

}
