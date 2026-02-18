import java.util.HashMap;
import java.util.Map;

public class StringLetterCheck {

    public static void main(String[] args) {
        System.out.println(test("programming", "program")); // true
        System.out.println(test("programming", "Programming")); // false 
        System.out.println(test("abc", "abcd")); // false
        System.out.println(test("aabbcc", "abc")); // true
        System.out.println(test("aabbcc", "abbc")); // true
        System.out.println(test("", "")); // true
        System.out.println(test("a", "")); // true
        System.out.println(test("", "a")); // false
    }

    public static boolean test(String str1, String str2) {
        if (str2.length() > str1.length()) {
            return false;
        }

        Map<Character, Integer> charCounts1 = new HashMap<>();
        for (char c : str1.toCharArray()) {
            charCounts1.put(c, charCounts1.getOrDefault(c, 0) + 1);
        }

        for (char c : str2.toCharArray()) {
            if (!charCounts1.containsKey(c) || charCounts1.get(c) == 0) {
                return false;
            }
            charCounts1.put(c, charCounts1.get(c) - 1);
        }

        return true;
    }
}
