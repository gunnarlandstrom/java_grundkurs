/**
 * Ex03_09 - PersonTest3
 *
 * Ett klass som testar klassen Person3 genom att skapa
 * ett objekt av klassen samt anropar de metoder som finns.
 *
 * @author Robert Jonsson
 */
public class PersonTest3 {
    public static void main(String[] args) {
        // Skapar två olika objekt av klassen Person3
        Person3 kalle = new Person3();
        Person3 unknown = new Person3();

        // Sätter namn, ålder och e-post
        kalle.setFirstName("Kalle");
        kalle.setLastName("Karlsson");
        kalle.setAge(30);
        kalle.setMail("kalle@karlsson.se");

        // Anropar den överlagrade setName-metoden så att användaren själv får angen namnet
        unknown.setName();

        // Anropar metoden print för att skriva ut information om personerna
        kalle.print();
        System.out.println(); // Skriver ut en tom rad
        unknown.print();

        /* OBS!! Notera vad utskriften av objektet unknown ger. För objektet kalle har vi
           använt alla set-metoder så att alla instansvariabler har fått ett värde.
           Däremot har vi enbart satt för- och efternamn på objektet unknown. De övriga
           instansvariablerna för detta objekt tilldeles deras staandardvärden.
        */
    }
}