package labb_7.Username;

import java.util.ArrayList;

public class Usernames {

    // Constructor
    public Usernames() {

    }

    // Creates ArrayList of Firstname, Lastname and a combined username of 3 letters from each.
    public static ArrayList<String> create(String[] names) {
        ArrayList<String> userNames = new ArrayList<String>();
        String tempUserFirst = "";
        String tempUserSecond = "";
        String userName;
        String userNameTemp = "";

        for (int i = 0; i < names.length; i++) {

            String tempString = names[i];
            
            // Checks if Arrayelement is empty
            if (tempString == null) {
                break;
            }

            // Splits First and Lastname 
            String[] tempArray = tempString.split(" ");

            // Creates UserName
            for (int j = 0; j < tempArray.length; j++) {

                String tempStringSub = tempArray[j];

                if (tempStringSub.length() > 2) {
                    if (j % 2 == 0) {
                        tempUserFirst = tempStringSub.substring(0, 3);
                    } else {
                        tempUserSecond = tempStringSub.substring(0, 3);
                    }
                } else if (tempStringSub.length() < 3) {
                    if (j % 2 == 0) {
                        tempUserFirst = tempStringSub;
                    } else {
                        tempUserSecond = tempStringSub;
                    }
                }

            }
            String firstName = tempArray[0];
            String lastName = tempArray[1];

            userNameTemp = tempUserFirst.toLowerCase() + tempUserSecond.toLowerCase();
            userName = firstName + " " + lastName + " (" + userNameTemp + ")";
            userNames.add(userName);

        }

        return userNames;
    }

    // Prints ArrayList
    public void userNamesPrinter(ArrayList<String> list) {

        for (String s : list) {
            System.out.println(s);
        }
    }
}
