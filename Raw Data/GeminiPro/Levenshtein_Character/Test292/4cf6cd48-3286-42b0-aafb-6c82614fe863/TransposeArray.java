public class TransposeArray {

    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Original Array:");
        print_array(array);

        transpose(array);

        System.out.println("\nTransposed Array:");
        print_array(array);
    }

    private static void transpose(int[][] array) {
        // Check for valid square matrix
        if (array.length != array[0].length) {
            System.out.println("Error: Matrix must be square for in-place transpose.");
            return;  // Or throw an exception
        }

        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) { // Note: Start j from i+1 to avoid swapping back
                // Swap array[i][j] and array[j][i]
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
    }


    private static void print_array(int[][] array) {
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
