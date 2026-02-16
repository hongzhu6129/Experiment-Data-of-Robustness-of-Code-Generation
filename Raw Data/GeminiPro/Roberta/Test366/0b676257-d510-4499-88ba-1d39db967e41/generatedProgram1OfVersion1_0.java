import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        // Example usage:
        String stream = "aaabccddeeffg"; // Example stream of characters

        findAndPrintFirstNonRepeating(stream); // Call the function to process the stream
    }


    public static void findAndPrintFirstNonRepeating(String stream) {
        HashMap<Character, Integer> charCounts = new HashMap<>(); // Store character counts
        Queue<Character> inOrderChars = new LinkedList<>();  // Maintain insertion order

        for (char c : stream.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1); // Update counts

            if (charCounts.get(c) == 1) {
                inOrderChars.add(c); // Add to queue only if it's the first occurrence
            }

            // Remove characters from the queue that have repeated
            while (!inOrderChars.isEmpty() && charCounts.get(inOrderChars.peek()) > 1) {
                inOrderChars.poll(); 
            }

            // Print the current first non-repeating character or '-' if none exists
            if (!inOrderChars.isEmpty()) {
                System.out.print(inOrderChars.peek()); // Print the current non-repeating char
            } else {
                System.out.print("-");
            }
        }
                System.out.println(); // New line after processing the entire stream

    }
}
