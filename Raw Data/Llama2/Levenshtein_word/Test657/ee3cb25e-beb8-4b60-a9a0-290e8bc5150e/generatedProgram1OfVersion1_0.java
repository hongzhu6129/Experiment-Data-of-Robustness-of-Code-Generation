public class SumDigits {

    public static void main(String[] args) {
        int number = 12345; // Example input

        int sum = sumDigits(number);
        System.out.println("Sum of digits until single digit: " + sum);


        number = 99999; // Another example
        sum = sumDigits(number);
        System.out.println("Sum of digits until single digit: " + sum);
    }

    private static int sumDigits(int n) {
        while (n > 9) {  // Continue until the number is a single digit
            int sum = 0;
            while (n > 0) { // Calculate sum of digits
                sum += n % 10;
                n /= 10;
            }
            n = sum; // Update n with the new sum
        }
        return n;
    }
}
