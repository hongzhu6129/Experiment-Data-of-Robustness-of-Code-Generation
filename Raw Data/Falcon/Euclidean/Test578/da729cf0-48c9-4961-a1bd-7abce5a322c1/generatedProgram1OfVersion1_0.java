class Solution {
    /**
     * Generates and shows the first 15 narcissistic decimal numbers.
     * A narcissistic decimal number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        int count = 0;
        long num = 1;

        while (count < 15) {
            if (is_narc_dec_num(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }


    /**
     * Checks if a given number is a narcissistic decimal number.
     *
     * @param num the number to check
     * @return true if the number is narcissistic, false otherwise
     */
    public static boolean is_narc_dec_num(long num) {
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
