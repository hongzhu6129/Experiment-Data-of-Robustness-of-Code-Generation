import java.util.ArrayList;
import java.util.List;

public class ProperDivisorSum {

    public static void main(String[] args) {
        long n = 12; // Example usage
        long sum = proper_Divs_Sum(n);
        System.out.println("The sum of proper divisors of " + n + " is: " + sum);

        n = 284;
        sum = proper_Divs_Sum(n);
        System.out.println("The sum of proper divisors of " + n + " is: " + sum);


        // You can test with more numbers here...
    }

    public static Long proper_Divs_Sum(long n) {
        if (n <= 1) {
            return 0L; // Proper divisors are defined for n > 1
        }

        long sum = 1; // 1 is always a proper divisor (except for 1 itself, handled above)
        List<Long> divisors = new ArrayList<>(); // Store divisors for clarity (optional)

        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                divisors.add(i);
                if (i * i != n) { // Avoid adding the same divisor twice for perfect squares
                    sum += n / i;
                    divisors.add(n / i);
                }
            }
        }



        // Optional: Print the divisors (for debugging/understanding)
        //System.out.print("Divisors of " + n + ": ");
        //for (long divisor : divisors) {
        //    System.out.print(divisor + " ");
        //}
        //System.out.println();

        return sum;
    }
}
