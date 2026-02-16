class Solution {
    /**
     * Reverses a string using recursion.
     *
     * @param str The string to reverse.
     */
    void reverseString(String str) {
        if (str == null || str.length() <= 1) {
            System.out.print(str);
            return; 
        }

        reverseString(str.substring(1));
        System.out.print(str.charAt(0));
    }


    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        solution.reverseString("hello");    // Output: olleh
        System.out.println();
        solution.reverseString("world");  // Output: dlrow
        System.out.println();
        solution.reverseString("");       // Output: 
        System.out.println();
        solution.reverseString("a");      // Output: a
        System.out.println();
        solution.reverseString(null);     // Output: null


    }
}
