class Solution {
    /**
     * Appends two strings, omitting one character if the concatenation creates double characters.
     *
     * @param s1 The first string.
     * @param s2 The second string.
     * @return The concatenated string with duplicate characters at the join removed.
     */
    public String conCat(String s1, String s2) {
        if (s1 == null || s2 == null) {
            return (s1 == null) ? s2 : s1; // Handle null inputs gracefully
        }

        if (s1.isEmpty()) {
            return s2;
        }

        if (s2.isEmpty()) {
            return s1;
        }

        if (s1.charAt(s1.length() - 1) == s2.charAt(0)) {
            return s1 + s2.substring(1);
        } else {
            return s1 + s2;
        }
    }


    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        System.out.println(solution.conCat("abc", "cat")); // Output: abcat
        System.out.println(solution.conCat("dog", "gopher")); // Output: dogopher
        System.out.println(solution.conCat("abc", ""));  // Output: abc
        System.out.println(solution.conCat("", "cat"));   // Output: cat
        System.out.println(solution.conCat(null, "cat")); // Output: cat
        System.out.println(solution.conCat("abc", null)); // Output: abc
        System.out.println(solution.conCat(null, null));  // Output: null

    }
}
