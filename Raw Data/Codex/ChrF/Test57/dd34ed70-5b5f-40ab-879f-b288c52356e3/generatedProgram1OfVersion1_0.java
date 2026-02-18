class Solution {
    /**
     * Gets the first occurrence (position starting from 0) of a substring within a given string.
     *
     * @param haystack The string to search within.
     * @param needle   The substring to search for.
     * @return The index of the first occurrence of the needle in the haystack, or -1 if not found.
     */
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0; 
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }

        return -1;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();

        String haystack1 = "hello";
        String needle1 = "ll";
        int result1 = solution.strStr(haystack1, needle1);
        System.out.println("Example 1: " + result1); // Output: 2

        String haystack2 = "aaaaa";
        String needle2 = "bba";
        int result2 = solution.strStr(haystack2, needle2);
        System.out.println("Example 2: " + result2); // Output: -1

        String haystack3 = "";
        String needle3 = "";
        int result3 = solution.strStr(haystack3, needle3);
        System.out.println("Example 3: " + result3); // Output: 0


        String haystack4 = "mississippi";
        String needle4 = "issip";
        int result4 = solution.strStr(haystack4, needle4);
        System.out.println("Example 4: " + result4); // Output: 4


    }
}
