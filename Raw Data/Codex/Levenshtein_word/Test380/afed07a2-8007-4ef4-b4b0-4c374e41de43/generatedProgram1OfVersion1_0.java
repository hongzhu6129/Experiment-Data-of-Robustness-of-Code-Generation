class Solution {
    /**
     * Checks if a prefix string created using the first n characters of a given string
     * appears somewhere else in the string.
     *
     * @param str The input string.
     * @param n   The number of characters to use for the prefix.
     * @return True if the prefix appears elsewhere in the string, false otherwise.
     */
    public boolean nChrStringSomewhere(String str, int n) {
        if (str == null || str.length() < n || n <= 0) {
            return false; 
        }

        String prefix = str.substring(0, n);
        // Search for the prefix from the (n+1)th character onwards
        return str.indexOf(prefix, n) != -1;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.nChrStringSomewhere("abababc", 2)); // true (ab appears again)
        System.out.println(solution.nChrStringSomewhere("abcabcabc", 3)); // true (abc appears again)
        System.out.println(solution.nChrStringSomewhere("abcdefgh", 3)); // false (abc doesn't appear again)
        System.out.println(solution.nChrStringSomewhere("abcab", 3)); // false (abc is at the end, not "somewhere else")

        System.out.println(solution.nChrStringSomewhere(null, 2)); // false
        System.out.println(solution.nChrStringSomewhere("abc", 4)); // false
        System.out.println(solution.nChrStringSomewhere("abc", 0)); // false
        System.out.println(solution.nChrStringSomewhere("abc", -1)); // false

        System.out.println(solution.nChrStringSomewhere("", 2)); // false

    }
}
