class Solution {
    /**
     * Checks if either of the two integers is 15 or if their sum or difference is 15.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return True if either a or b is 15, or if their sum or absolute difference is 15, false otherwise.
     */
    public static boolean calculate(int a, int b) {
        return a == 15 || b == 15 || (a + b) == 15 || Math.abs(a - b) == 15;
    }

    /**
     * Main method to demonstrate the calculate method.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        System.out.println(calculate(10, 5));   // Output: true (difference is 5)
        System.out.println(calculate(10, 25));  // Output: false
        System.out.println(calculate(15, 5));   // Output: true (a is 15)
        System.out.println(calculate(7, 8));    // Output: true (sum is 15)
        System.out.println(calculate(22, 7));   // Output: true (difference is 15)
        System.out.println(calculate(0,15));    // Output: true (b is 15)

    }
}
