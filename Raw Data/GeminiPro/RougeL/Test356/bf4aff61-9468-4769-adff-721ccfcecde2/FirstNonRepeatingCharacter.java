import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        String str1 = "leetcode";
        System.out.println("The first non-repeated character in string '" + str1 + "' is: " + firstNonRepeatingCharacter(str1));

        String str2 = "loveleetcode";
        System.out.println("The first non-repeated character in string '" + str2 + "' is: " + firstNonRepeatingCharacter(str2));

        String str3 = "aabb";
        System.out.println("The first non-repeated character in string '" + str3 + "' is: " + firstNonRepeatingCharacter(str3));
         String str4 = "racecars";
        System.out.println("The first non-repeated character in string '" + str4 + "' is: " + firstNonRepeatingCharacter(str4));

        String str5 = ""; // Empty string test case
        System.out.println("The first non-repeated character in string '" + str5 + "' is: " + firstNonRepeatingCharacter(str5));

        
        String str6 = null; // Null string test case
        System.out.println("The first non-repeated character in string '" + str6 + "' is: " + firstNonRepeatingCharacter(str6));
    }

    public static char firstNonRepeatingCharacter(String str) {
        if (str == null || str.isEmpty()) {
            return '\0'; // Return null character for empty or null string
        }

        Map<Character, Integer> charCount = new LinkedHashMap<>(); // Preserve insertion order

        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return '\0'; // Return null character if no non-repeating character is found
    }
}
