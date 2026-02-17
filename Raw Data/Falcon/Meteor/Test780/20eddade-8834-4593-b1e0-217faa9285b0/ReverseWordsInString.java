import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWordsInString {

    public void reverseEachWordInString(String str) {
        if (str == null || str.trim().isEmpty()) {
            System.out.println(""); // Handle null or empty input
            return;
        }

        List<String> words = Arrays.asList(str.split("\\s+")); // Split into words

        StringBuilder reversedString = new StringBuilder();
        for (String word : words) {
            List<String> characters = Arrays.asList(word.split(""));
            Collections.reverse(characters);  // Reverse characters in each word
            reversedString.append(String.join("", characters)).append(" ");
        }

        System.out.println(reversedString.toString().trim()); // Print the reversed string

    }

    public static void main(String[] args) {
        ReverseWordsInString reverser = new ReverseWordsInString();

        reverser.reverseEachWordInString("This is a test string"); // Output: sihT si a tset gnirts
        reverser.reverseEachWordInString("Hello World"); // Output: olleH dlroW
        reverser.reverseEachWordInString(null); // Output: (empty line)
        reverser.reverseEachWordInString(""); // Output: (empty line)
        reverser.reverseEachWordInString("  leading and trailing spaces  "); // Output:   gnidael dna gnilrairt secaps  
    }
}
