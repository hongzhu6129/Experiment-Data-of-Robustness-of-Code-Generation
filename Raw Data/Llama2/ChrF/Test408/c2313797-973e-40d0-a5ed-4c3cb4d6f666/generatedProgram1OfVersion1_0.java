import java.util.Arrays;

public class SaddlebackSearch {

    public static void main(String[] args) {
        int[][] sophisticated = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };

        int m = sophisticated.length;
        int n = sophisticated[0].length;

        int target = 16; // Example target value

        int[] result = Saddleback(sophisticated, target, m, n);

        if (result[0] != -1) {
            System.out.println("Target " + target + " found at: (" + result[0] + ", " + result[1] + ")");
        } else {
            System.out.println("Target " + target + " not found in the array.");
        }


        target = 20; // Example target value that doesn't exist
        result = Saddleback(sophisticated, target, m, n);

        if (result[0] != -1) {
            System.out.println("Target " + target + " found at: (" + result[0] + ", " + result[1] + ")");
        } else {
            System.out.println("Target " + target + " not found in the array.");
        }
    }


    private static int[] Saddleback(int[][] sophisticated, int target, int m, int n) {
        int row = 0;
        int col = n - 1;


        while (row < m && col >= 0) {
            if (sophisticated[row][col] == target) {
                return new int[]{row, col}; // Found, return row and column index
            } else if (sophisticated[row][col] < target) {
                row++; // Move down to the next row (larger values)
            } else {
                col--; // Move left to the previous column (smaller values)
            }
        }

        return new int[]{-1, -1}; // Not found
    }
}
