class Solution {
    /**
     * Searches for a target value within a 2D matrix.
     *
     * @param matrix The m x n integer matrix to search.
     * @param target The integer value to search for.
     * @return True if the target is found in the matrix, false otherwise.
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix1 = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target1 = 3;
        System.out.println(solution.searchMatrix(matrix1, target1)); // Output: true

        int[][] matrix2 = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target2 = 13;
        System.out.println(solution.searchMatrix(matrix2, target2)); // Output: false


        int[][] emptyMatrix = {};
        int target3 = 1;
        System.out.println(solution.searchMatrix(emptyMatrix, target3)); // Output: false

        int[][] nullMatrix = null;
        int target4 = 1;
        System.out.println(solution.searchMatrix(nullMatrix, target4)); // Output: false

        // Example with an empty row
        int[][] matrixWithEmptyRow = {{}};
        int target5 = 1;
        System.out.println(solution.searchMatrix(matrixWithEmptyRow, target5)); // Output: false



    }
}
