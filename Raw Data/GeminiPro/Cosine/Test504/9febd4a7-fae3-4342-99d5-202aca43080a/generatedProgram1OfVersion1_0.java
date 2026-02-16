class Solution {
    /**
     * Displays the factors of a given integer, part 3.
     *
     * This implementation focuses on clarity and efficiency, 
     * avoiding unnecessary calculations and improving readability.
     *
     * @param n The integer for which to find and display factors.
     */
    public static void test(int n) {
        if (n <= 0) {
            System.out.println("Factors are not defined for non-positive integers.");
            return;
        }


        System.out.print("Factors of " + n + " are: ");
        for (int i = 1; i * i <= n; i++) {  // Iterate up to the square root for efficiency
            if (n % i == 0) {
                System.out.print(i + " ");
                if (i * i != n) {  // Avoid duplicate output for perfect squares
                    System.out.print(n / i + " ");
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        test(12); // Example usage: Factors of 12 are: 1 12 2 6 3 4 
        test(10); // Example usage: Factors of 10 are: 1 10 2 5
        test(1); // Example usage: Factors of 1 are: 1
        test(0); // Example usage: Factors are not defined for non-positive integers.
        test(-5); // Example usage: Factors are not defined for non-positive integers.
    }
}
