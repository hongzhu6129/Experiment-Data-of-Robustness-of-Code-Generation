public class MatrixImage {

    public static void main(String[] args) {
        // Example usage: create a 5x5 matrix image
        printMatrix(5);
    }

    public static void printMatrix(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Logic to determine the value at each cell
                int value = (i + j) % 2; // Example: alternating 0 and 1

                System.out.print(value + " "); // Print the value with a space
            }
            System.out.println(); // Newline after each row
        }
    }
}
