/**
 * Ex03_12 - Person4
 * @author Robert Jonsson
 *
 * En klass som representerar en person med för-
 * och efternamn, ålder och personnummer. Metoder
 * finns för att sätta och hämta information om
 * personen. Har överlagrat setName() så att användaren
 * själv får mata in för- och efternamn. Konstruktorer
 * finns för att enkelt kunna skapa objekt av klassen.
 */

// import av JOptionPane
import javax.swing.JOptionPane;

public class Person4 {
    // Instansvariabler
    private String firstName; // Personens förnamn
    private String lastName;  // Personens efternamn
    private int age;          // Personens ålder
    private String mail;      // Personens e-post

    // Konstruktor som sätter värden på alla instansvariabler
    public Person4(String firstName, String lastName, int age, String mail) {
        // Eftersom både instansvariablerna och parametrarna har samma namn så skiljer
        // vi dem åt genom att använda this. this.firstName refererar till
        // instansvariabeln firstName, medan bara firstName refererar till parametern.
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.mail = mail;

        /* Försöker vi göra följande tilldelning:
           firstName = firstName;
           så är det inte instansvariabeln firstName som tilldeles värdet av parametern
           utan det är parametern firstName som tilldelas värdet av sig själv.
        */
    }

    // Konstruktor som sätter namn och ålder, men inte e-post
    public Person4(String firstName, String lastName, int age) {
        /* Med this() anropar vi en annan konstruktor i samma klass. Oftast är det bra att
           låta en enda konstruktor vara den som sätter värden på klassens instansvariabler
           och övriga konstruktorer anropar den konstruktorn genom att använda this().

           I denna konstruktor får vi parametrarna firstName, lastName och age. Det som saknas
           för att skapa ett "komplett" objekt är e-post. Vi anropar konstruktorn ovan och skickar
           de tre parametrarna denna konstruktor har. Vi anävnder värdet "okänt" för e-post.
        */
        this(firstName, lastName, age, "okänt");
    }

    // Konstruktor som skapar ett "tomt" objekt med endast våra egna standardvärden.
    // För tal är det vanligt att låta -1 representera ett värde som "inte finns",
    // "inte är satt" eller "fel".
    public Person4() {
        this("okänt", "okänt", -1, "okänt");
    }

    // Metod för att sätta förnamnet
    public void setFirstName(String f) {
        firstName = f;
    }

    // Metod för att sätta efternamnet
    public void setLastName(String l) {
        lastName = l;
    }

    // Metod för att sätta både för- och efternamn
    public void setName(String f, String l) {
        firstName = f;
        lastName = l;
    }

    // Sätter för- och efternamn på personen med hjälp av dialogrutor.
    public void setName() {
        firstName = JOptionPane.showInputDialog("Ange förnamn:");
        lastName = JOptionPane.showInputDialog("Ange efternamn:");
    }

    // Metod för att sätta åldern
    public void setAge(int a) {
        age = a;
    }

    // Metod för att sätta e-post
    public void setMail(String m) {
        mail = m;
    }

    // Metod som returnerar förnamnet
    public String getFirstName() {
        return firstName;
    }

    // Metod som returnerar efternamnet
    public String getLastName() {
        return lastName;
    }

    // Metod som returnerar åldern
    public int getAge() {
        return age;
    }

    // Metod som returnerar e-post
    public String getMail() {
        return mail;
    }

    // Metod som returnerar både för- och efternamn samtidigt.
    public String getName() {
        return firstName + " " + lastName;
    }

    // Metod som skriver ut information om personen
    public void print() {
        System.out.println("Namn\t" + getName());
        System.out.println("Ålder\t" + age);
        System.out.println("E-post\t" + mail);
    }
}