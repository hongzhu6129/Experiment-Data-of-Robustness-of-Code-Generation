public class SaddlebackSearch {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int target = 21;
        int m = matrix.length;
        int n = matrix[0].length;

        int[] result = Saddleback(matrix, target, m, n);

        if (result[0] != -1 && result[1] != -1) {
            System.out.println("Target " + target + " found at row: " + result[0] + ", column: " + result[1]);
        } else {
            System.out.println("Target " + target + " not found in the matrix.");
        }
    }



    private static int[] Saddleback(int[][] matrix, int target, int m, int n) {
        int row = 0;
        int col = n - 1;

        while (row < m && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[]{row, col}; // Target found
            } else if (matrix[row][col] < target) {
                row++; // Move down to the next row (larger values)
            } else {
                col--; // Move left to the previous column (smaller values)
            }
        }

        return new int[]{-1, -1}; // Target not found
    }
}
