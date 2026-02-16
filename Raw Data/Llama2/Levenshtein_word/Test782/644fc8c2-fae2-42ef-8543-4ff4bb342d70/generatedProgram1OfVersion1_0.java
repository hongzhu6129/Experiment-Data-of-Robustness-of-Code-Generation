class Solution {

    private static int[] generatePrimes(int n) {
        // Create a boolean array "prime[0..n]" and initialize
        // all entries it as true. A value in prime[i] will
        // finally be false if i is Not a prime, else true.
        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++)
            prime[i] = true;

        prime[0] = prime[1] = false; // 0 and 1 are not prime

        for (int p = 2; p * p <= n; p++) {
            // If prime[p] is not changed, then it is a prime
            if (prime[p] == true) {
                // Update all multiples of p
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }


        // Count the number of primes
        int count = 0;
        for(int i = 2; i <=n; i++) {
            if(prime[i])
                count++;
        }

        // Store primes in an array
        int[] primes = new int[count];
        int index = 0;
        for(int i = 2; i <= n; i++) {
            if(prime[i])
                primes[index++] = i;
        }

        return primes;
    }

    public static void main(String[] args) {
        int n = 30; // Example: Find primes up to 30
        int[] primes = generatePrimes(n);

        System.out.print("Prime numbers smaller than or equal to " + n + " are: ");
        for (int p : primes) {
            System.out.print(p + " ");
        }
        System.out.println();
    }
}

