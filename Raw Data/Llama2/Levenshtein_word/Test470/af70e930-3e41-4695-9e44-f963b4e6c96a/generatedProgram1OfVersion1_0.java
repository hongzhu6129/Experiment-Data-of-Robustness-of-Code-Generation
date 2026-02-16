import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DescendingWords {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java DescendingWords <filename>");
            return;
        }

        String filename = args[0];
        ArrayList<String> words = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNext()) {
                String word = scanner.next();
                if (word.matches("^[a-zA-Z].*")) { // Check if the word starts with a letter
                    words.add(word);
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + filename);
            return;
        }


        Collections.sort(words, Collections.reverseOrder()); // Sort in descending order

        for (String word : words) {
            display(word);
        }
    }


    public static void display(String word) {
        System.out.println(word);
    }
}
