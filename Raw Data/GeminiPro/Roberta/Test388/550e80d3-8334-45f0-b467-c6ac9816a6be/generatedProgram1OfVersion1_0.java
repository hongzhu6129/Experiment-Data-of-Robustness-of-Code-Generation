class Solution {

    /**
     * Checks if either of two given strings appears at the end of the other string (case-insensitive).
     *
     * @param str1 The first string.
     * @param str2 The second string.
     * @return True if either string appears at the end of the other (case-insensitive), false otherwise.
     */
    public boolean anyStringAtEnd(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        }

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        return str1.endsWith(str2) || str2.endsWith(str1);
    }


    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        System.out.println(solution.anyStringAtEnd("Hiabc", "abc")); // True
        System.out.println(solution.anyStringAtEnd("AbC", "Hiabc")); // False
        System.out.println(solution.anyStringAtEnd("abc", "ABC"));  // True
        System.out.println(solution.anyStringAtEnd("abcXYZ", "xyz")); // True
        System.out.println(solution.anyStringAtEnd(null, "abc")); // False
        System.out.println(solution.anyStringAtEnd("abc", null)); // False
        System.out.println(solution.anyStringAtEnd("", "abc")); // False
        System.out.println(solution.anyStringAtEnd("abc","")); //True

    }
}
