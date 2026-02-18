import java.util.*;

public class RemoveDuplicateCharacters {

    public static void main(String[] args) {
        // Test cases
        String[] testCases = {"hello", "world", "programming", "java", "python", "c++", "javascript", "ruby", "kotlin", "swift"};
        for (String testCase : testCases) {
            System.out.println("Original string: " + testCase);
            System.out.println("String after removing duplicate characters: " + removeDuplicateCharacters(testCase));
            System.out.println();
        }
    }

    public static String removeDuplicateCharacters(String str) {
        // Create a set to store the unique characters
        Set<Character> uniqueCharacters = new HashSet<>();

        // Iterate over the string
        for (char c : str.toCharArray()) {
            // If the character is not already in the set, add it
            if (!uniqueCharacters.contains(c)) {
                uniqueCharacters.add(c);
            }
        }

        // Create a new string builder to store the unique characters
        StringBuilder uniqueString = new StringBuilder();

        // Iterate over the set and append the characters to the string builder
        for (char c : uniqueCharacters) {
            uniqueString.append(c);
        }

        // Return the unique string
        return uniqueString.toString();
    }
}
