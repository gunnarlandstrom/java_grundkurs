/**
 * Ex02_09 - Person
 * @author Robert Jonsson
 *
 * En klass som representerar en person med namn och e-postadress. 
 * Metoder finns för att sätta namn och e-post samt för att skriva
 * ut information (namn och e-post) om personen.
 */
public class Person {
    // Instansvariabler
    private String name;
    private String mail;

    // Metod för att sätta namn på personen
    // Till metoden skickas ett argument av typen String som lagras i parametern name
    public void setName(String name) {
        // Vi tilldelar instansvariabeln name det värde som parametern name har
        // this.name innebär instansvariabeln name
        // enbart name innebär parametern name
        this.name = name;
    }
    
    // Metod för att sätta e-post
    public void setMail(String mail) {
        this.mail = mail;
    }
    
    // Denna metod skriver ut information om personen
    public void print() {
        System.out.println("Namn:\t" + name); // \t är tabb
        System.out.println("E-post:\t" + mail);
    }
}