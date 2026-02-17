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
            if (!String.valueOf(i).contains("7")) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 20; // Example usage: count numbers without 7 from 1 to 20
        int result = count_nums_not_7(n);
        System.out.println("Count of numbers without 7 from 1 to " + n + ": " + result);


        n = 100; // Example usage: count numbers without 7 from 1 to 100
        result = count_nums_not_7(n);
        System.out.println("Count of numbers without 7 from 1 to " + n + ": " + result);
    }
}
