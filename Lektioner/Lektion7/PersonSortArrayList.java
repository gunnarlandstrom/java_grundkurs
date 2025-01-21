package lektioner.Lektion7;
import java.util.*; // Klassen ArrayList och Collections

/**
 * Ex07_14 - PersonSortArrayList
 *
 * Visar hur vi skapar en ArrayList som innehåller personer
 * och som sen sorteras på olika sätt med hjälp av en
 * Comparator och Collections.sort.
 * Vi lägger till ett antal personer i listan, sorterar
 * listan för att sen skriva ut listan igen för att se
 * skillnaden.
 *
 * @author Robert Jonsson
 */
public class PersonSortArrayList {
	public static void main(String[] args) {
		// Skapar en ArrayList som ska innehålla objekt av klassen Person
		ArrayList<Person> persons = new ArrayList<>();

		// Skapar ett Person-objekt och lägger in den i listan persons
		Person p1 = new Person("Person 1", 34);
		persons.add(p1);
		
		// Vi kan lägga till personer utan att första lagra dem i en variabel
		persons.add(new Person("Person 9", 4));		
		persons.add(new Person("Person 3", 8));
		persons.add(new Person("Person 7", 1));
		persons.add(new Person("Person 2", 16));
		persons.add(new Person("Person 5", 22));
		persons.add(new Person("Person 8", 54));
		persons.add(new Person("Person 6", 23));		

		// Anropar metod för att skriva ut listans innehåll till skärmen
		System.out.println("Unsorted list");
		printList(persons);
		
		// Sorterar efter namnet. Metoden sort tar två argument. Det första
		// argumentet är den lista som ska sorteras och det andra argumentet
		// är vilken Comparator som ska användas för att jämföra personerna
		// i listan.
		Collections.sort(persons, new PersonNameComparator());
		
		// Anropar metod för att skriva ut listans innehåll till skärmen
		System.out.println("Sorted by name");
		printList(persons);
		
		// Sorterar efter ålder genom att använda PersonAgeComparator
		Collections.sort(persons, new PersonAgeComparator());
		
		// Anropar metod för att skriva ut listans innehåll till skärmen
		System.out.println("Sorted by age");
		printList(persons);		
	}
	
	public static void printList(ArrayList<Person> persons) {
		System.out.println("-----------------------------");
		
		// Loopa igenom hela listan med en for-loop
		for (int i = 0; i < persons.size(); i++) {
			// "Hämta" Person-objektet på poistion i
			Person person = persons.get(i);
			// Skriv ut personens namn och ålder
			System.out.println(person.getName() + "\t" + person.getAge());
		}
		
		// Ny rad
		System.out.println();
	}
}