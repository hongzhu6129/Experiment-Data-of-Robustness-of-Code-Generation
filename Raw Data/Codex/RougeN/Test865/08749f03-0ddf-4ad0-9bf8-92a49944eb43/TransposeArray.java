import java.util.Arrays;

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


        // Example with non-square array:
        int[][] nonSquareArray = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        System.out.println("\nOriginal Non-Square Array:");
        print_array(nonSquareArray);

        transpose(nonSquareArray); // This will not work correctly for non-square arrays in-place.

        System.out.println("\nIncorrect Transpose of Non-Square Array (in-place attempt):");
        print_array(nonSquareArray);

        // Correct transpose for non-square arrays requires creating a new array:
        int[][] transposedNonSquare = transposeNonSquare(nonSquareArray);


        System.out.println("\nCorrect Transpose of Non-Square Array (new array):");
        print_array(transposedNonSquare);

    }


    private static int[][] transposeNonSquare(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;
        int[][] transposed = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = array[i][j];
            }
        }
        return transposed;
    }

    private static void transpose(int[][] array) {
        int n = array.length;  // Assumes square matrix

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {  // Important: j starts from i+1
                // Swap array[i][j] and array[j][i]
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
    }

    private static void print_array(int[][] array) {
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }
}



