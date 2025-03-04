package labb_7;

import java.util.ArrayList;
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {

        String[] names = new String[4];

        names[0] = "kalle korvkupa";
        names[1] = "timmy tysktok";
        names[2] = "Stella Stavsugga";
        names[3] = "Pelle Pojksnopp";

        create(names);
    }

    public static ArrayList<String> create(String[] names) {
        ArrayList<String> usernames = new ArrayList<String>();

        for (int i = 0; i < names.length; i++) {

            String tempString = names[i];
            String[] tempArray = tempString.split(" ");
            String[] tempArraySecond = tempString.split("(?=[a-z]{3})");
            String firstName = tempArray[0];
            String lastName = tempArray[1];

            String userNameFirst = tempArraySecond[i];

            System.out.println(firstName + " " + i);
            System.out.println(lastName + " " + i);




            /*
             * 
             * for (int j = 0; j < tempArray.length; j++) {
             * if (j % 2 == 0) {
             * String firstName = tempArray[j];
             * System.out.println(firstName + " " + j);
             * } else {
             * String lastName = tempArray[j];
             * System.out.println(lastName + " " + j);
             * }
             * 
             * }
             */

        }

        return usernames;
    }
}
