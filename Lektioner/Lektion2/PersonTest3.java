// Importerar paketet javax.swing eftersom vi ska använda oss av dialogrutor
import javax.swing.*;

/**
 * Ex02_12 - PersonTest3
 *
 * Ytterligare en klass för att testa klassen Person. Nu använder vi dialogrutor för 
 * att fråga användaren efter namn och e-postadress.
 *
 * @author Robert Jonsson
 */
public class PersonTest3 {
    public static void main(String[] args) {
        // Skapar ett objekt av klassen Person
        Person p1 = new Person();

        // Frågar användaren efter namn och personnummer.
        // Börjar med att deklarera två strängar.
        String name;
        String mail;

        // Använder JOptionPane för att visa en dialogruta där vi
        // frågar användaren efter namn och personnummer.
        name = JOptionPane.showInputDialog("Skriv ditt namn:");
        mail = JOptionPane.showInputDialog("Skriv din e-post:");

        // Använder strängarna name och mail för att sätta värden på vårt objekt
        p1.setName(name);
        p1.setMail(mail);

        // Anropar metoden print på objektet p1 för att skriva ut personen på skärmen
        p1.print();
    }
}