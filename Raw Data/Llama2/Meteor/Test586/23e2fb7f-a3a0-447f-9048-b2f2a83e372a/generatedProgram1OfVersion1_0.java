class Solution {
    /**
     * Given two integers, return true if either one is 15 or if their sum or difference is 15.
     *
     * @param a First integer
     * @param b Second integer
     * @return True if either a or b is 15 or if their sum or difference is 15, false otherwise
     */
    public static boolean calculate(int a, int b) {
        if (a == 15 || b == 15) {
            return true;
        }

        if (a + b == 15 || Math.abs(a - b) == 15) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(calculate(10, 5)); // Output: true
        System.out.println(calculate(15, 10)); // Output: true
        System.out.println(calculate(10, 25)); // Output: true
        System.out.println(calculate(7, 8));  // Output: true
        System.out.println(calculate(10, 12)); // Output: false

    }
}
