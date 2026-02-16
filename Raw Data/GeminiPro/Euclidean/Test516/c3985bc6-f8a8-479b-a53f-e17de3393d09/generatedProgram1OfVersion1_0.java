import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

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


        // Test cases from the prompt's example (though the prompt itself has some errors)
        System.out.println("7 is a happy number: " + isHappy_number(7)); //true (7^2 = 49 -> 4^2 + 9^2 = 97 -> 9^2 + 7^2 ... -> 1)
        System.out.println("2 is a happy number: " + isHappy_number(2)); //false (2 -> 4 -> 16 -> ... -> cycles)

        // Additional test cases for more thoroughness
        System.out.println("1 is a happy number: " + isHappy_number(1)); //true
        System.out.println("100 is a happy number: " + isHappy_number(100)); //true (1^2 + 0 + 0 = 1)
    }
}
