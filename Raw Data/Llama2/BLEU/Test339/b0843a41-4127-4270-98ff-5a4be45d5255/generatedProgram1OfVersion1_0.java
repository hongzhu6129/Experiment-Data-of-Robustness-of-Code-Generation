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
        ArrayList<String> words = readWordsFromFile(filename);

        if (words == null) { // Handle file not found
            System.exit(1);  // Exit with an error code
        }

        Collections.sort(words, Collections.reverseOrder()); // Sort in descending order

        for (String word : words) {
            display(word);
        }
    }


    public static ArrayList<String> readWordsFromFile(String filename) {
        ArrayList<String> words = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNext()) {
                String word = scanner.next();
                if (word.matches("[a-zA-Z]+")) { // Check if the word starts with a letter
                   words.add(word) ;
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + filename);
           return null; // Return null to indicate an error
        }
        return words;
    }

    public static void display(String word) {
        System.out.println(word);
    }

    // Alternative main method signature if needed (though not strictly necessary here).
    // public static void main(String[] args) {
    //     // Same implementation as the other main method.
    // }


}
