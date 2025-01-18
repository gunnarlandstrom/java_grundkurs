import java.util.*; // Klassen Comparator

/**
 * Ex07_13 - ComparePersonAge
 *
 * Visar hur vi skapar en Comparator för att jämföra
 * två personer med varandra med avseende på deras ålder.
 * Detta gör vi genom att låta denna klass implementera 
 * gränssnittet Comparator och överskugga metoden compare 
 * för att där beskriva hur olika personer ska jämföras 
 * för att avgöra vilken ålder som kommer före den andra.
 *
 * @author Robert Jonsson
 * Ex07_13 - ComparePersonAge.java
 */
public class PersonAgeComparator implements Comparator<Person> {
	/**
	 * Metoden compare jämför dess två argument med avseende på inbördes
	 * ordning. Metoden ska returnera ett negativt, noll eller ett positivt
	 * värde utifrån om det första argumentet är mindre än, lika eller
	 * större än det andra argumentet.
	 */
	 @Override
	public int compare(Person p1, Person p2) {
		// Lagra de både personernas ålder i nya variabler
		int age1 = p1.getAge();
		int age2 = p2.getAge();
		
		// Vi vill sortera efter ålder i stigande ordning.
		// Vi antar att en ålder kommer före en annan ålder (mindre än) om den första åldern
		// är lägre än den andra. Om vi subtraherar första åldern med den andra
		// resulterar det i ett negativt värde om första åldern är lägre än andra
		// ålderna, noll om de båda åldrarna är lika, och ett positivt värde om 
		// första åldern är höggre än den andra åldern.
		int result = age1 - age2;
		
		// Vi returnera skillnaden mellan age1 och age2
		return result;
	}
}