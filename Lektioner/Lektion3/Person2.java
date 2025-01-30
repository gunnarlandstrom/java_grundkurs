/**
 * Ex03_05 - Person2
 *
 * En klass som representerar en person med för- och efternamn, 
 * ålder och e-post. Metoder finns för att sätta (set) och hämta 
 * (get) information om personen.
 *
 * @author Robert Jonsson
 */
public class Person2 {
    // Instansvariabler
    private String firstName; // Personens förnamn
    private String lastName;  // Personens efternamn
    private int age;          // Personens ålder
    private String mail;       // Personens e-post

    // Metod för att sätta förnamnet
    public void setFirstName(String f) {
        firstName = f;
    }

    // Metod för att sätta efternamnet
    public void setLastName(String l) {
        lastName = l;
    }

    /* Metod för att sätta både för- och efternamn. Denna metod
       har två parametrar, båda av typen String. Ena parametern
       används för att sätta förnamn och den andra för efternamn.
    */
    public void setName(String f, String l) {
        firstName = f;
        lastName = l;
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
    // Observera att det är endast ett värde som returneras.
    public String getName() {
        // Adderar strängarna firstName och lastName och lagrar resultatet i en ny sträng.
        String name = firstName + " " + lastName;

        // Returnerar värdet i den lokala variabeln name
        return name;

        // Vi hade kunna returnera direkt utan att mellanlagra namnet i en variabel
        // return firstName + " " + lastName;
    }

    // Metod som skriver ut information om personen
    public void print() {
        /* Anropar metoden getName för att skriva ut både för- och efternamn.
           Vi hade kunnat skriva System.out.println("Namn\t" + fistName + " " + lastName");
           Men när vi redan har en metod som formaterar namnet så som vi vill utnyttjar vi den.
           Vi ska undvika att upprepa samma kod på flera olika ställen (framför allt längre kodstycken)
        */
        System.out.println("Namn\t" + getName());
        System.out.println("Ålder\t" + age);
        System.out.println("E-post\t" + mail);
    }
}