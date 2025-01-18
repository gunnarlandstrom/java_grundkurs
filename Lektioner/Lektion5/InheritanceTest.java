/**
 * Ex05_07 - InheritanceTest
 *
 * En klass för att testa klasserna Child1 och Employee
 *
 * @author Robert Jonsson
 */
public class InheritanceTest {
    public static void main(String[] args) {
        // Börjar med att skapa ett Person-objekt
        Person mom = new Person("Mona Karlsson", 33);

        // Skapar nu ett Employee-objekt som jobbar på Mittuniversitetet
        Employee dad = new Employee("Kalle Karlsson", 35, "Mittuniversitetet");

        // Nu skapar vi ett objekt av Barn som har 30 kr i veckopeng
        Child1 daughter = new Child1("Stina Karlsson", 8, 20);

        // Ger barnet mer i veckopeng samt sparkar den anställde
        daughter.increaseWeeklyAllowance(10);
        dad.layOff();

        // Tom rad
        System.out.println();

        // Skriver ut information om objekten genom att anropa print.
        // Eftersom denna metod endast finns i Person skrivs endast
        // namnet och åldern ut på skärmen och inte subklassens data.
        mom.print();
        dad.print();
        daughter.print();

        // Tom rad
        System.out.println();

        // Skriver ut information om objekten igen men med toString.
        // Denna metod är överskuggad och returnerar en anpassad 
        // sträng för varje typ.
        System.out.println(mom);
        System.out.println(dad);
        System.out.println(daughter);
    }
}