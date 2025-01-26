// Imorterar alla klasser i paketet javax.swing. Där finns bl.a. klassen 
// JOptionPane som vi kan använda för att visa dialogrutor.
import javax.swing.*;

/**
 * Ex02_03 - Input3
 *
 * Visar hur vi använder JOptionPane för att läsa data från
 * tangentbordet samt att visa resultat mha en dialogruta.
 *
 * @author Robert Jonsson
 */
public class Input3 {
    // Main metoden
    public static void main(String[] args) {
        /* Deklarerar två variabler av typen String. Precis som när vi läser från
           tangentbordet med BufferedReader eller Scanner så returneras en sträng 
           även från JOptionPane.
        */
        String firstName;
        String lastName;
        
        /* Frågar efter personens för- och efter namn genom att anropa metoden 
           showInputDialog i klassen JOptionPane. Som argument skickar vi en 
           sträng som blir den text som visas i dialogrutan för användaren.
        */
        firstName = JOptionPane.showInputDialog("Ange ditt förnamn!");
        lastName = JOptionPane.showInputDialog("Ange ditt efternamn!");
        
        // Skapar en ny sträng där vi adderarsträngarna för för- och efternamn.
        // Strängaddition innebär att de två strängarna "läggs ihop" (concatenate).
        String output = "Du heter " + firstName + " " + lastName;
        
        /* Visar resultatet i en annan typ av dialogruta genom att anropa metoden 
           showMessageDialog. Denna metod tar två argument (separerade med ,). 
           Det första argumentet, där det står null, betyder att dialogrutan ska 
           centreras på skärmen. Det andra argumentet är den text som ska visas.
        */
        JOptionPane.showMessageDialog(null, output);
    }
}