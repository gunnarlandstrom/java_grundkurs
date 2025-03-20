package labb_7;
import java.text.DecimalFormat;

public class Yatzy {
    // Array and variables
    private String[] dices = new String[5];
    private static int yatzyCounter = 0;
    private static int rolledDices = 0;
    private static int yatzyGames = 0;

    // Constructor
    public Yatzy() {
        yatzyGames++;
        System.out.println("Game # " + yatzyGames);

        rollDices();
        System.out.print("Your dices are: ");
        for (String s : dices) {
            System.out.print(s);

        }
        System.out.println("");

        @SuppressWarnings("unused")
        boolean isYatzy = isYatzy();
    }

    // Yatzycounter and rollcounter
    public int yatzyCounter() {

        DecimalFormat onlyFourDecimals = new DecimalFormat("0.0000");

        System.out.println("You got #" + yatzyCounter + " Yatzys!");

        double percentageYatzy = ((double) yatzyCounter / (double) rolledDices * 100);

        System.out.println("That is (" + onlyFourDecimals.format(percentageYatzy) + "%) of the number of throws");

        return yatzyCounter;
    }

    // Rolls all five disces
    public void rollDices() {

        int randomNumber = 0;

        for (int i = 0; i < dices.length; i++) {

            randomNumber = (int) (Math.random() * 10);

            while (randomNumber < 1 || randomNumber >= 7) {

                randomNumber = (int) (Math.random() * 10);
            }
            dices[i] = Integer.toString(randomNumber);

            
        }
        isYatzy();
        rolledDices++;

    }

    // Rerolls desired dices
    public void rollDices(boolean diceOne, boolean diceTwo, boolean diceThree, boolean diceFour, boolean diceFive) {

        int randomNumber = 0;

        System.out.print("Rolling dices: ");

        while (diceOne || diceTwo || diceThree || diceFour || diceFive) {

            if (diceOne) {

                randomNumber = (int) (Math.random() * 10);
                while (randomNumber < 1 || randomNumber >= 7) {
                    randomNumber = (int) (Math.random() * 10);
                }
                dices[0] = Integer.toString(randomNumber);
                System.out.print("1 ");
                diceOne = false;
            } else if (diceTwo) {
                randomNumber = (int) (Math.random() * 10);
                while (randomNumber < 1 || randomNumber >= 7) {
                    randomNumber = (int) (Math.random() * 10);
                }
                dices[1] = Integer.toString(randomNumber);
                System.out.print("2 ");
                diceTwo = false;
            } else if (diceThree) {
                randomNumber = (int) (Math.random() * 10);
                while (randomNumber < 1 || randomNumber >= 7) {
                    randomNumber = (int) (Math.random() * 10);
                }
                dices[2] = Integer.toString(randomNumber);
                System.out.print("3 ");
                diceThree = false;
            } else if (diceFour) {
                randomNumber = (int) (Math.random() * 10);
                while (randomNumber < 1 || randomNumber >= 7) {
                    randomNumber = (int) (Math.random() * 10);
                }
                dices[3] = Integer.toString(randomNumber);
                System.out.print("4 ");
                diceFour = false;
            } else if (diceFive) {

                randomNumber = (int) (Math.random() * 10);
                while (randomNumber < 1 || randomNumber >= 7) {
                    randomNumber = (int) (Math.random() * 10);
                }
                dices[4] = Integer.toString(randomNumber);
                System.out.print("5 ");
                diceFive = false;
            }

        }
        System.out.println("");

    }

    // Checks if user have Yatzy
    public boolean isYatzy() {
        int dice1 = Integer.valueOf(dices[0]);
        int dice2 = Integer.valueOf(dices[1]);
        int dice3 = Integer.valueOf(dices[2]);
        int dice4 = Integer.valueOf(dices[3]);
        int dice5 = Integer.valueOf(dices[4]);

        if (dice1 == dice2 && dice1 == dice3 && dice1 == dice4 && dice1 == dice5) {
            yatzyCounter++;
            return true;
        } else {
            return false;
        }
    }

    // Sorts the dices
    public void sortDices(String input) {

        System.out.println("Game # " + input);
        for (int i = 0; i < dices.length; i++) {
            for (int j = i + 1; j < dices.length; j++) {
                if (Integer.valueOf(dices[i]) < Integer.valueOf(dices[j])) {
                    String tempNumber = dices[i];
                    dices[i] = dices[j];
                    dices[j] = tempNumber;
                }
            }
        }
        System.out.print("Your sorted dices are: ");
        for (String s : dices) {
            System.out.print(s);
        }
        System.out.println("\n");

    }

    // Prints dices
    @Override
    public String toString() {

        return dices[0] + " " + dices[1] + " " + dices[2] + " " + dices[3] + " " + dices[4];
    }
}
