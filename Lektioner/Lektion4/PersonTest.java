import java.util.*; // Scanner

/**
 * Ex04_03 - PersonTest
 *
 * Ett klass som testar klassen Person genom att skapa
 * objekt av klassen samt anropar de metoder som finns.
 * Använder Scanner för att läsa data från tangentbordet,
 * samt klassen Integer för att konvertera sträng till int.
 *
 * @author Robert Jonsson
 */
public class PersonTest {
    public static void main(String[] args) {
        // Skapar en Scanner med vilket vi läser från tangentbordet med
        Scanner input = new Scanner(System.in);

        // Frågar användaren efter personuppgifter
        System.out.println("Enter information for person 1");
        System.out.print("First name: ");
        String firstName = input.nextLine();
        System.out.print("Last name:");
        String lastName = input.nextLine();
        System.out.print("Age: ");
        String ageAsString = input.nextLine();
        System.out.print("Mail: ");
        String mail  = input.nextLine();

        /* Det som returneras från nextLine är en sträng och
           eftersom åldern i klassen Person lagras som ett heltal (int)
           måste vi konvertera strängen till ett heltal. Detta gör vi
           med hjälp av wrapper-klassen Integer.
        */
        int ageAsInt = Integer.parseInt(ageAsString);

        // Skapar ett objekt av klassen Person
        Person p1 = new Person(firstName, lastName, ageAsInt, mail);

        System.out.println("\nPerson 1 info:");
        p1.print();

        // Skapar ytterligare ett objekt
        System.out.println(); // Radbrytning

        System.out.println("Enter information for person 2");
        System.out.print("First name: ");
        firstName = input.nextLine();
        System.out.print("Last name:");
        lastName = input.nextLine();
        System.out.print("Age: ");
        ageAsString = input.nextLine();
        System.out.print("Mail: ");
        mail  = input.nextLine();

        // Skapar ett Namn-objekt
        Name name = new Name(firstName, lastName);

        // Skapar ett Person-objekt med den konstruktor som tar ett Name-objekt som argument
        // Vi behöver fortfarande konvertera åldern från sträng till heltal, men nu gör vi
        // det utan att mellanlagra resultatet i en heltalsvariabel.
        Person p2 = new Person(name, Integer.parseInt(ageAsString), mail);

        System.out.println("\nPerson 2 info:");
        p1.print();
    }
}