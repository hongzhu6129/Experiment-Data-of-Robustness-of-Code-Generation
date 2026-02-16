class Solution {
    /**
     * Get the first occurrence (Position starts from 0.) of a string within a given string.
     *
     * @param haystack The string to search in.
     * @param needle   The string to search for.
     * @return The index of the first occurrence of the needle in the haystack, or -1 if the needle is not found.
     */
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String haystack1 = "hello";
        String needle1 = "ll";
        int result1 = solution.strStr(haystack1, needle1);
        System.out.println("Example 1: haystack = \"" + haystack1 + "\", needle = \"" + needle1 + "\"");
        System.out.println("Output: " + result1); // Output: 2

        String haystack2 = "aaaaa";
        String needle2 = "bba";
        int result2 = solution.strStr(haystack2, needle2);
        System.out.println("Example 2: haystack = \"" + haystack2 + "\", needle = \"" + needle2 + "\"");
        System.out.println("Output: " + result2); // Output: -1


        String haystack3 = "";
        String needle3 = "";
        int result3 = solution.strStr(haystack3, needle3);
        System.out.println("Example 3: haystack = \"" + haystack3 + "\", needle = \"" + needle3 + "\"");
        System.out.println("Output: " + result3); // Output: 0 (Empty string is considered a substring of itself at position 0)

        String haystack4 = "mississippi";
        String needle4 = "issip";
        int result4 = solution.strStr(haystack4, needle4);
        System.out.println("Example 4: haystack = \"" + haystack4 + "\", needle = \"" + needle4 + "\"");
        System.out.println("Output: " + result4); // Output: 4
        
    }
}
