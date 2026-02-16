class SieveOfEratosthenes {

    private static int[] generatePrimes(int n) {
        boolean[] prime = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            prime[i] = true;
        }

        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }


        int primeCount = 0;
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                primeCount++;
            }
        }


        int[] primes = new int[primeCount];
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

        System.out.print("Prime numbers less than or equal to " + n + ": ");
        for (int p : primes) {
            System.out.print(p + " ");
        }
        System.out.println();
    }
}



