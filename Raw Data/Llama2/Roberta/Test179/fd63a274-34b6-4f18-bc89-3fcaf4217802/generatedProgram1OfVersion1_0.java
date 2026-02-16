class Solution {
    /**
     * Checks if the first two characters of a string are present at the end of the string.
     *
     * @param str The input string.
     * @return True if the first two characters are at the end, false otherwise.
     */
    public boolean firstInLast(String str) {
        if (str == null || str.length() < 2) {
            return false;
        }

        String firstTwo = str.substring(0, 2);
        String lastTwo = str.substring(str.length() - 2);

        return firstTwo.equals(lastTwo);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println("For \"edited\": " + solution.firstInLast("edited")); // Output: true
        System.out.println("For \"ed\": " + solution.firstInLast("ed")); // Output: true
        System.out.println("For \"edit\": " + solution.firstInLast("edit")); // Output: false
        System.out.println("For \"e\": " + solution.firstInLast("e")); // Output: false
        System.out.println("For \"\": " + solution.firstInLast("")); // Output: false
        System.out.println("For null: " + solution.firstInLast(null)); // Output: false

    }
}
