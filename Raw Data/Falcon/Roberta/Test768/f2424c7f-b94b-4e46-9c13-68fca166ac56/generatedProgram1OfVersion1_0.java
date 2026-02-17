public class MersennePrime {

    public static void main(String[] args) {
        // Example usage:
        int number1 = 7;
        int number2 = 11;
        int number3 = 31;
        int number4 = 127;
        int number5 = 8191;


        System.out.println(number1 + " is a Mersenne prime: " + isMersennePrime(number1)); // true
        System.out.println(number2 + " is a Mersenne prime: " + isMersennePrime(number2)); // false
        System.out.println(number3 + " is a Mersenne prime: " + isMersennePrime(number3)); // true
        System.out.println(number4 + " is a Mersenne prime: " + isMersennePrime(number4)); // true
        System.out.println(number5 + " is a Mersenne prime: " + isMersennePrime(number5)); // true




    }

    public static boolean isMersennePrime(int n) {
        if (n <= 1) {
            return false; // 1 and numbers less than 1 are not Mersenne primes
        }

        if (!isPrime(n)) {
            return false; // Mersenne primes must be prime
        }

        // Check if n is of the form 2^p - 1
        int p = 0;
        int mersenneCandidate = 0;
        while (mersenneCandidate < n) {
            p++;
            mersenneCandidate = (int) Math.pow(2, p) - 1; 
        }

        return mersenneCandidate == n;
    }

    // Helper function to check primality (efficient method)
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }

        return true;
    }




}
