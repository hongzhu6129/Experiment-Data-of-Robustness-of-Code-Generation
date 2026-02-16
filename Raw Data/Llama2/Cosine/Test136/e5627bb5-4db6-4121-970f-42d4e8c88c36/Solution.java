class Solution {
    /**
     * Checks if "good" appears at index 0 or 1 in the given string.
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

        if (str.length() >= 5 && str.substring(1).startsWith("good")) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.hasGood("gooddog")); // Output: true
        System.out.println(solution.hasGood("ggooddog")); // Output: true
        System.out.println(solution.hasGood("doggood")); // Output: false
        System.out.println(solution.hasGood("goo"));    // Output: false
        System.out.println(solution.hasGood(null));     // Output: false
        System.out.println(solution.hasGood("g"));     // Output: false

    }
}
