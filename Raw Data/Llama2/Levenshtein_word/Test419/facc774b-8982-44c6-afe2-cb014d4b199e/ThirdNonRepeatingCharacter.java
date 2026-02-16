import java.util.HashMap;
import java.util.Map;

public class ThirdNonRepeatingCharacter {

    public static void main(String[] args) {
        String str = "aabccd";

        // Create a map to store the count of each character in the string
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Find the third non-repeating character
        int count = 0;
        for (char c : str.toCharArray()) {
            if (charCount.get(c) == 1) {
                count++;
            }
            if (count == 3) {
                System.out.println("Third non-repeating character: " + c);
                break;
            }
        }
    }
}
