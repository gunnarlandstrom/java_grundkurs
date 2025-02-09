/**
 * Ex4_02 - Name
 * 
 * Denna klass representerar ett namn som består av 
 * både för- och efternamnet. Samma kod som i Ex03_18, men
 * utan dokumentationskommentarer.
 *
 * @author Robert Jonsson
 * @version 1.0
 */
public class Name {
    // Instansvariabler
    private String firstName;  // Förnamn
    private String lastName;   // Efternamn

    public Name(String firstName, String lastName) {
        this.firstName   = firstName;
        this.lastName = lastName;
    }

    public Name() {
        this("unknown", "unknown");
    }

    public void setName(String firstName, String lastName) {
        this.firstName   = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return getName();
    }
}