class Solution {
    /**
     * Removes the first two characters of a string if one or both are equal to 'o'.
     *
     * @param str The input string.
     * @return The modified string.
     */
    public String exceptTwoO(String str) {
        if (str == null || str.length() < 2) {
            return str;
        }

        if (str.charAt(0) == 'o' || str.charAt(1) == 'o') {
            return str.substring(2);
        }

        return str;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.exceptTwoO("oracle")); // Output: acle
        System.out.println(solution.exceptTwoO("foo"));   // Output: o
        System.out.println(solution.exceptTwoO("bar"));   // Output: bar
        System.out.println(solution.exceptTwoO("o"));     // Output: o
        System.out.println(solution.exceptTwoO(""));      // Output: 
        System.out.println(solution.exceptTwoO(null));    // Output: null


    }
}
