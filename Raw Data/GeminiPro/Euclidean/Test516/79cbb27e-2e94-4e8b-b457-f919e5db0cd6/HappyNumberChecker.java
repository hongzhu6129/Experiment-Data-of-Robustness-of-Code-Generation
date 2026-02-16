import java.util.HashSet;
import java.util.Set;

public class HappyNumberChecker {

    public static boolean isHappy_number(int n) {
        Set<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = sumOfSquaresOfDigits(n);
        }

        return n == 1;
    }

    private static int sumOfSquaresOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num1 = 19;
        if (isHappy_number(num1)) {
            System.out.println(num1 + " is a happy number");
        } else {
            System.out.println(num1 + " is not a happy number");
        }

        int num2 = 2;
        if (isHappy_number(num2)) {
            System.out.println(num2 + " is a happy number");
        } else {
            System.out.println(num2 + " is not a happy number");
        }


        // Test cases from the prompt
        int[] unhappyNumbers = {2, 3, 4, 5, 6, 8, 9, 11, 12, 14, 15, 16, 17, 18, 20};
        for (int num : unhappyNumbers) {
            if (isHappy_number(num)) {
                System.out.println(num + " is a happy number"); // Shouldn't print
            } else {
                System.out.println(num + " is not a happy number");
            }
        }
    }
}
