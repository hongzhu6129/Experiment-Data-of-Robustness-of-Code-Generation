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

    /**
     * Main method to demonstrate the string reversal.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Solution solution = new Solution();
        String str = "hello";
        System.out.print("Original String: " + str + "\n");
        System.out.print("Reversed String: ");
        solution.reverseString(str); // Output: olleh
        System.out.println();


        str = "world";
        System.out.print("Original String: " + str + "\n");
        System.out.print("Reversed String: ");
        solution.reverseString(str); // Output: dlrow
        System.out.println();


         str = "a";
        System.out.print("Original String: " + str + "\n");
        System.out.print("Reversed String: ");
        solution.reverseString(str); // Output: a
        System.out.println();


        str = "";
        System.out.print("Original String: " + str + "\n");
        System.out.print("Reversed String: ");
        solution.reverseString(str); // Output: (empty string)
        System.out.println();

          str = null;  // Test with null
        System.out.print("Original String: " + str + "\n"); 
        System.out.print("Reversed String: ");
        solution.reverseString(str);  // Output: null (or nothing � depending on how you want to handle null)
        System.out.println(); 
    }
}
