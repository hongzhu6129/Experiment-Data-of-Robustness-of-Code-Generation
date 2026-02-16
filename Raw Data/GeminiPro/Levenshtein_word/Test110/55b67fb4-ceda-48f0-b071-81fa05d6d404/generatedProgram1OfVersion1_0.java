class Solution {
    /**
     * Searches for a value in an m x n matrix.
     *
     * @param matrix The matrix to search in.
     * @param target The value to search for.
     * @return True if the target is found in the matrix, false otherwise.
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int m = matrix.length;
        int n = matrix[0].length;

        int row = 0;
        int col = n - 1;

        while (row < m && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }

        return false;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] matrix1 = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        int target1 = 5;
        System.out.println("Matrix 1 contains " + target1 + ": " + solution.searchMatrix(matrix1, target1)); // Output: true

        int[][] matrix2 = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        int target2 = 20;
        System.out.println("Matrix 2 contains " + target2 + ": " + solution.searchMatrix(matrix2, target2)); // Output: false


        int[][] matrix3 = {};
        int target3 = 20;
        System.out.println("Matrix 3 contains " + target3 + ": " + solution.searchMatrix(matrix3, target3)); // Output: false        

        int[][] matrix4 = {{1}};
        int target4 = 1;
        System.out.println("Matrix 4 contains " + target4 + ": " + solution.searchMatrix(matrix4, target4)); // Output: true
    }
}
