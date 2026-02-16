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
        String s1 = "abcabcbb";
        longestSubstring(s1); // Output: 3

        String s2 = "bbbbb";
        longestSubstring(s2); // Output: 1

        String s3 = "pwwkew";
        longestSubstring(s3); // Output: 3

        String s4 = "";
        longestSubstring(s4); // Output: 0

        String s5 = "dvdf";
        longestSubstring(s5);// Output: 3


    }
}
