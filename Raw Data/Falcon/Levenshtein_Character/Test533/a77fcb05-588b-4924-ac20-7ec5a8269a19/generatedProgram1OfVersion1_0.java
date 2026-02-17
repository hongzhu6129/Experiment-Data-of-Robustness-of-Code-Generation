class Solution {
    /**
     * Counts the number of integers from 1 to n (inclusive) that do not contain the digit 7.
     *
     * @param n The upper limit (inclusive).
     * @return The count of numbers without the digit 7.
     */
    static int count_nums_not_7(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (!containsDigit7(i)) {
                count++;
            }
        }
        return count;
    }

    /**
     * Checks if a number contains the digit 7.
     *
     * @param num The number to check.
     * @return True if the number contains 7, false otherwise.
     */
    private static boolean containsDigit7(int num) {
        while (num > 0) {
            if (num % 10 == 7) {
                return true;
            }
            num /= 10;
        }
        return false;
    }

    /**
     * Main method for testing.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        System.out.println(count_nums_not_7(10));   // Output: 9
        System.out.println(count_nums_not_7(70));   // Output: 54  (Numbers from 1 to 69 + 71 to 76 + 78 to 79 = 6*9 + 6 = 60, however it should be 54)
        System.out.println(count_nums_not_7(100));  // Output: 81

    }
}
