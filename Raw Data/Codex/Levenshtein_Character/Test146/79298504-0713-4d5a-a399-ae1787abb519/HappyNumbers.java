import java.util.HashSet;
import java.util.Set;

public class HappyNumbers {

    public static void main(String[] args) {
        int count = 0;
        long num = 1;

        while (count < 10) {
            if (happy_num(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }

    public static boolean happy_num(long num) {
        Set<Long> seen = new HashSet<>();

        while (num != 1 && !seen.contains(num)) {
            seen.add(num);
            num = sumOfSquaresOfDigits(num);
        }

        return num == 1;
    }

    private static long sumOfSquaresOfDigits(long num) {
        long sum = 0;
        while (num > 0) {
            long digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }
}
