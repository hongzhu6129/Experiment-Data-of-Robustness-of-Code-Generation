class Solution {
    public static int prime_cell(int row, int col) {
        int row_factors = 0;
        for (int i = 1; i <= row; i++) {
            if (row % i == 0) {
                row_factors++;
            }
        }

        int col_factors = 0;
        for (int i = 1; i <= col; i++) {
            if (col % i == 0) {
                col_factors++;
            }
        }

        if ((row_factors == 2) || (col_factors == 2)) {
            return 0; // Represents false, as either row or col is prime
        } else {
            return 1; // Represents true, neither row nor col is prime
        }
    }

    public static void main(String[] args) {
        int m = 3; // Example size, you can change it
        boolean[][] a = new boolean[m][m];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m; j++) {
                a[i - 1][j - 1] = (prime_cell(i, j) == 1); // Convert int result to boolean
                System.out.print(a[i - 1][j - 1] + " "); // Print each element
            }
        }
        System.out.println(); // Newline at the end

    }
}
