public class PrimeCell {

    public static int prime_cell(int i, int j) {
        if (isPrime(i) && isPrime(j)) {
            return 0; // Represents false
        } else {
            return 1; // Represents true
        }
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int m = 3; // Example size, you can change this
        boolean[][] a = new boolean[m][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = (prime_cell(i, j) == 1); // Convert 1 to true, 0 to false
                System.out.print(a[i][j] + " ");
            }
        }
         System.out.println(); // Add a newline at the end for better formatting
    }
}
