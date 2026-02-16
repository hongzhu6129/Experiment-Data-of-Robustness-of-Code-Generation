import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class MaxDistinctPrimes {

    static int max_distinct_primes(int start, int end) {
        int numWithMaxDistinctPrimes = start;
        int maxDistinctPrimesCount = 0;

        for (int num = start; num <= end; num++) {
            int distinctPrimesCount = countDistinctPrimeFactors(num);
            if (distinctPrimesCount > maxDistinctPrimesCount) {
                maxDistinctPrimesCount = distinctPrimesCount;
                numWithMaxDistinctPrimes = num;
            }
        }
        return numWithMaxDistinctPrimes;
    }


    private static int countDistinctPrimeFactors(int n) {
        Set<Integer> primeFactors = new HashSet<>();
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                if (isPrime(i)) {
                    primeFactors.add(i);
                }
                n /= i;
            }
        }
        if (n > 1 && isPrime(n)) {
            primeFactors.add(n);
        }
        return primeFactors.size();
    }


    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {
        int start = 10;
        int end = 100;
        int result = max_distinct_primes(start, end);
        System.out.println("Number with maximum distinct prime factors in the range [" + start + ", " + end + "]: " + result);


        start = 200;
        end = 500;
        result = max_distinct_primes(start, end);

        System.out.println("Number with maximum distinct prime factors in the range [" + start + ", " + end + "]: " + result);
    }
}
