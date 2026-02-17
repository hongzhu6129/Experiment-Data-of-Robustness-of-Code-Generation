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


        // Example with a non-square array
        int[][] nonSquareArray = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        System.out.println("\nOriginal Non-Square Array:");
        print_array(nonSquareArray);


        // Transpose the non-square array.  This will modify the original array. 
        // Note: Direct transposing in place isn't possible for non-square arrays. We need to create a new array.
        int[][] transposedNonSquare = new int[nonSquareArray[0].length][nonSquareArray.length];
        for (int i = 0; i < nonSquareArray.length; i++) {
            for (int j = 0; j < nonSquareArray[0].length; j++) {
                transposedNonSquare[j][i] = nonSquareArray[i][j];
            }
        }

        System.out.println("\nTransposed Non-Square Array:");
        print_array(transposedNonSquare);

    }


    private static void transpose(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;


        // Transpose in place (only works for square matrices)
        if(rows == cols){
            for (int i = 0; i < rows; i++) {
                for (int j = i + 1; j < cols; j++) {  // Start from i+1 to avoid swapping twice
                    int temp = array[i][j];
                    array[i][j] = array[j][i];
                    array[j][i] = temp;
                }
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

