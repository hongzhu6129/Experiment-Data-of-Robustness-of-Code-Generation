import java.util.*;

public class LongestPalindromicSubstring {

    public static String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        int start = 0;
        int end = 0;
        int maxLen = 1;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int max = Math.max(len1, len2);

            if (max > maxLen) {
                maxLen = max;
                start = i - (maxLen - 1) / 2;
                end = i + maxLen / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return right - left - 1;
    }

    public static void main(String[] args) {
        String s = "babad";
        String result = longestPalindrome(s);
        System.out.println(result); // Output: "bab"

        s = "cbbd";
        result = longestPalindrome(s);
        System.out.println(result); // Output: "bb"

        s = "a";
        result = longestPalindrome(s);
        System.out.println(result); // Output: "a"

        s = "ac";
        result = longestPalindrome(s);
        System.out.println(result); // Output: "a"

        s = "";
        result = longestPalindrome(s);
        System.out.println(result); // Output: ""

        s = "null";
        result = longestPalindrome(s);
        System.out.println(result); // Output: ""
    }
}
