/**
 * Ex03_02 - CallByValue
 *
 * Ett klass för att visa vad som sker med primitiva
 * datatyper som skickas som argument till en metod.
 *
 *  @author Robert Jonsson
 */
public class CallByValue {
    // Metod som tar ett heltal som parameter och tilldelar denna värdet 0
    public void init(int number) {
        System.out.println("metoden init: parameter number före nollställning:  " + number);
        number = 0;
        System.out.println("metoden init: parameter number efter nollställning:  " + number);
    }

    // Main metoden
    public static void main(String[] args) {
        // Skapar ett objekt av klassen CallByValue
        CallByValue c = new CallByValue();

        // Initierar variabeln number att innehålla värdet 10 och skriver ut värdet
        int number = 10;
        System.out.println("number före metodanrop:  " + number);

        // Anropar metoden init för att sätta number till 0. Skriver därefter ut värdet igen.
        c.init(number);

        System.out.println("number efter metodanrop: " + number);
    }
}