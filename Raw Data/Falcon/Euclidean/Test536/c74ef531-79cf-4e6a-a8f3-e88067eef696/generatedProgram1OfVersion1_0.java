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
            if (!contains7(i)) {
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
    private static boolean contains7(int n) {
        while (n > 0) {
            if (n % 10 == 7) {
                return true;
            }
            n /= 10;
        }
        return false;
    }

    public static void main(String[] args) {
        int a = 20;  // Example value
        int result = count_nums_not_7(a);
        System.out.println("The count of numbers without 7 from 1 to " + a + " is: " + result);

        a = 100; // Another example
        result = count_nums_not_7(a);
        System.out.println("The count of numbers without 7 from 1 to " + a + " is: " + result);

    }
}
