public class InverseMatrix {

    public static void main(String[] args) {
        // Example usage:
        printMatrix(4); 
        System.out.println(); // Add a newline for separation
        printMatrix(5);
    }

    public static void printMatrix(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Check if it's on the inverse diagonal (from top right to bottom left)
                if (i + j == n - 1) {
                    System.out.print("1 "); // Print 1 for inverse diagonal elements
                } else {
                    System.out.print("0 "); // Print 0 for other elements
                }
            }
            System.out.println(); // Newline after each row
        }
    }
}
