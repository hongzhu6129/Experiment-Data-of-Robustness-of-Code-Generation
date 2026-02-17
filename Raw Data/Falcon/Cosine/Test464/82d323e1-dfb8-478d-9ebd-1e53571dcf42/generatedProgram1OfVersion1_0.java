class Solution {

    /**
     * Checks if a string has pq-balance, meaning it contains at least one 'q'
     * directly after each 'p'. A 'q' before a 'p' invalidates pq-balance.
     *
     * @param str The input string.
     * @return True if the string is pq-balanced, false otherwise.
     */
    public boolean pqBalanceString(String str) {
        if (str == null || str.isEmpty()) {
            return true; // Empty string is considered balanced
        }

        boolean pFound = false;
        boolean qFoundAfterP = false;

        for (char c : str.toCharArray()) {
            if (c == 'p') {
                if (qFoundAfterP) {
                    qFoundAfterP = false; // Reset for the next 'p'
                }
                pFound = true;
            } else if (c == 'q') {
                if (pFound) {
                    qFoundAfterP = true;
                    pFound = false; // Reset pFound after a corresponding 'q' is found
                } else {
                    return false; // 'q' before 'p' invalidates balance
                }
            }
        }

        return !pFound; // Check if any 'p' remains without a following 'q'
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] testCases = {
            "pq", "pqq", "pqqq", "ppqqq", "ppq", "qp", "pqp", "pqpq", "", "p", "q", "pqqppqq", "pqqppq"
        };
        for (String testCase : testCases) {
            boolean isBalanced = solution.pqBalanceString(testCase);
            System.out.println("\"" + testCase + "\" : " + isBalanced);
        }
    }
}
