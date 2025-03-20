package labb_7;
public class YatzyTest {

    public void main(String[] args) {

        Yatzy game1 = new Yatzy();
        Yatzy game2 = new Yatzy();

        System.out.println("");

        game1.rollDices(false, false, true, true, true);
        game1.sortDices("1");
        System.out.println("");
        game2.rollDices(true, true, true, false, false);
        game2.sortDices("2");

    }

}
