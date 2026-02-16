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


        // Test cases from the prompt's examples (though not explicitly requested to print these)
         System.out.println("Is 7 a happy number? " + isHappy_number(7)); //true
         System.out.println("Is 10 a happy number? " + isHappy_number(10)); //true
         System.out.println("Is 13 a happy number? " + isHappy_number(13)); //true


    }
}
