class SieveOfEratosthenes {

    private static int[] generatePrimes(int n) {
        // Create a boolean array "prime[0..n]" and initialize
        // all entries it as true. A value in prime[i] will
        // finally be false if i is Not a prime, else true.
        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++)
            prime[i] = true;

        for (int p = 2; p * p <= n; p++) {
            // If prime[p] is not changed, then it is a prime
            if (prime[p] == true) {
                // Update all multiples of p greater than or
                // equal to the square of it numbers which are
                // multiple of p and are less than p^2 are
                // already been marked.
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }

        // Count the number of primes
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (prime[i] == true) {
                count++;
            }
        }

        // Create an array to store the primes
        int[] primes = new int[count];
        int index = 0;
        for (int i = 2; i <= n; i++) {
            if (prime[i] == true) {
                primes[index++] = i;
            }
        }

        return primes;
    }

    public static void main(String[] args) {
        int n = 30; // Example: Find primes up to 30
        int[] primes = generatePrimes(n);

        System.out.print("Prime numbers smaller than or equal to " + n + ": ");
        for (int prime : primes) {
            System.out.print(prime + " ");
        }
        System.out.println(); // Add a newline for cleaner output
    }
}
