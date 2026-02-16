import java.util.Arrays;

public class SieveOfEratosthenes {

    private static int[] generatePrimes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true); // Assume all numbers are prime initially

        isPrime[0] = isPrime[1] = false; // 0 and 1 are not prime

        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                // Mark multiples of p as not prime
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }


        int primeCount = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primeCount++;
            }
        }

        int[] primes = new int[primeCount];
        int index = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primes[index++] = i;
            }
        }
        return primes;

    }

    public static void main(String[] args) {
        int limit = 30; // Example limit, you can change this
        int[] primes = generatePrimes(limit);

        System.out.print("Prime numbers less than or equal to " + limit + ": ");
        for (int prime : primes) {
            System.out.print(prime + " ");
        }
        System.out.println(); 
    }
}
