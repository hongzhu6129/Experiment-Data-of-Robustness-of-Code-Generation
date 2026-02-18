public class Print2DArray {

    public static void main(String[] args) {
        // Sample 2D boolean array (replace with your actual array)
        boolean[][] algebraArray = {
                {true, false, true},
                {false, true, false},
                {true, true, false}
        };

        // Print the array contents
        printBooleanArray(algebraArray);
    }

    // Helper function to print the 2D boolean array with 't' and 'f'
    private static void printBooleanArray(boolean[][] arr) {
        for (boolean[] row : arr) {
            for (boolean value : row) {
                System.out.print(value ? 't' : 'f' + " "); // Print 't' for true, 'f' for false
            }
            System.out.println(); // New line after each row
        }
    }
}
