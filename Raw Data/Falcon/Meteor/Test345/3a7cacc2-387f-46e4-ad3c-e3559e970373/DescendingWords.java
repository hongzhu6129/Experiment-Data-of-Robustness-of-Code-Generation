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

        try (Scanner input = new Scanner(new File(filename))) {
            while (input.hasNext()) {
                String word = input.next();
                if (word.matches("^[a-zA-Z].*")) { // Check if word starts with a letter
                    words.add(word);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
            System.exit(2);
        }


        Collections.sort(words, Collections.reverseOrder()); // Sort in descending order

        for (String word : words) {
            display(word);
        }
    }


    public static void display(String word) {
        System.out.println(word);
    }


    //This main method is just for testing without command line args.  You can use this for local testing. Comment out when submitting.
    /*
    public static void main(String[] args) {
        ArrayList<String> testWords = new ArrayList<>();
        testWords.add("Zebra");
        testWords.add("apple");
        testWords.add("Banana");
        testWords.add("123word"); // This will be ignored as it doesn't start with a letter
        testWords.add("aardvark");

        Collections.sort(testWords, Collections.reverseOrder());

        for (String word : testWords) {
            display(word);
        }
    }
    */
}
