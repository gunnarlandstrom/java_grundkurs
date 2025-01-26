/**
 * Ex02_07 - PointTest2
 *
 * Ett klass som testar klassen Point genom att skapa flera
 * objekt av klassen samt anropar de metoder som finns i klassen.
 *
 * @author Robert Jonsson
 */
public class PointTest2 {
    public static void main(String[] args) {
        // Skapar olika objekt av klassen Point
        Point p1 = new Point();
        Point point = new Point();
        Point myPoint = new Point();

        /* Sätter olika värden på objekten samt skriver ut punkterna på skärmen.
           Varje objekt är unikt och innehåller sina egna data.
        */
        p1.setX(100);
        p1.setY(150);

        System.out.print("p1=");
        p1.print();

        point.setY(4);
        point.setX(44);

        myPoint.setX(200);
        myPoint.setY(200);

        System.out.print("myPoint=");
        myPoint.print();

        System.out.print("point=");
        point.print();
    }
}