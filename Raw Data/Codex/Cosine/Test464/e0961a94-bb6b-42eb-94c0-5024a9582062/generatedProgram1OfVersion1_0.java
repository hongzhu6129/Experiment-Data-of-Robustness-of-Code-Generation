class Solution {
    /**
     * Checks if a string is pq-balanced. A string is pq-balanced if it contains
     * at least one 'q' directly after each 'p'. A 'q' before a 'p' invalidates
     * pq-balance.
     *
     * @param str The string to check.
     * @return True if the string is pq-balanced, false otherwise.
     */
    public boolean pqBalanceString(String str) {
        if (str == null || str.isEmpty()) {
            return true; // Empty string is considered balanced
        }

        boolean pFound = false;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'p') {
                pFound = true;
                if (i + 1 >= str.length() || str.charAt(i + 1) != 'q') {
                    return false; 
                }
                i++; // Skip the 'q' since we've already processed it
            } else if (c == 'q' && !pFound) {
                return false; // 'q' before any 'p' is invalid
            } // other chars are ignored

        }

        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.pqBalanceString("pq")); // true
        System.out.println(solution.pqBalanceString("ppqq")); // true
        System.out.println(solution.pqBalanceString("pqq")); // true
        System.out.println(solution.pqBalanceString("prq")); // false
        System.out.println(solution.pqBalanceString("qp")); // false
        System.out.println(solution.pqBalanceString("p")); // false
        System.out.println(solution.pqBalanceString("q")); // true (no 'p', so considered balanced)
        System.out.println(solution.pqBalanceString("")); // true (empty string is balanced)
        System.out.println(solution.pqBalanceString("ppq")); // false
        System.out.println(solution.pqBalanceString("ppqp")); //false


    }
}
