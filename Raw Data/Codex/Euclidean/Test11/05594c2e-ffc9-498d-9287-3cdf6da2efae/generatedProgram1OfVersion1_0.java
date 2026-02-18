class Solution {
    /**
     * Given an integer, display all of its factors that are multiples of 3.
     *
     * @param n The input integer.
     */
    public static void test(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        test(30); // Example usage
        System.out.println(); // Add a newline for clarity
        test(45); // Another example usage
    }
}
