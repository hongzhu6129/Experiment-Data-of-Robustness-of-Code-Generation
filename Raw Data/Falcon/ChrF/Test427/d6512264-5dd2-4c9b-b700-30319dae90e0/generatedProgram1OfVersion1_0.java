class Solution {
    /**
     * Searches for a value (target) in an m x n matrix.
     *
     * @param matrix The m x n matrix to search in.
     * @param target The value to search for.
     * @return True if the target is found in the matrix, false otherwise.
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Treat the matrix as a sorted array and perform binary search
        int left = 0;
        int right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int row = mid / cols;
            int col = mid % cols;

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

        int[][] matrix1 = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };

        System.out.println(solution.searchMatrix(matrix1, 3));  // Output: true
        System.out.println(solution.searchMatrix(matrix1, 13)); // Output: false


        int[][] matrix2 = {{1}};
        System.out.println(solution.searchMatrix(matrix2, 1)); // Output: true

         int[][] matrix3 = {};
        System.out.println(solution.searchMatrix(matrix3, 1)); // Output: false

        int[][] matrix4 = null;
        System.out.println(solution.searchMatrix(matrix4, 1)); // Output: false


    }
}
