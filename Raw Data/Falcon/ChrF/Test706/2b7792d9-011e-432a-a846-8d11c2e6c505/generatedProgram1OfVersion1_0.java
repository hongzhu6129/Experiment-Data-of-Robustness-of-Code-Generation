class Solution {
    /**
     * Given a string, return the string without the first or last characters if they are the same,
     * otherwise return the string without the characters.
     *
     * @param str The input string.
     * @return The modified string.
     */
    public String excludeT(String str) {
        if (str == null || str.length() <= 1) {
            return "";
        }

        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length() - 1);

        if (firstChar == lastChar) {
            return str.substring(1, str.length() - 1);
        } else {
           return "";
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.excludeT("aba"));    // Output: b
        System.out.println(solution.excludeT("abc"));    // Output: ""
        System.out.println(solution.excludeT("a"));     // Output: ""
        System.out.println(solution.excludeT(""));      // Output: ""
        System.out.println(solution.excludeT("abca"));  // Output: bc
        System.out.println(solution.excludeT("abbaa")); // Output: bba
        System.out.println(solution.excludeT(null));   // Output: ""


    }
}
