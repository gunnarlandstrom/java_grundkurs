// Importerar paketet java.util eftersom vi ska använda 
// oss av klassen Scanner för att läsa data från tangentbordet
import java.util.*;

/**
 * Ex02_13 - PersonTest2
 *
 * Ytterligare en klass för att testa klassen Person. Nu använder vi 
 * Scanner för att fråga användaren efter namn och e-post.
 */
public class PersonTest2 {
    public static void main(String[] args) {
        // Skapar ett objekt av klassen Person
        Person p1 = new Person();
        
        // Deklarerar två strängar för att lagra det användaren skriver in med Scanner.
        String name;
        String mail;
        
        // Skapar ett objekt av Scanner för att kunna läsa från tangentbordet.
        Scanner input = new Scanner(System.in);
        
        // Skriver ut en uppmaning till användaren att skriva sitt namn
        System.out.print("Skriv ditt namn: ");

        // Läser "nästa rad" från tangentbordet (alla tecken tills Enter-tangenten trycks ner)
        name = input.nextLine();
        
        // Skriver ut en uppmaning till användaren att skriva sin e-postadress
        System.out.print("Skriv din e-post: ");
        mail = input.nextLine();
        
        // Skickar strängarna namn och mail (dess värden) som argument till metoderna
        // setName och SetMail för att sätta namn och e-post på objektet p1.
        p1.setName(name);
        p1.setMail(mail);
        
        // Anropar metoden print på objektet p1 för att skriva ut information om personen på skärmen
        p1.print();
    }
}