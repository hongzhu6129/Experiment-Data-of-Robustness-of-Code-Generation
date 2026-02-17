import java.util.HashSet;
import java.util.Set;

class MaxDistinctPrimes {

    static int max_distinct_primes(int start, int end) {
        int maxDistinctPrimes = 0;
        int numWithMaxDistinctPrimes = -1;

        for (int i = start; i <= end; i++) {
            int distinctPrimes = countDistinctPrimeFactors(i);
            if (distinctPrimes > maxDistinctPrimes) {
                maxDistinctPrimes = distinctPrimes;
                numWithMaxDistinctPrimes = i;
            }
        }

        return numWithMaxDistinctPrimes;
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

        // If n is still greater than 1, it's a prime factor
        if (n > 1) {
            primeFactors.add(n);
        }

        return primeFactors.size();
    }


    public static void main(String[] args) {
        int start = 10;
        int end = 100;
        int result = max_distinct_primes(start, end);
        System.out.println("Number with maximum distinct prime factors between " + start + " and " + end + ": " + result);

        start = 200;
        end = 500;
         result = max_distinct_primes(start, end);
        System.out.println("Number with maximum distinct prime factors between " + start + " and " + end + ": " + result);

                start = 2;
        end = 10;
         result = max_distinct_primes(start, end);
        System.out.println("Number with maximum distinct prime factors between " + start + " and " + end + ": " + result);


    }
}

