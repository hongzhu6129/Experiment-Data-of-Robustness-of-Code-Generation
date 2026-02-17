public class TwinPrimes {

    public static void main(String[] args) {
        System.out.println("Twin prime numbers less than 100:");
        for (long i = 3; i < 100; i += 2) { // Optimize: Check only odd numbers after 2
            if (is_Prime(i) && is_Prime(i + 2)) {
                System.out.println("(" + i + ", " + (i + 2) + ")");
            }
        }
    }

    public static boolean is_Prime(long n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        // Optimization: Check divisibility only up to the square root of n
        for (long i = 2; i * i <= n; i++) { 
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
