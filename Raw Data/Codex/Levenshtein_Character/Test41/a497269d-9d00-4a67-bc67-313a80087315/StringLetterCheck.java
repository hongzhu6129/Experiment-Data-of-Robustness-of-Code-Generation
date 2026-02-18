import java.util.HashMap;
import java.util.Map;

public class StringLetterCheck {

    public static void main(String[] args) {
        System.out.println(test("programming", "program")); // true
        System.out.println(test("programming", "Programming")); // false (case-sensitive)
        System.out.println(test("aabbcc", "abc")); // true
        System.out.println(test("abc", "abcc")); // false
        System.out.println(test(" ", "")); // true
        System.out.println(test("a", "A")); // false
        System.out.println(test("AbCd", "AabCcdd"));  // false
    }


    public static boolean test(String str1, String str2) {
        Map<Character, Integer> charCounts1 = new HashMap<>();

        // Count character frequencies in str1
        for (char c : str1.toCharArray()) {
            charCounts1.put(c, charCounts1.getOrDefault(c, 0) + 1);
        }

        // Check if characters in str2 are present in str1 with sufficient counts
        for (char c : str2.toCharArray()) {
            if (!charCounts1.containsKey(c) || charCounts1.get(c) == 0) {
                return false; // Character not found or count is insufficient
            }
            charCounts1.put(c, charCounts1.get(c) - 1); // Decrement count
        }

        return true; // All characters in str2 are present in str1
    }
}
