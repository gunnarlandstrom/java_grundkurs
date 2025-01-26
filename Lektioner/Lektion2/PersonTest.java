/**
 * Ex02_10 - PersonTest
 *
 * Ett klass som testar klassen Person genom att skapa ett objekt av klassen samt 
 * anropar de metoder som finns.
 *
 * @author Robert Jonsson
 */
public class PersonTest {
    public static void main(String[] args) {
        // Skapar ett objekt av klassen Person
        Person p1 = new Person();
        
        // Sätter namn och e-post genoma att anropa metoderna setName och setMail på objektet p1.
        // Som argument till metoderna skickar vi en sträng med den namn och den e-post personen ska ha.
        p1.setName("Kalle Karlsson");
        p1.setMail("kalle@karlsson.se");
        
        // Anropar metoden print på objektet p1 för att skriva ut data om personen på skärmen
        p1.print();
    }
}