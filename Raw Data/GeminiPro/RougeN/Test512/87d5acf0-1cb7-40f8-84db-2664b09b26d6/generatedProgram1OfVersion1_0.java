class Solution {
    /**
     * A Narcissistic Decimal Number is a number that is the sum of its own digits each raised to the power of the number of digits.
     * For example, 153 is a Narcissistic Decimal Number because 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153.
     *
     * This program generates and displays the first 15 narcissistic decimal numbers.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int count = 0;
        long num = 0;

        while (count < 15) {
            if (is_narc_dec_num(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }

    /**
     * Checks if a given number is a Narcissistic Decimal Number.
     *
     * @param num The number to check.
     * @return True if the number is a narcissistic decimal number, false otherwise.
     */
    public static boolean is_narc_dec_num(long num) {
        if (num < 0) {
            return false; // Handle negative numbers (optional, based on definition)
        }

        String numStr = String.valueOf(num);
        int numDigits = numStr.length();
        long sum = 0;

        for (int i = 0; i < numDigits; i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            sum += Math.pow(digit, numDigits);
        }

        return sum == num;
    }
}
