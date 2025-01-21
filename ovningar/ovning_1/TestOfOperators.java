/**
 * Ex01_04 - TestOfOperators
 * 
 * Ett exempel som provar att använda diverse
 * operatorer (t.ex addition och tilldelning).
 */
public class TestOfOperators {
	// Main metoden
	public static void main(String[] args) {
		// Deklarerar olika variabler
		int games;
		int goals;
        double shootingPercentage;
		
		// Tilldelar games och goals värden
		games = 708;
		goals = 249;

		// Deklarerar och tilldelar på samma gång
		int shots = 1693;
		
		/* Beräknar målprocenten genom att dividera variabeln goals
		   med variabeln shots. Vi multiplicerar även med 100
		   för att få resultatet i procent.
		   Resutlatet tilldelar vi variabeln shootingPercentage
		*/
		shootingPercentage = 100.0 * goals / shots;
				
		// Skriver ut divisionen och resultatet av denna
		System.out.println(goals + " / " + shots + " = " + shootingPercentage + "%");
		
		/* Deklarerar en boolean
		   En boolean kan endast anta värdena true eller false (sant eller falskt)
		   och kan användas för att till exempel lagra resutlat av olika jämförelser
		*/
		boolean lessThan;
		
		// Tilldelar lessThan värdet efter en jämförelse om värdet i goals är mindre än shots
		lessThan = goals < shots;
		
		// Skriver ut resultatet
		System.out.println("goals är mindre än shots = " + lessThan);
	}
}