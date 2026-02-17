import java.util.*;

public class NonRepeatingCharacters {

    public static void main(String[] args) {
        // Initialize the string
        String str = "java";

        // Create a HashSet to store the non-repeating characters
        Set<Character> nonRepeatingChars = new HashSet<>();

        // Iterate over the string and add each character to the HashSet
        for (char c : str.toCharArray()) {
            if (!nonRepeatingChars.contains(c)) {
                nonRepeatingChars.add(c);
            }
        }

        // Iterate over the HashSet and print the non-repeating characters
        for (char c : nonRepeatingChars) {
            System.out.println(c);
        }
    }
}
