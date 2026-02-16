import java.util.*;
import java.lang.*;

class Solution {
    /**
     * Given a string, return the longest substring that contains only the applicable characters sequence.
     *
     * @param str The string to search.
     * @return The longest substring that contains only the applicable characters sequence.
     */
    public String longestSubstring(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }

        int[] charCount = new int[256];
        int start = 0;
        int end = 0;
        int maxLen = 0;
        int startIndex = 0;

        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;

            while (charCount[str.charAt(i)] > 1) {
                charCount[str.charAt(start)]--;
                start++;
            }

            if (i - start + 1 > maxLen) {
                maxLen = i - start + 1;
                startIndex = start;
            }
        }

        return str.substring(startIndex, startIndex + maxLen);
    }
}
