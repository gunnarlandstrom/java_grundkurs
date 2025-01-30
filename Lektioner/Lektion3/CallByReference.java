/**
 * Ex03_03 - CallByReference
 *
 * Ett klass för att visa vad som sker med objekt-
 * referenser som skickas som argument till en metod.
 *
 * @author Robert Jonsson
 */
public class CallByReference {
    // Metod som tar ett objekt av typen Person1 och en sträng som parameter.
    // På parametern person anropar vi metoden setName för att sätta nytt namn på personen.
    public void changeName(Person1 person, String name) {
        person.setName(name);
    }

    // Main metoden
    public static void main(String[] args) {
        // Skapar ett objekt av klassen CallByReference
        CallByReference c = new CallByReference();

        /* Skapar ett person-objekt och sätter namn och e-post.
           Observera att vi använder klassen Person1 för att skapa objektet
           Anledningen är att vi i lektion 3 har många olika versioner av klassen Person
           för att demonstrera olika saker.
        */
        Person1 p1 = new Person1();
        p1.setName("Kalle Karlsson");
        p1.setMail("kalle@karlsson.se");

        // Skriver ut information om objektet
        p1.print();

        /* Anropar metoden changeName för att byta namn till Stina
           Vi skickar vårt objekt p1 (objektreferens) samt strängen
           "Stina Svensson" som argument till metoden changeName. Eftersom p1
		   är ett objekt (en objektreferens) är det en kopia på denna
		   referens som skickas.
        */
        c.changeName(p1, "Stina Svensson");

        // Tillskillnad från exemplet CallByValue påverkas objekt av förändringar
    	// som görs i objektet när det skickas som argument. Detta eftersom
		// kopian på objektreferensen fortfarande "pekar på" samma objekt.
        p1.print();
    }
}