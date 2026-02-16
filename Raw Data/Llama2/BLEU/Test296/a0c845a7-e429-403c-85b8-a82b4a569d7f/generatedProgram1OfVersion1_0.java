public class SaddlebackSearch {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7, 10, 13},
                {2, 5, 8, 11, 14},
                {3, 6, 9, 12, 15},
                {4, 7, 10, 13, 16}
        };
        int m = matrix.length;
        int n = matrix[0].length;
        int target = 10;

        int[] result = Saddleback(matrix, m, n, target);

        if (result[0] != -1 && result[1] != -1) {
            System.out.println("Element " + target + " found at row: " + result[0] + ", column: " + result[1]);
        } else {
            System.out.println("Element " + target + " not found in the matrix.");
        }


        target = 17; // Test for a value not present
        result = Saddleback(matrix, m, n, target);
        if (result[0] != -1 && result[1] != -1) {
            System.out.println("Element " + target + " found at row: " + result[0] + ", column: " + result[1]);
        } else {
            System.out.println("Element " + target + " not found in the matrix.");
        }
    }

    private static int[] Saddleback(int[][] matrix, int m, int n, int target) {
        int row = 0;
        int col = n - 1;

        while (row < m && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[]{row, col};  // Found the target
            } else if (matrix[row][col] < target) {
                row++;  // Move down to the next row
            } else {
                col--;  // Move left to the previous column
            }
        }

        return new int[]{-1, -1}; // Target not found
    }
}
