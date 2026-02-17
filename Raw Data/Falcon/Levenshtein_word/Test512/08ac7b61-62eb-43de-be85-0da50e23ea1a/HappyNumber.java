import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public static boolean isHappy_number(int num) {
        Set<Integer> seen = new HashSet<>();

        while (num != 1 && !seen.contains(num)) {
            seen.add(num);
            num = sumOfSquaresOfDigits(num);
        }

        return num == 1;
    }

    private static int sumOfSquaresOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num1 = 19;
        int num2 = 20;

        System.out.println(num1 + " is a happy number: " + isHappy_number(num1)); // Output: true
        System.out.println(num2 + " is a happy number: " + isHappy_number(num2)); // Output: false


        // More test cases
        System.out.println(7 + " is a happy number: " + isHappy_number(7)); // Output: true
        System.out.println(1 + " is a happy number: " + isHappy_number(1)); // Output: true
        System.out.println(2 + " is a happy number: " + isHappy_number(2)); // Output: false


    }
}
