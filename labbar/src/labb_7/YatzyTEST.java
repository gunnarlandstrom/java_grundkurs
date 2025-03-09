package labb_7;

public class YatzyTEST {

    public void main(String[] args) {

        Yatzy game1 = new Yatzy();
        Yatzy game2 = new Yatzy();
        Yatzy game3 = new Yatzy();

        System.out.println("");

        game1.rollDices(false, false, true, true, true);
        game1.sortDices("1");
        System.out.println("");
        game2.rollDices(true, true, true, false, false);
        game2.sortDices("2");

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10_000_000; i++) {
            game3.rollDices();

        }

        game3.yatzyCounter();
        long endTime = System.currentTimeMillis();
        System.out.println("It took: " + (endTime - startTime) + " ms to throw 10 million throws.");

    }

}
