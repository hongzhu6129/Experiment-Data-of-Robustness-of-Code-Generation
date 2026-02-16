import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        String str = "hello";
        char c = firstNonRepeatingCharacter(str);
        System.out.println(c); // Output: h
    }

    public static char firstNonRepeatingCharacter(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count the occurrences of each character in the string
        for (char c : str.toLowerCase().toCharArray()) {
            int count = charCountMap.getOrDefault(c, 0);
            charCountMap.put(c, count + 1);
        }

        // Find the first character with a count of 1
        for (char c : str.toLowerCase().toCharArray()) {
            if (charCountMap.get(c) == 1) {
                return c;
            }
        }

        // If no non-repeating character is found, return a special character
        return '\0';
    }
}
