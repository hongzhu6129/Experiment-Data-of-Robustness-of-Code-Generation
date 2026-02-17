import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

    static void longestSubstring(String str) {
        int n = str.length();
        int maxLength = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (areDistinct(str, i, j)) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }

        System.out.println(maxLength); 
    }

    static boolean areDistinct(String str, int i, int j) {
        Set<Character> chars = new HashSet<>();

        for (int k = i; k <= j; k++) {
            if (chars.contains(str.charAt(k))) {
                return false;
            }
            chars.add(str.charAt(k));
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "abcabcbb"; // Example 1
        longestSubstring(str);  // Output: 3

        str = "bbbbb"; // Example 2
        longestSubstring(str); // Output: 1

        str = "pwwkew"; // Example 3
        longestSubstring(str); // Output: 3

        str = ""; // Empty string
        longestSubstring(str); // Output: 0

        str = "dvdf"; // Example with repeating later
        longestSubstring(str);  // Output: 3

        str =  "au"; // Example with two distinct
        longestSubstring(str);  // Output: 2




    }
}
