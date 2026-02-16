import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        // Example usage:
        String stream = "geeksforgeeksandgeeksquizfor";

        findAndPrintFirstNonRepeating(stream); // Output: f
        System.out.println();

        findAndPrintFirstNonRepeating("abcabc"); // Output: 
        System.out.println();

        findAndPrintFirstNonRepeating("aabbcc"); // Output:

    }

    public static void findAndPrintFirstNonRepeating(String stream) {
        Map<Character, Integer> charCounts = new LinkedHashMap<>(); // Preserve insertion order

        for (char c : stream.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);

            // Find the first character with a count of 1 after each character is processed
            Character firstNonRepeating = null;
            for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
                if (entry.getValue() == 1) {
                    firstNonRepeating = entry.getKey();
                    break; 
                }
            }

            if (firstNonRepeating != null) {
                System.out.print(firstNonRepeating);
            } else {
                System.out.print(""); //  Nothing to print if all are repeating so far.
            }

        }


    }
}
