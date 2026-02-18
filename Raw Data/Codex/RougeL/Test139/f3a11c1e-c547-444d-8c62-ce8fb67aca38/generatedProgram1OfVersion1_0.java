class Solution {

    /**
     * Displays the factors of 3 present in a given integer.
     *
     * @param n The integer to check for factors of 3.
     */
    public static void test(int n) {
        int temp = n;
        int count = 0;

        while (temp > 0) {
            if (temp % 3 == 0) {
                count++;
                temp /= 3;
            } else {
                break; // Stop if it's no longer divisible by 3
            }
        }

        if (count > 0) {
            System.out.println("Factors of 3 in " + n + ": 3^" + count);
        } else {
            System.out.println("No factors of 3 found in " + n);
        }
    }


    public static void main(String[] args) {
        test(27);   // Output: Factors of 3 in 27: 3^3
        test(12);   // Output: Factors of 3 in 12: 3^1
        test(5);    // Output: No factors of 3 found in 5
        test(81);  // Output: Factors of 3 in 81: 3^4
        test(100); // Output: No factors of 3 found in 100 
    }
}
