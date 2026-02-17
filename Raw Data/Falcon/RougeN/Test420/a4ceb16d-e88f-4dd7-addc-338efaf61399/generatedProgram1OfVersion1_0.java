class Solution {
    /**
     * Counts the number of prime numbers less than a given positive number.
     *
     * @param n A positive integer.
     * @return The number of prime numbers less than n.
     */
    public static int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }

        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i < n; i++) {
            if (!isPrime[i]) {
                continue;
            }
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
        int result1 = countPrimes(n1);
        System.out.println("Number of primes less than " + n1 + ": " + result1); // Output: 4

        int n2 = 0;
        int result2 = countPrimes(n2);
        System.out.println("Number of primes less than " + n2 + ": " + result2); // Output: 0

        int n3 = 1;
        int result3 = countPrimes(n3);
        System.out.println("Number of primes less than " + n3 + ": " + result3); // Output: 0


        int n4 = 2;
        int result4 = countPrimes(n4);
        System.out.println("Number of primes less than " + n4 + ": " + result4); // Output: 0

        int n5 = 50;
        int result5 = countPrimes(n5);
        System.out.println("Number of primes less than " + n5 + ": " + result5);

    }
}
