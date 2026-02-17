import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {
        // Test cases
        String[] testCases = {"Hello", "World", "Mississippi", "AABBCC", "1234567890", "", "!"};

        // Iterate over test cases
        for (String testCase : testCases) {
            // Remove duplicates
            String result = removeDuplicates(testCase);

            // Print result
            System.out.println("Original: " + testCase);
            System.out.println("Removed duplicates: " + result);
            System.out.println();
        }
    }

    public static String removeDuplicates(String str) {
        // Create a set to store the unique characters
        Set<Character> uniqueChars = new HashSet<>();

        // Iterate over the string
        for (char ch : str.toCharArray()) {
            // Add the character to the set if it is not already there
            uniqueChars.add(ch);
        }

        // Build the result string from the set
        StringBuilder result = new StringBuilder();
        for (char ch : uniqueChars) {
            result.append(ch);
        }

        // Return the result string
        return result.toString();
    }
}
