import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MaxDistinctPrimes {

    static int max_distinct_primes(int start, int end) {
        int maxDistinctPrimes = 0;
        int numWithMaxPrimes = -1;

        for (int i = start; i <= end; i++) {
            int distinctPrimes = countDistinctPrimeFactors(i);
            if (distinctPrimes > maxDistinctPrimes) {
                maxDistinctPrimes = distinctPrimes;
                numWithMaxPrimes = i;
            }
        }

        return numWithMaxPrimes;
    }


    private static int countDistinctPrimeFactors(int n) {
        Set<Integer> primeFactors = new HashSet<>();
        
        // Handle 2 separately
        while (n % 2 == 0) {
            primeFactors.add(2);
            n /= 2;
        }

        // Iterate from 3 to sqrt(n)
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                primeFactors.add(i);
                n /= i;
            }
        }

        // If n is still greater than 2 (a prime number other than 2), add it
        if (n > 2) {
            primeFactors.add(n);
        }

        return primeFactors.size(); 
    }

    public static void main(String[] args) {
        int start = 10;
        int end = 100;
        int result = max_distinct_primes(start, end);

        if (result != -1) {
            System.out.println("Number with maximum distinct prime factors between " + start + " and " + end + ": " + result);
        } else {
            System.out.println("No number found in the given range.");
        }



        start = 2;
        end = 7;
        result = max_distinct_primes(start, end);
        if (result != -1) {
            System.out.println("Number with maximum distinct prime factors between " + start + " and " + end + ": " + result);
        } else {
            System.out.println("No number found in the given range.");
        }


        start = 20;
        end = 30;
        result = max_distinct_primes(start, end);

        if (result != -1) {
            System.out.println("Number with maximum distinct prime factors between " + start + " and " + end + ": " + result);
        } else {
            System.out.println("No number found in the given range.");
        }
    }
}
