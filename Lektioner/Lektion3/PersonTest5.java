/**
 * Ex03_15 - PersonTest5
 *
 * Ett klass som testar klassen Person5 genom att skapa
 * objekt av klassen och visar hur många objekt som är
 * skapade.
 *
* @author Robert Jonsson
 */
public class PersonTest5 {
    public static void main(String[] args) {
        /* Anropar den statiska metoden för att "hämta"
           antalet skapade personer. Observera att inga objekt av
           klassen ännu skapats, men det gör inget eftersom
           statiska metoder anropas med namnet på klassen
           i stället för på ett objekt av klassen.
        */
        int noOfPersons = Person5.getNoOfPersons();
        System.out.println("Antal skapade personer: " + noOfPersons);

        // Skapar tre objekt av klassen Person5
        Person5 p1 = new Person5("Kalle", "Karlsson", 30, "kalle@karlsson.se");
        Person5 p2 = new Person5("Stina", "Svensson", 25);
        Person5 p3 = new Person5();

        /* Skriver ut antalet skapade personer.
           Kom ihåg att metodanropet tilldelas det värde som returneras.
           Därför kan vi t.ex. göra som nedan utan att "mellanlagra" returvärdet
           i en lokal variabel.
        */
        System.out.println("Antal skapade personer: " + Person5.getNoOfPersons());

        /* Nu när vi har objekt skapade av klassen Person5 kan vi även använda dem för att
           anropa statiska metoder. Dvs p2.getNoOfPersons() eller p1.getNoOfPersons()
           fungerar lika bra och returnera samma värde som Person5.getNoOfPersons().
           MEN ha som vana att använda namnet på klassen för att anropa klassmetoder:
           Person5.getNoOfPersons();
        */
    }
}