import java.util.HashSet;
import java.util.Set;

public class HappyNumberChecker {

    public static boolean isHappy_number(int n) {
        Set<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            n = sum;
        }

        return n == 1;
    }

    public static void main(String[] args) {
        int num1 = 19;
        int num2 = 20;

        System.out.println(num1 + " is a happy number: " + isHappy_number(num1)); // Output: true
        System.out.println(num2 + " is a happy number: " + isHappy_number(num2)); // Output: false


        // Additional test cases (optional)
        System.out.println(7 + " is a happy number: " + isHappy_number(7)); //true
        System.out.println(1 + " is a happy number: " + isHappy_number(1)); //true
        System.out.println(2 + " is a happy number: " + isHappy_number(2)); //false

    }
}
