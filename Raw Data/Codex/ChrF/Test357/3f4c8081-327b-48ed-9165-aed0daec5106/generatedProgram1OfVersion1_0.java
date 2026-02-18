class Solution {
    public static void main(String[] args) {
        int count = 0;
        long num = 0;

        while (count < 15) {
            if (is_narc_dec_num(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        System.out.println(); // Add a newline at the end for better formatting.
    }


    public static boolean is_narc_dec_num(long num) {
        if (num < 0) {
            return false; // Narcissistic numbers are typically defined for non-negative integers.
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
