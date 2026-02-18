import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DescendingWords {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java DescendingWords <filename>");
            System.exit(1);
        }

        String filename = args[0];
        ArrayList<String> words = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNext()) {
                String word = scanner.next();
                if (word.matches("[a-zA-Z].*")) { // Check if the word starts with a letter
                    words.add(word);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
            System.exit(1);
        }


        Collections.sort(words, Collections.reverseOrder()); // Sort in descending order

        for (String word : words) {
            display(word);
        }
    }

    public static void display(String word) {
        System.out.println(word);
    }



    //This main method is here only to allow compilation in online IDEs which 
    //don't support command line arguments easily
    //You can delete it if running from command line
    //To use this, create a test.txt file in the same directory and paste some text.
    //Then uncomment the code below and run.
    /*
    public static void main(String[] args) {
        String[] testArgs = {"test.txt"};
        main(testArgs);
    }
    */
}
