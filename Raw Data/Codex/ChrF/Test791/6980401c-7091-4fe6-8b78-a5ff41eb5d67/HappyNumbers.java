public class HappyNumbers {

    public static void main(String[] args) {
        int count = 0;
        long num = 1;

        while (count < 10) {
            if (happy_num(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }

    public static boolean happy_num(long num) {
        long slow = num;
        long fast = num;

        do {
            slow = sumOfSquares(slow);
            fast = sumOfSquares(sumOfSquares(fast));
        } while (slow != fast);

        return slow == 1;
    }

    private static long sumOfSquares(long num) {
        long sum = 0;
        while (num > 0) {
            long digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }
}
