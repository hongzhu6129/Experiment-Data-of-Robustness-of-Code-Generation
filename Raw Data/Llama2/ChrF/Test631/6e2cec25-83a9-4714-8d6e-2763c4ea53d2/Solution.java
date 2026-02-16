class Solution {
    /**
     * Given two integers, return true if either is 15 or if their sum or difference is 15.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return True if either is 15 or if their sum or difference is 15, false otherwise.
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
        // Test cases
        System.out.println(calculate(10, 5)); // True (difference is 5)
        System.out.println(calculate(15, 10)); // True (a is 15)
        System.out.println(calculate(7, 8)); // True (sum is 15)
        System.out.println(calculate(1, 2)); // False
        System.out.println(calculate(25, 10)); // True (difference is 15)

    }
}
