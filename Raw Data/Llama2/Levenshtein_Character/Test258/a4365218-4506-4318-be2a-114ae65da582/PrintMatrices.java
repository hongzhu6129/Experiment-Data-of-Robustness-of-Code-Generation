import java.util.*;

public class PrintMatrices {

    public static void main(String[] args) {
        // Create a list of matrices
        List<int[][]> matrices = new ArrayList<>();

        // Create a matrix with all elements equal to 1
        int[][] matrix1 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix1[i][j] = 1;
            }
        }
        matrices.add(matrix1);

        // Create a matrix with all elements equal to 2
        int[][] matrix2 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix2[i][j] = 2;
            }
        }
        matrices.add(matrix2);

        // Create a matrix with all elements equal to 3
        int[][] matrix3 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix3[i][j] = 3;
            }
        }
        matrices.add(matrix3);

        // Create a matrix with all elements equal to 4
        int[][] matrix4 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix4[i][j] = 4;
            }
        }
        matrices.add(matrix4);

        // Create a matrix with all elements equal to 5
        int[][] matrix5 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix5[i][j] = 5;
            }
        }
        matrices.add(matrix5);

        // Print the matrices
        for (int[][] matrix : matrices) {
            for (int[] row : matrix) {
                for (int element : row) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
