class Solution {
    /**
     * Given a positive integer n, determine if it is a prime number.
     *
     * @param n a positive integer
     * @return true if n is prime, false otherwise
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


    public static void main(String[] args) {
        System.out.println("Twin prime numbers less than 100:");
        for (long i = 3; i < 100; i +=2) {  // Optimize by checking only odd numbers
            if (is_Prime(i) && is_Prime(i + 2)) {
                System.out.println("(" + i + ", " + (i + 2) + ")");
            }
        }

    }
}
