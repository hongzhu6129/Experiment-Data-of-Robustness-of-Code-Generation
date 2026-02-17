class Solution {
    /**
     * Checks if a prefix string created using the first 'n' characters of a given string
     * appears somewhere else in the string.
     *
     * @param str The input string.
     * @param n   The number of characters to use for the prefix.
     * @return True if the prefix appears elsewhere in the string, false otherwise.
     */
    public boolean nChrStringSomewhere(String str, int n) {
        if (str == null || str.length() <= n) {
            return false; // Prefix can't appear elsewhere if string is too short
        }

        String prefix = str.substring(0, n);
        for (int i = n; i <= str.length() - n; i++) {  // Start checking from after the prefix
            if (str.substring(i, i + n).equals(prefix)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println("abxabxab: " + solution.nChrStringSomewhere("abxabxab", 2)); // True (ab appears again)
        System.out.println("abcdabcd: " + solution.nChrStringSomewhere("abcdabcd", 4)); // True (abcd appears again)
        System.out.println("abcdabcd: " + solution.nChrStringSomewhere("abcdabcd", 1)); // True (a appears again)


        System.out.println("abcdefgh: " + solution.nChrStringSomewhere("abcdefgh", 2)); // False
        System.out.println("aba: " + solution.nChrStringSomewhere("aba", 1)); // True (a appears again)

        System.out.println("ab: " + solution.nChrStringSomewhere("ab", 2)); // False (String is too short)
        System.out.println("a: " + solution.nChrStringSomewhere("a", 1));  // False  (String is too short)
        System.out.println(solution.nChrStringSomewhere(null, 1));        // False (Handles null string gracefully)



    }
}
