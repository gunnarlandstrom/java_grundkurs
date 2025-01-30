/**
 * Ex03_10 - Point
 *
 * Denna klass representerar en punkt med en x- och y-koordinat.
 * Metoder finns för att sätta värden påkoordinaterna samt för 
 * att skriva ut information om punkten på skärmen. Det finns 
 * en konstruktor för att direkt i samband med skapandet av ett 
 * objekt av klassen kunna ange punktens x- och y-koordinater.
 *
 * @author Robert Jonsson
 */
public class Point {
    // Instansvariabler
    private int x;  // För att lagra punktens x-koordinat
    private int y;  // För att lagra punktens y-koordinat


    //Konstruktor
    // Tar två parametrar av typen int med vilka punktens x- och y-
    // kordinater tilldelas värden direkt när ett objekt av klassen skapas.
    public Point(int x, int y) {
        this.x = x;
        this.y = y;

        // Vi hade även kunnat göra följande metodanrop i konstruktorn för 
        // att sätta värden på x och y. Detta kan vara användbart om vi behöver
        // göra någon kontroll av parametrarnas värden. För att slippa göra samma 
        // kontroll både i konstruktor och set-metod(er) görs kontroll endast i
        // set-metoden som konstruktorn utnyttjar.
        // setX(x);
        // setY(y);
    }

    // Metoder

    // Denna metod sätter nytt värde på x-koordinaten
    public void setX(int x) {
        this.x = x;
    }

    // Denna metod sätter nytt värde på y-koordinaten
    public void setY(int y) {
        this.y = y;
    }

    // Denna metod skriver ut punkten på skärmen enligt t.ex. (4, 5)
    public void print() {
        System.out.println("(" + x + ", " + y + ")");
    }
}