import java.util.Arrays;

class Solution {

    /**
     * Finds a path from top left to bottom right in a 2D grid that minimizes the sum of numbers along the path.
     * Movement is allowed only down or right.
     *
     * @param grid The 2D grid of numbers.
     * @return The minimum sum of numbers along the path.
     */
    public int minPathSum(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        // dp[i][j] stores the minimum path sum to reach cell (i, j)
        int[][] dp = new int[rows][cols];

        // Initialize dp array
        initializeDP(grid, dp, rows, cols);


        // Fill the rest of the dp array using dynamic programming
        calculateMinPathSum(grid, dp, rows, cols);
        

        return dp[rows - 1][cols - 1];
    }


    // Helper function to initialize the dp array.
    private void initializeDP(int[][] grid, int[][] dp, int rows, int cols) {
        dp[0][0] = grid[0][0];

        // Initialize first row
        for (int j = 1; j < cols; j++) {
            dp[0][j] = dp[0][j - 1] + grid[0][j];
        }

        // Initialize first column
        for (int i = 1; i < rows; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }
    }

     // Helper function to use DP to calculate the rest of the matrix.
    private void calculateMinPathSum(int[][] grid, int[][] dp, int rows, int cols) {
        // Iterate through the remaining cells
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                dp[i][j] = grid[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);
            }
        }
    }

}
