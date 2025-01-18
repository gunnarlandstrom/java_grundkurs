/**
 * Ex05_10 - InheritanceTest1
 *
 * En klass för att testa klasserna Child2 och Employee1.
 *
 * @author Robert Jonsson
 */
public class InheritanceTest1 {
    public static void main(String[] args) {
        // Börjar med att skapa ett Employee1-objekt
        Employee1 employee = new Employee1("Kalle Karlsson", 35, "Mittuniversitetet");

        // Nu skapar vi ett objekt av Child
        Child2 daughter = new Child2("Stina Karlsson", 8, 20);

        // Skriver ut information om objekten genom att anropa metoden print
        employee.print();
        daughter.print();

        System.out.println();

        // Ger barnet mer i veckopeng samt sparkar den anställde
        daughter.increaseWeeklyAllowance(10);
        employee.layOff();

        // Anropar metoden toString på de båda objekten
        System.out.println(employee.toString());
        System.out.println(daughter);
        // Notera ovan att om metoden toString finns överskuggad i en klass
        // anropas den automatiskt när vi skriver ut med System.out.
    }
}