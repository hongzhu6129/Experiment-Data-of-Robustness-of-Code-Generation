import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWordsInString {

    public void reverseEachWordInString(String str) {
        if (str == null || str.trim().isEmpty()) {
            System.out.println(""); // Handle empty or null input
            return;
        }

        List<String> words = Arrays.asList(str.split("\\s+")); // Split into words
        Collections.reverse(words); // Reverse the order of words (optional)

        StringBuilder reversedString = new StringBuilder();
        for (String word : words) {
            reversedString.append(new StringBuilder(word).reverse().toString()).append(" ");
        }

        System.out.println(reversedString.toString().trim()); // Print the reversed string

    }

    public static void main(String[] args) {
        ReverseWordsInString reverser = new ReverseWordsInString();

        reverser.reverseEachWordInString("This is a test string"); // Example usage
        reverser.reverseEachWordInString("Hello World");         // Another example
        reverser.reverseEachWordInString(null);                 // Test null input
        reverser.reverseEachWordInString("");                   // Test empty input
        reverser.reverseEachWordInString("  leading and trailing spaces  "); // Test spaces


    }
}
