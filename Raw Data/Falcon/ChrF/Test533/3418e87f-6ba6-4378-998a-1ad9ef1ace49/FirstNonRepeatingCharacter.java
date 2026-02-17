import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println(firstNonRepeatingChar(str));
    }

    public static char firstNonRepeatingChar(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Store the count of each character in the map
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Iterate over the string again and return the first character with count 1
        for (char c : str.toCharArray()) {
            if (charCountMap.get(c) == 1) {
                return c;
            }
        }

        // If no non-repeating character is found, return a special character
        return Character.MIN_VALUE;
    }
}
