class Solution {
    /**
     * A turboprop prime is a prime number that remains prime when rotated.
     * For example: 2, 3, 5, 7, 11, 13, 17, 31, 37, 71, 73, 79, 97 are turboprop primes below 100.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Turboprop primes less than 100:");
        for (long i = 2; i < 100; i++) {
            if (is_Prime(i) && isTurbopropPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Add a newline for cleaner output
    }

    /**
     * Checks if a given number is a prime number.
     *
     * @param n The number to check for primality.
     * @return True if n is prime, false otherwise.
     */
    public static boolean is_Prime(long n) {
        if (n <= 1) {
            return false;
        }
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Helper function to check if a number is a turboprop prime
    private static boolean isTurbopropPrime(long n) {
        String numStr = String.valueOf(n);
        int len = numStr.length();

        for (int i = 0; i < len; i++) {
            numStr = numStr.substring(1) + numStr.charAt(0);  // Rotate the digits
            if (!is_Prime(Long.parseLong(numStr))) {
                return false;
            }
        }
        return true;
    }
}

