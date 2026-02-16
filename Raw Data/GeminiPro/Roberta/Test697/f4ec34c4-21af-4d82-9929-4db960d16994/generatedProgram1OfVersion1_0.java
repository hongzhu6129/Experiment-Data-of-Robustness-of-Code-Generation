class Solution {

    /**
     * Counts the numbers from 1 to n (inclusive) that do not contain the digit 7.
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


    public static void main(String[] args) {
        int n = 20; // Example usage: Count numbers without 7 from 1 to 20
        int count = count_nums_not_7(n);
        System.out.println("Count of numbers without 7 from 1 to " + n + ": " + count);


        n= 100;
        count = count_nums_not_7(n);
        System.out.println("Count of numbers without 7 from 1 to " + n + ": " + count);
    }
}
