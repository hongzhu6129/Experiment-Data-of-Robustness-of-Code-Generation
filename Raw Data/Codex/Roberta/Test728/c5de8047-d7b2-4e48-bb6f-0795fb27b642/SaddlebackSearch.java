public class SaddlebackSearch {

    public static void main(String[] args) {
        int[][] formula_1 = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };

        int m = formula_1.length;
        int n = formula_1[0].length;

        int target = 16; // Example target value


        int[] result = Saddleback(formula_1, m, n, target);

        if (result[0] != -1 && result[1] != -1) {
            System.out.println("Target " + target + " found at row: " + result[0] + ", column: " + result[1]);
        } else {
            System.out.println("Target " + target + " not found in the array.");
        }
    }


    private static int[] Saddleback(int[][] arr, int m, int n, int target) {
        int row = 0;
        int col = n - 1;


        while (row < m && col >= 0) {
            if (arr[row][col] == target) {
                return new int[]{row, col}; // Target found
            } else if (arr[row][col] < target) {
                row++; // Move down to the next row (larger values)
            } else {
                col--; // Move left to the previous column (smaller values)
            }
        }


        return new int[]{-1, -1}; // Target not found
    }
}
