package javaprojekt;

import java.io.*;
import java.util.*;

public class CommandPrompter extends Person {

    ArrayList<Person> personArrayList = new ArrayList<Person>();
    Scanner scannerInput = new Scanner(System.in);
    private int k = 1;

    // Constructor
    public CommandPrompter() throws FileNotFoundException {
        try {

            start();
        } catch (IOException error) {
            System.out.println("Error, try again.");
        }
    }

    // Default promptlist and input.
    public void start() throws FileNotFoundException {
        int commandMenuInput = 0;
        do {

            commandPromptList();
            System.out.print("input> ");
            try {
                commandMenuInput = Integer.valueOf(takeInput());
            } catch (NumberFormatException e) {
                System.out.println("Something went wrong, try again, input a number!");
                continue;
            }
            System.out.println("");
            commandMenu(commandMenuInput);
        } while (commandMenuInput != 9);
    }

    // Takes keyboard input
    public String takeInput() {

        String userInput = scannerInput.nextLine();
        return userInput;

    }

    // getter for the arraylist.
    public ArrayList<Person> getArrayList() {

        return personArrayList;
    }

    // Menu for all choices.
    public void commandMenu(int userInput) throws FileNotFoundException {
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
                commandReadFile();
                return;
            case 9:
                commandQuit(userInput);
            default:
                System.out.println("Unrecognized input, try again, enter a number [1-9]. ");
                System.out.println("");
                start();
        }
    }

    // Menu prompt.
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

    // Checks if a new person trying to be added is unique by comparing first and
    // lastname with height.
    public boolean isPersonUnique(String firstName, String lastName, int height) throws FileNotFoundException {

        for (int i = 0; i < personArrayList.size(); i++) {
            Person tempPerson = personArrayList.get(i);
            String tempFirstName = tempPerson.getFirstName().toLowerCase();
            String tempLastName = tempPerson.getLastName().toLowerCase();
            int tempHeight = tempPerson.getHeight();

            if (firstName.equals(tempFirstName) && lastName.equals(tempLastName) && height == tempHeight) {

                try {
                    System.out.println("");
                    System.out.println("******* You are trying to add a person already in the list. ********");
                    System.out.println("");
                    System.out.println("[1] Change inputs. ");
                    System.out.println("[2] Return to main menu. ");

                    System.out.print("input> ");
                    int errorChoice = Integer.parseInt(takeInput());

                    switch (errorChoice) {
                        case 1:
                            commandAddPersonToList();
                            return false;
                        case 2:
                            System.out.println("Returning to main menu");
                            start();
                        default:

                    }

                } catch (NumberFormatException e) {
                    System.out.println("Wrong input, please enter a number. [1] or [2]");
                    continue;
                }

            }

        }
        return true;

    }

    // Adds new person to Arraylist, creates username, checks if unique
    public void commandAddPersonToList() throws FileNotFoundException {
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
        } catch (NumberFormatException e) {
            System.out.println("");
            System.out.println("Wrong input, please enter a number. Returning to main menu.");
            start();
        }

        boolean tempUnique = isPersonUnique(firstName.toLowerCase(), lastName.toLowerCase(), height);

        if (tempUnique) {

            System.out.print("Address: ");
            String address = takeInput();

            System.out.print("Zip code: ");
            String zipCode = takeInput();

            System.out.print("Place of residence: ");
            String residence = takeInput();

            firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
            lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
            address = address.substring(0, 1).toUpperCase() + address.substring(1).toLowerCase();
            residence = residence.substring(0, 1).toUpperCase() + residence.substring(1).toLowerCase();

            Address newAddress = new Address(address, zipCode, residence);
            Person newPerson = new Person(userName, firstName, lastName, height, newAddress);

            personArrayList.add(newPerson);
        }
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
    public void commandRemovePersonFromList() throws FileNotFoundException {
        System.out.print("Enter the username of the person you wish to remove from list: ");
        String removeUser = takeInput().toLowerCase();

        for (int i = 0; i < personArrayList.size(); i++) {

            Person temp = personArrayList.get(i);
            String tempUserNameFromList = temp.getUserName();

            if (tempUserNameFromList.equals(removeUser)) {

                Person tempPerson = personArrayList.get(i);
                System.out.println("");
                System.out.println("*** Removing person ***");
                tempPerson.printPerson();
                System.out.println("");

                personArrayList.remove(i);
                temp.setAmountOfPersons(-1);
                break;

            } else {
                System.out.println("Username does not exist in file. Returning to main menu.");
                start();
            }
        }
    }

    // Searches the list for a username.
    public void commandSearchList() throws FileNotFoundException {

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
    public void commandSortList() throws FileNotFoundException {

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

    // Prints ArrayList **************************************SKA PRINTA MAX 20
    // ELEMENT, SEN ENTER FÖR FLER*******************
    public void commandPrintList() {

        System.out.println("*************** NAME LIST ***************");
        System.out.println("Amount of people in the current list: " + getAmountOfPersons());
        System.out.println("");
        System.out.println("Nr Username   Name                           Length [m]");

        for (int i = 0; i < personArrayList.size(); i++) {
            Person temp = personArrayList.get(i);
            String numberTemp = String.format("%2d", i + 1);
            System.out.print(numberTemp);
            temp.printPerson();
            System.out.println("");
        }
    }

    // Sorts list by username
    // Link to explanation:
    // https://stackoverflow.com/questions/2784514/sort-arraylist-of-custom-objects-by-property
    public void commandSortListByUsername() {

        Collections.sort(personArrayList,
                (tempPersonOne, tempPersonTwo) -> tempPersonOne.getUserName()
                        .compareToIgnoreCase(tempPersonTwo.getUserName()));

    }

    // Sorts list by lastname using Comparator comparing lastnames, then firstnames
    // if lastnames are equal.
    // Link to explanation:
    // https://medium.com/@AlexanderObregon/javas-comparator-thencomparing-method-explained-988e8f926a64
    public void commandSortListByLastname() {
        personArrayList.sort(Comparator.comparing(Person::getLastName).thenComparing(Person::getFirstName));
    }

    // Sorts list by height.
    public void commandSortListByHeight() {

        Collections.sort(personArrayList, (tempPersonOne, tempPersonTwo) -> Integer.compare(tempPersonTwo.getHeight(),
                tempPersonOne.getHeight()));
    }

    // Randomizes the list.
    public void commandRandomizeList() {
        Collections.shuffle(personArrayList);
    }

    // Scanner
    public Scanner scannerFromFile(String desiredFileName) throws FileNotFoundException {
        Scanner fileInput = new Scanner(new File(desiredFileName));
        return fileInput;
    }

    // Reads data from file to arraylist.
    public void commandReadFile() throws FileNotFoundException {

        try {

            System.out.println("** You are loading a desired list from a file **");
            System.out.println("");
            System.out.print("What is the filename of the file you want to load?: ");

            String wantedFile = takeInput();
            Scanner readInput = scannerFromFile(wantedFile);
            personArrayList.clear();
            readInput.useDelimiter("\\|");
            int i = 0;

            while (readInput.hasNext()) {

                String tempFirstName = readInput.next();
                tempFirstName = tempFirstName.substring(0, 1).toUpperCase() + tempFirstName.substring(1).toLowerCase();
                
                String tempLastName = readInput.next();
                tempLastName = tempLastName.substring(0, 1).toUpperCase() + tempLastName.substring(1).toLowerCase();
                
                String tempUserName = readInput.next();
                tempUserName = tempUserName.toLowerCase();
                
                int tempHeight = Integer.valueOf(readInput.next());
                
                String tempAddress = readInput.next();
                tempAddress = tempAddress.substring(0,1).toUpperCase() + tempAddress.substring(1).toLowerCase();
                
                String tempZipCode = readInput.next();
                
                String tempResidence = readInput.nextLine().substring(1);
                tempResidence = tempResidence.substring(0,1).toUpperCase() + tempResidence.substring(1).toLowerCase();

                Address tempAddressObj = new Address(tempAddress, tempZipCode, tempResidence);
                Person tempPerson = new Person(tempUserName, tempFirstName, tempLastName, tempHeight, tempAddressObj);
                personArrayList.add(i, tempPerson);
                i++;

            }
            start();

        } catch (IOException error) {

            System.out.println("");
            System.out.println("Filename does not exist, please try again! Returning to main menu.");
            start();
        }
    }

    // Saves the Arraylist to a file of the users choice.
    public void commandSaveToFile() throws FileNotFoundException {

        try {
            System.out.println("** You are saving your list to a desired file **");
            System.out.println("");
            System.out.print("What filename do you want to call your list?: ");
            String desiredFileName = takeInput();
            PrintWriter saveFile = new PrintWriter(new BufferedWriter(new FileWriter(desiredFileName)));

            for (int i = 0; i < getAmountOfPersons(); i++) {
                Person tempPerson = personArrayList.get(i);
                Address tempAddressObj = tempPerson.getAddressClass();

                String tempName = tempPerson.getFirstName() + "|" + tempPerson.getLastName();
                String tempSignature = "|" + tempPerson.getUserName();
                String tempHeight = "|" + String.valueOf(tempPerson.getHeight());
                String tempAddress = "|" + tempAddressObj.getHomeAddress();
                String tempZipcode = "|" + tempAddressObj.getZipCode();
                String tempResidence = "|" + tempAddressObj.getPlaceOfResidence();

                saveFile.println(tempName + tempSignature + tempHeight + tempAddress + tempZipcode + tempResidence);

            }
            saveFile.close();
        } catch (IOException error) {

            System.out.println("Something went wrong, returning to main menu.");
            start();
        }

    }

}
