class Solution {
    /**
     * Checks if the first two characters of a string appear at the end of the same string.
     *
     * @param str The input string.
     * @return True if the first two characters appear at the end, false otherwise.
     */
    public boolean firstInLast(String str) {
        if (str == null || str.length() < 2) {
            return false; // Not enough characters for comparison
        }

        String firstTwo = str.substring(0, 2);
        String lastTwo = str.substring(str.length() - 2);

        return firstTwo.equals(lastTwo);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] testStrings = {
                "edited",  // True
                "edit",    // False
                "ed",      // True
                "e",       // False
                "",        // False
                "abcdefab", // False
                "xyxyzxy",   // True
                null
        };


        for (String str : testStrings) {
            boolean result = solution.firstInLast(str);
            System.out.println("String: \"" + str + "\" - Result: " + result);
        }

    }
}
