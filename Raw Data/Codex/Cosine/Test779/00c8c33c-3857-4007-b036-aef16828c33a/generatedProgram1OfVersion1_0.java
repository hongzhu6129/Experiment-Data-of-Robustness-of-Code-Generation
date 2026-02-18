class Solution {
    /**
     * Given a non-zero integer n, display the factors of 3 in n.
     * For example:
     * n = 12, output: 3
     * n = 18, output: 3, 3
     * n = 27, output: 3, 3, 3
     * n = 10, output: (no output)
     * @param n the non-zero integer
     */
    public static void test(int n) {
        while (n % 3 == 0) {
            System.out.print("3 ");
            n /= 3;
        }
        System.out.println(); // Add a newline for cleaner output
    }

    public static void main(String[] args) {
        test(12);
        test(18);
        test(27);
        test(10);
        test(81); // Additional test case
        test(1); // Additional test case (no factors of 3)
    }
}
