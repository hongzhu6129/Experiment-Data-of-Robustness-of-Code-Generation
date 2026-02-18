class Solution {
    /**
     * Gets the first occurrence (position starts from 0) of a string (needle) within a given string (haystack).
     *
     * @param haystack The string to search within.
     * @param needle   The string to search for.
     * @return The index of the first occurrence of needle within haystack, or -1 if needle is not found or if needle is empty.
     */
    public int strStr(String haystack, String needle) {
        if (needle == null || needle.isEmpty()) {
            return 0; // Or -1, depending on the desired behavior for an empty needle
        }

        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String haystack1 = "hello";
        String needle1 = "ll";
        int index1 = solution.strStr(haystack1, needle1);
        System.out.println("Index of '" + needle1 + "' in '" + haystack1 + "': " + index1); // Output: 2


        String haystack2 = "aaaaa";
        String needle2 = "bba";
        int index2 = solution.strStr(haystack2, needle2);
        System.out.println("Index of '" + needle2 + "' in '" + haystack2 + "': " + index2); // Output: -1

        String haystack3 = "aaaaa";
        String needle3 = "";
        int index3 = solution.strStr(haystack3, needle3);
        System.out.println("Index of '" + needle3 + "' in '" + haystack3 + "': " + index3); // Output: 0

        String haystack4 = "mississippi";
        String needle4 = "issip";
        int index4 = solution.strStr(haystack4, needle4);
        System.out.println("Index of '" + needle4 + "' in '" + haystack4 + "': " + index4); // Output: 4
    }
}
