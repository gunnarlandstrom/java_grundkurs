/**
 * Ex05_03 - BarnTest
 *
 * En klass for att testa klasserna Child och Person.
 *
 * @author Robert Jonsson
 */
public class ChildTest {
    public static void main(String[] args) {
        // Börjar med att skapa ett Person-objekt precis som vanligt
        Person dad = new Person("Kalle Karlsson", 35);

        // Nu skapar vi ett objekt av klassen Child (som är en subklass
        // till klassen Person. Observera att vi endast
        // kan anvanda konstruktorn som inte tar några argument
        Child daughter = new Child();

        // Sätter namn och ålder på barnet med set-metoder. Även om vi i 
        // klassen Child inte implementerat metoderna setName och setAge 
        // kan vi anropa dessa på ett Child-objekt eftersom klassen Child 
        // ärver från Person och använder metoderna i Person istället.
        daughter.setName("Stina Karlsson");
        daughter.setAge(8);

        // Skriver ut information om objekten
        System.out.println("Dad:");
        dad.print();
        System.out.println("\nDaughter:");
        daughter.print();

        // Skapar ytterligare ett objekt av Child för att se
        // vilka värden denna får om vi inte sätter några själv.
        Child son = new Child();

        System.out.println("\nSon:");
        son.print();

        // Vad är det för något som skrivs ut om objektet son? Vilken
        // konstruktor är det som anropats när vi skriver: new Child()?

        // Detta är inte möjligt eftersom Child inte har någon konstruktor
        // Child son = new Child("Peter Karlsson", 12);
    }
}