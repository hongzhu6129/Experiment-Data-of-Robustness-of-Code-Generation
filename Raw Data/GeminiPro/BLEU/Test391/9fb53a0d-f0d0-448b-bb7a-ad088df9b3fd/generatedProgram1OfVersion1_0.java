class Solution {
    /**
     * Checks if a prefix string created using the first 'n' characters of a given string
     * appears somewhere else in the string (excluding the prefix itself).
     *
     * @param str The input string.
     * @param n   The number of characters to use for the prefix.
     * @return True if the prefix appears elsewhere in the string, false otherwise.
     */
    public boolean nChrStringSomewhere(String str, int n) {
        if (str == null || str.length() <= n) {
            return false; // Prefix cannot appear elsewhere if string is too short.
        }

        String prefix = str.substring(0, n);
        String remainingString = str.substring(n);

        return remainingString.contains(prefix);
    }


    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.nChrStringSomewhere("abababc", 3)); // Output: true (aba appears later)
        System.out.println(solution.nChrStringSomewhere("abcabcd", 2)); // Output: false (ab doesn't appear later)
        System.out.println(solution.nChrStringSomewhere("abxyabxy", 3)); // Output: false (abx doesn't appear later)
        System.out.println(solution.nChrStringSomewhere("xx", 1));      // Output: true (x appears later)
        System.out.println(solution.nChrStringSomewhere("xxxx", 1));     // Output: true (x appears later)
        System.out.println(solution.nChrStringSomewhere("abc", 4));     // Output: false (String too short)
        System.out.println(solution.nChrStringSomewhere(null, 2));     // Output: false (Null string)



    }
}
