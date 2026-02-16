class Solution {
    /**
     * Given two integers, return true if either is 15 or would their sum or difference is 15.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return True if either is 15 or would their sum or difference is 15, false otherwise.
     */
    public static boolean calculate(int a, int b) {
        return a == 15 || b == 15 || a + b == 15 || Math.abs(a - b) == 15;
    }

    /**
     * Main method to demonstrate the calculate method.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        System.out.println(calculate(7, 8));  // Output: true
        System.out.println(calculate(10, 5)); // Output: true
        System.out.println(calculate(15, 12)); // Output: true
        System.out.println(calculate(1, 2));  // Output: false
    }
}
