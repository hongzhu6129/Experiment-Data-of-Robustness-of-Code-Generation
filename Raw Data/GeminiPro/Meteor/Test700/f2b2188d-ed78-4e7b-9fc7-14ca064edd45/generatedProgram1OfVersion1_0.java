import java.util.HashSet;
import java.util.Set;

public class MaxDistinctPrimes {

    static int max_distinct_primes(int start, int end) {
        int numWithMaxPrimes = -1;
        int maxDistinctPrimes = 0;

        for (int num = start; num <= end; num++) {
            int distinctPrimesCount = countDistinctPrimeFactors(num);
            if (distinctPrimesCount > maxDistinctPrimes) {
                maxDistinctPrimes = distinctPrimesCount;
                numWithMaxPrimes = num;
            }
        }
        return numWithMaxPrimes;
    }


    private static int countDistinctPrimeFactors(int n) {
        Set<Integer> primeFactors = new HashSet<>();
        // Handle 2 as a special case
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

        // If n is still greater than 2, it's a prime factor
        if (n > 2) {
            primeFactors.add(n);
        }

        return primeFactors.size();
    }


    public static void main(String[] args) {
        int start = 10;
        int end = 100;

        int numWithMaxDistinctPrimes = max_distinct_primes(start, end);

        if (numWithMaxDistinctPrimes != -1) {
            System.out.println("Number with the maximum distinct prime factors in the range [" + start + ", " + end + "]: " + numWithMaxDistinctPrimes);

        } else {
            System.out.println("No number with distinct prime factors found in the given range.");
        }

         // Example with a larger range where output will be more interesting.
        start = 2;
        end = 200;
        numWithMaxDistinctPrimes = max_distinct_primes(start, end);
        System.out.println("Number with the maximum distinct prime factors in the range [" + start + ", " + end + "]: " + numWithMaxDistinctPrimes);

    }
}
