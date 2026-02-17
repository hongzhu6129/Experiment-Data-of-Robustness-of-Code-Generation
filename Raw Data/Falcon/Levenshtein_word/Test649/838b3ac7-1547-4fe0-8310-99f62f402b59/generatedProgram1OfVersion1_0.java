import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        // Example usage:
        String stream = "geeksforgeeksandgeeksquizfor";

        findAndPrintFirstNonRepeating(stream); // Output: f

        stream = "aabbcc";
        findAndPrintFirstNonRepeating(stream);  // Output: -1 (no non-repeating character)

        stream = "";
        findAndPrintFirstNonRepeating(stream); // Output: -1 (empty stream)
    }



    public static void findAndPrintFirstNonRepeating(String stream) {
        if (stream == null || stream.length() == 0) {
            System.out.println("-1"); // Handle empty or null input
            return;
        }

        Map<Character, Integer> charCounts = new LinkedHashMap<>(); // Preserve insertion order


        for (char c : stream.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                return; // Found the first non-repeating character
            }
        }

        System.out.println("-1"); // No non-repeating character found
    }
}
