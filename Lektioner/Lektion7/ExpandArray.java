/**
 * Ex07_06 - ExpandArray
 *
 * En klass som visar hur vi kan öka antalet element i en array.
 *
 * @author Robert Jonsson
 */
package lektioner.Lektion7;
public class ExpandArray {
    // Metod som utökar en Person-array med ytterligare element
    // Deklarerad som static så att det inte behövs något objekt av klassen
    // för att anropa metoden.
    private static Person[] expand(Person[] oldFamily, int newElements) {
        //Först tar vi reda på hur många element arrayen har
        int noOfElements = oldFamily.length;

        // Skapar en ny array med tillräckligt många element
        Person[] newFamily = new Person[noOfElements + newElements];

        // Nu kopierar vi elementen i den gamla arrayen till den nya
        // (Detta kan det göras effektivare, men vi använder detta sätt för det är enklare att förstå)
        for (int i = 0; i < noOfElements; i++) {
          newFamily[i] = oldFamily[i];
        }

        // Nollställer den gamla arrayen
        oldFamily = null;         

        // Och returnerar den nya arrayen som har 'newElements' st fler element.
        // Dessa nya tomma element innehåller null-referenser.
        return newFamily;
    }

    public static void main(String[] args) {
        Person[] family;         // Deklarerar ean array av Person
        family = new Person[2];  // Skapar arrayen

        // Ovan kan även göras på en rad
        // Person[] family = new Person[2];

        // Skapar 2 Person-objekt och "lägger in dem" i arrayen
        family[0] = new Person("Pappa Svensson", 33);
        family[1] = new Person("Mamma Svensson", 31);

        // För att utöka familjen med ytterligare 2 medlemmar (dotter, son)
        // måste vi ha en array som kan hålla 4 element (dvs 2 element till)
        family = expand(family, 2);

        family[2] = new Person("Dotter Svensson", 8);
        family[3] = new Person("Son Svensson", 14);

        // En for-loop som skriver ut namnen på personerna i arrayen
        for (int i = 0; i < family.length; i++) {
            System.out.println("family[" + i + "] = " + family[i].getName());
        }
    }
}