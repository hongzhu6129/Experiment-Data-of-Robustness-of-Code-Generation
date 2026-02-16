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
                if (word.length() > 0 && Character.isLetter(word.charAt(0))) {
                    words.add(word);
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found: " + filename);
            System.exit(2);
        }


        Collections.sort(words, Collections.reverseOrder()); // Sort in descending order

        display(words.toString());


    }


    public static void display(String words) {
      System.out.println(words);
    }
}
