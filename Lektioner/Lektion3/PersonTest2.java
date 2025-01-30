/**
 * Ex03_06 - PersonTest2
 *
 * Ett klass som testar klassen Person2 genom att skapa
 * objekt av klassen samt anropar de metoder som finns.
 *
 * @author Robert Jonsson
 */
public class PersonTest2 {
    public static void main(String[] args) {
        // Skapar två olika objekt av klassen Person2
        Person2 p1 = new Person2();
        Person2 p2 = new Person2();

        // Sätter namn, ålder och persnr på p1
        p1.setFirstName("Kalle");
        p1.setLastName("Karlsson");
        p1.setAge(30);
        p1.setMail("kalle@karlsson.se");

        // Sätter namn, ålder och e-post på p2. Här använder vi setNamn
        // för att i ett metodanrop sätta både för- och efternamn samtidigt.
        p2.setName("Stina", "Svensson");
        p2.setAge(25);
        p2.setMail("stina.svensson@java.se");

        // Anropar metoden print() på objektet p1 för att skriva ut personen på skärmen.
        p1.print();

        // Anropar olika get-metoder på objektet p2 för att skriva ut informationen 
		// om personen. På så sätt kan vi anpassa formatet på utskriften som vi vill.
        System.out.println(); // tom rad
        System.out.print(p2.getName()); // getName returnerar för- och efternamn "adderat"
        int age = p2.getAge(); // Variabeln age tilldelas värdet av metodanropet
        System.out.println(" är " + age + " år gammal.");
        System.out.println("Hennes e-postadress är " + p2.getMail());
    }
}