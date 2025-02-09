/**
 * Ex04_05 - PersonTest
 *
 * Ett klass som testar klassen Person2 genom att skapa objekt
 * av klassen och sen provar att sätta nya e-postadresser.
 *
 * @author Robert Jonsson
 */
public class PersonTest2 {
    public static void main(String[] args) {
        // Skapar två objekt av klassen Person2. Ett med e-post satt och ett utan.
        Person2 p1 = new Person2("Kalle", "Karlsson", 30, "kalle@karlsson.se");
        Person2 p2 = new Person2(new Name("Stina", "Svensson"), 25);

        // Skriver ut information om personerna
        p1.print();
        System.out.println();
        p2.print();

        // Försöker sätta nya e-postadresser
        boolean isMailChanged = p1.setMail("karlsson@kalle.se");
        System.out.println("\nIs mail changed for p1: " + isMailChanged);

        isMailChanged = p2.setMail("stina.svensson@java.se");
        System.out.println("Is mail changed for p2: " + isMailChanged + "\n");

        // Skriver ut information om personerna
        p1.print();
        System.out.println();
        p2.print();
    }
}