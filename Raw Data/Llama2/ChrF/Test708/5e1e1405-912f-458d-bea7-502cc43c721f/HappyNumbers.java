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
        while (num != 1 && num != 4) { // 4 is a known non-happy number that leads to a cycle
            long sum = 0;
            while (num > 0) {
                long digit = num % 10;
                sum += digit * digit;
                num /= 10;
            }
            num = sum;
        }
        return num == 1;
    }
}
