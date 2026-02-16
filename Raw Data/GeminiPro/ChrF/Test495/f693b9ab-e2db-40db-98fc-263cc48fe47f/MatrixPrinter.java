public class MatrixPrinter {

    public static void main(String[] args) {
        // Example usage:
        printMatrix(5); 
        System.out.println(); // Add a newline for clarity
        printMatrix(3);
    }

    public static void printMatrix(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + i + "," + j + "] "); // Print the matrix elements
            }
            System.out.println(); // Newline after each row
        }
    }
}
