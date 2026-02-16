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

        int[] result = Saddleback(matrix, m, n, target);

        if (result[0] != -1 && result[1] != -1) {
            System.out.println("Target " + target + " found at: (" + result[0] + ", " + result[1] + ")");
        } else {
            System.out.println("Target " + target + " not found in the matrix.");
        }


        target = 17; // Test with a number not in the matrix
        result = Saddleback(matrix, m, n, target);

        if (result[0] != -1 && result[1] != -1) {
            System.out.println("Target " + target + " found at: (" + result[0] + ", " + result[1] + ")");
        } else {
            System.out.println("Target " + target + " not found in the matrix.");
        }
    }

    private static int[] Saddleback(int[][] matrix, int m, int n, int target) {
        int row = 0;
        int col = n - 1;
        int[] result = {-1, -1}; // Default: not found

        while (row < m && col >= 0) {
            if (matrix[row][col] == target) {
                result[0] = row;
                result[1] = col;
                return result;
            } else if (matrix[row][col] < target) {
                row++; // Move down to the next row
            } else {
                col--; // Move left to the previous column
            }
        }

        return result; // Target not found
    }
}
