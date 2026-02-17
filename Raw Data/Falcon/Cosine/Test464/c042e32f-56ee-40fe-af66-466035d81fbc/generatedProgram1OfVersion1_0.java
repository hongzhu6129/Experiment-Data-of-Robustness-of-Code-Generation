class Solution {
    /**
     * Checks if a string has pq-balance. A string is pq-balanced if it contains
     * at least one 'q' directly after each 'p'. A 'q' before a 'p' invalidates
     * pq-balance.
     *
     * @param str The input string.
     * @return True if the string is pq-balanced, false otherwise.
     */
    public boolean pqBalanceString(String str) {
        boolean seenP = false;
        for (char c : str.toCharArray()) {
            if (c == 'p') {
                if (!seenP) {
                    seenP = true;
                }
            } else if (c == 'q') {
                if (!seenP) {
                    return false; // 'q' before 'p'
                }
                seenP = false; // Reset for the next 'p'
            }
        }
        return !seenP; // Ensure no dangling 'p'
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        String[] testCases = {
                "pq", "pqq", "pqqq", "ppqpq", "ppqqq", "qp", "pqp", "pqqqp", "p", "", "q", "qq", "paq", "pqaq"
        };
        boolean[] expectedOutputs = {
                true, true, true, true, true, false, false, true, false, true, false, true, false, true
        };

        for (int i = 0; i < testCases.length; i++) {
            String input = testCases[i];
            boolean expected = expectedOutputs[i];
            boolean actual = sol.pqBalanceString(input);

            if (actual == expected) {
                System.out.println("Test case " + (i + 1) + " passed: Input \"" + input + "\" Output: " + actual);
            } else {
                System.err.println("Test case " + (i + 1) + " failed: Input \"" + input + "\" Expected: " + expected + ", Actual: " + actual);
            }
        }


    }
}
