package labb_7.Username;
import java.util.ArrayList;

public class UsernamesTest {
    


    public static void main(String[] args) {

        // Creates array
        String[] names = new String[10];

        // Sets array
        names[0] = "Kalle Korvkupa";
        names[1] = "Timmy Tysktok";
        names[2] = "Stella Stavsugga";
        names[3] = "Pelle Pojksnopp";
        names[5] = "Tired Tommy";
        names[6] = "Cartman Connor";
        names[7] = "Practical Psycho";
        names[8] = "Katy Perry";
        names[4] = "Ia Zu";
        names[9] = "A X";

        ArrayList<String> userNamesWow = new ArrayList<String>();

        Usernames users = new Usernames();

        userNamesWow = Usernames.create(names);

        users.userNamesPrinter(userNamesWow);

    }
}
