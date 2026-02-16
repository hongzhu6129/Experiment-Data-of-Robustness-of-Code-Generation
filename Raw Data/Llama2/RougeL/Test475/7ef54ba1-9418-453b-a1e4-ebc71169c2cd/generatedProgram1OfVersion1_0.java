import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        String inputString = "aabbccddeeffg"; // Example input string
        char firstNonRepeatingChar = findFirstNonRepeatingChar(inputString);

        if (firstNonRepeatingChar != '\0') {
            System.out.println("First non-repeating character: " + firstNonRepeatingChar);
        } else {
            System.out.println("No non-repeating character found.");
        }


        inputString = "aabbccddeeff"; // Example with no non-repeating characters
        firstNonRepeatingChar = findFirstNonRepeatingChar(inputString);

        if (firstNonRepeatingChar != '\0') {
            System.out.println("First non-repeating character: " + firstNonRepeatingChar);
        } else {
            System.out.println("No non-repeating character found.");
        }


        inputString = "leetcode";
         firstNonRepeatingChar = findFirstNonRepeatingChar(inputString);

        if (firstNonRepeatingChar != '\0') {
            System.out.println("First non-repeating character: " + firstNonRepeatingChar);
        } else {
            System.out.println("No non-repeating character found.");
        }

        inputString = "loveleetcode";
        firstNonRepeatingChar = findFirstNonRepeatingChar(inputString);

        if (firstNonRepeatingChar != '\0') {
            System.out.println("First non-repeating character: " + firstNonRepeatingChar);
        } else {
            System.out.println("No non-repeating character found.");
        }



    }

    public static char findFirstNonRepeatingChar(String str) {
        // Use LinkedHashMap to maintain insertion order
        Map<Character, Integer> charCounts = new LinkedHashMap<>();

        // Count character occurrences
        for (char c : str.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        // Find the first character with a count of 1
        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        // Return null character if no non-repeating character is found
        return '\0';
    }
}
