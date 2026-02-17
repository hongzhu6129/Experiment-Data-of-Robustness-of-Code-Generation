import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        // Example usage:
        String stream = "aabbcceffgh";
        System.out.println("First non-repeating character: " + findFirstNonRepeating(stream)); // Output: e

        stream = "aabbccddeeff";
        System.out.println("First non-repeating character: " + findFirstNonRepeating(stream)); // Output: None

        stream = "geeksforgeeks";
        System.out.println("First non-repeating character: " + findFirstNonRepeating(stream)); // Output: f

        stream = ""; // Empty stream
        System.out.println("First non-repeating character: " + findFirstNonRepeating(stream)); // Output: None

        stream = "a"; // Single character stream
        System.out.println("First non-repeating character: " + findFirstNonRepeating(stream)); // Output: a

        stream = "abcdefghi"; // All unique characters
        System.out.println("First non-repeating character: " + findFirstNonRepeating(stream)); // Output: a


    }


    public static String findFirstNonRepeating(String stream) {

        // Use LinkedHashMap to preserve insertion order
        Map<Character, Integer> charCounts = new LinkedHashMap<>();

        // Count character occurrences
        for (char c : stream.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        // Find the first character with count 1
        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            if (entry.getValue() == 1) {
                return String.valueOf(entry.getKey());
            }
        }

        return "None"; // No non-repeating character found
    }
}
