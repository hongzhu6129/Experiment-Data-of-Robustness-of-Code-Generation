import java.util.HashSet;
import java.util.Set;

public class ProperDivisorSum {

    public static void main(String[] args) {
        long num = 12; // Example usage
        long sum = proper_Divs_Sum(num);
        System.out.println("The sum of proper divisors of " + num + " is: " + sum);


        num = 284; // Example for amicable numbers.
        long sum1 = proper_Divs_Sum(num);

        long num2 = 220; // Example for amicable numbers.
        long sum2 = proper_Divs_Sum(num2);
        System.out.println("Sum of divisors of 284: " + sum1);
        System.out.println("Sum of divisors of 220: " + sum2);



    }

    public static Long proper_Divs_Sum(long n) {
        if (n <= 1) {
            return 0L; // Handle cases where n is 0 or 1.
        }

        long sum = 1; // Start with 1 as 1 is always a proper divisor

        // Optimization: Check divisors only up to the square root of n
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                if (i * i != n) { // Avoid adding the same divisor twice if n is a perfect square
                    sum += n / i;
                }
            }
        }

        return sum;

    }
}
