/**
 * Ex04_01 - Person
 * 
 * Denna klass representerar en person med namn, ålder och e-post.
 * Samma kod som i Ex03_19, men utan dokumentationskommentarer.
 *
 * @author Robert Jonsson
 * @version 1.0
 */
public class Person {
    private Name name;               // Personens namn
    private int age;                 // Personens ålder
    private String mail;             // Personens e-post
    private static int noOfPersons;  // Antal skapade objekt

    public Person(Name name, int age, String mail) {
        this.name = name;
        this.age = age;
        this.mail = mail;
        noOfPersons++;
    }

    public Person(String firstName, String lastName, int age, String mail) {
        // Eftersom konstruktorn ovanför behöver ett Name-objekt skapar vi ett sådant
        this(new Name(firstName, lastName), age, mail);
    }

    public Person(Name name, int age) {
        this(name, age, "unknown");
    }

    public Person() {
        this(new Name("unknown", "unknown"), -1, "unknown");
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

    public void setMail(String mail) {
        this.mail = mail;
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