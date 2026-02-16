class Solution {
    /**
     * Checks if either of the two integers is 15, or if their sum or absolute difference is 15.
     *
     * @param x The first integer.
     * @param y The second integer.
     * @return True if either x or y is 15, or if their sum or absolute difference is 15; otherwise, false.
     */
    public static boolean calculate(int x, int y) {
        if (x == 15 || y == 15) {
            return true;
        }
        if (x + y == 15) {
            return true;
        }
        if (Math.abs(x - y) == 15) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        // Example usage:
        System.out.println(calculate(10, 5));   // Output: true (difference is 5)
        System.out.println(calculate(15, 5));   // Output: true (x is 15)
        System.out.println(calculate(7, 8));    // Output: true (sum is 15)
        System.out.println(calculate(1, 14));   // Output: false
        System.out.println(calculate(25,-10)); // Output: true (difference is 35, the absolute difference is 15)
        System.out.println(calculate(-10, 25)); // Output: true (difference is -35, the absolute difference is 15)
    }
}
