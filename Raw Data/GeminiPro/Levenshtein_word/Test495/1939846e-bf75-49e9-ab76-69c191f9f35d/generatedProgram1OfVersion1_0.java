public class MatrixImage {

    public static void main(String[] args) {
        // Example usage:
        printMatrix(5); 
        System.out.println(); // Add a newline for clarity
        printMatrix(3);
    }

    public static void printMatrix(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // The core logic to create the "image"
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("1 "); // Border is filled with 1s
                } else {
                    System.out.print("0 "); // Inside is filled with 0s
                }
            }
            System.out.println(); // Newline after each row
        }
    }
}
