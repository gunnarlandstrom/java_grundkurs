package labb_7;

import java.text.DecimalFormat;

public class Yatzy {
    private String[] dices = new String[5];
    private static int yatzyCounter = 0;
    private static int rolledDices = 0;
    private static int yatzyGames = 0;

    public Yatzy() {
        yatzyGames++;
        System.out.println("Game # " + yatzyGames);

        rollDices();
        System.out.print("Your dices are: ");
        for (String s : dices){
            System.out.print(s);

        }
        System.out.println("");

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

            isYatzy();

        }
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
        int j = 1;
        int i = 0;

        while (dices[i].equals(dices[j])) {
            i++;
            j++;
            if (i == 4) {
                yatzyCounter++;
                return true;
            }
        }
        return false;
    }

    // Sorts the dices
    public void sortDices(String input) {

        System.out.println("Game # " + input);
        for (int i = 0; i < dices.length; i++) {
            int tempOne = Integer.valueOf(dices[i]);
            for (int j = i + 1; j < dices.length; j++) {
                int tempTwo = Integer.valueOf(dices[j]);
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

    // Print dices
    @Override
    public String toString() {

        return dices[0] + " " + dices[1] + " " + dices[2] + " " + dices[3] + " " + dices[4];
    }
}
