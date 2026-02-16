import java.util.HashMap;
import java.util.Map;

public class StringLetterCheck {

    public static void main(String[] args) {
        String str1 = "programming";
        String str2 = "gram";
        boolean result = test(str1, str2);
        System.out.println(result); // Output: true

        str1 = "hello";
        str2 = "world";
        result = test(str1, str2);
        System.out.println(result); // Output: false


        str1 = "AbCd";
        str2 = "Aabc";
        result = test(str1, str2);
        System.out.println(result); // Output: false (case-sensitive)

        str1 = "AbCd";
        str2 = "Abd";
        result = test(str1, str2);
        System.out.println(result); // Output: true

        str1 = "";
        str2 = "";
        result = test(str1, str2);
        System.out.println(result); // Output: true (empty strings are considered a match)


        str1 = "programming";
        str2 = "rammingg"; // contains duplicates of letters in str1
        result = test(str1, str2);
        System.out.println(result); // Output: true

    }

    public static boolean test(String str1, String str2) {
        // Create a frequency map for characters in str1
        Map<Character, Integer> charFrequency = new HashMap<>();
        for (char c : str1.toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }

        // Check if characters in str2 are present in the frequency map
        for (char c : str2.toCharArray()) {
            if (!charFrequency.containsKey(c) || charFrequency.get(c) == 0) {
                return false; // Character not found or not enough occurrences
            } else {
                charFrequency.put(c, charFrequency.get(c) - 1); // Decrement count
            }
        }

        return true; // All characters in str2 found in str1
    }
}
