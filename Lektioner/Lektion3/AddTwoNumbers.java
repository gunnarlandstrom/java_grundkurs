/**
 * Ex03_01 - AddTwoNumbers
 *
 * Ett klass för att demonstrera metoder som har fler än en parameter.
 * Denna klass har en metod som tar två heltal som parametrar.
 */
public class AddTwoNumbers {
    // Metod som adderar två heltal med varandra och skriver ut resultatet på skärmen
    public void add(int number1, int number2) {
        // Beräknar summan av number1 och number2. Resultatet lagrar vi i variabeln answer.
        int answer = number1 + number2;

        // Gör en utskrift av additionen enligt formen: värde_på_tal1 + värde_på_tal2 = värde_på_summa
        System.out.println(number1 + " + " + number2 + " = " + answer);
    }

    // Main-metoden
    public static void main(String[] args) {
        /* Skapar ett nytt objekt av klassen AddTwoNumbers. Vi använder inte
           en separat testklass som övriga exempel gjort, utan i stället
           har vi en main-metod i samma klass.
        */
        AddTwoNumbers a = new AddTwoNumbers();

        // Beräknar summan av heltalsvärdena (literal) 10 och 20
        a.add(10, 20);

        // Beräknar summan av variablerna (av typen int) i1 och i2;
        int i1 = 25;
        int i2 = 5;
        a.add(i1, i2);

        /* Prova att ändra i koden för ett av metodanropen så att endast ett
           argument anväds (eller fler än två). Kompilera och notera vilket
           felmeddelande som ges. Prova även att ange fel datatyp som argument.
           T.ex:
        */
        //a.add(10, "20");
        //a.add(10, 23.43);
    }
}