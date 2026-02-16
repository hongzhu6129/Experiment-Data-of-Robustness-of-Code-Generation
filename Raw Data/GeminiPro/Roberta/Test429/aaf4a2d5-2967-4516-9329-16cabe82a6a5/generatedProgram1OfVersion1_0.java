import java.util.HashMap;
import java.util.Map;

public class StringContainsLetters {

    public static void main(String[] args) {
        System.out.println(test("programming", "program")); // true
        System.out.println(test("abcdefg", "gfedcba")); // true
        System.out.println(test("abc", "abcd")); // false 
        System.out.println(test("aabbcc", "abc")); // true
        System.out.println(test("Hello", "hello")); // false (case-sensitive)
        System.out.println(test("programming", "ramming")); // true
        System.out.println(test("", ""));  // true (empty string contains empty string)
        System.out.println(test("abc", "")); // true  (string contains empty string)
        System.out.println(test("", "a"));// false (empty string does not contain "a")


    }

    public static boolean test(String str1, String str2) {
        // Create a character count map for str1
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : str1.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Check if str2's characters are present in the map
        for (char c : str2.toCharArray()) {
            if (!charCount.containsKey(c) || charCount.get(c) == 0) {
                return false; // Character not found or count is zero
            }
            charCount.put(c, charCount.get(c) - 1); // Decrement count if found
        }

        return true; // All characters of str2 were found in str1
    }
}
