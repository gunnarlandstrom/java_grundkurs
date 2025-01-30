/**
 * Ex03_07 - AddTwoNumbers2
 *
 * Ett klass för att demonstrera överlagrade metoder.
 * Varje metod tar två parametrar, men av olika typ,
 * och adderar dessa. Resultatet skrivs ut.
 *
 * @author Robert Jonsson
 */
public class AddTwoNumbers2 {
    // Metod som adderar två heltal med varandra
    public void add(int number1, int number2) {
        System.out.println("Adderar två heltal: " + number1 + " och " + number2);

        // Deklarerar variabeln answer (av typen int) och initierar den till
        // summan av parametrarna number1 och number2.
        int answer = number1 + number2;

        System.out.println("Summan är " + answer +"\n");
    }

    // En överlagrad metod som också tar två parametrar, men
    // denna gång två parametrar av typen double.
    public void add(double number1, double number2) {
        System.out.println("Adderar två decimaltal: " + number1 + " och " + number2);
        double answer = number1 + number2;

        System.out.println("Summan är " + answer +"\n");
    }

    // Ytterligare en överlagrad metod som adderar ett hel- och ett decimaltal
    public void addera(int number1, double number2) {
        System.out.println("Adderar ett heltal " + number1 +
          " och ett deciamltal " + number2);
        double answer = number1 + number2;

        System.out.println("Summan är " + answer +"\n");
    }

    // Main metoden
    public static void main(String[] args) {
        // Skapar ett nytt objekt av klassen AddTwoNumbers2
        AddTwoNumbers2 a = new AddTwoNumbers2();

        // Beroende på vilken ordning vi anger argumenten till metodanropen och
        // vilken datatyp argumenten har anropas den variant av de överlagrade
        // metoderna som matchar.

        // Beräknar summan av heltalen 10 och 20
        a.add(10, 20);

        // Beräknar summan av deciamltalen 5.5 och 14.9
        a.add(5.5, 14.9);

        // Beräknar summan av heltalen 99 och 0.99
        a.add(99, 0.99);

        /* Prova att kommentera bort hela metoden som tar
           två heltal (int) som parametrar. Kompilera och
           testkör. Vad tror du händer när anropet till
           add sker med två heltal (när det inte finns
           någon sådan metod)?
        */
    }
}