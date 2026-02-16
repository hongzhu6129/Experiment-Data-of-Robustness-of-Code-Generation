class Solution {
    /**
     * Reverses a string using recursion.
     *
     * @param str The string to reverse.
     */
    void reverseString(String str) {
        if (str == null || str.length() <= 1) {
            System.out.print(str); // Base case: empty or single-char string
            return;
        }

        // Recursive step:
        reverseString(str.substring(1)); // Reverse the rest of the string
        System.out.print(str.charAt(0)); // Print the first character last
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        solution.reverseString("hello");    // Output: olleh
        System.out.println();

        solution.reverseString("world");   // Output: dlrow
        System.out.println();

        solution.reverseString("");        // Output: 
        System.out.println();

        solution.reverseString(null);     // Output: null
        System.out.println();  // Just to make the last null output visible
    }
}
