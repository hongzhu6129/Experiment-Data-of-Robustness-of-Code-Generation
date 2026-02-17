import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords {

    public static String WordsInReverse(String str) {
        if (str == null || str.trim().isEmpty()) {
            return ""; // Handle null or empty strings
        }

        List<String> words = Arrays.asList(str.trim().split("\\s+")); // Split into words
        Collections.reverse(words); // Reverse the list of words
        return String.join(" ", words); // Join back with spaces
    }

    public static void main(String[] args) {
        String inputString1 = "the quick brown fox";
        String reversedString1 = WordsInReverse(inputString1);
        System.out.println("Reversed string: " + reversedString1); // Output: fox brown quick the

        String inputString2 = " hello world  ";  // Example with leading/trailing spaces
        String reversedString2 = WordsInReverse(inputString2);
        System.out.println("Reversed string: " + reversedString2); // Output: world hello


        String inputString3 = null; // Test with null
        String reversedString3 = WordsInReverse(inputString3);
        System.out.println("Reversed string: " + reversedString3); // Output:


        String inputString4 = " "; // Test with empty string
        String reversedString4 = WordsInReverse(inputString4);
        System.out.println("Reversed string: " + reversedString4); // Output:

        String inputString5 = "  a  b "; // Test with multiple spaces
        String reversedString5 = WordsInReverse(inputString5);
        System.out.println("Reversed string: " + reversedString5); // Output: b a
    }
}
