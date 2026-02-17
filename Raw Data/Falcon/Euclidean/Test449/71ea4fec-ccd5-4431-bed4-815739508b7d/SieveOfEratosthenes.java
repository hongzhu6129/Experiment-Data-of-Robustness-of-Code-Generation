import java.util.Arrays;

public class SieveOfEratosthenes {

    private static int[] generatePrimes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true); // Assume all numbers are prime initially

        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                // Mark multiples of p as non-prime
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        // Count the number of primes
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }

        // Create an array to store the prime numbers
        int[] primes = new int[count];
        int index = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primes[index++] = i;
            }
        }

        return primes;
    }

    public static void main(String[] args) {
        int n = 30; // Example limit, you can change this value
        int[] primes = generatePrimes(n);

        System.out.print("Primes smaller than or equal to " + n + ": ");
        for (int prime : primes) {
            System.out.print(prime + " ");
        }
        System.out.println(); 

        // Another test case:
        n = 120;
        primes = generatePrimes(n);
        System.out.print("Primes smaller than or equal to " + n + ": ");
        for (int prime : primes) {
            System.out.print(prime + " ");
        }
        System.out.println();
    }
}



