class Solution {
    /**
     * Checks if the substring "abc" appears in the middle of the given string.
     *
     * @param str The input string.
     * @return True if "abc" appears in the middle, false otherwise.
     */
    public boolean abcInMiddle(String str) {
        if (str == null || str.length() < 3) {
            return false;
        }

        int midIndex = str.length() / 2;

        if (str.length() % 2 == 0) { // Even length string
            return str.substring(midIndex - 2, midIndex + 1).equals("abc") ||
                   str.substring(midIndex - 1, midIndex + 2).equals("abc");
        } else { // Odd length string
            return str.substring(midIndex - 1, midIndex + 2).equals("abc");
        }
    }



    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        System.out.println(solution.abcInMiddle("xxabcxx")); // true
        System.out.println(solution.abcInMiddle("xabcabc")); // false - "abc" is at beginning and in the middle overlapping
        System.out.println(solution.abcInMiddle("xabbcxx")); // false
        System.out.println(solution.abcInMiddle("xxxxxabc")); // false - at the end
        System.out.println(solution.abcInMiddle("abcabcabc")); // true
        System.out.println(solution.abcInMiddle("abc")); // true - For strings of length 3, the whole string is the middle
         System.out.println(solution.abcInMiddle("ab")); // false
         System.out.println(solution.abcInMiddle("xab")); // false
        System.out.println(solution.abcInMiddle("xabcy")); // true
        System.out.println(solution.abcInMiddle("xabcxy")); // true - for even length,  check both potential middle sections
        System.out.println(solution.abcInMiddle("xabycxx")); // false


    }
}
