import java.util.*;

class Solution {
    /**
     * Find all interleavings of two strings.
     *
     * @param s1 the first string
     * @param s2 the second string
     * @return a list of all interleavings of s1 and s2
     */
    public static List<String> interleave(String s1, String s2) {
        List<String> result = new ArrayList<>();
        if (s1.length() == 0) {
            result.add(s2);
        } else if (s2.length() == 0) {
            result.add(s1);
        } else {
            for (int i = 0; i < s1.length(); i++) {
                for (String s : interleave(s1.substring(i + 1), s2)) {
                    result.add(s1.charAt(i) + s);
                }
            }
            for (int i = 0; i < s2.length(); i++) {
                for (String s : interleave(s1, s2.substring(i + 1))) {
                    result.add(s2.charAt(i) + s);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(interleave("ab", "cd")); // [abcd, acbd, cabd, cadb]
        System.out.println(interleave("abc", "def")); // [abcdef, adbcef, adcbef, abdecf, abdefc, acdbef, acdfbe, cadbef, cabdef, cdabfe, cdbafe, dcbafe]
        System.out.println(interleave("", "abc")); // [abc]
        System.out.println(interleave("abc", "")); // [abc]
        System.out.println(interleave("a", "b")); // [ab, ba]
        System.out.println(interleave("aa", "bb")); // [aabb, abab, baba, bbaa]
        System.out.println(interleave("aaa", "bbb")); // [aaabbb, aababb, aabbab, ababab, abbaab, babaab, baabab, bbaaba, bbbaba]
    }
}
