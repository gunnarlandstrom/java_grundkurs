/**
 * Ex05_04 - ChildTest1
 *
 * En klass som visar att det är möjligt att deklarera ett objekt 
 * av en viss typ, men som initieras till att innehålla en referens
 * till en subklass
 *
 * @author Robert Jonsson
 */
public class ChildTest1 {
    public static void main(String[] args) {
        // Deklarerar ett objekt av typen Object
        Object dad;

        // Skapar ett Person-objekt
        dad = new Person("Kalle Karlsson", 35);

        // Vi kan nu endast anropa metoder som finns deklarerade i
        // klassen Object, inte metoder deklarerade i Person. En metod som finns
        // i Object är hashCode som returnerar ett unikt heltal för objekt av klassen.
        int hashCode = dad.hashCode();
        System.out.println("hashCode: " + hashCode);

        // Nu kan vi inte anropa metoderna setName, setAge etc via objektet dad
        // dad.setAge(36);

        // Nu skapar vi ett objekt av subklassen Child. Observera att
        // vi deklarerar objektet daughter att vara av typen Person.
        Person daughter = new Child();

        // Sätter namn och ålder på barnet med set-metoder
        daughter.setName("Stina Karlsson");
        daughter.setAge(8);

        // Skriver ut information om objekten med toString.
        System.out.println("\nDad: " + dad.toString());
        System.out.println("Daughter: " + daughter); // toString anropas (i Person)
    }
}