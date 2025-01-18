/**
 * Ex07_01 - MyFirstArray
 *
 * En klass som visar hur man skapar en array samt till-
 * delar den några värden.
 *
 * @author Robert Jonsson
 * @version 1.0
 */
public class MyFirstArray {
    public static void main(String[] args) {
        // Deklarerar och skapar en array som rymmer 3 heltal
        int[] number = new int[3];

        // Skriver ut antalet element i arrayen med hjälp av variabeln length.
        // Observera att det alltid är maximala antalet element som rymms, inte hur
        // många element som tilldelats värden, som lengt har som värde
        System.out.println("The array contains  " + number.length + " integers.");

        // Tilldelar arrayens element några värden
        number[0] = 10;
        number[1] = 20;
        number[2] = number[0] * 3;

        // Skriver ut arrayens värden
        System.out.println("number[0] = " + number[0]);
        System.out.println("number[1] = " + number[1]);
        System.out.println("number[2] = " + number[2]);

        // Trots att en array inte skapas av någon klass så finns det medlemsmetoder
        // vi kan anropa. En array härstammar (ärver sina egenskaper) från klassen Object
        // vilket gör att alla metoder definierade i Object går att anropa. T.ex. kan metoden
        // equals anropas för att avgöra om två array-variabler refererar till samma array.
        // Notera! Ingen kontroll görs om arrayernas element är lika!

        // Skapar en ny array (number2) som tilldeles referensen till första arrayen (number)
        int[] number2 = number;
        System.out.println("\nnumber[] and number2[] are equal: " + number.equals(number2));

        // Tilldelar nytt värde i index 0 för arrayen number2
        // Notera! Eftersom både number och number2 refererar till samma array 
        // kommer det tilldelade värdet "ändras" även i arrayen number
        number2[0] = 0;

        // Skriver ut värdet i index 0 i arrayen number
        System.out.println("number[0] = " + number[0]);
    }
}