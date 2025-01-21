/**
 * Ex01_02 - Argument
 * 
 * Ett exempel som kort visar hur vi använder String[] args.
 * Programet skriver ut det färsta argumentet som anges när
 * vi startar programet. Skriver också ut antalet argument.
 *
 * Starta programet från terminalen enligt t.ex. följande:
 * java Argument hello
 */

package ovningar.ovning_1;
public class Argument {
    // Main metoden
    public static void main(String[] args) {
        // Skriver ut antalet argument som angetts
        System.out.print("Antal argument: ");
        System.out.println(args.length);
        
        // Skriver ut det första argumentet
        System.out.print("Argument 1 = ");
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        
        /* OBS!! Har inget argument angetts  för vi ett körningsfel!
           Hur vi hanterar denna typ av fel, eller undantag som det 
		   heter i Java, tas upp i fortsättningskursen Java II.
        */
    }
}