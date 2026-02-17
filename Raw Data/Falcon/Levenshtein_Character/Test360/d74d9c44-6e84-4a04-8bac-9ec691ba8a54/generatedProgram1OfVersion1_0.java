class Solution {
    /**
     * Checks if the substring "abc" appears in the middle of the given string.
     *
     * @param str The string to check.
     * @return True if "abc" is in the middle, false otherwise.
     */
    public boolean abcInMiddle(String str) {
        if (str == null || str.length() < 3) {
            return false;
        }

        int middleIndex = str.length() / 2;

        // Check if "abc" starts at the middle index or slightly before 
        // (depending on whether string length is even or odd)
        if (str.length() % 2 == 0) {
            return str.startsWith("abc", middleIndex - 1); 
        } else {
            return str.startsWith("abc", middleIndex);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.abcInMiddle("xxabcxx")); // True
        System.out.println(solution.abcInMiddle("xabcyy"));   // False
        System.out.println(solution.abcInMiddle("xabcc"));   // True
        System.out.println(solution.abcInMiddle("abc"));     // True
        System.out.println(solution.abcInMiddle("ab"));      // False
        System.out.println(solution.abcInMiddle("a"));       // False
        System.out.println(solution.abcInMiddle(null));      // False
        System.out.println(solution.abcInMiddle("123abc4567")); // False
        System.out.println(solution.abcInMiddle("1234abc5678")); // True



    }
}
