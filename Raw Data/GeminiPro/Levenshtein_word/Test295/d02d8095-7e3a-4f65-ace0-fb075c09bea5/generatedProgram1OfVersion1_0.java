class Solution {
    /**
     * Checks if a number is prime.
     *
     * @param n The number to check.
     * @return True if n is prime, false otherwise.
     */
    public static int prime_cell(int i, int j) {
        if (isPrime(i) && isPrime(j)) {
            return 0; // False (represented as 0 for clarity)
        } else {
            return 1; // True (represented as 1)
        }
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int m = 5; // Example size, you can change this
        int[][] a = new int[m][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = prime_cell(i, j);
            }
        }

        // Print the array (optional)
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
