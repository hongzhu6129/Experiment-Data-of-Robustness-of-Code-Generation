import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static char findFirstNonRepeatingCharacter(String str) {
        Map<Character, Integer> characterCounts = new HashMap<>();

        // Count the occurrences of each character in the string.
        for (char c : str.toCharArray()) {
            characterCounts.put(c, characterCounts.getOrDefault(c, 0) + 1);
        }

        // Iterate over the string again and return the first character with a count of 1.
        for (char c : str.toCharArray()) {
            if (characterCounts.get(c) == 1) {
                return c;
            }
        }

        // If no non-repeating character is found, return a special character.
        return '\0';
    }

    public static void main(String[] args) {
        // Test cases
        String str1 = "hello";
        char expected1 = 'h';
        char result1 = findFirstNonRepeatingCharacter(str1);
        System.out.println("Test case 1: " + (result1 == expected1));

        String str2 = "aabbcc";
        char expected2 = '\0';
        char result2 = findFirstNonRepeatingCharacter(str2);
        System.out.println("Test case 2: " + (result2 == expected2));

        String str3 = "aabbc";
        char expected3 = 'c';
        char result3 = findFirstNonRepeatingCharacter(str3);
        System.out.println("Test case 3: " + (result3 == expected3));

        String str4 = "";
        char expected4 = '\0';
        char result4 = findFirstNonRepeatingCharacter(str4);
        System.out.println("Test case 4: " + (result4 == expected4));
    }
}
