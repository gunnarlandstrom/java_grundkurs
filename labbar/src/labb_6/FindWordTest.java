package labb_6;

import java.io.FileNotFoundException;

public class FindWordTest {

    public static void main(String[] args) throws FileNotFoundException {

        FindWord file1 = new FindWord();

        file1.countWordsInFile("wantedWord", "wantedFile");

    }
    
}
