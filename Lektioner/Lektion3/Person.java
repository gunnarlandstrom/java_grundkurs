/**
 * Ex03_19 - Person
 * <p>
 * Denna klass representerar en person med namn, ålder och e-post.
 * Personens namn representeras i sin tur av klassen <code>Name</code>
 * som innehåller information om både för- och efternamn.
 * <p>
 * Metoder finns för att både sätta och hämta värden samt
 * för att skriva ut information om personen.
 *
 * @author Robert Jonsson
 * @version 1.0
 */
public class Person {
    private Name name;               // Personens namn
    private int age;                 // Personens ålder
    private String mail;             // Personens e-post
    private static int noOfPersons;  // Antal skapade objekt

    /**
    * Skapar en ny <code>Person</code> med ett namn, en ålder och en e-post. 
    * Alla olika sätt att skapa en person resulterar i att denna konstruktor
    * används.
    *
    * @param name  personens namn som ett <code>Namn</code> objekt
    * @param age   personens ålder
    * @param mail   personens e-post
    * @see #getNoOfPersons()
    */
    public Person(Name name, int age, String mail) {
        this.name = name;
        this.age = age;
        this.mail = mail;
        noOfPersons++;
    }

    /**
    * Skapar en ny <code>Person</code> med ett för- och efternamn, en ålder och en e-post.
    * Denna variant att skapa en person tar för- och efternamn som separata strängar.
    *
    * @param firstName personens förnamn
    * @param lastName  personens efternamn
    * @param age       personens ålder
    * @param mail       personens e-post
    * @see #Person(Name, int, String)
    */
    public Person(String firstName, String lastName, int age, String mail) {
        // Eftersom konstruktorn ovanför behöver ett Name-objekt skapar vi ett sådant
        this(new Name(firstName, lastName), age, mail);
    }

    /**
    * Skapar en ny <code>Person</code> med ett namn och en ålder, men ingen e-post. 
    * Här skapas ett objekt som har ett namn och en ålder. E-posten sätts till strängen 
    * <code>okänt</code> och bör senare ändras med metoden {@link #setMail(String) setMail}.
    *
    * @param name      personens namn
    * @param age       personens ålder
    * @see #Person(Name, int, String)
    */
    public Person(Name name, int age) {
        this(name, age, "okänt");
    }

    /**
    * Skapar en ny <code>Person</code> vars värden för för och efternamn samt e-post sätts 
    * till strängen <code>okänt</code> och åldern till <code>-1</code>. Detta sätt att skapa
    * ett objekt av klassen bör undvikas. Använd istället någon av de övriga konstruktorerna.
    *
    * @see #Person(Name, int, String)
    * @see #Person(String, String, int, String)
    * @see #Person(Name, int)
    */
    public Person() {
        this(new Name("okänt", "okänt"), -1, "okänt");
    }

    /**
    * Sätter namnet på personen.
    *
    * @param name personens namn
    * @see #setName(String, String)
    */
    public void setName(Name name) {
        this.name = name;
    }

    /**
    * Sätter namnet på personen. Utifrån de båda strängarna som skickas som
    * argument skapas ett nytt <code>Name</code>-objekt.
    *
    * @param firstName personens förnamn
    * @param lastName personens efternamn
    * @see #setName(Name)
    */
    public void setName(String firstName, String lastName) {
        // Skapa ett nytt Name-objekt och tilldela till instansvariablen name.
        this.name = new Name(firstName, lastName);
    }

    /**
    * Sätter förnamnet på personen.
    *
    * @param firstName personens förnamn
    * @see #setLastName(String)
    */
    public void setFirstName(String firstName) {
        // Använd instansvariabeln name och anropa dess metod för att sätta förnamn.
        name.setFirstName(firstName);
    }

    /**
    * Sätter efternamnet på personen.
    *
    * @param lastName personens efternamn
    * @see #setFornamn(String)
    */
    public void setLastName(String lastName) {
        // Använd instansvariabeln name och anropa dess metod för att sätta efternamn.
        name.setLastName(lastName);
    }

    /**
    * Sätter åldern på personen.
    *
    * @param age personens ålder
    */
    public void setAge(int age) {
        this.age = age;
    }

    /**
    * Sätter e-post på personen.
    * @param mail personens e-post
    */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
    * Returnerar personens namn.
    *
    * @return namnet på personen
    * @see #getNamnAsString()
    */
    public Name getName() {
        // Returnera instansvariabeln name som är ett Name-objekt
        return name;
    }

    /**
    * Returnerar personens namn som en sträng. 
    * Strängen som returneras har formen <i>förnamn efternamn</i>.
    *
    * @return för- och efternamn på personen som en sträng
    * @see #getName()
    * @see #toString()
    */
    public String getNameAsString() {
        String f = name.getFirstName();
        String l = name.getLastName();
        return f + " " + l;

        // return name.getFirstName() + " " + name.getLastName();
    }

    /**
    * Returnerar personens förnamn.
    *
    * @return förnamnet på personen
    */
    public String getFirstName() {
        return name.getFirstName();
    }

    /**
    * Returnerar personens efternamn.
    *
    * @return efternamnet på personen
    */
    public String getLastName() {
        return name.getLastName();
    }

    /**
    * Returnerar personens ålder.
    *
    * @return åldern på personen
    */
    public int getAge() {
        return age;
    }

    /**
    * Returnerar personens e-post.

    * @return personens e-post
    */
    public String getMail() {
        return mail;
    }

    /**
    * Returnerar antalet skapade objekt av denna klass. Metoden är en s.k.
    * klass-metod, vilket innebär att den är deklarerad som <code>static</code>.
    * För att anropa metoden behövs inget <code>Person</code>-objekt utan vi
    * anropar metoden direkt på klassen enligt följande:
    * <p>
    * <code>Person.getNoOfPersons();</code>
    * @return totala antalet skapade objekt av klassen
    */
    public static int getNoOfPersons() {
        return noOfPersons;
    }

    /**
    * Sriver ut information om personen enligt följande:
    * <p>
    * <pre><code>
    * Namn     firstName lastName
    * Ålder    age
    * E-post   mail
    * </code></pre>
    */
    public void print() {
        System.out.println("Namn\t" + getNameAsString());
        System.out.println("Ålder\t" + age);
        System.out.println("E-post\t" + mail);
    }

    /**
    * Returnerar en strängrepresentation av <code>Person</code>. Strängen som returneras
    * innehåller personens för- och efternamn enligt: <i>förnamn efternamn</i>.
    *
    * @return för- och efternamn på personen
    * @see #getNameAsString()
    */
    public String toString() {
        return getNameAsString();
    }
}