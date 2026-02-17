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
     * Checks if a given integer contains the digit 7.
     *
     * @param n The integer to check.
     * @return True if the integer contains the digit 7, false otherwise.
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
     * Main method to demonstrate the count_nums_not_7 function.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        int a = 20;
        int count = count_nums_not_7(a);
        System.out.println("Count of numbers without 7 from 1 to " + a + ": " + count);


         a = 100;
         count = count_nums_not_7(a);
        System.out.println("Count of numbers without 7 from 1 to " + a + ": " + count);


    }
}
