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
        System.out.println(maxLength);  // Print the result
    }

    static boolean areDistinct(String str, int i, int j) {
        Set<Character> characters = new HashSet<>();

        for (int k = i; k <= j; k++) {
            char c = str.charAt(k);
            if (characters.contains(c)) {
                return false; // Found a repeating character
            }
            characters.add(c);
        }
        return true; // No repeating characters found
    }


    public static void main(String[] args) {
        String str = "abcabcbb";
        longestSubstring(str); // Output: 3

        str = "bbbbb";
        longestSubstring(str); // Output: 1

        str = "pwwkew";
        longestSubstring(str); // Output: 3

         str = "";
        longestSubstring(str); // Output: 0


        str = "dvdf";
        longestSubstring(str); // Output: 3
    }
}
