import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

    static void longestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int start = 0;
        int end = 0;

        Set<Character> charSet = new HashSet<>();

        while (end < n) {
            if (!charSet.contains(s.charAt(end))) {
                charSet.add(s.charAt(end));
                end++;
                maxLength = Math.max(maxLength, end - start);
            } else {
                charSet.remove(s.charAt(start));
                start++;
            }
        }

        System.out.println(maxLength);

    }

    public static void main(String[] args) {
        longestSubstring("abcabcbb"); // Output: 3
        longestSubstring("bbbbb");   // Output: 1
        longestSubstring("pwwkew");   // Output: 3
        longestSubstring("");        // Output: 0
        longestSubstring("dvdf");    // Output: 3


    }
}



