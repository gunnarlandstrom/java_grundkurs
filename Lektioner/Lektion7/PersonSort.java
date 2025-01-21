package lektioner.Lektion7;
import java.util.*; // Klassen Arrays

/**
 * Ex07_11 - PersonSort.java
 *
 * Visar hur vi sorterar en array med Person-objekt.
 * Vi utnyttjar metoden sort i klassen Arrays för att
 * utföra sorteringen. Eftersom det är objekt som ska
 * sorteras måste vi ange hur sorteringen (jämförelsen)
 * ska gå till. Detta gör vi genom att i klassen Person2
 * implementera gränssnittet Combarable och där beskriva
 * hur olika Personer ska jämföras för att avgöra vilken
 * person som kommer före en annan.
 *
 * @author Robert Jonsson
 */
public class PersonSort {
	public static void main(String[] args) {
		// Skapar en Person2-array med plats för 15 personer
		Person2[] p = new Person2[15];

		// Skapar personer med slumpad ålder och lägger in dessa i arrayen
		for (int i = 0; i < p.length; i++) {
			p[i] = new Person2("Person " + (i + 1), Util.getRandomNumber(1, 100));
		}

		// Sorterar arrayen med hjälp av Arrays.sort
		Arrays.sort(p);

		// Loopar igenom och skriver ut
		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i]);
		}
	}
}