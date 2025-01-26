/**
 * Ex02_06 - PointTest
 *
 * En klass som "testar" klassen Point genom att skapa ett objekt av klassen
 * samt anropar de metoder som finns i klassen.
 *
 * @author Robert Jonsson
 */
public class PointTest {
    public static void main(String[] args) {
        // Skapar ett objekt av klassen Point. Objektet p1 är en så kallad
        // referensvariabel som innehåller en referens till objektet.
        Point p1 = new Point();

        /* Använder nu objektet p1 för att anropa metoderna setX och setY
           för att sätta värden på punktens x- och y-koordinater. Dessa
           metoder kräver var sitt argument, vilka vi skickar direkt i anropet till metoderna.
        */

        p1.setX(100); // Sätter x-koordinaten till 100
        p1.setY(150); // Sätter y-koordinaten till 150

        // Anropar metoden print på objektet p1 som skriver ut
        // punktens koordinater på skärmen.
        p1.print();
    }
}