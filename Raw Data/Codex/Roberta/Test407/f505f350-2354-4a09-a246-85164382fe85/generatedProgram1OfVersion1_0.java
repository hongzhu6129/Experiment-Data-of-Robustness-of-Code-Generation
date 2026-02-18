import java.lang.Math;

public class NarcissisticFractions {

    public static void main(String[] args) {
        int count = 0;
        long num = 1;

        System.out.println("First 15 Narcissistic Decimal Numbers:");

        while (count < 15) {
            if (is_narc_dec_num(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }


    public static boolean is_narc_dec_num(long num) {
        long originalNum = num;
        long sum = 0;
        int numDigits = String.valueOf(num).length();

        while (num > 0) {
            long digit = num % 10;
            sum += Math.pow(digit, numDigits);
            num /= 10;
        }

        return sum == originalNum;
    }
}
