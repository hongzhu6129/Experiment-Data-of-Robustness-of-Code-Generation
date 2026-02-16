public class SaddlebackSearch {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int m = matrix.length;
        int n = matrix[0].length;

        int target = 7;
        int[] result = Saddleback(matrix, target, m, n);

        if (result[0] != -1) {
            System.out.println("Target " + target + " found at: (" + result[0] + ", " + result[1] + ")");
        } else {
            System.out.println("Target " + target + " not found.");
        }


         target = 17; // Test for not found
         result = Saddleback(matrix, target, m, n);

        if (result[0] != -1) {
            System.out.println("Target " + target + " found at: (" + result[0] + ", " + result[1] + ")");
        } else {
            System.out.println("Target " + target + " not found.");
        }
    }

    private static int[] Saddleback(int[][] matrix, int target, int m, int n) {
        int row = 0;
        int col = n - 1;

        while (row < m && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[]{row, col}; // Found
            } else if (matrix[row][col] < target) {
                row++; // Move down to next row (larger values)
            } else {
                col--; // Move left to previous column (smaller values)
            }
        }

        return new int[]{-1, -1}; // Not found
    }
}
