/**
 * Ex04_07 - NumericalData
 *
 * Ett klass som testar gränserna på några primitiva typer.
 *
 * @author Robert Jonsson
 */
public class NumericalData {
    public static void main(String[] args) {
        // Tar reda på det högsta värdet en int kan lagra med hjälp av wrapper-klassen Integer
        int maxInt = Integer.MAX_VALUE;

        // Skriver ut detta värde
        System.out.println("Max value for an int is: " + maxInt);

        // Ökar detta max-värde med 1 för att se vad som
        // händer när vi passerar gränsen för vad ett heltal kan lagra.
        maxInt = maxInt + 1;

        // Skriver ut värdet igen
        System.out.println("After adding 1 the value is: " + maxInt);

        /* Utför en multiplikation vars produkt inte finns
           Observera användandet av tecknet F efter talen.
           Detta för att visa att talet ska tolkas som en float.
           Normalt hanteras alla decimala literaler i koden som double.
        */   
        float f = 1.0001F * 1000F;

        // Skriver ut detta värde
        System.out.println("1.0001F * 1000F = " + f + " (should be 1000.1)");

        // Utför samma multiplikation med double
        double d = 1.0001D * 1000D; // Vi behöver som sagt inte ange D efter talet

        // Skriver ut detta värde
        System.out.println("1.0001D * 1000D = " + d);
        
        // Anropar metoden myMethod
        myMethod();

        }

    public static void myMethod() {
        int x = 99;
        int a = 3;
        
        if (x < 100) {
            int b = x++;  // ok, x nås härifrån
            int c = a;    // ok, a nås härifrån
        }
        
        //System.out.println(b); // ERROR b nås ej!
        System.out.println(x); // ok, x nås härifrån
    }
}