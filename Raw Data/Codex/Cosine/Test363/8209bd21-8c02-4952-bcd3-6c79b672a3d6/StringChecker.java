import java.util.HashMap;
import java.util.Map;

public class StringChecker {

    public static void main(String[] args) {
        System.out.println(test("programming", "gram")); // true
        System.out.println(test("hello", "leh"));  // true
        System.out.println(test("world", "wordl")); // true
        System.out.println(test("java", "jv"));   // true
        System.out.println(test("coding", "god"));   // false 
        System.out.println(test("Hello", "hello")); // false (case sensitive)


    }

    public static boolean test(String str1, String str2) {
        // Create a character count map for str1
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : str1.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Check if characters in str2 are present in str1's map with sufficient counts
        for (char c : str2.toCharArray()) {
            if (!charCount.containsKey(c) || charCount.get(c) == 0) {
                return false;
            }
            charCount.put(c, charCount.get(c) - 1);
        }

        return true;
    }
}
