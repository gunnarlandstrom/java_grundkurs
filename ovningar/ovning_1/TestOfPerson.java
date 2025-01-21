/**
 * Ex01_07 - TestOfPerson.java
 * 
 * Ett exempel som "testar" användningen av klassen Person.
 */
public class TestOfPerson {
	// Main metoden
	public static void main(String[] args) {
		// Skapa ett objekt av klassen Person (mer om detta i kommande lektioner)
		Person sara = new Person();

		// Skriver ut namnet på sara
		System.out.println("namn=" + sara.getName());

		// Sätter ett namn på sara och skriver ut namnet igen
		sara.setName("Sara");
		System.out.println("namn=" + sara.getName());
	}
}