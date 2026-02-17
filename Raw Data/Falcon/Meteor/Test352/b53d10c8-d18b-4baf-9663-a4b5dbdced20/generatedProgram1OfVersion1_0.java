import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWordsInAString {

    public static void main(String[] args) {
        // Test cases
        String[] testCases = {"", "hello", "hello world", "this is a test", "this is a test string", "this is a test string with spaces"};
        for (String testCase : testCases) {
            System.out.println("Input: " + testCase);
            System.out.println("Output: " + reverseWords(testCase));
            System.out.println();
        }
    }

    public static String reverseWords(String str) {
        // Check if the string is empty or null
        if (str == null || str.isEmpty()) {
            return "";
        }

        // Convert the string to a list of words
        List<String> words = Arrays.asList(str.split(" "));

        // Reverse the list of words
        Collections.reverse(words);

        // Convert the list of words back to a string
        return String.join(" ", words);
    }
}
