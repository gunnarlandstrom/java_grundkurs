/**
 * Ex03_13 - PersonTest4
 *
 * Ett klass som testar klassen Person4 genom att skapa
 * objekt av klassen med de olika konstruktorerna.
 */
public class PersonTest4 {
    public static void main(String[] args) {
        // Skapar olika objekt av klassen Person4 genom att använda de tre olika konstruktorerna
        Person4 p1 = new Person4("Kalle", "Karlsson", 30, "kalle@karlsson.se");
        Person4 p2 = new Person4("Stina", "Svensson", 25);
        Person4 p3 = new Person4();

        // Anropar metoden print för varje objekt
        p1.print();
        System.out.println();  // Radbrytning
        p2.print();
        System.out.println();  // Radbrytning
        p3.print();
    }
}