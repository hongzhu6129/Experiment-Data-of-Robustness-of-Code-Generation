class Solution {
    /**
     * Checks if the string "good" appears at index 0 or 1 in the given string.
     *
     * @param str The input string.
     * @return True if "good" appears at index 0 or 1, false otherwise.
     */
    public boolean hasGood(String str) {
        if (str == null || str.length() < 4) {
            return false;
        }

        if (str.startsWith("good")) {
            return true;
        }

        if (str.length() >= 5 && str.startsWith("g", 1) && str.startsWith("o", 2) && str.startsWith("o", 3) && str.startsWith("d", 4)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.hasGood("gooddog"));  // Output: true
        System.out.println(solution.hasGood("ggooddog")); // Output: true
        System.out.println(solution.hasGood("doggood")); // Output: false
        System.out.println(solution.hasGood("good"));   // Output: true
        System.out.println(solution.hasGood("goo"));    // Output: false
        System.out.println(solution.hasGood("god"));    // Output: false
        System.out.println(solution.hasGood(null)); // Output: false
        System.out.println(solution.hasGood("")); // Output: false
        System.out.println(solution.hasGood("xgood")); // Output: false

    }
}
