/**
 * Ex03_20 - PersonTest
 * <p>
 * Ett klass som testar klassen Person genom att skapa 
 * objekt av klassen samt anropar de metoder som finns.
 *
 * @author Robert Jonsson
 */
public class PersonTest {
    public static void main(String[] args) {
        // Börjar med att skriva ut antal skapade personer
        System.out.print("Antal skapade personer: ");
        System.out.println(Person.getNoOfPersons() + "\n");

        // Provar olika sätt att skapa objekt av klassen Person och Name
        Person p1 = new Person("Kalle", "Karlsson", 30, "kalle@karlsson.se");
        System.out.println("Nu har vi skapat: " + p1);

        Name n1 = new Name("Stina", "Svensson");
        Person p2 = new Person(n1, 25);
        System.out.println("Nu har vi skapat: " + p2.getLastName() + ", " + p2.getFirstName());

        Person p3 = new Person();
        System.out.println("Nu har vi skapat: " + p3.getNameAsString());

        Name n2 = new Name("Pelle", "Persson");
        Person p4 = new Person(n2, 82, "pelle.p@home.net");
        System.out.println("Nu har vi skapat: " + n2);

        // Skriver ut antal skapade personer
        System.out.print("\n" + "Antal skapade personer: ");
        System.out.println(Person.getNoOfPersons());

        // Anropar metoden print() på objekteten
        System.out.println("\nSkriver ut information om alla skapade personer:");
        p1.print();
        p2.print();
        p3.print();
        p4.print();

        // Ändrar värden på en del objekt
        p1.setAge(103);
        p2.setFirstName("Anders");
        p2.setMail("ankan@sverige.se");
        p3.setName(p1.getName());  // Sätter namnet på p3 till samma som p1
        p4.setName(null); // !!!!

        // Skriver ut info om dessa objekt igen
        System.out.println("\nSkriver ut information om alla skapade personer igen:");
        p1.print();
        p2.print();
        p3.print();
        p4.print(); // Vad händer här när vi har satt Name till null på p4?????
    }
}