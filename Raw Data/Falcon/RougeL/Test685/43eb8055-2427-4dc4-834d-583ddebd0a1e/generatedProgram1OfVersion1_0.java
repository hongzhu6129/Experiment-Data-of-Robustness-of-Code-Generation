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
        int rows = array.length;
        int cols = array[0].length;

        if (rows != cols) {
            System.out.println("Error: Transpose is only defined for square matrices.");
            return; // Or throw an exception
        }


        for (int i = 0; i < rows; i++) {
            for (int j = i + 1; j < cols; j++) {  // Note: Start j from i+1 to avoid swapping twice
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
