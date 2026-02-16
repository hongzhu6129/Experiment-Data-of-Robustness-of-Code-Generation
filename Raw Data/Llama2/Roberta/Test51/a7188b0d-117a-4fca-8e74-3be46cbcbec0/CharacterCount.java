import java.util.HashMap;
import java.util.Map;

public class CharacterCount {

    public static void main(String[] args) {
        String inputString = "abcaabbcdeffggh";
        int count = test(inputString);
        System.out.println("Number of characters occurring more than twice: " + count);

        inputString = "aabbccddeeffggh"; // Example with all characters appearing exactly twice.
        count = test(inputString);
        System.out.println("Number of characters occurring more than twice: " + count);


        inputString = "123abcABCabc"; // Example with alphanumeric characters
        count = test(inputString);
        System.out.println("Number of characters occurring more than twice: " + count);
    }

    public static int test(String str) {
        Map<Character, Integer> charCounts = new HashMap<>();
        int count = 0;

        for (char c : str.toCharArray()) {
            if (Character.isLetterOrDigit(c)) { // Consider only alphanumeric characters
                charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
            }
        }

        for (int charCount : charCounts.values()) {
            if (charCount > 2) {
                count++;
            }
        }

        return count;
    }
}
