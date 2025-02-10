package labb_4;

import java.util.Scanner;

public class CommandPrompt {

    public static final String inputPrompt = "input> ";

    private String commandHelp;
    private String commandRepeat;
    private String commandHello;
    private String userInput;
    private String commandMenu;

    private boolean commandQ;
    private boolean commandQuit;
    private boolean isOdd;


    private int commandOdd;
    private int commandCalc;
    private int commandCalculate;

    Scanner input = new Scanner(System.in);

    public CommandPrompt() {
        start();

    }

    public void start() {
        System.out.println(inputPrompt);
        commandMenu = takeInput();

    }

    public String takeInput() {
        userInput = input.nextLine();
        return userInput;
    }

    public String commandMenu(String input){
        System.out.println("commandHello");
        return input;

    }

    public void commandPromptHelp(){
        System.out.println("Valid commands are:");
        System.out.println("help");
        System.out.println("q or quit");
        System.out.println("hello");
        System.out.println("odd");
        System.out.println("repeat");
        System.out.println("calc");
        System.out.println("calculate");
        System.out.println("commandHello");
        start();
    }

    public void commandQuit(String input){
        if (input == "q" || input == "quit") {
            System.exit(0);
        }
    }

    public boolean isNumberOdd(int input) {

        if (input % 2 == 0) {
            isOdd = false;
        }
        else {
            isOdd = true;
        }
        return isOdd;
    }

    public void repeatSomeWords() {
        System.out.print("How many times do you want to repeat? ");
        int repeatAmount = input.nextInt();

        System.out.print("What do you want to repeat? ");
        String reapeatedString = input.nextLine();

        for (int i = 0; i < repeatAmount; i++) {
            System.out.println(reapeatedString);
        }
    }

    public void commandCalculator() {
        System.out.print("EntercommandHello");
    }

}
