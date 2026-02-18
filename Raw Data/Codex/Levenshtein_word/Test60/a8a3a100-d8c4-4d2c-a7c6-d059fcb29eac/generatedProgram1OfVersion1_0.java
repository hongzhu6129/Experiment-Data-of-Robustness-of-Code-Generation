public class TurbopropPrimes {

    public static void main(String[] args) {
        System.out.println("Turboprop primes less than 100:");
        for (long i = 2; i < 100; i++) {
            if (is_Prime(i) && isTurboprop(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Newline for better formatting
    }

    // Checks if a number is prime
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

    // Helper method to check if a number is a "turboprop" number
    // A turboprop number is simply a prime number (in this context).
    //  There seems to be no standard definition of a turboprop number 
    //  in mathematics. So, assuming it's just a prime number.
    private static boolean isTurboprop(long n) {
        return is_Prime(n);
    }

}
