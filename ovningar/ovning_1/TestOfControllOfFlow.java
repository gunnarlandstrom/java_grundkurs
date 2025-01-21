/**
 * Ex01_05 - TestOfControllOfFlow.java
 * 
 * Ett exempel som provar att använda diverse
 * kontrollflöden (t.ex if-sats och for-loop).
 */
public class TestOfControllOfFlow {
	// Main metoden
	public static void main(String[] args) {
		// En for-loop kan användas för att upprepa någonting ett förutbestämt antal gånger.
		for (int i = 0; i < 5; i++) {
			System.out.println("Denna rad skrivs ut 5 gånger vara detta är rad " + (i + 1)); // Beräkna först parentesen och sen addera till strängen som skrivs ut
		}
		
		System.out.println(); // tom rad
		
		// Med if-satsen kan vi låta vårt program utföra olika programsatser utifrån en jämförelse
		int number = -5;
		
		if (number < 0) {
			System.out.println("Talet " + number + " är negativt");
		}
		else {
			System.out.println("Talet " + number + " är positivt");
		}
	}
}