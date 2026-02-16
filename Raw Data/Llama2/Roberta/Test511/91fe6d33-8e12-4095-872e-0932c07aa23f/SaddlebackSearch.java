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
        int target = 17;

        int[] result = Saddleback(formula_1, m, n, target);

        if (result[0] != -1) {
            System.out.println("Element " + target + " found at row: " + result[0] + ", column: " + result[1]);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }

        target = 20; // Example for an element not present
         result = Saddleback(formula_1, m, n, target);

        if (result[0] != -1) {
            System.out.println("Element " + target + " found at row: " + result[0] + ", column: " + result[1]);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }


    }

    private static int[] Saddleback(int[][] formula_1, int m, int n, int target) {
        int row = 0;
        int col = n - 1;

        while (row < m && col >= 0) {
            if (formula_1[row][col] == target) {
                return new int[]{row, col}; // Element found
            } else if (formula_1[row][col] < target) {
                row++; // Move down to the next row (larger elements)
            } else {
                col--; // Move left to the previous column (smaller elements)
            }
        }

        return new int[]{-1, -1}; // Element not found

    }
}
