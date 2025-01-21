/**
 * Ex01_03 - NickName.java
 *
 * Ett första exempel som använder variabler. Visar även
 * exempel på olika escape-teckenoch utskrift med unicode-tecken.
 */

package ovningar.ovning_1;

public class NickName {
    // Main metoden
    public static void main(String[] args) {
        // Deklarerar fyra variabler (tre av typen int och en av typen double)
        int games;
		int goals;
        int shots;
        double shootingPercentage;
        
        // Tilldelar variablerna olika värden
		games = 708;
        goals = 249;
        shots = 1693;
        shootingPercentage = 14.7;
        
        // Tre olika sätt att skriva ut på skärmen

		// 1. Uppdelat i olika kombinationer av print och println
		// där print inte gör en radbrytning, vilket println gör.
        System.out.print("Peter \"Foppa\" Forsberg har spelat ");
		System.out.print(games);
		System.out.println(" matcher i NHL."); // Ny rad med println
		System.out.print("Där sköt han total ");
        System.out.print(shots);
        System.out.print(" skott varav ");
        System.out.print(goals);
        System.out.print(" gick in i mål.\n"); // Radbrytning med \n
		System.out.print("Detta ger han en skottprocent p\u00E5 "); // \u00E5 är unicode för å
        System.out.print(shootingPercentage);
        System.out.println("%");
        
        // 2. Använder + för att utföra "strängaddition"
		System.out.println(); // Tom rad
		System.out.println("Peter \"Foppa\" Forsberg har spelat " + games + " matcher i NHL.");
		System.out.println("Där sköt han total " + shots + " skott varav " + goals + " gick in i mål.");
		System.out.println("Detta ger han en skottprocent p\u00E5 " + shootingPercentage + "%");

		// 3. Använder metoden format (förklaras i senare lektioner)
		System.out.println(); // Tom rad
		System.out.format("Peter \"Foppa\" Forsberg har spelat %d matcher i NHL.%n", games);
		System.out.format("Där sköt han total %d skott varav %d gick in i mål.%n", shots, goals);
		System.out.format("Detta ger han en skottprocent p\u00E5 %3.1f%%%n", shootingPercentage);
		// I sista System.out.format betyder %3.1f att ett flyttal (double eller float) ska skrivas ut
		// med totalt 3 värdesiffror varav 2 ska tillhöra decimaldelen.
		// Eftersom % används i format för att ange att ett värde ska skrivas ut måste vi skriva %% för
		// att själva tecknet % ska skrivas ut.
		// %n innebär ny rad.
    }
}