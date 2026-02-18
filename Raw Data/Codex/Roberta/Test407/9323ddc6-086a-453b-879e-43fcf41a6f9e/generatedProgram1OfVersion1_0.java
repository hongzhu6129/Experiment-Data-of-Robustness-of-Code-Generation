public class NarcissisticFractions {

    public static void main(String[] args) {
        int count = 0;
        long num = 1;

        System.out.println("First 15 Narcissistic Fraction Numbers:");

        while (count < 15) {
            if (is_narc_dec_num(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }


    public static boolean is_narc_dec_num(long num) {
        String numStr = String.valueOf(num);
        int n = numStr.length();
        long sum = 0;

        for (int i = 0; i < n; i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            sum += Math.pow(digit, n);  // Correctly calculate the sum of powers
        }

        return sum == num; 
    }
}
