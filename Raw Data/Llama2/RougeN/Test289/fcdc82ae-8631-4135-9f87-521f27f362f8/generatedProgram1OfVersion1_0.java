class Solution {
    /**
     * Checks if a given number is a perfect square.
     *
     * @param n The number to check.
     * @return True if n is a perfect square, false otherwise.
     */
    static boolean isPerfectSquare(int n) {
        if (n < 0) return false;
        int root = (int) Math.sqrt(n);
        return root * root == n;
    }

    /**
     * Checks if a given number is a Fibonacci number.
     * A number is Fibonacci if and only if one or both of (5*n^2 + 4) or (5*n^2 � 4) is a perfect square.
     *
     * @param n The number to check.
     * @return True if n is a Fibonacci number, false otherwise.
     */
    static boolean isFibonacci(int n) {
        if (n < 0) return false; // Fibonacci numbers are non-negative
        return isPerfectSquare(5 * n * n + 4) || isPerfectSquare(5 * n * n - 4);
    }

    /**
     * Main method to demonstrate the isFibonacci function.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 13;
        int num3 = 7;

        System.out.println(num1 + " is a Fibonacci number: " + isFibonacci(num1)); // Output: true
        System.out.println(num2 + " is a Fibonacci number: " + isFibonacci(num2)); // Output: true
        System.out.println(num3 + " is a Fibonacci number: " + isFibonacci(num3)); // Output: false


        // Test cases for edge conditions.
        System.out.println(0 + " is a Fibonacci number: " + isFibonacci(0)); // Output: true
        System.out.println(1 + " is a Fibonacci number: " + isFibonacci(1)); // Output: true
        System.out.println(-1 + " is a Fibonacci number: " + isFibonacci(-1)); // Output: false

    }
}

