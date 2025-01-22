package uppgifter;
public class Variables {
    public static void main(String[] args) {
        int number;
        boolean isEven;
        String output;

        number = 512 % 2;
        output = "Number is even, that is ";
        if (number != 0) {
            isEven = false;
        }
        else {
            isEven = true;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
        if (isEven) {
            System.out.println(output);
            System.out.print(isEven + ".");
            

        }

    }
}
