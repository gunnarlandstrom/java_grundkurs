/**
 * Ex04_06 - BooleanTest
 * @author Robert Jonsson
 *
 * Provar att skicka boolean som argument till metoder,
 * som även returnerar en boolean.
 */
public class BooleanTest {
    // Returnerar resultatet av ett logiskt AND på parametrarna b1 och b2
    public boolean and(boolean b1, boolean b2) {
        System.out.print(b1 + " && " + b2 + " = ");
        return b1 && b2;
    }

    // Returnerar resultatet av ett logiskt OR på parametrarna b1 och b2
    public boolean or(boolean b1, boolean b2) {
        System.out.print(b1 + " || " + b2 + " = ");
        return b1 || b2;
    }

    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // Skapar ett objekt av den egna klassen
        BooleanTest bt = new BooleanTest();

        boolean andResult = bt.and(a, !b);
        System.out.println(andResult);

        System.out.println(bt.or(b, andResult));
    }
}