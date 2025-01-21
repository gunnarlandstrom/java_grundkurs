/**
 * Ex01_06 - Person.java
 * Ett exempel som visar hur en enkel klass är uppbyggd.
 * Klassen har två instansvariabler, en fär namnet (name), och
 * en för personnumret (pnr). Dessa är satta som privata (private)
 * och kan därför inte manipuleras utifrån denna klass. I stället
 * har klassen publika (public) metoder som andra använder för att
 * sätta (setX) och hämta (getX) namnet samt personnumret.
 *
 * Observera att klassen Person saknar en main-metod och är
 * därför inget Javaprogram som går att köra. Prova dock
 * gärna att kompilera och starta för att se vilket fel-
 * meddelande som ges.
 */

package ovningar.ovning_1;

public class Person {
	// Instansvariabler
	private int pnr;
	private String name;

	// Metod för att sätta namn på personen
	public void setName(String name) {
		this.name = name;
	}

	// Metod som returnerar namnet på personen
	public String getName() {
		return name;
	}

	// Metod som sätter persones personnummer
	public void setPnr(int pnr) {
		this.pnr = pnr;
	}

	// Metod som returnerar personens personnummer
	public int getPnr() {
		return pnr;
	}
}