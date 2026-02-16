import java.util.Arrays;

class Solution {

    private static int[] generatePrimes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p)
                    isPrime[i] = false;
            }
        }

        int primeCount = 0;
        for (boolean b : isPrime) {
            if (b) {
                primeCount++;
            }
        }

        int[] primes = new int[primeCount];
        int index = 0;
        for (int i = 0; i <= n; i++) {
            if (isPrime[i]) {
                primes[index++] = i;
            }
        }
        return primes;
    }

    public static void main(String[] args) {
        int n = 30; // Example: Find primes up to 30
        int[] primes = generatePrimes(n);

        System.out.print("Primes smaller than or equal to " + n + ": ");
        for (int prime : primes) {
            System.out.print(prime + " ");
        }
        System.out.println();
    }
}
