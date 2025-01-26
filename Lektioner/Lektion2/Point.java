/**
 * Ex02_05 - Point
 *
 * Ett första förök med en enkel klass. Denna klass representerar en punkt med 
 * en x- och y-koordinat. Klassens innehåller information om punktens x- och 
 * y-koordinat, detta är klassens data (instansvariabler).
 *
 * Vidare har vi metoder för att sätta värden på koordinaterna samt för att 
 * skriva ut information om punkten på skärmen. Metoderna är klassens betende,
 * de tjänster en Point erbjuder åt de som använder den (skapar objekt av klassen).
 *
 * @author Robert Jonsson
 */
public class Point {
    // Instansvariabler
    private int x;  // För att lagra punktens x-koordinat
    private int y;  // För att lagra punktens y-koordinat

    // Metoder

    // Denna metod sätter nytt värde på x-koordinaten
    public void setX(int x) {
        /* Lagrar det värde som skickas till metoden som argument i parametern x
           i vår instansvariabel x (this.x). Vi gör här en tilldelning där
           instansvariabeln x tilldeles värdet som finns lagrat i parametern x.
           - instansvariabel
           - lokal variabel
           - argument
           - parameter
           Vad är skillnaderna?
        */
        this.x = x;
    }

    // Denna metod sätter nytt värde på y-koordinaten
    public void setY(int y) {
        this.y = y;
    }

    // Denna metod skriver ut punkten på skärmen enligt t.ex. (4, 5)
    public void print() {
        System.out.println("(" + x + ", " + y + ")");
        // Eller föredrar du följande sätt?
        //System.out.format("(%d, %d)", x, y);
		
		//Eller kanske ytterligare ett sätt?
		//System.out.printf("(%d, %d", x,y); //printf fungerar likadant som format
    }
}