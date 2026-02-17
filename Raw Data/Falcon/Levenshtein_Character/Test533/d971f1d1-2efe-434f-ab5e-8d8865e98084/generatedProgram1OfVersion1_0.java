class Solution {
    /**
     * Counts the number of integers from 1 to 'a' (inclusive) that do not contain the digit 7.
     *
     * @param a The upper limit of the range (inclusive).
     * @return The count of numbers without the digit 7.
     */
    static int count_nums_not_7(int a) {
        int count = 0;
        for (int i = 1; i <= a; i++) {
            if (!containsDigit7(i)) {
                count++;
            }
        }
        return count;
    }

    /**
     * Checks if a number contains the digit 7.
     *
     * @param n The number to check.
     * @return True if the number contains 7, false otherwise.
     */
    private static boolean containsDigit7(int n) {
        while (n > 0) {
            if (n % 10 == 7) {
                return true;
            }
            n /= 10;
        }
        return false;
    }

    /**
     * Main method for testing.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        System.out.println(count_nums_not_7(10)); // Output: 9
        System.out.println(count_nums_not_7(70)); // Output: 54  (Numbers like 7, 17, 27...67 are excluded, as is 70 itself)
        System.out.println(count_nums_not_7(100)); // Output: 81
    }
}
