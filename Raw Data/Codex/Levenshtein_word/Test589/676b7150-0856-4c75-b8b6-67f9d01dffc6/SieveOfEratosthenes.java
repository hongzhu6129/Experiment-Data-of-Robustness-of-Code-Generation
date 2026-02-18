import java.util.Arrays;

public class SieveOfEratosthenes {

    private static int[] generatePrimes(int n) {
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);  // Assume all numbers are prime initially

        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                // Mark multiples of p as non-prime
                for (int i = p * p; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }

        // Count the number of primes
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                count++;
            }
        }

        // Create an array to store the primes
        int[] primes = new int[count];
        int index = 0;
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                primes[index++] = i;
            }
        }

        return primes;
    }


    public static void main(String[] args) {
        int n = 30; // Example: Find primes up to 30
        int[] primes = generatePrimes(n);

        System.out.print("Primes less than or equal to " + n + ": ");
        for (int p : primes) {
            System.out.print(p + " ");
        }
        System.out.println(); 
    }
}
