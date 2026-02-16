class Solution {
    /**
     * Given an integer, display the factors of 3 in it.
     * For example:
     * If the integer is 9, then the output should be 3 x 3 = 9
     * If the integer is 12, then the output should be "No factors of 3"
     * If the integer is 27, then the output should be 3 x 3 x 3 = 27
     *
     * @param n The input integer
     */
    public static void test(int n) {
        if (n <= 0) {
            System.out.println("No factors of 3");
            return;
        }

        StringBuilder factors = new StringBuilder();
        int count = 0;
        while (n % 3 == 0) {
            factors.append("3 x ");
            n /= 3;
            count++;
        }

        if (count == 0) {
            System.out.println("No factors of 3");
        } else {
            factors.delete(factors.length() - 3, factors.length()); // Remove the last " x "
            factors.append(" = ").append(n * (int) Math.pow(3, count)); // Show original value
            System.out.println(factors.toString());
        }
    }


    public static void main(String[] args) {
        test(9);  // Output: 3 x 3 = 9
        test(12); // Output: No factors of 3
        test(27); // Output: 3 x 3 x 3 = 27
        test(1); // Output: No factors of 3
        test(0); // Output: No factors of 3
        test(81); // Output: 3 x 3 x 3 x 3 = 81
        test(18); // Output: 3 x 3 = 18



    }
}
