public class TwinPrimes {

    public static void main(String[] args) {
        System.out.println("Twin prime numbers less than 100:");
        findTwinPrimes(100);
    }

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

    public static void findTwinPrimes(int limit) {
        for (long i = 3; i < limit; i += 2) { // Optimize: Check only odd numbers (except 2)
            if (is_Prime(i) && is_Prime(i + 2)) {
                System.out.println("(" + i + ", " + (i + 2) + ")");
            }
        }
    }
}
