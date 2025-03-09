package labb_7;

public class Yatzy {
    private String[] dices = new String[5];
    private static int yatzyCounter = 0;

    public Yatzy() {
        rollDices();

        boolean isYatzy = isYatzy();
        sortDices();

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

        System.out.print("The dices are rolled! They landed on: ");
        for (String s : dices) {
            System.out.print(s);
        }
        System.out.println("\n");

    }

    // Print amount of Yatzy
    

    // Rerolls desired dices
    public void rollDices(boolean diceOne, boolean diceTwo, boolean diceThree, boolean diceFour, boolean diceFive) {

        int randomNumber = 0;

        while (diceOne || diceTwo || diceThree || diceFour || diceFive) {

            for (String s : dices) {
                System.out.println(s);
            }

            if (diceOne) {

                randomNumber = (int) (Math.random() * 10);
                while (randomNumber < 1 || randomNumber >= 7) {
                    randomNumber = (int) (Math.random() * 10);
                }
                dices[0] = Integer.toString(randomNumber);
                diceOne = false;
            } else if (diceTwo) {
                randomNumber = (int) (Math.random() * 10);
                while (randomNumber < 1 || randomNumber >= 7) {
                    randomNumber = (int) (Math.random() * 10);
                }
                dices[1] = Integer.toString(randomNumber);
                diceTwo = false;
            } else if (diceThree) {
                randomNumber = (int) (Math.random() * 10);
                while (randomNumber < 1 || randomNumber >= 7) {
                    randomNumber = (int) (Math.random() * 10);
                }
                dices[2] = Integer.toString(randomNumber);
                diceThree = false;
            } else if (diceFour) {
                randomNumber = (int) (Math.random() * 10);
                while (randomNumber < 1 || randomNumber >= 7) {
                    randomNumber = (int) (Math.random() * 10);
                }
                dices[3] = Integer.toString(randomNumber);
                diceFour = false;
            } else if (diceFive) {

                randomNumber = (int) (Math.random() * 10);
                while (randomNumber < 1 || randomNumber >= 7) {
                    randomNumber = (int) (Math.random() * 10);
                }
                dices[5] = Integer.toString(randomNumber);
                diceFive = false;
            }

        }

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
    public void sortDices() {

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

    }

    // Print dices
    @Override
    public String toString() {

        return dices[0] + " " + dices[1] + " " + dices[2] + " " + dices[3] + " " + dices[4];
    }
}
