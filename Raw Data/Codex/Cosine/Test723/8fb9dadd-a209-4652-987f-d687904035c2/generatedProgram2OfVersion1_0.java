public static void main(String[] args) {
    Solution solution = new Solution();
    int m = 3; // Rows
    int n = 7; // Columns
    int paths = solution.uniquePaths(m, n);
    System.out.println("Number of unique paths: " + paths); 
}
