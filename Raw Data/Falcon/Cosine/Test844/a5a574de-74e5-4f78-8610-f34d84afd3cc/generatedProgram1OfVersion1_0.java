class Solution {
    /**
     * Checks if the first two characters of a string also appear at the end of the string.
     *
     * @param str The input string.
     * @return True if the first two characters are the same as the last two, false otherwise.
     */
    public boolean firstInLast(String str) {
        if (str == null || str.length() < 2) {
            return false;  // Not enough characters for comparison
        }

        String firstTwo = str.substring(0, 2);
        String lastTwo = str.substring(str.length() - 2);

        return firstTwo.equals(lastTwo);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.firstInLast("edited")); // Output: true
        System.out.println(solution.firstInLast("edit"));   // Output: false
        System.out.println(solution.firstInLast("ed"));     // Output: true  (First two ARE the last two in this case)
        System.out.println(solution.firstInLast("e"));      // Output: false (String too short)
        System.out.println(solution.firstInLast(null));     // Output: false (Handles null input)


    }
}
