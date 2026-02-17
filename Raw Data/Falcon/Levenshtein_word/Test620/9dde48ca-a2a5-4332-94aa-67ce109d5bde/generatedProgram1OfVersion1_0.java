class Solution {
    /**
     * Prints an n-by-n matrix where each element is the row number multiplied by the column number.
     *
     * @param n The size of the matrix (n x n).
     */
    public static void printMatrix(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i * j);
                // Add spacing for better readability. Adjust as needed.
                if (j < n) {
                    System.out.print(" "); // Space between elements in a row.
                }
            }
            System.out.println(); // Newline after each row
        }
    }



    public static void main(String[] args) {
        // Example usage:
        printMatrix(3); // Prints a 3x3 matrix.
        System.out.println(); // Add a newline for separation.
        printMatrix(5); // Prints a 5x5 matrix.

    }
}
