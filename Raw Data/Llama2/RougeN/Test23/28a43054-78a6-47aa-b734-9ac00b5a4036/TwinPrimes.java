public class TwinPrimes {

    public static void main(String[] args) {
        System.out.println("Twin prime numbers less than 100:");
        for (long i = 3; i < 100; i += 2) { // Optimize: only check odd numbers
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
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        for (long i = 5; i * i <= n; i += 6) { // 6k � 1 optimization
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
