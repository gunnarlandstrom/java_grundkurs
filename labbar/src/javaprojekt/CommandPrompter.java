package javaprojekt;
import java.util.Scanner;

public class CommandPrompter extends Person {

    Scanner scannerInput = new Scanner(System.in);
    public static final String inputPrompt = "input> ";
    private static int showHelpMessage = 0;

    public CommandPrompter() {
        start();

    }

    public void start() {
        int commandMenuInput = 0;
        while (commandMenuInput != 9){

            if (showHelpMessage == 0) {
                
                showHelpMessage = +1;
                commandPromptList();
            }
            System.out.print(inputPrompt);
            commandMenuInput = takeIntInput();
            
            commandMenu(commandMenuInput);
            
        }
    }

    public int takeIntInput() {
        int userInput = scannerInput.nextInt();
        return userInput;
    }

    public String takeStringInput() {
        String userInput = scannerInput.nextLine();
        System.out.println(inputPrompt);
        return userInput;
    }

    public void commandMenu(int userInput) {
        if (userInput == 1) {
            commandAddPersonToList();
            return;
        } else if (userInput == 2) {
            commandRemovePersonFromList();
            return;
        } else if (userInput == 3) {
            commandSearchList();
            return;
        } else if (userInput == 4) {
            commandPrintList();
            return;
        } else if (userInput == 5) {
            commandSortList();
            return;
        } else if (userInput == 6) {
            commandRandomizeList();
            return;
        } else if (userInput == 7){
            commandSaveToFile();
            return;
        } else if (userInput == 8){
            commandReadFile();
            return;
        } else if (userInput == 9){
            commandQuit(userInput);
        }else {
            System.out.println("Unrecognized input, try again! ");
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
        start();
    }

    public void commandQuit(int input) {

        if (input == 9) {
            scannerInput.close();
            System.out.println("Program terminated.");
            System.exit(0);
        }
    }

    public void commandAddPersonToList(){

        System.out.println("Enter the persons information!");
        
        System.out.print("First name: ");
        String firstName = takeStringInput();
        
        System.out.print("Last name: ");
        String lastName = takeStringInput();
        
        System.out.print("Height in centimeters: ");
        int height = takeIntInput();
        
        System.out.print("Place of residence: ");
        String residence = takeStringInput();
        
        System.out.print("Address: ");
        String address = takeStringInput();
        
        System.out.print("Zip code: ");
        String zipCode = takeStringInput();
        
        Person newPerson = new Person(firstName, lastName, height, address, zipCode, residence);
    
    
    }


}
