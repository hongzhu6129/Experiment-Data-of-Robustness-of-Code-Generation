public class PrintBooleanArray {

    public static void main(String[] args) {
        // Sample boolean array (replace with your actual array)
        boolean[][] boolArray = {
                {true, false, true},
                {false, true, false},
                {true, true, false}
        };

        // Print the array
        printBooleanArray(boolArray); 
    }

    // Helper function to print the 2D boolean array
    private static void printBooleanArray(boolean[][] arr) {
        for (boolean[] row : arr) {
            for (boolean value : row) {
                System.out.print(value ? "t " : "f "); // Print "t" for true and "f" for false
            }
            System.out.println(); // Newline after each row
        }
    }
}
