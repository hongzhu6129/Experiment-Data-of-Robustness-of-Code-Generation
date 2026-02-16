import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWordsInString {

    public void reverseEachWordInString(String inputString) {
        if (inputString == null || inputString.trim().isEmpty()) {
            System.out.println(""); // Handle empty or null input
            return;
        }

        List<String> words = Arrays.asList(inputString.split("\\s+")); // Split into words

        StringBuilder reversedString = new StringBuilder();
        for (String word : words) {
            reversedString.append(new StringBuilder(word).reverse().toString()).append(" ");
        }

        System.out.println(reversedString.toString().trim()); // Print the reversed string
    }

    public static void main(String[] args) {
        ReverseWordsInString reverser = new ReverseWordsInString();

        // Test cases
        reverser.reverseEachWordInString("This is a test string"); // Output: sihT si a tset gnirts
        reverser.reverseEachWordInString("Hello World");        // Output: olleH dlroW
        reverser.reverseEachWordInString("One");             // Output: enO
        reverser.reverseEachWordInString("");                // Output: (empty line)
        reverser.reverseEachWordInString(null);               // Output: (empty line)
        reverser.reverseEachWordInString("  leading and trailing spaces  "); // Output:   gnidael dna gnialirt secaps  
    }
}
