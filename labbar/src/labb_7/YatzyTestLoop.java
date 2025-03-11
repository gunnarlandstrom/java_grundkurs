
public class YatzyTestLoop {

    public static void main(String[] args) {

        Yatzy game3 = new Yatzy();

        int n = 10_000_000;
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            game3.rollDices();

        }

        game3.yatzyCounter();
        long endTime = System.currentTimeMillis();
        System.out.println("It took: " + (endTime - startTime) + " ms to throw " +  n + " throws.");

    }

}
