package labb_7;

public class Yatzy {

    public void main(String[] args) {

        rollDisces();

    }

    public void rollDisces() {

        int randomNumber = 0;
        String[] dices = new String[5];
        for (int i = 0; i < dices.length; i++) {

            randomNumber = (int) (Math.random() * 10);

            while (randomNumber < 1 || randomNumber > 6) {

                randomNumber = (int) (Math.random() * 10);
            }
            dices[i] = Integer.toString(randomNumber);
            
        }


    }
}
