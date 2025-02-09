/**
 * Ex04_04 - Person2
 * 
 * Denna klass representerar en person med namn, ålder och e-post. 
 * Namnet representeras av klassen <code>Name</code> som innehåller 
 * information om både för- och efternamnet.
 * <p>
 * Metoder finns för att både sätta och hämta värden samt för att 
 * skriva ut information om personen. Har en instansvariabel som
 * avgör om vi e-post är satt eller inte. Detta för att när e-post
 * väl är satt ska den inte kunna ändras igen (användas som användarnamn).
 *
 * @author Robert Jonsson
 * @version 1.0
 */
public class Person2 {
    private Name name;               // Personens namn
    private int age;                 // Personens ålder
    private String mail;             // Personens e-post
    private static int noOfPersons;  // Antal skapade objekt
    private boolean hasMail;         // Har e-post  redan bestämts?

    public Person2(Name name, int age, String mail) {
        this.name = name;
        this.age = age;
        this.mail = mail;
        noOfPersons++;

        // Sätter hasMail till true eftersom vi antar att den e-postadress
        // som skickas till konstruktorn är korrekt.
        hasMail = true;
    }

    public Person2(String firstName, String lastName, int age, String mail) {
        // Eftersom konstruktorn ovanför behöver ett Name-objekt skapar vi ett sådant
        this(new Name(firstName, lastName), age, mail);
    }

    public Person2(Name name, int age) {
        this(name, age, "unknown");

        // Eftersom denna konstruktor inte har e-post som parameter
        // sätter vi hasMail till false så att e-post senare kan
        // anges i ett anrop till setMail.
        hasMail = false;
    }

    public Person2() {
        this(new Name("unknown", "unknown"), -1, "unknown");

        // Eftersom denna konstruktor inte har e-post som parameter
        // sätter vi hasMail till false så att e-post senare kan
        // anges i ett anrop till setMail.
        hasMail = false;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public void setName(String firstName, String lastName) {
        // Skapa ett nytt Name-objekt och tilldela till instansvariablen name.
        this.name = new Name(firstName, lastName);
    }

    public void setFirstName(String firstName) {
        // Använd instansvariabeln name och anropa dess metod för att sätta förnamn.
        name.setFirstName(firstName);
    }

    public void setLastName(String lastName) {
        // Använd instansvariabeln name och anropa dess metod för att sätta efternamn.
        name.setLastName(lastName);
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Sätter e-post. Metoden returnerar true om ny e-post kan sättas
    // eller false om det inte går.
    public boolean setMail(String mail) {
        /* Kontrollerar variabeln hasMail så att dess värde är false, detta
           eftersom vi då kan/får sätta e-post. Om hasMail har värdet true har 
		   e-post redan satts en gång.
		   
		   I en if-sats kommer koden i if-satsen att utföras
           om det booleska uttrycket inom parenteserna utvärderas till true.
           Vi anävnder därför operatorn ICKE (not) för att "spegelvända" värdet på hasMail.
           Om hasMail är false utvärderas uttrycket till true och kodblocket körs.
        */
        if (!hasMail) {
            // Sätter ny e-post
            this.mail = mail;

            // Sätter hasMail till true så att vi inte kan sätta nytt igen
            hasMail = true;

            // Returnerar true vilket betyder att e-post ändrats/satts
            return true;
        }

        // Är e-post redan satt (dvs hasMail är true) så returnerar
        // vi false vilket innebär att e-post inte ändrats (då den redan har ändrats).
        return false;
    }

    public Name getName() {
        // Returnera instansvariabeln name som är ett Name-objekt
        return name;
    }

    public String getNameAsString() {
        String f = name.getFirstName();
        String l = name.getLastName();
        return f + " " + l;

        // return name.getFirstName() + " " + name.getLastName();
    }

    public String getFirstName() {
        return name.getFirstName();
    }

    public String getLastName() {
        return name.getLastName();
    }

    public int getAge() {
        return age;
    }

    public String getMail() {
        return mail;
    }

    public static int getNoOfPersons() {
        return noOfPersons;
    }

    public void print() {
        System.out.println("Name\t" + getNameAsString());
        System.out.println("Age\t" + age);
        System.out.println("Mail\t" + mail);
    }

    public String toString() {
        return getNameAsString();
    }
}