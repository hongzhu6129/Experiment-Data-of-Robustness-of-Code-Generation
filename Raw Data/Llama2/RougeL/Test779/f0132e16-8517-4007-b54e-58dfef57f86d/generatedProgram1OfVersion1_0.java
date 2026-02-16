class Solution {
    /**
     * Extracts the first digit from a positive or negative integer.
     *
     * @param n The integer to extract the first digit from.
     * @return The first digit of the integer.
     */
    public static int test(int n) {
        if (n == 0) {
            return 0;
        }

        n = Math.abs(n); // Handle negative numbers

        while (n >= 10) {
            n /= 10;
        }

        return n;
    }


    public static void main(String[] args) {
        System.out.println(test(123));   // Output: 1
        System.out.println(test(0));     // Output: 0
        System.out.println(test(-123));  // Output: 1
        System.out.println(test(7));     // Output: 7
        System.out.println(test(-7));    // Output: 7
        System.out.println(test(1000)); // Output: 1
        System.out.println(test(-1000));// Output:1

    }
}
