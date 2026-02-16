class Solution {
    public static int prime_cell(int m, int n) {
        int count = 0;
        for (int i = 2; i <= m / 2; i++) {
            if (m % i == 0) {
                count++;
                break;
            }
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0)
            return 0;  // Represents false (both are prime)
        else
            return 1;  // Represents true (at least one is not prime)
    }

    public static void main(String[] args) {
        int m = 3; // Example size, you can change this

        boolean[][] A = new boolean[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                A[i][j] = prime_cell(i, j) == 1; // Convert 1 to true, 0 to false
                System.out.print(A[i][j] + " ");
            }
           
        }
         System.out.println(); // Add a newline for better output formatting
    }
}
