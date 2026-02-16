public class CatalanFromPascal {

    public static void main(String[] args) {
        int n = 10; // Number of Catalan numbers to print

        for (int i = 0; i < n; i++) {
            long catalan = calculateCatalanFromPascal(i);
            System.out.println("Catalan number " + (i + 1) + ": " + catalan);
        }
    }

    private static long calculateCatalanFromPascal(int n) {
        if (n < 0) {
            return 0; // Handle invalid input
        }
         if (n == 0) {
             return 1; // Base case
         }

        long[][] pascal = generatePascalTriangle(2 * n); // Generate enough rows
        return pascal[2 * n][n] / (n + 1); 
    }


    private static long[][] generatePascalTriangle(int rows) {
        long[][] pascal = new long[rows + 1][rows + 1];

        for (int i = 0; i <= rows; i++) {
            pascal[i][0] = 1;  // First element of each row is 1
            if (i > 0) {
                pascal[i][i] = 1; // Last element of each row is 1
            }

            for (int j = 1; j < i; j++) {
                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
            }
        }

        return pascal;
    }
}
