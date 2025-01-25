import java.util.Scanner;

public class Story {
    public static void main() {

        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
        Scanner input = new Scanner(System.in);
        System.out.println("This is a story about an ant.\r");
        System.out.print("What is the ants name?: ");
        String inputAntName = input.nextLine();
        System.out.print("Who does the ant live with?: ");
        String inputAntFamily = input.nextLine();
        System.out.print("How many siblings does the ant have?: ");
        String inputAntAmountOfSiblings = input.nextLine();
        System.out.print("The anthill is next to a ?: ");
        String inputAntHome = input.nextLine();
        System.out.print("What does the ant and it's siblings carry to the hill?: ");
        String inputAntCarry = input.nextLine();
        System.out.print("And?: ");
        String inputAntCarry2 = input.nextLine();
        System.out.print("What special day gives the ant the day off?: ");
        String inputAntHoliday = input.nextLine();

        System.out.print("The little ant " + inputAntName + ".\r");
        System.out.print("Once upon a time there was a tiny, tiny little ant who lived with " + inputAntFamily);
        System.out.print(" and it's " + inputAntAmountOfSiblings + " siblings in an anthill,");
        System.out.print(" by a " + inputAntHome + " in the woods. ");
        System.out.print("The little ant's name was " + inputAntName + ". ");
        System.out.print("Most of the time " + inputAntName + " and his siblings work with carrying ");
        System.out.print(inputAntCarry + " and " + inputAntCarry2 + " to the hill, but today it was ");
        System.out.print(inputAntHoliday + ", so that's why " + inputAntName + " was free from work.");

    }

}
