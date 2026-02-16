class Solution {

    private static int[] generatePrimes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
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
        int n = 30; // Example limit
        int[] primes = generatePrimes(n);

        System.out.print("Primes less than or equal to " + n + ": ");
        for (int prime : primes) {
            System.out.print(prime + " ");
        }
        System.out.println(); 
    }
}
