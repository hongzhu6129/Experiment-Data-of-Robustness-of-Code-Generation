import java.util.HashMap;

public class StringLetterCheck {

    public static void main(String[] args) {
        System.out.println(test("abcde", "cab")); // True
        System.out.println(test("abcde", "cabd")); // True
        System.out.println(test("abcde", "cabf")); // False
        System.out.println(test("abcde", "cabdx")); // False
        System.out.println(test("abcde", "Aabc")); // False because 'A' is different from 'a'
        System.out.println(test("", "")); // True - Empty string can be formed from empty string
        System.out.println(test("abc", ""));  // True - Empty string can be formed from any string
        System.out.println(test("", "a")); // False -  Non-empty string cannot be formed from an empty string.


    }

    public static boolean test(String s1, String s2) {
        if (s2.length() == 0) {
            return true; // Empty s2 can always be formed from s1
        }
        if (s1.length() == 0 && s2.length() > 0) {
            return false; // Non-empty s2 cannot be formed from empty s1
        }


        HashMap<Character, Integer> charCounts = new HashMap<>();
        for (char c : s1.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        for (char c : s2.toCharArray()) {
            if (!charCounts.containsKey(c) || charCounts.get(c) == 0) {
                return false;
            }
            charCounts.put(c, charCounts.get(c) - 1);
        }

        return true;
    }
}
