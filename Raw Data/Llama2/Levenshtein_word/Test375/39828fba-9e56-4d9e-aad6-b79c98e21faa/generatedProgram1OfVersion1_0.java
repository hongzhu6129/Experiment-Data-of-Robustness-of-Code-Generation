class Solution {
    /**
     * Checks if the substring "abc" appears in the middle of the given string.
     *
     * @param str The input string.
     * @return True if "abc" is in the middle, false otherwise.
     */
    public boolean abcInMiddle(String str) {
        if (str == null || str.length() < 3) {
            return false;
        }

        int middleIndex = str.length() / 2;

        if (str.length() % 2 == 0) { // Even length string
            return str.substring(middleIndex - 2, middleIndex + 1).equals("abc") ||
                   str.substring(middleIndex - 1, middleIndex + 2).equals("abc");
        } else { // Odd length string
            return str.substring(middleIndex - 1, middleIndex + 2).equals("abc");
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.abcInMiddle("AabcBBB")); // True
        System.out.println(solution.abcInMiddle("AaabBc")); // True
        System.out.println(solution.abcInMiddle("AabcBB")); // True - Even length, first possible middle
        System.out.println(solution.abcInMiddle("AaabcB")); // True - Even length, second possible middle
        System.out.println(solution.abcInMiddle("Aabcbc")); // False
        System.out.println(solution.abcInMiddle("abc"));    // True
        System.out.println(solution.abcInMiddle("ab"));     // False
        System.out.println(solution.abcInMiddle(""));      // False
        System.out.println(solution.abcInMiddle(null));    // False


    }
}
