class Solution {
    /**
     * Counts the number of prime numbers less than a given positive number.
     *
     * @param n The positive number.
     * @return The number of prime numbers less than n.
     * @throws IllegalArgumentException if n is not a positive number.
     */
    public static int countPrimes(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Input must be a positive integer.");
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int n1 = 10;
        System.out.println("Number of primes less than " + n1 + ": " + countPrimes(n1)); // Expected Output: 4

        int n2 = 20;
        System.out.println("Number of primes less than " + n2 + ": " + countPrimes(n2)); // Expected Output: 8

        int n3 = 1;
        // Handling invalid input
        try {
            countPrimes(n3);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage()); // Expected Output: Error: Input must be a positive integer.

        }


    }
}
