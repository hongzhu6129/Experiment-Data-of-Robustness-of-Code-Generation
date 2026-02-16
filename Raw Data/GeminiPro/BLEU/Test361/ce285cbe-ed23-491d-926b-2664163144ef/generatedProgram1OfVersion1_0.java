class Solution {

    /**
     * Reverses a string using recursion.
     *
     * @param str The string to reverse.
     */
    void reverseString(String str) {
        if ((str == null) || (str.length() <= 1)) {
            System.out.print(str);
        } else {
            System.out.print(str.charAt(str.length() - 1));
            reverseString(str.substring(0, str.length() - 1));
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.reverseString("hello"); // Output: olleh
        System.out.println();
        solution.reverseString("world"); // Output: dlrow
        System.out.println();
        solution.reverseString(""); // Output: 
        System.out.println();
        solution.reverseString(null); // Output: null
        System.out.println();
        solution.reverseString("a"); // Output: a
    }
}
