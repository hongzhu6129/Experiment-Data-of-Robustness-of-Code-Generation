import java.util.*;

class Solution {

    private String longestPalindromicSubstring;
    private int start;
    private int end;
    private int maxLength;

    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return s;
        }

        maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            expandAroundCenter(s, i, i);
            expandAroundCenter(s, i, i + 1);
        }

        return s.substring(start, end + 1);
    }

    private void expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        if (right - left - 1 > maxLength) {
            maxLength = right - left - 1;
            start = left + 1;
            end = right - 1;
        }
    }
}
