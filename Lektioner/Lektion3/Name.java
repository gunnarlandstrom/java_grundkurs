/**
 * Ex03_18 - Name
 * <p>
 * Denna klass representerar ett namn som består av 
 * både för- och efternamnet.Metoder finns för att sätta 
 * och hämta både för- och efternamn, samt hela namet.
 *
 * @author Robert Jonsson
 * @version 1.0
 */
public class Name {
    // Instansvariabler
    private String firstName;  // Förnamn
    private String lastName;   // Efternamn

    /**
    * Skapar ett nytt <code>Name</code> med ett för- och efternamn angivet.
    *
    * @param firstName personens förnamn
    * @param lastName personens efternamn
    */
    public Name(String firstName, String lastName) {
        this.firstName   = firstName;
        this.lastName = lastName;
    }

    /**
    * Skapar ett nytt <code>Name</code> där värdet på för- och efternamn 
    * sätts till strängvärdet <code>okänt</code>.
    *
    * @see #Name(String, String)
    */
    public Name() {
        this("okänt", "okänt");
    }

    /**
    * Sätter nytt för- och efternamn.
    *
    * @param firstName personens förnamn
    * @param lastName personens efternamn
    * @see #setFirstName(String)
    * @see #setLastName(String)
    */
    public void setName(String firstName, String lastName) {
        this.firstName   = firstName;
        this.lastName = lastName;
    }

    /**
    * Sätter nytt förnamn.
    *
    * @param firstName personens förnamn
    * @see #setLastName(String)
    */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
    * Sätter nytt efternamn.
    *
    * @param lastName personens efternamn
    * @see #setFirstName(String)
    */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
    * Returnerar både för- och efternamn som en <code>String</code> 
    * enligt formen <i>förnamn efternamn</i>.
    *
    * @return personens för- och efternamn som en sträng
    * @see #toString()
    */
    public String getName() {
        return firstName + " " + lastName;
    }

    /**
    * Returnerar förnamnet.
    *
    * @return personens förnamn
    */
    public String getFirstName() {
        return firstName;
    }

    /**
    * Returnerar efternamnet.
    *
    * @return personens efternamn
    */
    public String getLastName() {
        return lastName;
    }

    /**
    * Returnerar en strängrepresentation av <code>Name</code>. Strängen som returneras
    * innehåller för- och efternamn, vilket kan vara användbart i t.ex. en
    * <code>System.out.println()</code>. Exempel:
    * <p>
	* <pre>
    * <code>
    * Name n = new Name("Kalle", "Karlsson");
    * System.out.println(n);
    * </code>
	* </pre>
    * @return för- och efternamn på personen
    */
    public String toString() {
        return getName();
    }
}