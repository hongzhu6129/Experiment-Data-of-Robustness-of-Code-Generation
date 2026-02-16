class Solution {
    /**
     * Counts the number of prime numbers less than a given positive number.
     *
     * @param n A positive integer.
     * @return The number of prime numbers less than n.
     * @throws IllegalArgumentException if n is not a positive integer.
     */
    public static int countPrimes(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Input must be a positive integer.");
        }

        if (n <= 2) {
            return 0;
        }

        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i < n; i++) {
            if (!isPrime[i]) continue;
            for (int j = i * i; j < n; j += i) {
                isPrime[j] = false;
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }

        return count;
    }


    public static void main(String[] args) {
        int n1 = 10;
        System.out.println("Number of primes less than " + n1 + ": " + countPrimes(n1)); // Output: 4

        int n2 = 0;
        try {
            System.out.println("Number of primes less than " + n2 + ": " + countPrimes(n2));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // Output: Input must be a positive integer.
        }



        int n3 = 2;
        System.out.println("Number of primes less than " + n3 + ": " + countPrimes(n3)); // Output: 0


        int n4 = 1;
        System.out.println("Number of primes less than " + n4 + ": " + countPrimes(n4)); // Output: 0

        int n5 = 50;
        System.out.println("Number of primes less than " + n5 + ": " + countPrimes(n5)); // Output: 15
    }
}
