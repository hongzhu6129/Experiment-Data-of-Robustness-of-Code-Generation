class Solution {
    /**
     * Given a nonzero integer, display the factors of 3 within it.
     * For example:
     * test(12) should print 3, 6, 9, 12
     * test(15) should print 3, 6, 9, 12, 15
     * test(-15) should print -3, -6, -9, -12, -15
     * test(5) should print 3
     * test(-4) should print -3
     *
     * @param n A nonzero integer
     */
    public static void test(int n) {
        int absN = Math.abs(n);
        int sign = n > 0 ? 1 : -1;

        int i = 3;
        while (i <= absN) {
            System.out.print(i * sign);
            if (i + 3 <= absN) {
                 System.out.print(", ");
            }
            i += 3;
        }

        System.out.println(); // Add a newline for cleaner output


    }

    public static void main(String[] args) {
        test(12);  // Output: 3, 6, 9, 12
        test(15);  // Output: 3, 6, 9, 12, 15
        test(-15); // Output: -3, -6, -9, -12, -15
        test(5);   // Output: 3
        test(-4);  // Output: -3
        test(2);  // Output: 
        test(-1); // Output:

    }
}
