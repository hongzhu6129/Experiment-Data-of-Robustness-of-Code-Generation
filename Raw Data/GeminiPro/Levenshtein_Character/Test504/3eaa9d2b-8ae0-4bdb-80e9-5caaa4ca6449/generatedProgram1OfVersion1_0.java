public class FactorsOfThree {

    public static void main(String[] args) {
        test(12); // Example usage: Factors of 3 in 12 are 3 
        test(27); // Example usage: Factors of 3 in 27 are 3 9 27
        test(10); // Example usage: No factors of 3 found in 10
    }

    public static void test(int n) {
        boolean found = false;
        for (int i = 3; i <= n; i++) {
            if (n % i == 0 && isPowerOfThree(i)) {
                System.out.print(i + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.print("No factors of 3 found in " + n);
        }
        System.out.println(); // New line for next output
    }


    private static boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }

        while (n % 3 == 0) {
            n /= 3;
        }

        return n == 1;
    }
}

