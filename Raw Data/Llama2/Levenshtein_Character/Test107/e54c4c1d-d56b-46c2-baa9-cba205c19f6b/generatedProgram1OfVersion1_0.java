class Solution {
    /**
     * Displays the factors of a given integer.
     *
     * @param n The integer whose factors are to be displayed.
     */
    public static void test(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Add a newline for better formatting
    }

    public static void main(String[] args) {
        test(12); // Example usage: displays factors of 12
        test(30); // Example usage: displays factors of 30
        test(3);  // Example usage: displays factors of 3
    }
}
