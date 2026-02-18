import java.util.HashSet;

public class HappyNumber {

    public static boolean isHappy_number(int n) {
        HashSet<Integer> seen = new HashSet<>();

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

        // Test cases from the prompt
        System.out.println(7 + " is a happy number: " + isHappy_number(7));  // Should be false per definition
        System.out.println(2 + " is a happy number: " + isHappy_number(2));   // Should be false per definition 


    }
}
