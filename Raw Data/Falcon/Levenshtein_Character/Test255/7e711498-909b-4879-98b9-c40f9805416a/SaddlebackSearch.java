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
            System.out.println("Element " + target + " found at: (" + result[0] + ", " + result[1] + ")");
        } else {
            System.out.println("Element " + target + " not found in the matrix.");
        }


        target = 20; // Example with an element not in the array
        result = Saddleback(matrix, target, m, n);

        if (result[0] != -1) {
            System.out.println("Element " + target + " found at: (" + result[0] + ", " + result[1] + ")");
        } else {
            System.out.println("Element " + target + " not found in the matrix.");
        }
    }


    private static int[] Saddleback(int[][] matrix, int target, int m, int n) {
        int row = 0;
        int col = n - 1;

        while (row < m && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[]{row, col}; // Element found
            } else if (matrix[row][col] < target) {
                row++; // Move down to the next row
            } else {
                col--; // Move left to the previous column
            }
        }

        return new int[]{-1, -1}; // Element not found
    }
}
