class Solution {
    /**
     * Given a string, return the string without the first and last characters if they are the same.
     * Otherwise, return the string without any characters removed.
     *
     * @param str The input string.
     * @return The modified string.
     */
    public String excludeT(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }

        char first = str.charAt(0);
        char last = str.charAt(str.length() - 1);

        if (first == last) {
            return str.substring(1, str.length() - 1);
        } else {
            return str;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.excludeT("aba"));   // Output: b
        System.out.println(solution.excludeT("abca"));  // Output: abca
        System.out.println(solution.excludeT("a"));     // Output: a
        System.out.println(solution.excludeT("ab"));    // Output: ab
        System.out.println(solution.excludeT(null));    // Output: null
        System.out.println(solution.excludeT(""));     // Output: 
        System.out.println(solution.excludeT("abcba")); // Output: bcb
    }
}
