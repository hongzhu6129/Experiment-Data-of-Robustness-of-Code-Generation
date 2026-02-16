class Solution {
    /**
     * Prints an n-by-n matrix to the console.
     *
     * @param n The size of the matrix (n x n).
     */
    public static void printMatrix(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(j + 1 + " "); // Print the column number (1-based)
            }
            System.out.println(); // Newline after each row
        }
    }

    public static void main(String[] args) {
        // Example usage: Print a 5x5 matrix
        printMatrix(5);


        // Example usage: Print a 3x3 matrix
        printMatrix(3);


         // Example for n = 0 (empty matrix) - won't print anything
         printMatrix(0);

    }
}
