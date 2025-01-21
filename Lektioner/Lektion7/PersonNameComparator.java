package lektioner.Lektion7;
import java.util.*; // Klassen Comparator

/**
 * Ex07_12 - PersonNameComparator
 *
 * Visar hur vi skapar en Comparator för att jämföra
 * två personer med varandra med avseende deras namn.
 * Detta gör vi genom att låta denna klass implementera 
 * gränssnittet Comparator och överskugga metoden compare 
 * för att där beskriva hur olika personer ska jämföras 
 * för att avgöra vilket namn som kommer före i bokstavsordning.
 *
 * @author Robert Jonsson
 */
public class PersonNameComparator implements Comparator<Person> {
	/**
	 * Metoden compare jämför dess två argument med avseende på inbördes
	 * ordning. Metoden ska returnera ett negativt, noll eller ett positivt
	 * värde utifrån om det första argumentet är mindre än, lika eller
	 * större än det andra argumentet.
	 */
	 @Override
	public int compare(Person p1, Person p2) {
		// Lagra de både personernas namn i nya variabler
		String name1 = p1.getName();
		String name2 = p2.getName();
		
		// Vi utnyttjar metoden compareTo i klassen String. Denna metod
		// returnerar värdet 0 om de båda strängarna anses vara lika, ett
		// värde mindre än 0 om den första strängen kommer före den andra, 
		// och ett värde större än 0 om den första strängen kommer efter
		// den andra.
		int result = name1.compareTo(name2);
		
		// Eftersom denna metod (compare) ska returnera samma sak som compareTo
		// kan vi direkt returnera det compareTo returnerade
		return result;
	}
}