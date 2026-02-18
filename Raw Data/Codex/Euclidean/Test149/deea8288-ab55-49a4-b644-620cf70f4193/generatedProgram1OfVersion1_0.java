public class NarcissisticNumbers {

    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (isNarcissistic(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isNarcissistic(int num) {
        int originalNum = num;
        int sum = 0;
        int numDigits = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numDigits);
            num /= 10;
        }

        return sum == originalNum;
    }
}
