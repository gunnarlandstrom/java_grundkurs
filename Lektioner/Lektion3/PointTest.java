/**
 * Ex03_11 - PointTest
 *
 * Ett klass som testar klassen Point genom att skapa
 * ett objekt av klassen samt anropar de metoder som finns.
 * Använder konstruktorn för att skapa objekt.
 *
 * @author Robert Jonsson
 */
public class PointTest {
    public static void main(String[] args) {
        // Skapar ett objekt av klassen Point. Objektet p1
        // innehåller en referens till objektet.
        Point p1 = new Point(100, 150);

        // Observera att vi nu inte längre kan använda det tidigare sättet att skapa:
        // Point p1 = new Point();
        // Utan enda sättet att skapa Point-objekt är att använda konstruktorn med två parametrar.

        // Skriver ut information om objektet
        p1.print();

        // Sätter nya värden och skriver ut igen
        p1.setX(200);
        p1.setY(50);
        p1.print();
    }
}