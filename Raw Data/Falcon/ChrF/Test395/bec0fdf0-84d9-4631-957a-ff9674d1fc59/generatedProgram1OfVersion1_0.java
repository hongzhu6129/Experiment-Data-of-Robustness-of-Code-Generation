class Solution {
    /**
     * Counts the number of digits in a non-negative integer.
     *
     * @param n The non-negative integer.
     * @return The number of digits in n.
     */
    public static int test(int n) {
        if (n == 0) {
            return 1; // Special case: 0 has one digit
        }

        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }


    public static void main(String[] args) {
        int num1 = 12345;
        int num2 = 0;
        int num3 = 2;


        System.out.println("Number of digits in " + num1 + ": " + test(num1)); // Output: 5
        System.out.println("Number of digits in " + num2 + ": " + test(num2)); // Output: 1
        System.out.println("Number of digits in " + num3 + ": " + test(num3)); // Output: 1
    }
}
