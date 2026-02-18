class Solution {
    /**
     * Searches for a target value in an m x n matrix.
     *
     * @param matrix The m x n matrix to search.
     * @param target The value to search for.
     * @return True if the target value is found in the matrix, false otherwise.
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int m = matrix.length;
        int n = matrix[0].length;

        // Treat the matrix as a sorted array
        int left = 0;
        int right = m * n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int row = mid / n;
            int col = mid % n;

            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] matrix1 = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target1 = 3;
        System.out.println(solution.searchMatrix(matrix1, target1));  // Output: true

        int[][] matrix2 = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target2 = 13;
        System.out.println(solution.searchMatrix(matrix2, target2));  // Output: false


        int[][] matrix3 = {}; // Empty Matrix
        int target3 = 1;
        System.out.println(solution.searchMatrix(matrix3, target3)); // Output: false

        int[][] matrix4 = {{}}; // Empty row matrix
        int target4 = 1;
        System.out.println(solution.searchMatrix(matrix4, target4)); // Output: false


    }
}
