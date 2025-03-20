package javaprojekt;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class CommandPrompter extends Person {

    ArrayList<Person> personArrayList = new ArrayList<Person>();
    Scanner scannerInput = new Scanner(System.in);
    private int k = 1;

    public CommandPrompter() {
        start();
    }

    public void start() {
        int commandMenuInput = 0;
        do {

            commandPromptList();
            System.out.print("input> ");
            try {
                commandMenuInput = Integer.valueOf(takeInput());
            } catch (NumberFormatException e){
                System.out.println("Something went wrong, try again, input a number!");
                continue;
            }
            System.out.println("");
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
                commandSearchList();
                return;
            case 4:
                commandPrintList();
                return;
            case 5:
                commandSortList();
                return;
            case 6:
                commandRandomizeList();
                return;
            case 7:
                commandSaveToFile();
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

    // Menu prompt
    public void commandPromptList() {
        System.out.println("");
        System.out.println("Amount of people in the current list: " + getAmountOfPersons());
        System.out.println("Valid commands are:");
        System.out.println("[1] Add       - Add a new person to the list.");
        System.out.println("[2] Remove    - Remove a person from the list.");
        System.out.println("[3] Search    - Searches the list.");
        System.out.println("[4] Print     - Prints the list.");
        System.out.println("[5] Sort      - Sorts the list.");
        System.out.println("[6] Randomize - Randomizes the list.");
        System.out.println("[7] Save file - Saves the list to desired file.");
        System.out.println("[8] Read file - Imports list to program.");
        System.out.println("[9] Quit      - Stops the program.\n");
    }

    // Exits program
    public void commandQuit(int input) {

        if (input == 9) {
            scannerInput.close();
            System.out.println("Program terminated.");
            System.exit(0);
        }
    }

    // Adds new person to Arraylist, creates username, checks if unique
    public void commandAddPersonToList() {
        int height = 0; 

        System.out.println("Enter the personal information!");

        System.out.print("First name: ");
        String firstName = takeInput();

        System.out.print("Last name: ");
        String lastName = takeInput();

        // Creates username
        String userName = commandUserName(firstName.toLowerCase(), lastName.toLowerCase());
        userName = isUserNameUnique(userName);

        System.out.print("Height in centimeters: ");
        try {
            height = Integer.valueOf(takeInput());
        } catch ( NumberFormatException e) {
            System.out.println("");
            System.out.println("Wrong input, please enter a number. Returning to main menu.");
            start();
        }        

        System.out.print("Place of residence: ");
        String residence = takeInput();

        System.out.print("Address: ");
        String address = takeInput();

        System.out.print("Zip code: ");
        String zipCode = takeInput();

        Address newAddress = new Address(address, zipCode, residence);
        Person newPerson = new Person(userName, firstName, lastName, height, newAddress);

        personArrayList.add(newPerson);
    }

    // Creates UserName
    public String commandUserName(String firstName, String lastName) {

        String tempUserFirst;
        String tempUserLast;

        // Regex to remove whitespaces and invisible characters from string.
        firstName = firstName.replaceAll("\\s", "");
        lastName = lastName.replaceAll("\\s", "");

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

    // Checks if username of new person is unique, else increments counter, reads
    // from list reversed to detect the number of identical username.
    public String isUserNameUnique(String userName) {
        String tempUserName;
        String uniqueCounter;

        tempUserName = userName;

        for (int i = personArrayList.size() - 1; i >= 0; i--) {

            Person temp = personArrayList.get(i);
            String tempName = temp.getUserName().substring(0, 6);

            if (tempName.equals(tempUserName)) {

                String tempCounter = temp.getUserName().substring(7, 8);
                k = Integer.valueOf(tempCounter);
                k++;

                uniqueCounter = String.valueOf(k);
                uniqueCounter = (String.format("%02d", k));
                tempUserName = userName + uniqueCounter;
                return tempUserName;
            }

        }
        k = 1;
        uniqueCounter = String.valueOf(k);
        uniqueCounter = (String.format("%02d", k));

        tempUserName = userName + uniqueCounter;
        return tempUserName;

    }

    // Removes user from the list by username.
    public void commandRemovePersonFromList() {
        System.out.print("Enter the username of the person you wish to remove from list: ");
        String removeUser = takeInput().toLowerCase();

        for (int i = 0; i < personArrayList.size(); i++) {

            Person temp = personArrayList.get(i);
            String tempUserNameFromList = temp.getUserName();

            if (tempUserNameFromList.equals(removeUser)) {

                personArrayList.remove(i);
                temp.setAmountOfPersons(-1);
            } else {
                System.out.println("Username does not exist in file. Returning to main menu.");
                start();
            }
        }
    }

    // Searches the list for a username.
    public void commandSearchList() {

        System.out.print("Enter the username you with to search for in the current list: ");
        String doesUserExist = takeInput().toLowerCase();
        System.out.println("");

        for (int i = 0; i < personArrayList.size(); i++) {

            Person temp = personArrayList.get(i);

            String tempUsernameExists = temp.getUserName();

            if (doesUserExist.equals(tempUsernameExists)) {

                temp.printPerson();
                System.out.println("");
                return;
            }
        }
        System.out.println("***** Username does not exist in current list. Returning to menu. *****");
        start();

    }

    // Gives options of how to sort the list
    public void commandSortList() {

        System.out.println("How do you want to sort the list? ");
        System.out.println("[1] By username. ");
        System.out.println("[2] By lastname. ");
        System.out.println("[3] By height.");
        System.out.println("[4] Return to main menu.");
        System.out.print("input> ");

        int input = Integer.valueOf(takeInput());

        switch (input) {
            case 1:
                commandSortListByUsername();
                break;

            case 2:
                commandSortListByLastname();
                break;

            case 3:
                commandSortListByHeight();
                break;

            case 4:
                System.out.println("");
                System.out.println("Returning to main menu.");
                start();
                break;

            default:
                System.out.println("Wrong input, try again!");
                commandSortList();
        }

    }

    // Prints ArrayList
    public void commandPrintList() {

        System.out.println("*************** NAME LIST ***************");
        System.out.println("Amount of people in the current list: " + getAmountOfPersons());
        System.out.println("");
        System.out.println("Nr Username   Name                           Length [m]");

        for (int i = 0; i < personArrayList.size(); i++) {
            Person temp = personArrayList.get(i);
            String numberTemp = String.format("%2d", i+1);
            System.out.print(numberTemp);
            temp.printPerson();
            System.out.println("");
        }

    }

    // Sorts list by username
    // Link to explanation: https://stackoverflow.com/questions/2784514/sort-arraylist-of-custom-objects-by-property
    public void commandSortListByUsername() {

        Collections.sort(personArrayList,
                (tempPersonOne, tempPersonTwo) -> tempPersonOne.getUserName().compareToIgnoreCase(tempPersonTwo.getUserName()));

    }

    // Sorts list by lastname using Comparator comparing lastnames, then firstnames if lastnames are equal.
    // Link to explanation: https://medium.com/@AlexanderObregon/javas-comparator-thencomparing-method-explained-988e8f926a64
    public void commandSortListByLastname() {
        personArrayList.sort(Comparator.comparing(Person::getLastName).thenComparing(Person::getFirstName));
    }

    // Sorts list by height.
    public void commandSortListByHeight() {

        Collections.sort(personArrayList, (tempPersonOne, tempPersonTwo) -> Integer.compare(tempPersonTwo.getHeight(),
                tempPersonOne.getHeight()));
    }

    // Randomizes the list.
    public void commandRandomizeList(){
        Collections.shuffle(personArrayList);
    }

    // Saves the Arraylist to a file of the users choice.
    public void commandSaveToFile(){

        !!!!
    }

}
