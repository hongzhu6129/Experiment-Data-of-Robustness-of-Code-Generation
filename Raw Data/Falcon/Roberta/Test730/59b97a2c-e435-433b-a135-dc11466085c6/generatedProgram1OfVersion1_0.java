public class MatrixPrinter {

    public static void main(String[] args) {
        // Example usage: Print a 5x5 matrix
        printMatrix(5); 
    }

    public static void printMatrix(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("X "); // Replace "X" with the desired element (e.g., i, j, a calculated value, etc.)
            }
            System.out.println(); // Newline after each row
        }
    }
}
