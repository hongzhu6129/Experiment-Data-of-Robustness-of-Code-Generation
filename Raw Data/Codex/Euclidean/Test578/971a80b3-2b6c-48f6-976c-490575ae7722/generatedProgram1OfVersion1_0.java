import java.util.ArrayList;
import java.util.List;

class Solution {
    /**
     * Generates and prints the first 15 narcissistic decimal numbers.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        List<Long> narcissisticNumbers = new ArrayList<>();
        long num = 0;
        while (narcissisticNumbers.size() < 15) {
            if (is_narc_dec_num(num)) {
                narcissisticNumbers.add(num);
            }
            num++;
        }

        System.out.println("First 15 narcissistic decimal numbers:");
        for (long narcissisticNumber : narcissisticNumbers) {
            System.out.println(narcissisticNumber);
        }
    }

    /**
     * Checks if a number is a narcissistic decimal number.
     *
     * @param num The number to check.
     * @return True if the number is narcissistic, false otherwise.
     */
    public static boolean is_narc_dec_num(long num) {
        if (num < 0) {
            return false; 
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
