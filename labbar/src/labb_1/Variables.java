package labb_1;
/**
* Filnamn: Variables.java
* @author Gunnar Landström
* @version 1.0
* Datum: 2025-01-22
*
* Beskrivning:
* Kollar om ett nummer är jämnt delbart med 2, skriver ut resultatet.
*/

public class Variables {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        boolean isEven;
        String outputEven;
        String outputOdd;
        int number = 514;
        int isNumberEven = number % 2;

        outputEven = "Is number even? Yes that is ";
        outputOdd = "Is number even? No that is ";

        if (isNumberEven != 0) {
            isEven = false;
        } else {
            isEven = true;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
        if (isEven) {
            System.out.print(outputEven + isEven + ".\n");
            System.out.println("The number: " + number + " is even!");
        } else {
            System.out.print(outputOdd + isEven + ".\n");
            System.out.println("The number: " + number + " is not even!");
        }
    }
}
